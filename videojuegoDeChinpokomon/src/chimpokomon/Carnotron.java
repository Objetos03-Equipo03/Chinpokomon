package Chimpokomon;

import java.util.ArrayList;

public class Carnotron extends Chimpokomon {

    ArrayList<AtaqueAbstract> ataques = new ArrayList<AtaqueAbstract>();
    
    public Carnotron() {
        ataques.add(Ataque.RayoVeloz());
        ataques.add(Ataque.CanhonSonico());
        this.setAtaques(ataques);
        this.setNombre("Carnotron");
        this.setNivelVida(20);
    }

}