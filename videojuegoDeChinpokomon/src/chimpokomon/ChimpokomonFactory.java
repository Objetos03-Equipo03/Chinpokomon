package Chimpokomon;

import Ataque.*;
import Naturaleza.Naturaleza;

import java.util.ArrayList;
import java.util.List;

public class ChimpokomonFactory {

    public static Chimpokomon Carnotron(Naturaleza Naturaleza) {
        List<Ataque> ataques = new ArrayList<Ataque>(2);
        ataques.add(new CañonConico(4, "CañonConico"));
        ataques.add(new RayoVeloz(3, "RayoVeloz"));
        return new Chimpokomon(ataques, Naturaleza, "Carnotron");
    }

    public static Chimpokomon Gallotronix(Naturaleza Naturaleza) {
        List<Ataque> ataques = new ArrayList<Ataque>(2);
        ataques.add(new GarraMecanica(2, "GarraMecanica"));
        return new Chimpokomon(ataques, Naturaleza, "Gallotronix");
    }

    public static Chimpokomon Zapato(Naturaleza Naturaleza) {
        List<Ataque> ataques = new ArrayList<Ataque>(1);
        ataques.add(new Zapatazo(1, "Zapatazo"));
        return new Chimpokomon(ataques, Naturaleza, "Zapato");
    }

    public static Chimpokomon ZapatoConDosAtaques(Naturaleza Naturaleza) {
        List<Ataque> ataques = new ArrayList<Ataque>(2);
        ataques.add(new Zapatazo(1, "Zapatazo"));
        ataques.add(new PomadaWassington(0, "PomadaWassington"));
        return new Chimpokomon(ataques, Naturaleza, "ZapatoConDosAtaques");
    }

}
