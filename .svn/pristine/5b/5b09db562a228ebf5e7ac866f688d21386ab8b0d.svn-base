# -*- coding: UTF-8 -*-
'''
Created on 2013-11-30

@author: bezy
'''

from Writer import Writer
from utils.util import Util
from utils import logger

class ConstDataWriter(Writer):

    JAVA_CODE_LEN = 5

    def __init__(self, heads, rawDatas, directory, fileName):
        super(ConstDataWriter, self).__init__(directory, fileName)
        self.heads = heads
        self.rawDatas = rawDatas

    def writeFile(self):
        clientIdentifies = []
        serverIdentifies = []
        clientDatas = []
        serverDatas = []
        for i, rawData in enumerate(self.rawDatas):
            ret = self._processRawData(rawData)
            if ret is None:
                logger.error('导出表格%s错误' % self.heads[i][Util.FILE_IDENTIFY])
                return False
            clientData, serverData = ret
            if clientData:
                clientIdentifies.append(self.heads[i][Util.FILE_IDENTIFY])
                clientDatas.extend(clientData)
            if serverData:
                serverIdentifies.append(self.heads[i][Util.FILE_IDENTIFY])
                serverDatas.extend(serverData)
        if clientDatas:
            content = self._generateLuaText(clientDatas, clientIdentifies)
            if not self.writeLua(content):
                return False
        if serverDatas:
            content = self._generateJavaText(serverDatas, serverIdentifies)
            if not self.writeJava(content):
                return False
        return True

    def _processRawData(self, iItems):
        clientData = []
        serverData = []
        for item in iItems:
            key = item[0]
            if not key:
                continue
            selector = item[4].lower()
            if 'c' not in selector and 's' not in selector:
                logger.error('%s行常量填写有误' % key)
                return None
            try:
                value = Util.getValueByType(item[2].upper(), item[3])
            except ValueError:
                logger.error('在导出过程中遇到不正确类型，在%s行的%s值' % (key, item[3]))
                return None
            if 'c' in selector:
                clientData.append((key, value, item[1]))
                pass
            if 's' in selector:
                serverData.append((key, value, item[1]))
        return clientData, serverData

    def _generateLuaText(self, iDatas, iIdentifies):
        content = '--\n'

        for identify in iIdentifies:
            content += '-- ' + identify + '.csv\n'

        content += '\nlocal data = {\n'
        ll = []
        for i, data in enumerate(iDatas):
            text = '    [' + Util.value2luastr(data[0]) + '] = ' + Util.value2luastr(data[1])
            text += ', -- ' + data[2] if i < len(iDatas) - 1 else ' -- ' + data[2]
            ll.append(text)
        content += '\n'.join(ll)
        content += '\n}\n\n'
        content += 'return data'
        return content

    def _generateJavaText(self, iDatas, iIdentifies):
        content = """package {package};

import {package}.base.LData;
import {package}.base.LMap;
""".format(package = Util.JAVA_PACKAGE_NAME)
        content += '\n/**\n'
        for identify in iIdentifies:
            content += ' * ' + identify + '.csv\n'
        content += ' */\n'
        content += """public class %s extends LData {
    public static final LMap data = new LMap();

""" % self.javaFileName

        llgroup = []
        ll = None
        for i, data in enumerate(iDatas):
            if ll is None or len(ll) == ConstDataWriter.JAVA_CODE_LEN:
                ll = []
                llgroup.append(ll)
            text = '    ' + Util.value2javastr(data[0]) + ', ' + Util.value2javastr(data[1])
            text += ', // ' + data[2] if i < len(iDatas) - 1 and \
                i % ConstDataWriter.JAVA_CODE_LEN < (ConstDataWriter.JAVA_CODE_LEN - 1) else ' // ' + data[2]
            ll.append(text)

        static_content = '    static {\n'
        init_content = ''
        for index, ll in enumerate(llgroup):
            init_content += '    private static void init' + str(index) + '() {\n'
            init_content += 'data.map(\n'
            init_content += '\n'.join(ll)
            init_content += '\n);\n'
            init_content += '    }\n\n'
            static_content += '        init' + str(index) + '();\n'
        static_content += '        data.setFrozen(true);\n'
        static_content += '    }\n\n'

        content += static_content
        content += init_content
        content += '}'
        return content
