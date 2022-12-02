from Ataque.Ataque import Ataque

class CañonConico(Ataque):
    def __init__(self):
            Ataque.__init__(self, 2, "CañonConico")

    def dañar(self, chinpokomonAtacante, chimpokomonEnemigo):
        if(chinpokomonAtacante.tieneVentajaSobre(chimpokomonEnemigo)):
            chinpokomonAtacante.restarVida(5)
        else:
            chimpokomonEnemigo.restarVida(4)
