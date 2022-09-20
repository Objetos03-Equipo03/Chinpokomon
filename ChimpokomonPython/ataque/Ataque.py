from ChimpokomonPython.chimpokomon.Chimpokomon import Chimpokomon

from IAtaque import IAtaque


class Ataque(IAtaque):
    def __init__(self, nombre, daño):
        self._nombre = nombre
        self._daño = daño
