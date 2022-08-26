public class GimnasioChinpokomon {

    static void peleaChinpokomonDe_Con_(IChinpokomon chinpokomonA, IChinpokomon chinpokomonB){
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
        peleaChinpokomonDe_Con_(new Carnotron(), new Zapato());
    }
}
