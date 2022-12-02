from Ataque.Ataque import Ataque
import random

class Zapatazo(Ataque):
    def __init__(self):
        Ataque.__init__(self, 1, "Zapatazo")

    def dañar(self, chimpokomonAtacante, chimpokomonEnemigo):
        ram = random.randint(0, 1)
        if(chimpokomonAtacante.tieneVentajaSobre(chimpokomonEnemigo)):
            if (ram < 0.5):
                chimpokomonEnemigo.restarVida(4)
            else:
                #logger.info(chipoAtacante.getNombre() + " Realizo un ataque veloz");
                chimpokomonEnemigo.restarVida(5)
        else:
            if (ram < 0.5):
                chimpokomonEnemigo.restarVida(1)
            else:
                #logger.info(chipoAtacante.getNombre() + " Realizo un ataque veloz");
                chimpokomonEnemigo.restarVida(2)

       
