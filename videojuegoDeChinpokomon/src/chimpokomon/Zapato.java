package Chimpokomon;
import Ataque.Ataque;
import Naturaleza.Naturaleza;

import java.util.List;

public class Zapato extends Chimpokomon {

    public Zapato(List<Ataque> ataques, Naturaleza naturaleza) {
        super(ataques, naturaleza);
        setNombre("Zapato");
        setNivelDeVida(30);
    }

    
}
