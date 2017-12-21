# -*- coding: UTF-8 -*-
'''
Created on 2014-01-02

@author: bezy
'''

from checking.pyparsing import ParseException, Word, alphas, alphanums, ZeroOrMore, Forward,\
        Suppress, Literal, Group

from utils.util import Util
from utils import logger

class MergeKeyRule(object):

    # item format
    IDENT = Word(alphas + "_", alphanums + "_")

    # syntax items
    EXP, FACTOR, FACTOR_LIST, FACTOR_TUPLE, FACTOR_DICT, CSSELECTOR =(Forward() for i in xrange(6))

    # syntax tree
    FACTOR << ( FACTOR_LIST | FACTOR_TUPLE | FACTOR_DICT | IDENT )
    FACTOR_LIST << Group( Literal('#list') + Suppress('(') + FACTOR + ZeroOrMore(Suppress(',') + FACTOR) + Suppress(')') )
    FACTOR_TUPLE << Group( Literal('#tuple') + Suppress('(') + FACTOR + ZeroOrMore(Suppress(',') + FACTOR) + Suppress(')') )
    FACTOR_DICT << Group( Literal('#dict') + Suppress('(') + IDENT + Suppress(':') + FACTOR + ZeroOrMore(Suppress(',') + IDENT + Suppress(':') + FACTOR) + Suppress(')') )
    CSSELECTOR << ( Literal('cs') | Literal('sc') | Literal('c') | Literal('s') )
    EXP << IDENT + Suppress('(') +  CSSELECTOR + Suppress(')') + Literal(':') + (FACTOR_LIST | FACTOR_TUPLE | FACTOR_DICT)

    def __init__(self, reg):
        super(MergeKeyRule, self).__init__()
        self.reg = reg
        self.tree = MergeKeyRule.EXP.parseString(self.reg, True).asList()
        self.name = None
        self.csselector = None
        self.mergeKeys = self._getMergeKeys(self.tree)

    def _getMergeKeys(self, iTree):
        keys = set()

        if len(iTree) == 4 and iTree[2] == ':':
            self.name = iTree[0]
            self.csselector = iTree[1]
            keys = self._getMergeKeys(iTree[3])
        elif len(iTree) >= 1 and (iTree[0] == '#list' or iTree[0] == '#tuple' or iTree[0] == '#dict'):
            for treeItem in iTree[1:]:
                if isinstance(treeItem, list):
                    keys = keys.union(self._getMergeKeys(treeItem))
                else:
                    keys.add(treeItem)
        return keys

    def merge(self, iItem, iKeyTypes):
        try:
            value = self._merge(iItem, iKeyTypes, self.tree)
            if value[1]:
                return value[0]
            else:
                logger.error('导入合并规则 %s 错误' % self.reg)
                return None
        except ParseException as e:
            logger.error('导入合并规则 %s 合并异常: %s' % (self.reg, str(e)))
            return None

    def _merge(self, iItem, iKeyTypes, iTree):
        if len(iTree) == 4 and iTree[2] == ':':
            return self._merge(iItem, iKeyTypes, iTree[3])
        elif len(iTree) >= 1 and (iTree[0] == '#list' or iTree[0] == '#tuple' or iTree[0] == '#dict'):
            isValid = False
            obList = []
            obDict = {}
            for index, treeItem in enumerate(iTree[1:]):
                if (index+1) % 2 == 0 and iTree[0] == '#dict':
                    continue
                if isinstance(treeItem, list):
                    ob = self._merge(iItem, iKeyTypes, treeItem)
                    if ob[1]:
                        if iTree[0] == '#list' or iTree[0] == '#tuple':
                            isValid = True
                            obList.append(ob[0])
                        elif iTree[0] == '#dict':
                            if isinstance(iTree[index+2], list):
                                mergerdValue = self._merge(iItem, iKeyTypes, iTree[index+2])
                                if mergerdValue[1]:
                                    isValid = True
                                    obDict[ob[0]] = mergerdValue[0]
                            else:
                                ob2 = iItem.get(iTree[index+2], None)
                                if ob2 is None:
                                    raise ParseException, "--> 在导入合并中，不存在%s列" % iTree[index+2]
                                try:
                                    isValid = True
                                    obKey = ob[0]
                                    columnName = iTree[index+2]
                                    ob = ob2
                                    obDict[obKey] = Util.getValueByType(iKeyTypes[columnName], ob)
                                except ValueError:
                                    raise ParseException, "在导入合并中遇到不正确类型，在%s列的%s值" % (columnName, ob)
                else:
                    ob = iItem.get(treeItem, None)
                    if ob is None:
                        raise ParseException, "--> 在导入合并中，不存在%s列" % treeItem
                    try:
                        if iTree[0] == '#list':
                            #忽略空元素
                            if ob:
                                isValid = True
                                columnName = treeItem
                                obList.append(Util.getValueByType(iKeyTypes[columnName], ob))
                        elif iTree[0] == '#tuple':
                            #不忽略空元素
                            isValid = True
                            columnName = treeItem
                            obList.append(Util.getValueByType(iKeyTypes[columnName], ob))
                        elif iTree[0] == '#dict':
                            #忽略空元素
                            if ob:
                                if isinstance(iTree[index+2], list):
                                    mergerdValue = self._merge(iItem, iKeyTypes, iTree[index+2])
                                    if mergerdValue[1]:
                                        isValid = True
                                        columnName = treeItem
                                        obDict[Util.getValueByType(iKeyTypes[columnName], ob)] = mergerdValue[0]
                                else:
                                    ob2 = iItem.get(iTree[index+2], None)
                                    if ob2 is None:
                                        raise ParseException, "--> 在导入合并中，不存在%s列" % iTree[index+2]
                                    isValid = True
                                    columnName = treeItem
                                    obKey = Util.getValueByType(iKeyTypes[columnName], ob)
                                    columnName = iTree[index+2]
                                    ob = ob2
                                    obDict[obKey] = Util.getValueByType(iKeyTypes[columnName], ob)
                    except ValueError:
                        raise ParseException, "在导入合并中遇到不正确类型，在%s列的%s值" % (columnName, ob)

            if iTree[0] == '#list':
                instance = obList
            elif iTree[0] == '#tuple':
                instance = tuple(obList)
            elif iTree[0] == '#dict':
                instance = obDict
            return (instance, isValid)
