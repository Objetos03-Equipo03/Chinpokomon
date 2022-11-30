package Ataque;

import Chimpokomon.Chimpokomon;
import logger.Logger;


public class Zapatazo extends Ataque {
    
    public static Logger logger = Logger.getInstance();
    public Zapatazo(Integer dañoValor, String nombre) {
        super(dañoValor, nombre);
        
    }

    @Override
    public void dañar(Chimpokomon chipoAtacante, Chimpokomon chipoEnemigo) {
        double random = Math.random();
        if (chipoAtacante.tieneVentajaSobre(chipoEnemigo)) {
            if (random < 0.5) {
                chipoEnemigo.restarVida(4);
                ;
            } else {
                logger.info(chipoAtacante.getNombre() + " Realizo un ataque veloz");
                chipoEnemigo.restarVida(5);
                ;
            }
        } else {
            if (random < 0.5) {
                chipoEnemigo.restarVida(1);
                ;
            } else {
                logger.info(chipoAtacante.getNombre() + " Realizo un ataque veloz");
                chipoEnemigo.restarVida(2);
                ;
            }

        }

    }

   
}
