from Ataque import Ataque

class RayoVeloz(Ataque):
    def __init__(self):
            Ataque.__init__(self, "Rayo Veloz", 3, 1)

    def dañar(self,  chinpokomon, poder):
        chinpokomon.restarVida(poder)
