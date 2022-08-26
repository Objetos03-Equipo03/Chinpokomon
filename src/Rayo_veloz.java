public class Rayo_veloz extends Ataque{

    @Override
    public void dañar(IChinpokomon chinpokomon) {
        chinpokomon.restarVida(3);
    }
}
