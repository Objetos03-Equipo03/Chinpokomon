package Chimpokomon;

import Ataque.*;
import Naturaleza.Naturaleza;
import logger.*;



import static Chimpokomon.ChimpokomonFactory.Zapato;
import static Chimpokomon.ChimpokomonFactory.ZapatoConDosAtaques;
import static Chimpokomon.ChimpokomonFactory.Carnotron;
import static Chimpokomon.ChimpokomonFactory.Gallotronix;

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
            logger.info("La vida de "+chinpokomonA.getNombre() + " es: " + chinpokomonA.getNivelDeVida());
            logger.info("La vida de "+chinpokomonB.getNombre() + " es: " + chinpokomonB.getNivelDeVida());
            if(!this.chinpokomonA.estaDerrotado() && !this.chinpokomonB.estaDerrotado()){
                chinpokomonB.pelearContra(chinpokomonA);
            }
        }
        logger.info("La vida de "+chinpokomonA.getNombre() + " es: " + chinpokomonA.getNivelDeVida());
        logger.info("La vida de "+chinpokomonB.getNombre() + " es: " + chinpokomonB.getNivelDeVida());
        logger.info("Tenemos un ganador!");
        if(chinpokomonB.estaDerrotado()){
            logger.info("El ganador es: "+ chinpokomonA.getNombre());
        }
        else{
            logger.info("El ganador es: "+ chinpokomonB.getNombre());
        }
    }

    public static void main(String[] args) {

        // GimnasioChimpokomon gimnasioChimpokomon = new GimnasioChimpokomon(Zapato(Naturaleza.robot), ZapatoConDosAtaques(Naturaleza.animal));
        GimnasioChimpokomon gimnasioChimpokomon = new GimnasioChimpokomon(Carnotron(Naturaleza.robot), Gallotronix(Naturaleza.animal));

        gimnasioChimpokomon.peleaChinpokomones();










    }
}
