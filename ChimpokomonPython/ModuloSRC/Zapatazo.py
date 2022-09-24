from Ataque import Ataque
from Chimpokomon import Chimpokomon
import random

class Zapatazo(Ataque):
    def dañar(self,  chinpokomon: Chimpokomon, chimpokomonAtacante: Chimpokomon):
        ram = random.randint(0, 1)
        if chinpokomon.getNaturaleza() == "Animal" and chimpokomonAtacante.getNaturaleza() == "Robot" or chinpokomon.getNaturaleza() == "Cosa" and chimpokomonAtacante.getNaturaleza() == "Animal" or chinpokomon.getNaturaleza() == "Robot" and chimpokomonAtacante.getNaturaleza() == "Cosa":
            if ram < 0.5:
                chinpokomon.restarVida(4)
            else:
                chinpokomon.restarVida(5)
                print(chimpokomonAtacante.getNombre() +
                      " Realizo un ataque veloz")
        else:
            chinpokomon.restarVida(2)
            print(chimpokomonAtacante.getNombre() +
                  " Realizo un ataque veloz")
