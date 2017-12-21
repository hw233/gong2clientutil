# -*- coding: UTF-8 -*-
'''
Created on 2013-11-27

@author: bezy
'''
import sys
import os

DEBUG = 10
INFO = 20
WARNING = 30
ERROR = 40
CRITICAL = 50

LOG_LEVEL = DEBUG

def _lvlStack():
    """
    try:
        raise ZeroDivisionError
    except ZeroDivisionError:
        f = sys.exc_info()[2].tb_frame.f_back
    """
    f = sys._getframe().f_back
    n = 1
    while f != None and n < 2:
        f = f.f_back
        n = n+1
    if f and n == 2:
        filename = f.f_code.co_filename
        funcname = f.f_code.co_name
        lineno = f.f_lineno
        _path, filename = os.path.split(filename)
        filename, _ext = os.path.splitext(filename)
        return '%s.%s:%d' % (filename, funcname, lineno)
    else:
        return 'GLOBAL'

def _lvlPrint(title, stack, msg, args):
    msg = str(msg) + ' ' + ' '.join([str(a) for a in args])
    if stack:
        print '[%s][%s] %s' % (title, stack, msg)
    else:
        print '[%s] %s' % (title, msg)

def debug(msg, *args):
    if LOG_LEVEL > DEBUG:
        return
    _lvlPrint('DEBUG', '', msg, args)

def info(msg, *args):
    if LOG_LEVEL > INFO:
        return
    _lvlPrint('INFO', '', msg, args)

def warning(msg, *args):
    if LOG_LEVEL > WARNING:
        return
    _lvlPrint('WARNING', '', msg, args)

def error(msg, *args):
    if LOG_LEVEL > ERROR:
        return
    _lvlPrint('ERROR', '', msg, args)

def critical(msg, *args):
    if LOG_LEVEL > CRITICAL:
        return
    st = _lvlStack()
    _lvlPrint('CRITICAL', st, msg, args)
