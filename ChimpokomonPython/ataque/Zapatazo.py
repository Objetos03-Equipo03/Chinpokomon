from chimpokomon.Chimpokomon import Chimpokomon
import random
from Ataque import Ataque

class Zapatazo(Ataque):
    def dañar(self,  chinpokomon : Chimpokomon, chimpokomonAtacante : Chimpokomon):
        ram = random.randint(0,1)
        if ram < 0.5:
            chinpokomon.restarVida(1)
        else:
            chinpokomon.restarVida(2)
            print(chimpokomonAtacante.getNombre() + " Realizo un ataque veloz")
