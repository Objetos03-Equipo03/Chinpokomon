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
            // System.out.printf(chimpokomonAtacante.getNombre() + " es un robot y " +
            // chinpokomon.getNombre()
            // + " es un animal, por lo tanto " + chinpokomon.getNombre() + " recibe 5
            // puntos de daño.\n");
        } else {
            chimpoEnemigo.restarVida(4);
        }

    }

}
