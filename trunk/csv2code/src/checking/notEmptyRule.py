# -*- coding: UTF-8 -*-
'''
Created on 2013-12-17

@author: bezy
'''

from unitRule import UnitRule
from utils.util import Util
from utils import logger

class NotEmptyRule(UnitRule):

    def __init__(self):
        super(NotEmptyRule, self).__init__()

    def check(self, iData, iFieldName):
        isSuccess = True
        emptys = []
        for item in iData:
            if len(item[iFieldName]) == 0:
                isSuccess = False
                if item.has_key('id'):
                    emptys.append(item['id'])
                else:
                    emptys.append(item)
        if not isSuccess:
            logger.error('空白项 %s 出现在\'%s\'列' % (Util.value2pystr(emptys), iFieldName))
        return isSuccess
