from abc import ABC, abstractmethod

class AChimpokomon(ABC):

    @abstractmethod
    def restarVida(self, vida):
        pass
    
    @abstractmethod
    def pelearContra(self, Chimpokomon):
        pass


