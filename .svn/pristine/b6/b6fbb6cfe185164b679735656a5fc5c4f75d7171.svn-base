# -*- coding: UTF-8 -*-
'''
Created on 2013-11-27

@author: bezy
'''
import csv
from utils.util import Util
from utils import logger

class CsvReader(object):
    def __init__(self, fileName):
        super(CsvReader, self).__init__()
        self.fileName = fileName

    def readHead(self):
        try:
            reader = csv.reader(file(self.fileName))
            heads = {
                    Util.CONST_DATA_KEY: False,
                    Util.SPECIAL_CHECK_RULE_KEY : [], Util.EXPORT_RULE_KEY : [],
                    Util.COLUMN_NAME_KEY : [], Util.KEY_IDENTIFY : [],
                    Util.UNIQUE_KEY : [], Util.NOT_EMPTY_KEY :[],
                    Util.REGEXP_CHECK_KEY : [], Util.FIELD_NAME_KEY : [],
                    Util.TYPE_KEY : [], Util.CS_SELECTOR_KEY : [],
                    Util.FILE_IDENTIFY : None, Util.FILE_EXPORT_NAME : None,
                    Util.DATA_KEY : None,
                    }
            validCnt = 0
            for line in reader:
                line = map(lambda x : x.strip().decode('gbk').encode('utf-8'), line)

                # print("line = %s"%(line))

                # 常量表标识
                if line[0] == Util.CONST_DATA_KEY:
                    heads[Util.CONST_DATA_KEY] = True

                # 交互检查规则
                elif line[0] == Util.SPECIAL_CHECK_RULE_KEY:
                    for item in line[1:]:
                        if item:
                            specialRules = map(lambda x : x.strip(), item.split('\n'))
                            heads[Util.SPECIAL_CHECK_RULE_KEY].extend(specialRules)
                    validCnt = validCnt + 1

                # 导出规则
                elif line[0] == Util.EXPORT_RULE_KEY:
                    for item in line[1:]:
                        if item:
                            importRules = map(lambda x : x.strip(), item.split('\n'))
                            heads[Util.EXPORT_RULE_KEY].extend(importRules)
                    validCnt = validCnt + 1

                # 表头
                elif line[0] == Util.COLUMN_NAME_KEY:
                    heads[Util.COLUMN_NAME_KEY].extend(line[1:])
                    # delete the empty items
                    while len(heads[Util.COLUMN_NAME_KEY]) > 0 and heads[Util.COLUMN_NAME_KEY][-1] == '':
                        del heads[Util.COLUMN_NAME_KEY][-1]
                    validCnt = validCnt + 1

                # 关键字标识
                elif line[0] == Util.KEY_IDENTIFY:
                    for item in line[1:]:
                        if item:
                            heads[Util.KEY_IDENTIFY].append(True)
                        else:
                            heads[Util.KEY_IDENTIFY].append(False)
                    validCnt = validCnt + 1

                # 唯一标识
                elif line[0] == Util.UNIQUE_KEY:
                    for item in line[1:]:
                        if item:
                            heads[Util.UNIQUE_KEY].append('unique')
                        else:
                            heads[Util.UNIQUE_KEY].append(None)
                    validCnt = validCnt + 1

                # 非空标识
                elif line[0] == Util.NOT_EMPTY_KEY:
                    for item in line[1:]:
                        if item:
                            heads[Util.NOT_EMPTY_KEY].append("not_empty")
                        else:
                            heads[Util.NOT_EMPTY_KEY].append(None)
                    validCnt = validCnt + 1

                # 检查规则
                elif line[0] == Util.REGEXP_CHECK_KEY:
                    # parse regular expression
                    for item in line[1:]:
                        heads[Util.REGEXP_CHECK_KEY].append(map(lambda x : x.strip(), item.split('|')))
                    validCnt = validCnt + 1

                # 变量名称
                elif line[0] == Util.FIELD_NAME_KEY:
                    # parse field name, it is necessary
                    heads[Util.FIELD_NAME_KEY].extend(line[1:])
                    # delete the empty items
                    while len(heads[Util.FIELD_NAME_KEY]) > 0 and heads[Util.FIELD_NAME_KEY][-1] == '':
                        del heads[Util.FIELD_NAME_KEY][-1]
                    validCnt = validCnt + 1

                # 变量类型
                elif line[0] == Util.TYPE_KEY:
                    # parse type key
                    heads[Util.TYPE_KEY].extend(map(lambda x : x.upper(), line[1:]))
                    validCnt = validCnt + 1

                # 变量空间
                elif line[0] == Util.CS_SELECTOR_KEY:
                    # parse cs selector
                    for i, item in enumerate(line[1:len(heads[Util.FIELD_NAME_KEY]) + 1]):
                        item = item.lower()
                        if (not item in ('sc', 'cs', 'c', 's')) and heads[Util.FIELD_NAME_KEY][i] != '':
                            logger.error('%s文件存在不正确的cs选择符%s' % (self.fileName, item))
                            return None
                        else:
                            heads[Util.CS_SELECTOR_KEY].append(item)
                    validCnt = validCnt + 1

                elif line[0] == Util.BEGIN_KEY:
                    heads[Util.FILE_IDENTIFY] = line[1]
                    heads[Util.FILE_EXPORT_NAME] = line[2]
                    break

            if not heads[Util.FILE_IDENTIFY] or not heads[Util.FILE_EXPORT_NAME]:
                logger.error('%s文件没有定义文件名或导出名' % self.fileName)
                return None
            if (not heads[Util.CONST_DATA_KEY] and validCnt < 10) or (heads[Util.CONST_DATA_KEY] and validCnt < 1):
                logger.error('%s文件头定义错误' % self.fileName)
                return None

            if not heads[Util.CONST_DATA_KEY]:
                maxColumn = len(heads[Util.FIELD_NAME_KEY])

                #print("maxColumn = %d"%(maxColumn))

                #添加一些信息
                heads[Util.KEY_IDENTIFY].extend([False] * (maxColumn - len(heads[Util.KEY_IDENTIFY])))
                heads[Util.UNIQUE_KEY].extend([None] * (maxColumn - len(heads[Util.UNIQUE_KEY])))
                heads[Util.NOT_EMPTY_KEY].extend([None] * (maxColumn - len(heads[Util.NOT_EMPTY_KEY])))
                heads[Util.REGEXP_CHECK_KEY].extend(map(lambda x : [], xrange(maxColumn - len(heads[Util.REGEXP_CHECK_KEY]))))
                heads[Util.TYPE_KEY].extend([None] * (maxColumn - len(heads[Util.TYPE_KEY])))
                heads[Util.CS_SELECTOR_KEY].extend(['cs'] * (maxColumn - len(heads[Util.CS_SELECTOR_KEY])))
                #删除一些多余数据，用变量名的个数要计算
                del heads[Util.KEY_IDENTIFY][maxColumn:]
                del heads[Util.UNIQUE_KEY][maxColumn:]
                del heads[Util.NOT_EMPTY_KEY][maxColumn:]
                del heads[Util.REGEXP_CHECK_KEY][maxColumn:]
                del heads[Util.TYPE_KEY][maxColumn:]
                del heads[Util.CS_SELECTOR_KEY][maxColumn:]
            return heads
        except IOError:
            logger.error('无法读取文件%s' % self.fileName)
            return None
        except Exception:
            logger.error('解析%s头时出现无法预期的异常' % self.fileName)
            return None

    def readData(self):
        heads = self.readHead()
        if heads is None:
            return None
        if not heads[Util.CONST_DATA_KEY]:
            maxColumn = len(heads[Util.FIELD_NAME_KEY])
        else:
            maxColumn = len(heads[Util.COLUMN_NAME_KEY])
        try:
            reader = csv.reader(file(self.fileName))
            data = []
            isData = False
            for line in reader:
                if line[0].strip().decode('gbk').encode('utf-8') == Util.BEGIN_KEY:
                    isData = True
                elif isData == True:
                    # parse the data
                    line = map(lambda x : x.strip().decode('gbk').encode('utf-8'), line[1:])
                    isEmptyLine = True
                    for item in line:
                        if item:
                            isEmptyLine = False
                    if isEmptyLine:
                        continue
                    line.extend([None] * (maxColumn - len(line)))
                    del line[maxColumn:]
                    data.append(line)
            heads[Util.DATA_KEY] = data
            return heads 
        except Exception:
            logger.error('解析%s数据时出现无法预期的异常,%s的下一行可能有非法字符：' % (self.fileName, line[0]))
            return None
