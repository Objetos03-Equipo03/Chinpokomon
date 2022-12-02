package Ataque;

import Chimpokomon.Chimpokomon;

public class PomadaWassington extends Ataque {
    public PomadaWassington(Integer dañoValor, String nombre) {
        super(dañoValor, nombre);

    }

    @Override
    public void dañar(Chimpokomon chipoAtacante, Chimpokomon chipoEnemigo) {

        if (chipoAtacante.tieneVentajaSobre(chipoEnemigo)) {
            chipoAtacante.setNivelDeVida(chipoAtacante.nivelDeVida + 6);

        } else {
            chipoAtacante.setNivelDeVida(chipoAtacante.nivelDeVida + 5);

        }

    }
}
