public class Zapatazo extends Ataque{

    @Override
    public void dañar(IChinpokomon chinpokomon) {
        chinpokomon.restarVida(1);
    }
}
