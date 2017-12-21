# -*- coding: UTF-8 -*-
'''
Created on 2013-12-17

@author: bezy
'''

from datetime import datetime

from pyparsing import ParseException, Word, alphas, nums, alphanums, ZeroOrMore, Forward, oneOf, Empty,\
        OneOrMore, Combine, Optional, Regex, Suppress, Literal, Group, quotedString, QuotedString, CharsNotIn
from unitRule import UnitRule
from idRefRule import IdRefRule

from utils.util import Util
from utils import logger

def _get_check_stime():
    def wrapper(subject, curpos, cap):
        stime = cap[0].strip()
        try:
            if len(stime) == 8:
                datetime.strptime(stime, '%H:%M:%S')
            elif len(stime) == 5:
                datetime.strptime(stime, '%H:%M')
            elif len(stime) == 2:
                datetime.strptime(stime, '%H')
            else:
                raise ValueError()
        except ValueError:
            raise ParseException, 'stime 类型错误，正确类型为HH:MM:SS | HH:MM | HH 错误的输入值为%s' % stime
    return wrapper

def _get_check_date():
    def wrapper(subject, curpos, cap):
        date = cap[0].strip()
        try:
            if len(date) == 10:
                datetime.strptime(date, '%Y-%m-%d')
            else:
                raise ValueError()
        except ValueError:
            raise ParseException, 'date 类型错误，正确类型为YYYY-MM-DD 错误的输入值为%s' % date
    return wrapper

def _get_check_ltime():
    def wrapper(subject, curpos, cap):
        ltime = cap[0].strip()
        try:
            if len(ltime) == 19:
                datetime.strptime(ltime, '%Y-%m-%d %H:%M:%S')
            elif len(ltime) == 16:
                datetime.strptime(ltime, '%Y-%m-%d %H:%M')
            elif len(ltime) == 13:
                datetime.strptime(ltime, '%Y-%m-%d %H')
            else:
                raise ValueError()
        except ValueError:
            raise ParseException, 'ltime 类型错误，正确类型为YYYY-MM-DD HH:MM:SS | HH:MM | HH 错误的输入值为%s' % ltime
    return wrapper

def _get_check_week():
    def wrapper(subject, curpos, cap):
        try:
            week = int(cap[0])
            if week < 1 or week > 7:
                raise ValueError()
        except ValueError:
                raise ParseException, 'week 类型错误，必须为[1, 7] 错误的输入值为 %s ' % cap[0]
    return wrapper

def _get_check_num_int(a, b):
    def wrapper(subject, curpos, cap):
        if a is None:
            if int(cap[0]) > b:
                raise ParseException, 'check_int %s in (%s, %s)' % (cap[0], str(a), str(b))
        elif b is None:
            if int(cap[0]) < a:
                raise ParseException, 'check_int %s in (%s, %s)' % (cap[0], str(a), str(b))
        elif int(cap[0]) < a or int(cap[0]) > b:
            raise ParseException, 'check_int %s in (%s, %s)' % (cap[0], str(a), str(b))
    return wrapper

def _get_check_num_float(a, b):
    def wrapper(subject, curpos, cap):
        if a is None:
            if float(cap[0]) > b:
                raise ParseException, 'check_float %s in (%s, %s)' % (cap[0], str(a), str(b))
        elif b is None:
            if float(cap[0]) < a:
                raise ParseException, 'check_float %s in (%s, %s)' % (cap[0], str(a), str(b))
        elif float(cap[0]) < a or float(cap[0]) > b:
            raise ParseException, 'check_float %s in (%s, %s)' % (cap[0], str(a), str(b))
    return wrapper

def _get_check_ID(checkRule):
    def wrapper(subjuct, curpos, cap):
        datas = [{'id' : cap}]
        res = checkRule.check(datas, 'id')
        if not res:
            raise ParseException, 'check_ID ' + Util.value2pystr(cap)
    return wrapper

def _get_check_and(iParseList):
    def wrapper(subjuct, curpos, cap):
        for item in iParseList:
            try:
                item.parseString(cap[0])
            except:
                raise ParseException, 'check_and ' + cap[0]
    return wrapper

def _get_check_not(iParse):
    def wrapper(subjuct, curpos, cap):
        try:
            iParse.parseString(cap[0])
        except ParseException:
            return
        raise ParseException, 'check_not ' + cap[0]
    return wrapper

BASE_TYPE_CHECK = {
    '#stime' : _get_check_stime,
    '#date' : _get_check_date,
    '#ltime' : _get_check_ltime,
    '#week' : _get_check_week,
}

