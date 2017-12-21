# -*- coding: UTF-8 -*-
'''
Created on 2013-11-27

@author: bezy
'''

from Writer import Writer
from checking.mergeKeyRule import MergeKeyRule
from utils.util import Util
from utils import logger

class DataWriter(Writer):

    JAVA_CODE_LEN = 5

    def __init__(self, heads, rawDatas, directory, fileName):
        super(DataWriter, self).__init__(directory, fileName)
        self.heads = heads
        self.rawDatas = rawDatas
        self.isMultiValueMode = False
        self.primeKeyFormula = None
        self.outputComment = {}

    def writeFile(self):
        isClient = False
        isServer = False
        for head in self.heads:
            for i in xrange(len(head[Util.FIELD_NAME_KEY])):
                if 'c' in head[Util.CS_SELECTOR_KEY][i]:
                    isClient = True
                if 's' in head[Util.CS_SELECTOR_KEY][i]:
                    isServer = True
            for exportRule in head[Util.EXPORT_RULE_KEY]:
                if exportRule.startswith('primeKey='):
                    pass
                elif exportRule.startswith('primeKeyFormula='):
                    pass
                elif exportRule.startswith('charMap='):
                    pass
                else:
                    try:
                        mergeRule = MergeKeyRule(exportRule)
                    except Exception as e:
                        logger.error('导入合并规则 %s 解析异常: %s' % (exportRule, str(e)))
                        return False
                    if 'c' in mergeRule.csselector:
                        isClient = True
                    if 's' in mergeRule.csselector:
                        isServer = True
        #write client
        if isClient:
            self.isMultiValueMode = False
            self.primeKeyFormula = None
            self.outputComment = {}
            datas = []
            fieldNameOrders = []
            for i, rawData in enumerate(self.rawDatas):
                data = self._processRawData(rawData, self.heads[i], 'c', fieldNameOrders)
                if data is None:
                    logger.error('导出表格%s错误' % self.heads[i][Util.FILE_IDENTIFY])
                    return False
                datas.append(data)
            content = self._generateLuaText(datas, fieldNameOrders)
            if not self.writeLua(content):
                return False
        #write server
        if isServer:
            self.isMultiValueMode = False
            self.primeKeyFormula = None
            self.outputComment = {}
            datas = []
            fieldNameOrders = []
            for i, rawData in enumerate(self.rawDatas):
                data = self._processRawData(rawData, self.heads[i], 's', fieldNameOrders)
                if data is None:
                    logger.error('导出表格%s错误' % self.heads[i][Util.FILE_IDENTIFY])
                    return False
                datas.append(data)
            content = self._generateJavaText(datas, fieldNameOrders)
            if not self.writeJava(content):
                return False
        return True

    def _processRawData(self, iItems, iHead, iSelector, iFieldNameOrders):
        #field name order
        fieldNameOrder = iHead[Util.FIELD_NAME_KEY][:]
        iFieldNameOrders.append(fieldNameOrder)
        #primary key
        primeKeys = []
        for i in xrange(len(iHead[Util.KEY_IDENTIFY])):
            if iHead[Util.KEY_IDENTIFY][i] == True and iHead[Util.FIELD_NAME_KEY][i]:
                primeKeys.append(iHead[Util.FIELD_NAME_KEY][i])

        # prepare the export rule
        mergeRules = []
        mergeKeys = set()
        for exportRule in iHead[Util.EXPORT_RULE_KEY]:
            if exportRule.startswith('primeKey='):
                seps = exportRule.split('=')[1].split(',')
                primeKeys = []
                for sep in seps:
                    if sep.strip():
                        primeKeys.append(sep.strip())
                self.isMultiValueMode = True
            elif exportRule.startswith('primeKeyFormula='):
                self.primeKeyFormula = exportRule.split('=')[1].strip()
            elif exportRule.startswith('charMap='):
                seps = exportRule.split('=')[1].split(',')
                charName, charFields = seps[0], seps[1:]
                self._processCharSet(iItems, charName, charFields)
            else:
                try:
                    mergeRule = MergeKeyRule(exportRule)
                except Exception as e:
                    logger.error('导入合并规则 %s 异常: %s' % (exportRule, str(e)))
                    return None
                if mergeRule.csselector.find(iSelector) != -1:
                    pos = len(fieldNameOrder)
                    for mergeKey in mergeRule.mergeKeys:
                        if mergeKey not in iHead[Util.FIELD_NAME_KEY]:
                            logger.error('导入合并规则 %s 中 %s 在表中不存在' % (exportRule, mergeKey))
                            return None
                        if mergeKey in fieldNameOrder:
                            index = fieldNameOrder.index(mergeKey)
                            fieldNameOrder.remove(mergeKey)
                            if index < pos:
                                pos = index
                    fieldNameOrder.insert(pos, mergeRule.name)
                    mergeKeys = mergeKeys.union(mergeRule.mergeKeys)
                    mergeRules.append(mergeRule)

        if len(primeKeys) == 0:
            primeKeys = ['id']

        keyTypes = {}
        for i in xrange(len(iHead[Util.FIELD_NAME_KEY])):
            if iHead[Util.FIELD_NAME_KEY][i]:
                keyTypes[iHead[Util.FIELD_NAME_KEY][i]] = iHead[Util.TYPE_KEY][i]

        for key in primeKeys:
            if not keyTypes.has_key(key):
                logger.error('表格不包含主键%s' % key)
                return None

        keys = []
        keys.extend(primeKeys)
        for i in xrange(len(iHead[Util.FIELD_NAME_KEY])):
            if iHead[Util.CS_SELECTOR_KEY][i].find(iSelector) != -1\
                    and iHead[Util.FIELD_NAME_KEY][i] and iHead[Util.FIELD_NAME_KEY][i] not in mergeKeys:
                keys.append(iHead[Util.FIELD_NAME_KEY][i])
                if iHead[Util.COLUMN_NAME_KEY][i]:
                    self.outputComment[iHead[Util.COLUMN_NAME_KEY][i]] = iHead[Util.FIELD_NAME_KEY][i]

        data = self._preProcess(iItems, keys, keyTypes, primeKeys, mergeRules)
        if data is None:
            return None
        data = self._postProcess(data, primeKeys)
        return data

    def _processCharSet(self, iItems, iCharName, iCharFields):
        charSet = Util.CHAR_SET_MAP.setdefault(iCharName, set())
        for item in iItems:
            for charField in iCharFields:
                value = item.get(charField.strip())
                if value:
                    charSet |= set(value.decode("utf-8"))

    def _preProcess(self, iItems, iKeys, iKeyTypes, iPrimeKeys, iMergeRules):
        processedData = []
        for item in iItems:
            itemFilters = {}
            for key, value in item.iteritems():
                if key in iKeys:
                    if value or key in iPrimeKeys:
                        try:
                            itemFilters[key] = Util.getValueByType(iKeyTypes[key], value)
                        except ValueError:
                            logger.error('在导出过程中遇到不正确类型，在%s列的%s值' % (key, value))
                            return None
            for mergeRule in iMergeRules:
                ret = mergeRule.merge(item, iKeyTypes)
                if ret:
                    itemFilters[mergeRule.name] = ret
                    self.outputComment[mergeRule.name] = mergeRule.reg
            if itemFilters:
                processedData.append(itemFilters)
        return processedData

    def _postProcess(self, iItems, iPrimeKeys):
        processedData = {}

        for item in iItems:
            if self.primeKeyFormula:
                sandbox = {}
                for key in iPrimeKeys:
                    sandbox[key] = item[key]
                try:
                    keyValue = eval(self.primeKeyFormula, sandbox)
                except:
                    logger.error('在导出过程中计算主键%s错误' % self.primeKeyFormula)
                    return None
            else:
                keyValue = item[iPrimeKeys[0]]
            if self.isMultiValueMode:
                processedData.setdefault(keyValue, []).append(item)
            else:
                processedData[keyValue] = item
        return processedData

    def _generateLuaText(self, iDatas, iFieldNameOrders):
        content = '--\n'

        headKeySet = set()
        for head in self.heads:
            content += '-- ' + head[Util.FILE_IDENTIFY] + '.csv\n'
            for i in xrange(len(head[Util.COLUMN_NAME_KEY])):
                if not head[Util.COLUMN_NAME_KEY][i] in headKeySet\
                    and self.outputComment.has_key(head[Util.COLUMN_NAME_KEY][i]):
                    content += '-- ' + head[Util.COLUMN_NAME_KEY][i] + ' = ' + head[Util.FIELD_NAME_KEY][i] + '\n'
                    headKeySet.add(head[Util.COLUMN_NAME_KEY][i])
                    self.outputComment.pop(head[Util.COLUMN_NAME_KEY][i])

        for key, value in self.outputComment.iteritems():
            if not key in headKeySet:
                content += '-- ' + key + ' = ' + value + '\n'

        content += '\nlocal data = {\n'
        ll = []
        for index, data in enumerate(iDatas):
            fieldNameOrder = iFieldNameOrders[index]
            for key, value in sorted(data.items()):
                ll.append('    [' + Util.value2luastr(key) + '] = '\
                + self._generateLuaByFieldNameOrder(value, fieldNameOrder))
        content += ',\n'.join(ll)
        content += '\n}\n\n'
        content += 'return data'
        return content

    def _generateLuaByFieldNameOrder(self, value, fieldNameOrder):
        content = ''
        isList = False
        count = 1
        
        if isinstance(value, list):
            content += '{'
            isList = True
            count = len(value)

        ll = []
        for i in xrange(count):
            if isList:
                iteration = value[i]
            else:
                iteration = value
            text = '{'
            l = []
            for key in fieldNameOrder:
                if key in iteration.keys():
                    l.append('[' + Util.value2luastr(key) + '] = ' + Util.value2luastr(iteration[key]))
            text += ', '.join(l)
            text += '}'
            ll.append(text)
        content += ', '.join(ll)

        if isList:
            content += '}'

        return content

    def _generateJavaText(self, iDatas, iFieldNameOrders):
        content = """package {package};

import {package}.base.LData;
import {package}.base.LMap;
""".format(package = Util.JAVA_PACKAGE_NAME)
        content += '\n/**\n'
        headKeySet = set()
        for head in self.heads:
            content += ' * ' + head[Util.FILE_IDENTIFY] + '.csv\n'
            for i in xrange(len(head[Util.COLUMN_NAME_KEY])):
                if not head[Util.COLUMN_NAME_KEY][i] in headKeySet\
                    and self.outputComment.has_key(head[Util.COLUMN_NAME_KEY][i]):
                    content += ' * ' + head[Util.COLUMN_NAME_KEY][i] + ' = ' + head[Util.FIELD_NAME_KEY][i] + '\n'
                    headKeySet.add(head[Util.COLUMN_NAME_KEY][i])
                    self.outputComment.pop(head[Util.COLUMN_NAME_KEY][i])

        for key, value in self.outputComment.iteritems():
            if not key in headKeySet:
                content += ' * ' + key + ' = ' + value + '\n'
        content += ' */\n'
        content += """public class %s extends LData {
    public static final LMap data = new LMap();

""" % self.javaFileName

        llgroup = []
        ll = None
        for index, data in enumerate(iDatas):
            fieldNameOrder = iFieldNameOrders[index]
            for key, value in sorted(data.items()):
                if ll is None or len(ll) == DataWriter.JAVA_CODE_LEN:
                    ll = []
                    llgroup.append(ll)
                ll.append('    ' + Util.value2javastr(key) + ', '\
                + self._generateJavaByFieldNameOrder(value, fieldNameOrder))

        static_content = '    static {\n'
        init_content = ''
        for index, ll in enumerate(llgroup):
            init_content += '    private static void init' + str(index) + '() {\n'
            init_content += 'data.map(\n'
            init_content += ',\n'.join(ll)
            init_content += '\n);\n'
            init_content += '    }\n\n'
            static_content += '        init' + str(index) + '();\n'
        static_content += '        data.setFrozen(true);\n'
        static_content += '    }\n\n'

        content += static_content
        content += init_content
        content += '}'
        return content

    def _generateJavaByFieldNameOrder(self, value, fieldNameOrder):
        content = ''
        isList = False
        count = 1
        
        if isinstance(value, list):
            content += 'list('
            isList = True
            count = len(value)

        ll = []
        for i in xrange(count):
            if isList:
                iteration = value[i]
            else:
                iteration = value
            text = 'map('
            l = []
            for key in fieldNameOrder:
                if key in iteration.keys():
                    l.append(Util.value2javastr(key) + ', ' + Util.value2javastr(iteration[key]))
            text += ', '.join(l)
            text += ')'
            ll.append(text)
        content += ', '.join(ll)

        if isList:
            content += ')'

        return content
