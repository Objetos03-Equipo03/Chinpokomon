package Ataque;

import Chimpokomon.Chimpokomon;

public class CañonConico extends Ataque {

    public CañonConico(Integer dañoValor, String nombre) {
        super(dañoValor, nombre);

    }

    @Override
    public void dañar(Chimpokomon chipoAtacante, Chimpokomon chimpoEnemigo) {
        if (chipoAtacante.tieneVentajaSobre(chimpoEnemigo)) {
            chimpoEnemigo.restarVida(5);
        } else {
            chimpoEnemigo.restarVida(4);
        }

    }

}
