package Ataque;

import Chimpokomon.Chimpokomon;

public class RayoVeloz extends Ataque {

    public RayoVeloz(Integer dañoValor, String nombre) {
        super(dañoValor, nombre);
        dañoValor = 3;
        nombre = "RayoVeloz";
    }

    @Override
    public void dañar(Chimpokomon chipoAtacante, Chimpokomon chipoEnemigo) {

        if (chipoAtacante.tieneVentajaSobre(chipoEnemigo)) {
            chipoEnemigo.restarVida(4);
            // System.out.println(chipoAtacante.getNombre() + " Hizo 4 puntos de daño a " +
            // chipoEnemigo.getNombre());
        } else {
            chipoEnemigo.restarVida(3);
            // System.out.println(chipoAtacante.getNombre() + " Hizo 3 puntos de daño a " +
            // chipoEnemigo.getNombre());
        }
    }

}
