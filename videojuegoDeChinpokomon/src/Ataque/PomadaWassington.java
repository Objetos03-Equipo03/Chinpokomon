package Ataque;

import Chimpokomon.Chimpokomon;

public class PomadaWassington extends Ataque {
    public PomadaWassington(Integer dañoValor, String nombre) {
        super(dañoValor, nombre);

    }

    @Override
    public void dañar(Chimpokomon chipoAtacante, Chimpokomon chipoEnemigo) {

        if (chipoAtacante.tieneVentajaSobre(chipoEnemigo)) {
            chipoAtacante.nivelDeVida += 6;
            // System.out.printf(chimpokomonAtacante.getNombre() + " es un robot y " +
            // chinpokomon.getNombre()
            // + " es un animal, por lo tanto " + chimpokomonAtacante.getNombre()
            // + " recupera 6 puntos de vida.\n");
        } else {
            chipoAtacante.nivelDeVida += 5;
            // System.out.println(chimpokomonAtacante.getNombre() + " se cura 5 puntos de
            // vida");
        }

    }
}
