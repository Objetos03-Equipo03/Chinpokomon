package Chimpokomon;

import Ataque.Ataque;
import Naturaleza.Naturaleza;

import java.util.List;

//crear objeto con los datos de la naturaleza

public class Gallotronix extends Chimpokomon {

    public Gallotronix(List<Ataque> ataques, Naturaleza naturaleza) {
        super(ataques, naturaleza);
        setNombre("Gallotronix");
        setNivelDeVida(25);

    }

   
}
