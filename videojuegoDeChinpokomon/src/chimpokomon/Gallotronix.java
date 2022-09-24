package chimpokomon;

import Ataque.IAtaque;

import java.util.List;

//crear objeto con los datos de la naturaleza

public class Gallotronix extends Chimpokomon {

    public Gallotronix(List<IAtaque> ataques, Number naturaleza) {
        super(ataques, naturaleza);
        setNombre("Gallotronix");
        setNivelDeVida(25);

    }

}
