from abc import ABC, abstractmethod
class Ataque():
    def __init__(self, nombre, poder, puntoExtra):
        self._nombre = nombre
        self._poder = poder
        self._puntoExtra = puntoExtra

    @property
    def nombre(self):
      return self._nombre

    @nombre.setter
    def nombre(self, nombre):
        self.nombre = nombre

    @property
    def poder(self):
      return self._poder

    @poder.setter
    def poder(self, poder):
        self._poder = poder

    @property
    def puntoExtra(self):
      return self._puntoExtra

    @puntoExtra.setter
    def puntoExtra(self, puntoExtra):
        self._puntoExtra = puntoExtra

    def atacar(self, Chimpokomon):
        if(Chimpokomon.atacante.tieneVentaja(Chimpokomon)):
            self.dañar(Chimpokomon, self.poder + self.puntoExtra)
        else:
            self.dañar(Chimpokomon, self.poder)

    @abstractmethod
    def dañar(self, Chimpokomon, poder):
        pass
    