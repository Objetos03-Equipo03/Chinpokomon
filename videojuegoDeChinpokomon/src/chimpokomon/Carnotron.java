package chimpokomon;
import Ataque.IAtaque;

import java.util.List;

public class Carnotron extends Chimpokomon{

    public Carnotron(List<IAtaque> ataques , Number naturaleza) {
        super(ataques , naturaleza);
        this.setNombre("Carnotron");
        this.setNivelDeVida(20);
    }


}
