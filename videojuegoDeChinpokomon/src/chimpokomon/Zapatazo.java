package chimpokomon;

public class Zapatazo extends Ataque{
    // Esta mal usado chimpokomonAtacante, ya lo cambie.
    @Override
    public void dañar(Chimpokomon chinpokomon, Chimpokomon chimpokomonAtacante) {
        double random = Math.random();

        if(random < 0.5) {
            chinpokomon.restarVida(1);;
        }
        else {
            System.out.println(chimpokomonAtacante.nombre + " Realizo un ataque veloz");
            chinpokomon.restarVida(2);;
        }

    }
}
