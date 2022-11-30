
class Chimpokomon():

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
        return self.nivelDeVida <= 0

    def restarVida(self, vida):
        self.nivelDeVida(self.nivelDeVida - vida)

    def pelearContra(self, chimpokomonEnemigo):
        for  i in i < len(self.ataques):
            self.ataques[i].dañar(self, chimpokomonEnemigo)

    def tieneVentajaSobre(self, chimpokomon):
        return(self.naturaleza == chimpokomon.naturaleza.ROBOT and chimpokomon.naturaleza == chimpokomon.naturaleza.ANIMAL or
        self.naturaleza == chimpokomon.naturaleza.ANIMAL and chimpokomon.naturaleza == chimpokomon.naturaleza.COSA or
        self.naturaleza == chimpokomon.naturaleza.COSA and chimpokomon.naturaleza == chimpokomon.naturaleza.ROBOT)
            
    


