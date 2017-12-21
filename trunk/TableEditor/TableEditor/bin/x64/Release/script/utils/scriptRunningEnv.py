# -*- coding: UTF-8 -*-

import compiler
from types import ModuleType

class ScriptRunningEnv(object):
    INSTANCE = None

    def __init__(self):
        super(ScriptRunningEnv, self).__init__()
        self._eval_globals_ = None
        self._setup_sandbox()
    
    def _setup_sandbox(self):
        self._eval_globals_ = {}

        # safe builtins 只导入安全的系统方法，去掉了import, eval, exec等
        safe_builtins={}
        for fname in ('print', 'abs', 'chr', 'cmp', 'complex', 'dict', 'divmod', 'enumerate', 'filter', 
                      'float', 'hex', 'int', 'len', 'list', 'long', 'map', 'max', 'min', 'oct', 'ord', 'pow', 
                      'range', 'reduce', 'reversed', 'round', 'set', 'slice', 'sorted', 'str', 'sum', 'tuple', 
                      'unichr', 'unicode', 'xrange', 'zip'):
            if type(__builtins__) ==  ModuleType:
                safe_builtins[fname] = getattr(__builtins__, fname)
            elif isinstance(__builtins__, dict):
                safe_builtins[fname] = __builtins__[fname]

        self._eval_globals_['__builtins__'] = safe_builtins

        # basic functions 导入基本的数学方法
        import math
        for fname in ('acos', 'acosh', 'asin', 'asinh', 'atan', 'atan2', 'atanh', 'ceil', 'copysign', 'cos', 
                      'cosh', 'degrees', 'e', 'exp', 'fabs', 'factorial', 'floor', 'fmod', 'frexp', 'fsum', 'hypot', 
                      'isinf', 'isnan', 'ldexp', 'log', 'log10', 'log1p', 'modf', 'pi', 'pow', 'radians', 'sin', 'sinh', 
                      'sqrt', 'tan', 'tanh', 'trunc'):
            self._eval_globals_[fname] = getattr(math, fname)

        # 导入返回值方法 ret(xxx)
        self._eval_globals_['retv'] = None # if after evaluate, it's still None, it's an error
        def retf(x):
            self._eval_globals_['retv'] = x
        self._eval_globals_['ret']=retf

    def _isSingleLine(self, msg):
        return not ('\r' in msg or '\n' in msg)

    # 检查并排除非法的opcode，比如while、raise等等
    def _check_opcode(self, node, depth):
        invalid_opcode_name = ('Raise', 'While')
        for _key, n in enumerate( node ):
            name = n.__class__.__name__

            if name in invalid_opcode_name:
                print 'invalid opcode:%s', name
                return False
            
            if hasattr(n, '__iter__'):
                self._check_opcode(self, n, depth + 1)

        return True

    def execute(self, iExpression, iLocals):
        try:
            #检查输入的合法性：1）如果是单行的，用eval来运行；2）多行的用exec运行，但是必须保证有ret()
            if self._isSingleLine(iExpression):
                return eval(iExpression, iLocals)
            else:
                code_mode = 'exec'
                if not 'ret(' in iExpression: 
                    print 'ERROR: no ret() in code:%s', iExpression
                    return None # indicate error
            
                code_object = compiler.parse(iExpression, code_mode) # 多行必须用exec模式编译，eval只能支持单条语句
        
                #检查是否有非法的python命令被使用
                if not self._check_opcode(code_object, 0): # check if opcode ok
                    return None # indicate error
    
                self._eval_globals_['retv'] = None
                exec iExpression in self._eval_globals_, iLocals
                return self._eval_globals_['retv']
        except:
            return None

    @staticmethod
    def getInstance():
        if ScriptRunningEnv.INSTANCE == None:
            ScriptRunningEnv.INSTANCE = ScriptRunningEnv()
        return ScriptRunningEnv.INSTANCE
