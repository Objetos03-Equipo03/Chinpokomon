package Chimpokomon;

import java.util.ArrayList;

public class Gallotronix extends Chimpokomon {
    ArrayList<AtaqueAbstract> ataques = new ArrayList<AtaqueAbstract>();
    public Gallotronix() {
        ataques.add(Ataque.GarraMecanica());
        setAtaques(ataques);
        setNombre("Gallotronix");
        setNivelVida(25);

    }
}
