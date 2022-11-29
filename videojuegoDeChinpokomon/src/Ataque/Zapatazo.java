package Ataque;

import Chimpokomon.Chimpokomon;


public class Zapatazo extends Ataque {
    

    public Zapatazo(Integer dañoValor, String nombre) {
        super(dañoValor, nombre);
        
    }

    @Override
    public void dañar(Chimpokomon chinpokomon, Chimpokomon chimpokomonAtacante) {
        // double random = Math.random();
        // if (Naturaleza.tieneVentaja(chinpokomon, chimpokomonAtacante)) {
        //     if (random < 0.5) {
        //         chinpokomon.restarVida(4);
        //         ;
        //     } else {
        //         System.out.println(chimpokomonAtacante.getNombre() + " Realizo un ataque veloz");
        //         chinpokomon.restarVida(5);
        //         ;
        //     }
        // } else {
        //     if (random < 0.5) {
        //         chinpokomon.restarVida(1);
        //         ;
        //     } else {
        //         System.out.println(chimpokomonAtacante.getNombre() + " Realizo un ataque veloz");
        //         chinpokomon.restarVida(2);
        //         ;
        //     }

        // }

    }

   
}
