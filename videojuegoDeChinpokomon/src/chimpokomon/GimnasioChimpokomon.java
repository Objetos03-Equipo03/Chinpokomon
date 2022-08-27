package chimpokomon;

import java.util.ArrayList;
import java.util.List;

public class GimnasioChimpokomon {
    static void peleaChinpokomonDe_Con_(Chimpokomon chinpokomonA, Chimpokomon chinpokomonB){
        while(!chinpokomonA.estaDerrotado() && !chinpokomonB.estaDerrotado()){
            chinpokomonA.pelearContra(chinpokomonB);
            chinpokomonB.pelearContra(chinpokomonA);
        }
        if(chinpokomonB.estaDerrotado()){
            System.out.printf("El ganador es "+ chinpokomonA.getNombre(),"\n");
        }
        else{
            System.out.printf("El ganador es "+ chinpokomonB.getNombre(),"\n");
        }
    }

    public static void main(String[] args) {

        List<Ataque> ataque1 = new ArrayList<Ataque>();
        List<Ataque> ataque2 = new ArrayList<Ataque>();

        ataque1.add(new Zapatazo());
        ataque2.add(new Zapatazo());
        ataque2.add(new PomadaWassington());

        peleaChinpokomonDe_Con_(new Zapato(ataque2), new Zapato(ataque1));
    }
}
