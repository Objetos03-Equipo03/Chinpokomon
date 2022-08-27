package chimpokomon;

public class GarraMecanica extends Ataque{
    @Override
    public void dañar(Chimpokomon chinpokomon, Chimpokomon chimpokomonAtacante) {
        double random = Math.random();
        if(random < 0.1) {
            chinpokomon.restarVida((int) (chinpokomon.nivelDeVida * 0.5));
            System.out.println(chinpokomon.nombre + " Realizo un ataque critico");
        }
        else {
            chinpokomon.restarVida(2);
        }

    }
}
