from IAtaque import IInterface
class Ataque(IInterface):
    def __init__(self, nombre, daño):
        self._nombre = nombre
        self._daño = daño
