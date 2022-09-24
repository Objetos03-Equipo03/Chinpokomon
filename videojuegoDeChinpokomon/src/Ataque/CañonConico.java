package Ataque;
import chimpokomon.Chimpokomon;
import chimpokomon.Naturaleza;

public class CañonConico extends Naturaleza implements IAtaque {
    @Override
    public void dañar(Chimpokomon chinpokomon, Chimpokomon chimpokomonAtacante) {
        if (Naturaleza.tieneVentaja(chinpokomon, chimpokomonAtacante)) {
            chinpokomon.restarVida(5);
            System.out.printf(chimpokomonAtacante.getNombre() + " es un robot y " + chinpokomon.getNombre()
                    + " es un animal, por lo tanto " + chinpokomon.getNombre() + " recibe 5 puntos de daño.\n");
        }
        else {
            chinpokomon.restarVida(4);
        }

    }
}
