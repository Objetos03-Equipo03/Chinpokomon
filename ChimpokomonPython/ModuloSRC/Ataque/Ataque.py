from abc import ABC, abstractmethod
class Ataque():
    def __init__(self, dañoValor, nombre):
        self._dañoValor = dañoValor
        self._nombre = nombre

    @property
    def nombre(self):
      return self._nombre

    @nombre.setter
    def nombre(self, nombre):
        self.nombre = nombre

    @property
    def dañoValor(self):
      return self._dañoValor

    @dañoValor.setter
    def dañoValor(self, dañoValor):
        self._dañoValor = dañoValor

    @abstractmethod
    def dañar(self, chimpokomonAtacante, chimpokomonEnemigo):
        pass
    