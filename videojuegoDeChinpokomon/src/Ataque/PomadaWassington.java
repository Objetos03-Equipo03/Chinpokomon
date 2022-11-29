package Ataque;

import Chimpokomon.Chimpokomon;

public class PomadaWassington extends Ataque {
    public PomadaWassington(Integer dañoValor, String nombre) {
        super(dañoValor, nombre);
        //TODO Auto-generated constructor stub
    }

    @Override
    public void dañar(Chimpokomon chinpokomon, Chimpokomon chimpokomonAtacante) {

        // if (Naturaleza.tieneVentaja(chinpokomon, chimpokomonAtacante)) {
        // chimpokomonAtacante.nivelDeVida += 6;
        // System.out.printf(chimpokomonAtacante.getNombre() + " es un robot y " +
        // chinpokomon.getNombre()
        // + " es un animal, por lo tanto " + chimpokomonAtacante.getNombre()
        // + " recupera 6 puntos de vida.\n");
        // } else {
        // chimpokomonAtacante.nivelDeVida += 5;
        // System.out.println(chimpokomonAtacante.getNombre() + " se cura 5 puntos de
        // vida");
        // }

    }
}
