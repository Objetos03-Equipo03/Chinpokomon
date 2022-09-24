
def singleton(cls):

    instances = dict()

    def wrap(*arg, **kwargs):
        if cls not in instances:
            instances[cls] = cls(*arg, **kwargs)

        return instances[cls]

    return wrap


@singleton
class LoggerAux():
    
    LEVEL_DEBUG = "DEBUG"
    LEVEL_INFO = "INFO"
    LEVEL_WARN = "WARN"
    LEVEL_ERROR = "ERROR"

    def __init__(self):
        self._level = self.LEVEL_DEBUG
        self._debug = ""
        self._info = ""
        self._warn = ""
        self._error = ""
    
    def setLevel(self, level):
        self._level = level

    
    def debug(self):
        if self._level == self.LEVEL_DEBUG:
            return "debug: " + self._debug + "info: " + self._info + "warn: " + self._warn + "error: " + self._error
        else:
            return None
        

    def info(self):
        if self._level != self.LEVEL_WARN and self._level != self.LEVEL_ERROR:
            return "info: " + self._info + "warn: " + self._warn + "error: " + self._error
        else:
            return None

    def warn(self):
        if self._level != self.LEVEL_ERROR:
            return "warn: " + self._warn + "error: " + self._error
        else:
            return None

    def error(self):
        return "error: " + self._error

    def setDebug(self, debug):
        self._debug = debug

    def setInfo(self, info):
        self._info = info

    def setWarn(self, warn):
        self._warn = warn

    def setError(self, error):
        self._error = error

LOGGER = LoggerAux()