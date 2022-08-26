public class Cañon_Conico extends Ataque{

    @Override
    public void dañar(IChinpokomon chinpokomon) {
        chinpokomon.restarVida(4);
    }
}
