package Ataque;

import Ataque.Ataque;
import chimpokomon.Chimpokomon;

public class Zapatazo extends Ataque {
    @Override
    public void dañar(Chimpokomon chinpokomon, Chimpokomon chimpokomonAtacante) {
        double random = Math.random();

        if(random < 0.5) {
            chinpokomon.restarVida(1);;
        }
        else {
            System.out.println(chinpokomon.getNombre() + " Realizo un ataque critico");
            chinpokomon.restarVida(2);;
        }

    }
}
