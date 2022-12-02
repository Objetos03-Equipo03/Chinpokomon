package Ataque;

import Chimpokomon.Chimpokomon;
import logger.Logger;

public class GarraMecanica extends Ataque {
    public static Logger logger = Logger.getInstance();
    public GarraMecanica(Integer dañoValor, String nombre) {
        super(dañoValor, nombre);
        dañoValor = 2;
        nombre = "GarraMecanica";
    }

    @Override
    public void dañar(Chimpokomon chipoAtacante, Chimpokomon chipoEnemigo) {
        double random = Math.random();
        if (chipoAtacante.tieneVentajaSobre(chipoEnemigo)) {
            if (random < 0.5) {
                chipoEnemigo.restarVida((int) (chipoEnemigo.getNivelDeVida() * 0.5));
                logger.info(chipoAtacante.getNombre() + " Realizo un ataque critico");
            } else {
                chipoEnemigo.restarVida(this.getdañoValor() + 2);
            }
        } else {
            if (random < 0.1) {
                chipoEnemigo.restarVida((int) (chipoEnemigo.getNivelDeVida() * 0.5));
                logger.info(chipoAtacante.getNombre() + " Realizo un ataque critico");
            } else {
                chipoEnemigo.restarVida(this.getdañoValor());
            }
        }

    }
}
