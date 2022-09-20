package chimpokomon;

import Ataque.Ataque;

import java.util.List;

public class Zapato extends Chimpokomon {

    public Zapato(List<Ataque> ataques, int Naturaleza) {
        super(ataques, Naturaleza);
        setNombre("Zapato");
        setNivelDeVida(30);

    }
}
