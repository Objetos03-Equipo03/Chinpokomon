from ChimpokomonPython.chimpokomon.Chimpokomon import Chimpokomon


class Carnotron(Chimpokomon):

    def __init__(self, naturaleza, ataque):
        super().__init__(naturaleza, ataque)
        self.nombre = "Carnotron"
        self.nivelVida = 20



