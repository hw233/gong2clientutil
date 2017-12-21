# -*- coding: UTF-8 -*-
'''
Created on 2013-12-19

@author: bezy
'''

from unitRule import UnitRule
from pyparsing import ParseException
from utils.util import Util
from utils import logger

class IdRefRule(UnitRule):

    def __init__(self, iTableName, iRefIdName):
        super(IdRefRule, self).__init__()
        if iTableName is None:
            self.tableName = Util.CURRENT_TABLE_NAME
        else:
            self.tableName = iTableName
        self.refIdName = iRefIdName
        self.refValues = []
        if not self._preProcess():
            raise ParseException, '\'%s\'表\'%s\'列为IdRefRule预处理失败' % (self.tableName, self.refIdName)

    def check(self, iData, iFieldName):
        isSuccess = True
        dup = set()
        for item in iData:
            values = item[iFieldName]
            for value in values:
                if not value:
                    continue
                if value not in self.refValues:
                    dup.add(value)
                    isSuccess = False
        if not isSuccess:
            logger.error('引用项 %s 出现在\'%s\'列，在\'%s\'表\'%s\'列中没有找到' % (Util.value2pystr(dup), iFieldName, self.tableName, self.refIdName))
        return isSuccess

    def _preProcess(self):
        head, rawData = Util.TABLE_CACHE.get(self.tableName, (None, None, ))
        if head and rawData:
            keyType = None
            for i in xrange(len(head[Util.FIELD_NAME_KEY])):
                if head[Util.FIELD_NAME_KEY][i] == self.refIdName:
                    keyType = head[Util.TYPE_KEY][i]
            if not keyType:
                return False
            for item in rawData:
                value = item[self.refIdName]
                if not value:
                    continue
                try:
                    value = Util.getValueByType(keyType, value)
                except ValueError:
                    return False
                if isinstance(value, list) or isinstance(value, tuple):
                    self.refValues.extend([str(v) for v in value])
                else:
                    self.refValues.append(str(value))
            self.refValues = set(self.refValues)
            return True
        return False
