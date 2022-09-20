from Ataque import Ataque
from chimpokomon.Chimpokomon import Chimpokomon
import random
import Ataque.Ataque
import chimpokomon.Chimpokomon


class RayoVeloz(Ataque):
    def dañar(self,  chinpokomon: Chimpokomon, chimpokomonAtacante: Chimpokomon):
        if chinpokomon.getNaturaleza() == "Animal" and chimpokomonAtacante.getNaturaleza() == "Robot":
            chinpokomon.restarVida(4)
        elif chinpokomon.getNaturaleza() == "Cosa" and chimpokomonAtacante.getNaturaleza() == "Animal":
            chinpokomon.restarVida(4)
        elif chinpokomon.getNaturaleza() == "Robot" and chimpokomonAtacante.getNaturaleza() == "Cosa":
            chinpokomon.restarVida(4)
        else:
            chinpokomon.restarVida(3)
