package Chimpokomon;

public class Ataque  {
       
    public static AtaqueAbstract RayoVeloz() {
        return new AtaqueAbstract("Rayo Veloz", 3);
    }

    public static AtaqueAbstract CanhonSonico() {
        return new AtaqueAbstract("cañon sónico", 4);
    }

    public static AtaqueAbstract GarraMecanica() {
        return new AtaqueAbstract("Garra Mecánica", 2);
    }

    public static AtaqueAbstract Zapatazo() {
        return new AtaqueAbstract("zapatazo", IsAtaqueCritico.getDañoModificado(1) );
    }

    // public static AtaqueAbstract PomadaWassinton() {
    //     return new AtaqueAbstract("Pomada Wassinton", 5);
    // }
    
}
