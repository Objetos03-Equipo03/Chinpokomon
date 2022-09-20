
from ChimpokomonPython.chimpokomon.IChimpokomon import AChimpokomon

class Chimpokomon(AChimpokomon):

    def __init__(self, naturaleza, ataque):
        self.nombre = None
        self.nivelVida = None
        self.ataques = [ataque]
        self.naturaleza = naturaleza
        self.tipoDeNat = ["ChimpokomonSinNAturaleza", "Animal", "Cosa", "Roboi"]

    def getNaturaleza(self):
        return self.tipoDeNat[self.naturaleza]

    def setNaturaleza(self, naturaleza):
        self.naturaleza = naturaleza

    def getNombre(self):
        return self.nombre

    def setNombre(self, nombre):
        self.nombre = nombre

    def getNivelVida(self):
        return self.nivelVida

    def setNivelVida(self, nivelVida):
        self.nivelVida = nivelVida

    def getAtaques(self):
        return self.ataques

    def setAtaques(self, ataques):
        self.ataques = ataques

    def estaDerrotado(self):
        if self.nivelVida <= 0:
            print("El chimpokomon " + self.getNombre + " ha sido derrotado")
        return self.nivelVida <= 0

    def restarVida(self, vida):
        self.nivelVida -= vida
        print("El chimpokomon " + self.getNombre + " le queda " + str(self.nivelVida) + " de vida")

    def pelearContra(self, chimpokomon):
        for  i in i < len(self.ataques):
            self.ataques[i].dañar(chimpokomon, self)
            


