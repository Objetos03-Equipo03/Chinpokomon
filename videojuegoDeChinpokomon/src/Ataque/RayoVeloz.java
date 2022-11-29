package Ataque;

import Chimpokomon.Chimpokomon;

public class RayoVeloz extends Ataque {




    public RayoVeloz(Integer dañoValor, String nombre) {
        super(dañoValor, nombre);
        //TODO Auto-generated constructor stub
    }

    @Override
    public void dañar(Chimpokomon chinpokomon, Chimpokomon chimpokomonAtacante) {

        // if (Naturaleza.tieneVentaja(chinpokomon, chimpokomonAtacante)) {
        //     chinpokomon.restarVida(4);
        //     System.out.println(chimpokomonAtacante.getNombre() + " Hizo 4 puntos de daño a " + chinpokomon.getNombre());
        // }
        // else {
        //     chinpokomon.restarVida(3);
        //     System.out.println(chimpokomonAtacante.getNombre() + " Hizo 3 puntos de daño a " + chinpokomon.getNombre());
        // }
    }

    
}
