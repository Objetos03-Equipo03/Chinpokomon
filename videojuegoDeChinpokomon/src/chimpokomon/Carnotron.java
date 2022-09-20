package chimpokomon;

import Ataque.Ataque;

import java.util.List;

public class Carnotron extends Chimpokomon{

    public Carnotron(List<Ataque> ataques) {
        super(ataques);
        this.setNombre("Carnotron");
        this.setNivelDeVida(20);
    }


}
