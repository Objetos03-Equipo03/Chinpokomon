package chimpokomon;

public class PomadaWassington extends Ataque{
    @Override
    public void dañar(Chimpokomon chinpokomon, Chimpokomon chimpokomonAtacante) {
        chimpokomonAtacante.nivelDeVida += 5;
        System.out.println(chimpokomonAtacante.nombre + " se cura 5 puntos de vida");
    }
}
