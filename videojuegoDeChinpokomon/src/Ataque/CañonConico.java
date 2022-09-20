package Ataque;
import chimpokomon.Chimpokomon;

public class CañonConico extends Ataque {
    @Override
    public void dañar(Chimpokomon chinpokomon, Chimpokomon chimpokomonAtacante) {
        if (chinpokomon.getNaturaleza() == "Animal" && chimpokomonAtacante.getNaturaleza() == "Robot") {
            chinpokomon.restarVida(5);
            System.out.printf(chimpokomonAtacante.getNombre() + " es un robot y " + chinpokomon.getNombre()
                    + " es un animal, por lo tanto " + chinpokomon.getNombre() + " recibe 5 puntos de daño.\n");
        }
        if (chinpokomon.getNaturaleza() == "Cosa" && chimpokomonAtacante.getNaturaleza() == "Animal") {
            chinpokomon.restarVida(5);
            System.out.printf(chinpokomon.getNombre() + " es una cosa y " + chimpokomonAtacante.getNombre()
                    + " es un animal, por lo tanto " + chinpokomon.getNombre() + " recibe 5 puntos de daño.\n");
        }
        if (chinpokomon.getNaturaleza() == "Robot" && chimpokomonAtacante.getNaturaleza() == "Cosa") {
            chinpokomon.restarVida(5);
            System.out.printf(chinpokomon.getNombre() + " es un robot y " + chimpokomonAtacante.getNombre()
                    + " es una cosa, por lo tanto " + chinpokomon.getNombre() + " recibe 5 puntos de daño.\n");
        }

        else {
            chinpokomon.restarVida(4);
        }

    }
}
