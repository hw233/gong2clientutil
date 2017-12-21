# -*- coding: UTF-8 -*-
'''
Created on 2013-12-17

@author: bezy
'''

from utils.util import Util
from uniqueRule import UniqueRule
from notEmptyRule import NotEmptyRule
from formulaRule import FormulaRule
from pyparsingRule import PyparsingRule

class RuleManager(object):
    def __init__(self):
        super(RuleManager, self).__init__()
        self._rowRules = []

    def createRules(self, iHeads, iTableNames):
        for index, iHead in enumerate(iHeads):
            Util.CURRENT_TABLE_NAME = iTableNames[index]
            rowRule = {}
            for i in xrange(len(iHead[Util.FIELD_NAME_KEY])):
                if not iHead[Util.FIELD_NAME_KEY][i]:
                    continue
                rules = []
                if iHead[Util.UNIQUE_KEY][i] == 'unique':
                    rules.append(UniqueRule())
                if iHead[Util.NOT_EMPTY_KEY][i] == 'not_empty':
                    rules.append(NotEmptyRule())
                if iHead[Util.TYPE_KEY][i] == Util.TYPE_EVAL:
                    rules.append(FormulaRule())
                if iHead[Util.REGEXP_CHECK_KEY][i]:
                    for regCheck in iHead[Util.REGEXP_CHECK_KEY][i]:
                        if regCheck:
                            rules.append(PyparsingRule(regCheck))
                rowRule[iHead[Util.FIELD_NAME_KEY][i]] = rules
            self._rowRules.append(rowRule)

    def checkFields(self, iRawDatas):
        isSuccess = True
        for index, rawData in enumerate(iRawDatas): 
            for field, rules in self._rowRules[index].iteritems():
                for rule in rules:
                    if not rule.check(rawData, field):
                        isSuccess = False

        return isSuccess
