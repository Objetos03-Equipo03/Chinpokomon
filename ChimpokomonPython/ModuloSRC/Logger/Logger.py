from Logger.Level import Level

class Logger():
    
    _instance = None

    def __init__(self):
        None
    
    @classmethod
    def instance(cls, level=Level.DEBUG):
        if cls._instance is None:
            cls._instance = cls.__new__(cls)
            cls._level = level
        return cls._instance

    @property
    def level(self):
        return self._level

    @level.setter
    def level(self, level):
        self._level = level

    def debug(self, respuesta):
        print("DEBUG: " + respuesta)

    def info(self, respuesta):
        if(self.level != Level.DEBUG):
            print("INFO: " + respuesta)

    def warn(self, respuesta):
        if( self.level != Level.DEBUG or self.level == Level.INFO):
            print("WARN: " + respuesta)

    def error(self, respuesta):
        if( self.level == Level.ERROR):
            print("ERROR: " + respuesta)