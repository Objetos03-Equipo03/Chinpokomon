package Ataque;

import chimpokomon.Chimpokomon;
import chimpokomon.Naturaleza;

public class Zapatazo extends Naturaleza implements IAtaque {
    @Override
    public void dañar(Chimpokomon chinpokomon, Chimpokomon chimpokomonAtacante) {
        double random = Math.random();
        if (Naturaleza.tieneVentaja(chinpokomon, chimpokomonAtacante)) {
            if (random < 0.5) {
                chinpokomon.restarVida(4);
                ;
            } else {
                System.out.println(chimpokomonAtacante.getNombre() + " Realizo un ataque veloz");
                chinpokomon.restarVida(5);
                ;
            }
        } else {
            if (random < 0.5) {
                chinpokomon.restarVida(1);
                ;
            } else {
                System.out.println(chimpokomonAtacante.getNombre() + " Realizo un ataque veloz");
                chinpokomon.restarVida(2);
                ;
            }

        }

    }
}
