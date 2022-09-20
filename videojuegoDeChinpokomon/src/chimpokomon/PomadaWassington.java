package chimpokomon;

public class PomadaWassington extends Ataque {
    @Override
    public void dañar(Chimpokomon chinpokomon, Chimpokomon chimpokomonAtacante) {

        if (chinpokomon.getNaturaleza() == "Animal" && chimpokomonAtacante.getNaturaleza() == "Robot") {
            chimpokomonAtacante.nivelDeVida += 6;
            System.out.printf(chimpokomonAtacante.getNombre() + " es un robot y " + chinpokomon.getNombre()
                    + " es un animal, por lo tanto " + chimpokomonAtacante.getNombre()
                    + " recupera 6 puntos de vida.\n");
        }
        if (chinpokomon.getNaturaleza() == "Cosa" && chimpokomonAtacante.getNaturaleza() == "Animal") {
            chimpokomonAtacante.nivelDeVida += 6;
            System.out.printf(chinpokomon.getNombre() + " es una cosa y " + chimpokomonAtacante.getNombre()
                    + " es un animal, por lo tanto " + chimpokomonAtacante.getNombre()
                    + " recupera 6 puntos de vida.\n");

        }
        if (chinpokomon.getNaturaleza() == "Robot" && chimpokomonAtacante.getNaturaleza() == "Cosa") {
            chimpokomonAtacante.nivelDeVida += 6;
            System.out.printf(chinpokomon.getNombre() + " es un robot y " + chimpokomonAtacante.getNombre()
                    + " es una cosa, por lo tanto " + chimpokomonAtacante.getNombre()
                    + " recupera 6 puntos de vida.\n");
        }

        else {
            chimpokomonAtacante.nivelDeVida += 5;
            System.out.println(chimpokomonAtacante.nombre + " se cura 5 puntos de vida");
        }

    }
}
