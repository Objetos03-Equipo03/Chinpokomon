package chimpokomon;

public class GarraMecanica extends Ataque{
    //Esta mal pasarle el chimpokomonAtacante aca
    //Nunca se usa el chimpokomonAtacante
    @Override
    public void dañar(Chimpokomon chinpokomon, Chimpokomon chimpokomonAtacante) {
        double random = Math.random();
        if(random < 0.5) {
            chinpokomon.restarVida((int) (chinpokomon.nivelDeVida * 0.5));
            System.out.println(chimpokomonAtacante.nombre + " Realizo un ataque critico");
        }
        else {
            chinpokomon.restarVida(2);
        }

    }
}
