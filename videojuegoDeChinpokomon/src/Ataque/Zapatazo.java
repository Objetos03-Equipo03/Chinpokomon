package Ataque;
import chimpokomon.Chimpokomon;

public class Zapatazo extends Ataque {
    @Override
    public void dañar(Chimpokomon chinpokomon, Chimpokomon chimpokomonAtacante) {
        double random = Math.random();

        if(random < 0.5) {
            chinpokomon.restarVida(1);;
        }
        else {
            System.out.println(chimpokomonAtacante.getNombre() + " Realizo un ataque veloz");
            chinpokomon.restarVida(2);;
        }

    }
}
