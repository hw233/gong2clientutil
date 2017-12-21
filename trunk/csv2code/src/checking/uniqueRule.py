# -*- coding: UTF-8 -*-
'''
Created on 2013-12-17

@author: bezy
'''

from unitRule import UnitRule
from utils.util import Util
from utils import logger

class UniqueRule(UnitRule):

    def __init__(self):
        super(UniqueRule, self).__init__()

    def check(self, iData, iFieldName):
        isSuccess = True
        unique = set()
        dup = set()
        for item in iData:
            if item[iFieldName] in unique:
                isSuccess = False
                if item.has_key('id'):
                    dup.add(item['id'])
                else:
                    dup.add(item[iFieldName])
            else:
                unique.add(item[iFieldName])
        if not isSuccess:
            logger.error('重复的项 %s 出现在\'%s\'列' % (Util.value2pystr(list(dup)), iFieldName))
        return isSuccess
