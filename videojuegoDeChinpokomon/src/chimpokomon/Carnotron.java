package chimpokomon;

import java.util.ArrayList;
import java.util.List;

public class Carnotron extends Chimpokomon{

    public Carnotron(List<Ataque> ataques , Number naturaleza) {
        super(ataques , naturaleza);
        this.setNombre("Carnotron");
        this.setNivelDeVida(20);
    }


}
