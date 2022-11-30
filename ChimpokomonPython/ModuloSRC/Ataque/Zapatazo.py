from Ataque import Ataque
from Chimpokomon import Chimpokomon
import random

class Zapatazo(Ataque):
    def __init__(self):
            Ataque.__init__(self, "Zapatazo", 1, 3)

    def dañar(self,  chinpokomon, poder):
        ram = random.randint(0, 1)
        if ram == 0:
            chinpokomon.restarVida(poder * 2)
        else:
            chinpokomon.restarVida(poder)
       
