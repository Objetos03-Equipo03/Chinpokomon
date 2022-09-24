package Ataque;
import chimpokomon.Chimpokomon;
import chimpokomon.Naturaleza;

public class GarraMecanica extends Naturaleza implements IAtaque {
    @Override
    public void dañar(Chimpokomon chinpokomon, Chimpokomon chimpokomonAtacante) {
        double random = Math.random();
        if(Naturaleza.tieneVentaja(chinpokomon, chimpokomonAtacante)){
            if (random < 0.5) {
                chinpokomon.restarVida((int) (chinpokomon.nivelDeVida * 0.5) + 2);
                System.out.println(chimpokomonAtacante.getNombre() + " Realizo un ataque critico");
            } else {
                chinpokomon.restarVida(4);
            }
        }
        else{
            if(random < 0.1) {
                chinpokomon.restarVida((int) (chinpokomon.getNivelDeVida() * 0.5));
                System.out.println(chinpokomon.getNombre() + " Realizo un ataque critico");
            }
            else {
                chinpokomon.restarVida(2);
            }
        }

      

    }
}
