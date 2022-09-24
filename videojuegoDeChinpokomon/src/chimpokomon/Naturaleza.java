package chimpokomon;


public class Naturaleza  {

  public static  boolean tieneVentaja(Chimpokomon chimpokomonVictima, Chimpokomon chimpokomonAtacante){
        if (chimpokomonVictima.getNaturaleza() == "Animal" && chimpokomonAtacante.getNaturaleza() == "Robot") {
            return true;
        }
        if (chimpokomonVictima.getNaturaleza() == "Cosa" && chimpokomonAtacante.getNaturaleza() == "Animal") {
            return true;
        }
        if (chimpokomonVictima.getNaturaleza() == "Robot" && chimpokomonAtacante.getNaturaleza() == "Cosa") {
            return true;
        }
        return false;
    }
}
