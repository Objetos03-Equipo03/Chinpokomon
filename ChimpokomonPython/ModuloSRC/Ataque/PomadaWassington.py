from Ataque.Ataque import Ataque

class PomadaWassington(Ataque):
    def __init__(self):
            Ataque.__init__(self, "Pomada Wassington", 5, 1)

    def dañar(self, chinpokomon, poder):
        chinpokomon.atacante.sumarVida(poder)
