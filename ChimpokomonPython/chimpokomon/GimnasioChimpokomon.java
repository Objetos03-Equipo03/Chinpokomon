package chimpokomon;

import Ataque.Ataque;
import Ataque.Zapatazo;
import Ataque.PomadaWassington;
import logger.*;

import java.util.ArrayList;
import java.util.List;

public class GimnasioChimpokomon {

    protected Chimpokomon chinpokomonA;
    protected Chimpokomon chinpokomonB;
    Logger logger = Logger.getInstance(new Debug());

    public GimnasioChimpokomon(Chimpokomon chinpokomonA, Chimpokomon chinpokomonB) {
        this.chinpokomonA = chinpokomonA;
        this.chinpokomonB = chinpokomonB;

    }

    public void peleaChinpokomonDe_Con_(){
        while(!this.chinpokomonA.estaDerrotado() && !this.chinpokomonB.estaDerrotado()){
            chinpokomonA.pelearContra(chinpokomonB);
            chinpokomonB.pelearContra(chinpokomonA);
        }
        if(chinpokomonB.estaDerrotado()){
            //System.out.printf("El ganador es "+ chinpokomonA.getNombre(),"\n");
            LoggerAux.info("El ganador es: "+ chinpokomonA.getNombre());
            LoggerAux.error("Este es un mensaje de error");
            logger.info("El ganador es: "+ chinpokomonA.getNombre());

        }
        else{
            //System.out.printf("El ganador es "+ chinpokomonB.getNombre(),"\n");
            //LoggerAux.info("El ganador es: "+ chinpokomonB.getNombre());
            logger.info("El ganador es: "+ chinpokomonB.getNombre());
            //LoggerAux.error("Este es un mensaje de error");
            //System.out.printf(logger.getInfo());

        }
    }

    public static void main(String[] args) {

        List<Ataque> ataque1 = new ArrayList<Ataque>();
        List<Ataque> ataque2 = new ArrayList<Ataque>();

        ataque1.add(new Zapatazo());
        ataque2.add(new Zapatazo());
        ataque2.add(new PomadaWassington());

        GimnasioChimpokomon gimnasioChimpokomon = new GimnasioChimpokomon(new Zapato(ataque2), new Zapato(ataque1));

        gimnasioChimpokomon.peleaChinpokomonDe_Con_();

        //gimnasioChimpokomon.logger.setLevel(new Warn());

        Logger logger = Logger.getInstance(new Debug());

        logger.setLevel(new Warn());

        System.out.println(logger.getLevel());





    }
}