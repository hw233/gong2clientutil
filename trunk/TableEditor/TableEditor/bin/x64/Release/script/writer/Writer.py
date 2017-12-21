# -*- coding: UTF-8 -*-
'''
Created on 2013-11-30

@author: bezy
'''

import os
from utils.util import Util
from utils import logger

class Writer(object):

    def __init__(self, directory, fileName):
        super(Writer, self).__init__()
        self.directory = directory
        self.luaFileName = fileName.lower()
        self.javaFileName = ''.join(map(lambda x: x.capitalize(), fileName.lower().split('_')))
        self.chartFileName = fileName.lower()

    def writeLua(self, content):
        try:
            d = self.directory + os.path.sep + Util.LUA_FOLDER
            f = d + os.path.sep + self.luaFileName + '.lua'
            if not os.path.exists(d):
                os.makedirs(d)
            with open(f, "w") as fp:
                fp.write(content)
        except Exception:
            logger.error('写入文件%s错误' % f)
            return False
        return True

    def writeJava(self, content):
        try:
            d = self.directory + os.path.sep + Util.JAVA_FOLDER
            f = d + os.path.sep + self.javaFileName + '.java'
            if not os.path.exists(d):
                os.makedirs(d)
            with open(f, "w") as fp:
                fp.write(content)
        except Exception:
            logger.error('写入文件%s错误' % f)
            return False
        return True

    def writeChar(self, content):
        try:
            d = self.directory + os.path.sep + Util.CHAR_FOLDER
            f = d + os.path.sep + self.chartFileName + '.txt'
            if not os.path.exists(d):
                os.makedirs(d)
            with open(f, "w") as fp:
                fp.write(content)
        except Exception:
            logger.error('写入文件%s错误' % f)
            return False
        return True
