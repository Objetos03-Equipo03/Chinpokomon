package Ataque;

import Ataque.Ataque;
import chimpokomon.Chimpokomon;

public class GarraMecanica extends Ataque {
    @Override
    public void dañar(Chimpokomon chinpokomon, Chimpokomon chimpokomonAtacante) {
        double random = Math.random();
        if(random < 0.1) {
            chinpokomon.restarVida((int) (chinpokomon.getNivelDeVida() * 0.5));
            System.out.println(chinpokomon.getNombre() + " Realizo un ataque critico");
        }
        else {
            chinpokomon.restarVida(2);
        }

    }
}
