package Chimpokomon;

public class IsAtaqueCritico {

    static double random = Math.random();
    public int daño;

    public static int getDañoModificado(int daño) {
        if (random < 0.5) {
            return daño * 2;
        }

    }
}
