package chimpokomon;

public class PomadaWassington extends Ataque{
    @Override
    public void dañar(Chimpokomon chinpokomon, Chimpokomon chimpokomonAtacante) {
        chimpokomonAtacante.nivelDeVida += 5;
    }
}
