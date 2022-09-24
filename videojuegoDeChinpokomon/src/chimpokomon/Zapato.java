package chimpokomon;
import Ataque.IAtaque;

import java.util.List;

public class Zapato extends Chimpokomon {

    public Zapato(List<IAtaque> ataques, int Naturaleza) {
        super(ataques, Naturaleza);
        setNombre("Zapato");
        setNivelDeVida(30);

    }
}
