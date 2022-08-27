package chimpokomon;

public class RayoVeloz extends Ataque{

    @Override
    public void dañar(Chimpokomon chinpokomon, Chimpokomon chimpokomonAtacante) {
        chinpokomon.restarVida(3);
    }
}
