from ChimpokomonPython.chimpokomon.Chimpokomon import Chimpokomon
from abc import ABC, abstractmethod

class IInterface(object):
    @abstractmethod
    def dañar(self, chinpokomon: Chimpokomon, ChipokomonAtacante: Chimpokomon):
        pass
