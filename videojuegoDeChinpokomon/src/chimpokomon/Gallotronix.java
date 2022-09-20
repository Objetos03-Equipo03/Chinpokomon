package chimpokomon;

import Ataque.Ataque;

import java.util.List;

//crear objeto con los datos de la naturaleza

public class Gallotronix extends Chimpokomon {

    public Gallotronix(List<Ataque> ataques, Number naturaleza) {
        super(ataques, naturaleza);
        setNombre("Gallotronix");
        setNivelDeVida(25);

    }

}
