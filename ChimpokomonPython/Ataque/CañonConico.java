package Ataque;

import Ataque.Ataque;
import chimpokomon.Chimpokomon;

public class CañonConico extends Ataque {
    @Override
    public void dañar(Chimpokomon chinpokomon, Chimpokomon chimpokomonAtacante) {
        chinpokomon.restarVida(4);
    }
}
