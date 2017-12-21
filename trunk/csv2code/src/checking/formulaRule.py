# -*- coding: UTF-8 -*-
'''
Created on 2013-12-18

@author: bezy
'''

from unitRule import UnitRule
from utils import logger
from utils.util import Util
from utils.scriptRunningEnv import ScriptRunningEnv

class FormulaRule(UnitRule):

    def __init__(self):
        super(FormulaRule, self).__init__()
        self._scriptEnv = ScriptRunningEnv.getInstance()

    def check(self, iData, iFieldName):
        isSuccess = True
        errors = []
        for item in iData:
            if len(item[iFieldName]) == 0:
                continue
            try:
                self._scriptEnv.execute(item[iFieldName], Util.DUMMY_LOCAL)
            except:
                isSuccess = False
                errors.append(item[iFieldName])
        if not isSuccess:
            logger.error('错误脚本 %s 出现在\'%s\'列' % (Util.value2pystr(errors), iFieldName))
        return isSuccess
