##from IChimpokomon import AChimpokomon

from ChimpokomonPython.ModuloSRC.Ataque import Ataque


class Chimpokomon(Ataque):

    def __init__(self, nombre, nivelDeVida, naturaleza, ataques):
        self._nombre = nombre
        self._nivelDeVida = nivelDeVida
        self._naturaleza = naturaleza
        self._ataques = ataques
        
    @property
    def nombre(self):
        return self._nombre

    @nombre.setter
    def nombre(self, nombre):
        self._nombre = nombre

    @property
    def nivelDeVida(self):
        return self._nivelDeVida

    @nivelDeVida.setter
    def nivelDeVida(self, nivelDeVida):
        self._nivelDeVida = nivelDeVida

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
            print("El chimpokomon " + self.getNombre + " ha sido derrotado")
        return self.nivelVida <= 0

    def restarVida(self, vida):
        self.nivelVida -= vida
        print("El chimpokomon " + self.getNombre + " le queda " + str(self.nivelVida) + " de vida")

    def pelearContra(self, chimpokomon):
        for  i in i < len(self.ataques):
            self.ataques[i].dañar(chimpokomon, self)

    def tieneVentajaSobre(self, chimpokomon):
        return(self.naturaleza == chimpokomon.naturaleza.ROBOT and chimpokomon.naturaleza == chimpokomon.naturaleza.ANIMAL or
        self.naturaleza == chimpokomon.naturaleza.ANIMAL and chimpokomon.naturaleza == chimpokomon.naturaleza.COSA or
        self.naturaleza == chimpokomon.naturaleza.COSA and chimpokomon.naturaleza == chimpokomon.naturaleza.ROBOT)
            
    


