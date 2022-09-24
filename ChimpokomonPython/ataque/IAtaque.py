from Chimpokomon import Chimpokomon
from abc import ABC, abstractmethod

class IInterface(ABC):
    @abstractmethod
    def dañar(self, chinpokomon: Chimpokomon, ChipokomonAtacante: Chimpokomon):
        pass
