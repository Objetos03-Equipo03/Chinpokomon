from Ataque.Ataque import Ataque



class CañonConico(Ataque):
    def __init__(self):
        Ataque.__init__(self, "Cañon conico", 4, 1)

    def dañar(self, chinpokomon, poder):
        chinpokomon.restarVida(poder)
