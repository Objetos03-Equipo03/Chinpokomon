package chimpokomon;

public class RayoVeloz extends Ataque {

    @Override
    public void dañar(Chimpokomon chinpokomon, Chimpokomon chimpokomonAtacante) {

        if (chinpokomon.getNaturaleza() == "Animal" && chimpokomonAtacante.getNaturaleza() == "Robot") {
            chinpokomon.restarVida(4);
            System.out.println(chimpokomonAtacante.getNombre() + " Hizo 4 puntos de daño a " + chinpokomon.getNombre());
        }
        
        if (chinpokomon.getNaturaleza() == "Cosa" && chimpokomonAtacante.getNaturaleza() == "Animal") {
            chinpokomon.restarVida(4);
            System.out.println(chimpokomonAtacante.getNombre() + " Hizo 4 puntos de daño a " + chinpokomon.getNombre());

        }
        if (chinpokomon.getNaturaleza() == "Robot" && chimpokomonAtacante.getNaturaleza() == "Cosa") {
            chinpokomon.restarVida(4);
            System.out.println(chimpokomonAtacante.getNombre() + " Hizo 4 puntos de daño a " + chinpokomon.getNombre());
        }

        else {
            chinpokomon.restarVida(3);
            System.out.println(chimpokomonAtacante.getNombre() + " Hizo 3 puntos de daño a " + chinpokomon.getNombre());
        }

        // chinpokomon.restarVida(3);
    }
}
