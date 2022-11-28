package Chimpokomon;


import java.util.ArrayList;

public class Zapato extends Chimpokomon {
    ArrayList<AtaqueAbstract> ataques = new ArrayList<AtaqueAbstract>();
    public Zapato() {
        ataques.add(Ataque.Zapatazo());
        setAtaques(ataques);
        setNombre("Zapato");
        setNivelVida(30);

    }
}