##from IChimpokomon import AChimpokomon

from ChimpokomonPython.ModuloSRC.Ataque import Ataque


class Chimpokomon(Ataque):

    def __init__(self, nombre, vida, nivel, naturaleza, ataques):
        self._nombre = nombre
        self._vida = vida
        self._nivel = nivel
        self._naturaleza = naturaleza
        self._ataques = ataques
        
    @property
    def nombre(self):
        return self._nombre

    @nombre.setter
    def nombre(self, nombre):
        self._nombre = nombre

    @property
    def vida(self):
        return self._vida

    @vida.setter
    def vida(self, vida):
        self._vida = vida
    
    @property
    def nivel(self):
        return self._nivel

    @nivel.setter
    def nivel(self, nivel):
        self._nivel = nivel

    @property
    def naturaleza(self):
        return self._naturaleza

    @naturaleza.setter
    def naturaleza(self, naturaleza):
        self._naturaleza = naturaleza

    @property
    def ataques(self):
        return self._ataques

    @naturaleza.setter
    def ataques(self, ataques):
        self._ataques = ataques

    def estaDerrotado(self):
        if self.nivelVida <= 0:
            print("El Chimpokomon " + self.getNombre + " ha sido derrotado")
        return self.nivelVida <= 0

    def restarVida(self, vida):
        self.nivelVida -= vida
        print("El Chimpokomon " + self.getNombre + " le queda " + str(self.nivelVida) + " de vida")

    def pelearContra(self, Chimpokomon):
        for  i in i < len(self.ataques):
            self.ataques[i].dañar(Chimpokomon, self)
            


