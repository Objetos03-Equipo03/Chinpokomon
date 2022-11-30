from model.Logger.Level import Nivel


class Logger():
    
    _instance = None

    def __init__(self):
        None
    
    @classmethod
    def instance(cls, level=Nivel.DEBUG):
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
        if(self.nivel != Nivel.DEBUG):
            print("INFO: " + respuesta)

    def warn(self, respuesta):
        if( self.nivel != Nivel.DEBUG or self.nivel == Nivel.INFO):
            print("WARN: " + respuesta)

    def error(self, respuesta):
        if( self.nivel == Nivel.ERROR):
            print("ERROR: " + respuesta)