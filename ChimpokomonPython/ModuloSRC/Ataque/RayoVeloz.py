from Ataque import Ataque

class RayoVeloz(Ataque):
    def __init__(self):
            Ataque.__init__(self, 3, "RayoVeloz")

    def dañar(self,  chimpokomonAtacante, chimpokomonEnemigo):
        if(chimpokomonAtacante.tieneVentajaSobre(chimpokomonEnemigo)):
            chimpokomonEnemigo.restarVida(4)
        else:
            chimpokomonEnemigo.restarVida(3)


