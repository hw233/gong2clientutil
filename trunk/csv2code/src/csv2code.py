# -*- coding: UTF-8 -*-
'''
Created on 2013-11-27

@author: bezy
'''
import sys
import os

from reader.csvReader import CsvReader
from checking.ruleManager import RuleManager
from writer.Writer import Writer
from writer.dataWriter import DataWriter
from writer.constDataWriter import ConstDataWriter
from utils.util import Util
from utils import logger

class Csv2Code(object):

    def __init__(self, configs = None):
        super(Csv2Code, self).__init__()
        self.configs = configs
        self.exportDatas = {}
        self.exportConstDatas = {}

    def transform(self, inputDir, outputDir):
        files = []
        inputDir = inputDir.rstrip(os.sep)
        for fileName in os.listdir(inputDir):
            if fileName.lower().endswith('.csv'):
                files.append(inputDir + os.sep + fileName)
        files.sort()
        #read
        logger.info("读取csv开始...")
        for f in files:
            if sys.platform == 'win32':
                logger.info("读取csv", f.decode('GBK').encode('UTF-8'))
            else:
                logger.info("读取csv", f)
            data = CsvReader(f).readData()
            if data is None:
                logger.error("读取csv失败！")
                return False
            if not data[Util.CONST_DATA_KEY]:
                exportName, head, rawData = self._transformData(data)
                exportData = self.exportDatas.setdefault(exportName, [[], [], []])
            else:
                exportName, head, rawData = self._transformConstData(data)
                exportData = self.exportConstDatas.setdefault(exportName, [[], [], []])
            exportData[0].append(head)
            exportData[1].append(rawData)
            exportData[2].append(head[Util.FILE_IDENTIFY])
            if not Util.TABLE_CACHE.has_key(head[Util.FILE_IDENTIFY]):
                Util.TABLE_CACHE[head[Util.FILE_IDENTIFY]] = (head, rawData, )
            else:
                logger.error("存在重复数据表", head[Util.FILE_IDENTIFY])
                return False
        logger.info("读取csv完成！")
        #check
        logger.info("检查数据表开始...")
        isSuccess = True
        for exportName, exportData in self.exportDatas.iteritems():
            logger.info("检查数据表", Util.value2pystr(exportData[2]))
            ruleManager = RuleManager()
            ruleManager.createRules(exportData[0], exportData[2])
            if not ruleManager.checkFields(exportData[1]):
                logger.error("数据错误！")
                isSuccess = False
        if isSuccess:
            logger.info("检查数据表完成：全部正确！")
        else:
            logger.error("检查数据表完成：发生错误！")
            return False
        #write code
        logger.info("导出代码开始...")
        for exportName, exportData in self.exportDatas.iteritems():
            logger.info("导出代码", exportName)
            ret = DataWriter(exportData[0], exportData[1], outputDir, exportName).writeFile()
            if not ret:
                logger.error("导出代码失败！")
                return False
        for exportName, exportData in self.exportConstDatas.iteritems():
            ret = ConstDataWriter(exportData[0], exportData[1], outputDir, exportName).writeFile()
            if not ret:
                logger.error("导出代码失败！")
                return False
        logger.info("导出代码完成！")
        #write char set
        # logger.info("导出字符集开始...")
        # for charName, charSet in Util.CHAR_SET_MAP.iteritems():
        #     if not charSet:
        #         continue
        #     content = ""
        #     for char in sorted(charSet):
        #         char = char.encode('utf-8')
        #         if char and char != ' ':
        #             content += char
        #     if content:
        #         Writer(outputDir, charName).writeChar(content)
        # logger.info("导出字符集完成！")
        return True

    def _transformData(self, data):
        exportName = data[Util.FILE_EXPORT_NAME]
        rawData = []
        fields = data[Util.FIELD_NAME_KEY]
        for row in data[Util.DATA_KEY]:
            item = {}
            for i in xrange(len(fields)):
                if fields[i]:
                    item[fields[i]] = row[i]
            rawData.append(item)
        head = {}
        for k, v in data.iteritems():
            if k != Util.DATA_KEY:
                head[k] = v
        return exportName, head, rawData

    def _transformConstData(self, data):
        exportName = data[Util.FILE_EXPORT_NAME]
        rawData = []
        for row in data[Util.DATA_KEY]:
            rawData.append(row)
        head = {}
        head[Util.FILE_IDENTIFY] = data[Util.FILE_IDENTIFY]
        return exportName, head, rawData

if __name__ == '__main__':
    if len(sys.argv) >= 3:
        isSuccess = Csv2Code().transform(*sys.argv[1:3])
    else:
        logger.error('合法的命令行应该是：python csv2Code.py inputPath outputPath')
        isSuccess = False
    if isSuccess:
        sys.exit(0)
    else:
        sys.exit(1)
