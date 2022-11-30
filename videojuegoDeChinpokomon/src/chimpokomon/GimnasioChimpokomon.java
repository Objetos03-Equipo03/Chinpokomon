package Chimpokomon;

import Ataque.Ataque;
import Naturaleza.Naturaleza;
import logger.*;

import java.util.ArrayList;
import java.util.List;

import static Chimpokomon.ChimpokomonFactory.Zapato;
import static Chimpokomon.ChimpokomonFactory.ZapatoConDosAtaques;

public class GimnasioChimpokomon {

    protected Chimpokomon chinpokomonA;
    protected Chimpokomon chinpokomonB;
    public static Logger logger = Logger.getInstance();

    public GimnasioChimpokomon(Chimpokomon chinpokomonA, Chimpokomon chinpokomonB) {
        this.chinpokomonA = chinpokomonA;
        this.chinpokomonB = chinpokomonB;

    }

    public void peleaChinpokomones(){
        while(!this.chinpokomonA.estaDerrotado() && !this.chinpokomonB.estaDerrotado()){

            chinpokomonA.pelearContra(chinpokomonB);
            logger.info(chinpokomonA.getNombre() + " su vida es: " + chinpokomonA.getNivelDeVida());
            logger.info(chinpokomonB.getNombre() + " su vida es: " + chinpokomonB.getNivelDeVida());
            if(!this.chinpokomonA.estaDerrotado() && !this.chinpokomonB.estaDerrotado()){
                chinpokomonB.pelearContra(chinpokomonA);
            }
        }
        logger.info(chinpokomonA.getNombre() + " su vida es: " + chinpokomonA.getNivelDeVida());
        logger.info(chinpokomonB.getNombre() + " su vida es: " + chinpokomonB.getNivelDeVida());
        logger.info("Tenemos un ganador!");
        if(chinpokomonB.estaDerrotado()){
            logger.info("El ganador es: "+ chinpokomonA.getNombre());
        }
        else{
            logger.info("El ganador es: "+ chinpokomonB.getNombre());
        }
    }

    public static void main(String[] args) {

        GimnasioChimpokomon gimnasioChimpokomon = new GimnasioChimpokomon(Zapato(Naturaleza.cosa), ZapatoConDosAtaques(Naturaleza.cosa));

        gimnasioChimpokomon.peleaChinpokomones();










    }
}