class PyparsingRule(UnitRule):

    # item format
    NUMS = Word(nums)
    INTEGER = Combine(Optional(oneOf("+ -")) + NUMS)
    FLOAT = Combine(INTEGER + Optional("." + Optional(NUMS)) + Optional(oneOf("E e") + INTEGER))
    STRING = QuotedString('"', '\\') | QuotedString("'", "\\")
    IDENT = Word(alphas + "_", alphanums + "_")

    # item format input
    INPUT_EXPRESSION = (FLOAT | STRING | IDENT)
    INPUT_DATETIEM = Word(nums, nums + "-: ")
    INPUT_ID_REFS = (Suppress("(") + OneOrMore(FLOAT  + Suppress(",")) + Suppress(")")) | \
                    (Suppress("(") + OneOrMore(STRING  + Suppress(",")) + Suppress(")")) | \
                    OneOrMore(FLOAT  + Suppress(",")) | OneOrMore(STRING  + Suppress(",")) | \
                    INPUT_EXPRESSION

    # factor format
    FACTOR_INT = Group(Literal("#int") + Suppress("(") + Optional(INTEGER) + Literal(",") + Optional(INTEGER) + Suppress(")"))
    FACTOR_FLOAT = Group(Literal("#float") + Suppress("(") + Optional(FLOAT) + Literal(",") + Optional(FLOAT) + Suppress(")"))
    FACTOR_IREF = Group(Literal("#iref") + Suppress("(") + IDENT + Suppress(")"))
    FACTOR_EREF = Group(Literal("#eref") + Suppress("(") + CharsNotIn(",") + Suppress(",") + IDENT + Suppress(")"))
    FACTOR_STRING = Group(Literal("#string"))
    FACTOR_FIX_TYPE = Group(Literal("#stime") | Literal("#date") | Literal("#ltime") | Literal("#week") | Literal("#crontab"))
    FACTOR_REGULAR_EXP = Group(Literal('#reg') + Suppress('(') + quotedString + Suppress(')'))

    # syntax items
    EXP, REP, OR_PART, OR, AND_PART, AND, NOT, TERM, FACTOR, STR, = ( Forward() for i in xrange(10) )

    # syntax tree
    FACTOR << ( FACTOR_INT | FACTOR_FLOAT | FACTOR_IREF | FACTOR_EREF | FACTOR_STRING | FACTOR_FIX_TYPE | FACTOR_REGULAR_EXP )
    REP << Group( Literal("#rep") + Suppress("(") + INTEGER + Suppress(",") + INTEGER + Suppress(",") + EXP + Suppress(")") )
    OR_PART << Suppress(",") + EXP
    OR << Group( Literal("#or") + Suppress("(") + EXP + ZeroOrMore(OR_PART) + Suppress(")") )
    AND_PART << Suppress(",") + EXP
    AND << Group( Literal("#and") + Suppress("(") + EXP + ZeroOrMore(AND_PART) + Suppress(")") )
    NOT << Group( Literal("#not") + Suppress("(") + EXP + Suppress(")") )
    TERM << ( REP | OR | AND | NOT | FACTOR )
    EXP << Group( (TERM | STRING) + ZeroOrMore(EXP) )

    def __init__(self, reg):
        super(PyparsingRule, self).__init__()
        self.reg = reg
        tree = PyparsingRule.EXP.parseString(self.reg, False).asList()
        self._pattern = self._generate(tree)

    def check(self, iData, iFieldName):
        isSuccess = True
        errors = []
        for item in iData:
            if len(item[iFieldName]) == 0:
                continue
            try:
                self._pattern.parseString(item[iFieldName], True)
            except ParseException as e:
                logger.error('匹配规则 %s 异常: %s' % (self.reg, str(e)))
                isSuccess = False
                errors.append(item[iFieldName])
        if not isSuccess:
            logger.error('不符合规则 %s 的内容 %s 出现在\'%s\'列' % (self.reg, Util.value2pystr(errors), iFieldName))
        return isSuccess

    def _generate(self, tree):
        pattern = Empty()
        i = 0
        while i < len(tree):
            if isinstance(tree[i], list):
                p1 = self._generate(tree[i])
                pattern += p1

            elif tree[i] =="#rep":
                if i != 0 or len(tree) < 4:
                    raise ParseException, "--> 策划检查表达式有错误，可疑处为#rep表达式"
                p1 = self._generate(tree[3])
                try:
                    p1 = p1 * (int(tree[1]), int(tree[2]))
                except ValueError:
                    raise ParseException, "--> 策划检查表达式有错误，可疑处为#rep中循环数不为整数"
                pattern += p1
                break

            elif tree[i] == "#or":
                if i != 0 or len(tree) < 2:
                    raise ParseException, "--> 策划检查表达式有错误，可疑处为#or表达式"
                p1 = self._generate(tree[1])
                for j in xrange(2, len(tree)):
                    p2 = self._generate(tree[j])
                    p1 = p1 | p2
                pattern += p1
                break

            elif tree[i] == "#and":
                if i != 0 or len(tree) < 2:
                    raise ParseException, "--> 策划检查表达式有错误，可疑处为#and表达式"
                parseList = [self._generate(tree[1])] 
                for j in xrange(2, len(tree)):
                    p2 = self._generate(tree[j])
                    parseList.append(p2)
                
                p1 = (Empty() + parseList[0]).setParseAction(_get_check_and(parseList))
                pattern += p1
                break

            elif tree[i] == "#not":
                if i != 0 or len(tree) < 2:
                    raise ParseException, "--> 策划检查表达式有错误，可疑处为#not表达式"
                p1 = self._generate(tree[1])
                p1 = (Empty() + PyparsingRule.INPUT_EXPRESSION).setParseAction(_get_check_not(p1))
                pattern += p1
                break

            elif tree[i] == "#int":
                if i != 0 or len(tree) < 2:
                    raise ParseException, "--> 策划检查表达式有错误，可疑处为#int表达式"
                try:
                    if len(tree) == 2:
                        p1 = PyparsingRule.INTEGER
                    elif len(tree) == 3:
                        if tree[1] == ',':
                            p1 = (Empty() + PyparsingRule.INTEGER).setParseAction(_get_check_num_int(None, int(tree[2])))
                        else:
                            p1 = (Empty() + PyparsingRule.INTEGER).setParseAction(_get_check_num_int(int(tree[1]), None))                                                                     
                    else:
                        p1 = (Empty() + PyparsingRule.INTEGER).setParseAction(_get_check_num_int(int(tree[1]), int(tree[3])))
                except ValueError:
                    raise ParseException, "--> 策划检查表达式有错误，可疑处为#int中上下限不为整数"
                pattern += p1
                break

            elif tree[i] == "#float":
                if i != 0 or len(tree) < 2:
                    raise ParseException, "--> 策划检查表达式有错误，可疑处为#float表达式"
                try:
                    if len(tree) == 2:
                        p1 = PyparsingRule.INTEGER
                    elif len(tree) == 3:
                        if tree[1] == ',':
                            p1 = (Empty() + PyparsingRule.FLOAT).setParseAction(_get_check_num_float(None, int(tree[2])))
                        else:
                            p1 = (Empty() + PyparsingRule.FLOAT).setParseAction(_get_check_num_float(int(tree[1]), None))                                                                     
                    else:
                        p1 = (Empty() + PyparsingRule.FLOAT).setParseAction(_get_check_num_float(float(tree[1]), float(tree[3])))
                except ValueError:
                    raise ParseException, "--> 策划检查表达式有错误，可疑处为#float中上下限不为浮点数"
                pattern += p1
                break

            elif tree[i] == "#iref":
                if i != 0 or len(tree) < 2:
                    raise ParseException, "--> 策划检查表达式有错误，可疑处为#iref表达式"
                checkRule = IdRefRule(None, tree[1])
                p1 = (Empty() + PyparsingRule.INPUT_ID_REFS).setParseAction(_get_check_ID(checkRule))
                pattern += p1
                break

            elif tree[i] == "#eref":
                if i != 0 or len(tree) < 3:
                    raise ParseException, "--> 策划检查表达式有错误，可疑处为#eref表达式"
                checkRule = IdRefRule(tree[1], tree[2])
                p1 = (Empty() + PyparsingRule.INPUT_ID_REFS).setParseAction(_get_check_ID(checkRule))
                pattern += p1
                break

            elif tree[i] == "#string":
                pattern += PyparsingRule.STRING

            elif tree[i] == "#stime":
                p1 = (Empty() + PyparsingRule.INPUT_DATETIEM).setParseAction(BASE_TYPE_CHECK[tree[i]]())
                pattern += p1

            elif tree[i] == "#date":
                p1 = (Empty() + PyparsingRule.INPUT_DATETIEM).setParseAction(BASE_TYPE_CHECK[tree[i]]())
                pattern += p1

            elif tree[i] == "#ltime":
                p1 =  (Empty() + PyparsingRule.INPUT_DATETIEM).setParseAction(BASE_TYPE_CHECK[tree[i]]())
                pattern += p1

            elif tree[i] == "#week":
                p1 =  (Empty() + PyparsingRule.INPUT_DATETIEM).setParseAction(BASE_TYPE_CHECK[tree[i]]())
                pattern += p1

            elif tree[i] == '#reg':
                if i != 0 or len(tree) < 2:
                    raise ParseException, "--> 策划检查表达式有错误，可疑处为#reg表达式"
                pattern += Regex(tree[1][1:-1])
                break

            elif type(tree[i]) == type(""):
                pattern += tree[i]

            i = i + 1

        return pattern
