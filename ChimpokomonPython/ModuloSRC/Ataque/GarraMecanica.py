from Ataque.Ataque import Ataque
import random 

class GarraMecanica(Ataque):
    def __init__(self):
            Ataque.__init__(self, 2, "GarraMecanica")

    def dañar(self,  chimpokomonAtacante, chimpokomonEnemigo):
        ram = random.randint(0, 1)
    
        if (chimpokomonAtacante.tieneVentajaSobre(chimpokomonEnemigo)):
            if (ram < 0.5):
                chimpokomonEnemigo.restarVida(chimpokomonEnemigo.nivelDeVida() * 0.5)
            else: 
                chimpokomonEnemigo.restarVida(self.dañoValor() + 2)
        else:        
            if (ram < 0.1):
                chimpokomonEnemigo.restarVida(chimpokomonEnemigo.nivelDeVida() * 0.5)
                # logger.info(chipoAtacante.getNombre() + " Realizo un ataque critico");
            else:
                chimpokomonEnemigo.restarVida(self.dañoValor())
      
