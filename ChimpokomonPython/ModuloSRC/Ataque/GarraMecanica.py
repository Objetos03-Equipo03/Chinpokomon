from Ataque.Ataque import Ataque
import random 

class GarraMecanica(Ataque):
    def __init__(self):
            Ataque.__init__(self, "Garra Mecanica", 2, 2)

    def dañar(self,  chinpokomon, poder):
        ram = random.randint(1, 10)
    
        if ram == 1:
            chinpokomon.restarVida(chinpokomon.getNivelDeVida() * 0.5)
        else:        
            chinpokomon.restarVida(poder)
      
