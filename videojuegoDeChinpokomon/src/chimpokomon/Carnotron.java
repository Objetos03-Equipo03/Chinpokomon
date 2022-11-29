package Chimpokomon;
import Ataque.Ataque;
import Naturaleza.Naturaleza;

import java.util.List;

public class Carnotron extends Chimpokomon{

    public Carnotron(List<Ataque> ataques, Naturaleza naturaleza) {
        super(ataques, naturaleza);
        this.setNombre("Carnotron");
        this.setNivelDeVida(20);
    }

    


}
