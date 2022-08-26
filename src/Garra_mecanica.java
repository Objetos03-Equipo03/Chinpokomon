public class Garra_mecanica extends Ataque{

    @Override
    public void dañar(IChinpokomon chinpokomon) {
        chinpokomon.restarVida(2);
    }
}
