package chimpokomon;

public class GarraMecanica extends Ataque {
    // Esta mal pasarle el chimpokomonAtacante aca
    // Nunca se usa el chimpokomonAtacante
    @Override
    public void dañar(Chimpokomon chinpokomon, Chimpokomon chimpokomonAtacante) {
        double random = Math.random();

        if (chinpokomon.getNaturaleza() == "Animal" && chimpokomonAtacante.getNaturaleza() == "Robot") {
            if (random < 0.5) {
                chinpokomon.restarVida((int) (chinpokomon.nivelDeVida * 0.5) + 2);
                System.out.println(chimpokomonAtacante.nombre + " Realizo un ataque critico");
            } else {
                chinpokomon.restarVida(4);
            }

        }
        if (chinpokomon.getNaturaleza() == "Cosa" && chimpokomonAtacante.getNaturaleza() == "Animal") {
            if (random < 0.5) {
                chinpokomon.restarVida((int) (chinpokomon.nivelDeVida * 0.5) + 2);
                System.out.println(chimpokomonAtacante.nombre + " Realizo un ataque critico");
            } else {
                chinpokomon.restarVida(4);
            }
        }
        if (chinpokomon.getNaturaleza() == "Robot" && chimpokomonAtacante.getNaturaleza() == "Cosa") {
            if (random < 0.5) {
                chinpokomon.restarVida((int) (chinpokomon.nivelDeVida * 0.5) + 2);
                System.out.println(chimpokomonAtacante.nombre + " Realizo un ataque critico");
            } else {
                chinpokomon.restarVida(4);
            }
        }

        else {
            chinpokomon.restarVida(2);
        }

    }
}
