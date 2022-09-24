from Ataque import Ataque
from Chimpokomon import Chimpokomon
import random


class PomadaWassington(Ataque):
    def dañar(self,  chinpokomon: Chimpokomon, chimpokomonAtacante: Chimpokomon):
        if chinpokomon.getNaturaleza() == "Animal" and chimpokomonAtacante.getNaturaleza() == "Robot":
            chimpokomonAtacante.nivelDeVida += 6
        elif chinpokomon.getNaturaleza() == "Cosa" and chimpokomonAtacante.getNaturaleza() == "Animal":
            chimpokomonAtacante.nivelDeVida += 6
        elif chinpokomon.getNaturaleza() == "Robot" and chimpokomonAtacante.getNaturaleza() == "Cosa":
            chimpokomonAtacante.nivelDeVida += 6
        else:
            chimpokomonAtacante.nivelDeVida += 5
