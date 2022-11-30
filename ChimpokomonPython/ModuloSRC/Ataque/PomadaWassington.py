from Ataque.Ataque import Ataque

class PomadaWassington(Ataque):
    def __init__(self):
            Ataque.__init__(self, 1, "PomadaWassington")

    def dañar(self, chimpokomonAtacante, chimpokomonEnemigo):
        if(chimpokomonAtacante.tieneVentajaSobre(chimpokomonEnemigo)):
            chimpokomonAtacante.nivelDeVida(chimpokomonAtacante.nivelDeVida + 6)
        else:
            chimpokomonAtacante.nivelDeVida(chimpokomonAtacante.nivelDeVida + 5)

