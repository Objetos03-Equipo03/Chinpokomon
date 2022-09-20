from Ataque import Ataque
from chimpokomon.Chimpokomon import Chimpokomon
import random
import Ataque.Ataque;
import chimpokomon.Chimpokomon;

class GarraMecanica(Ataque):
    def dañar(self,  chinpokomon : Chimpokomon, chimpokomonAtacante : Chimpokomon):
        ram = random.randint(0,1)
        if ram < 0.5:
            chinpokomon.restarVida(chimpokomon.getNivelDeVida() * 0.5)
            print(chimpokomonAtacante.getNombre() + " Realizo un ataque critico")
        
        else:
            chinpokomon.restarVida(2)
