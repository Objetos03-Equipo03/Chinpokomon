package Chimpokomon;


import java.util.ArrayList;

public abstract class Chimpokomon {
    
    private String nombre;
    private int nivelVida;
    private ArrayList<AtaqueAbstract> ataques;


    public String getNombre() {
        return nombre;
    }
    public int getNivelVida() {
        return nivelVida;
    }
    public ArrayList<AtaqueAbstract> getAtaques() {
        return ataques;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setNivelVida(int nivelVida) {
        this.nivelVida = nivelVida;
    }
    public void setAtaques(ArrayList<AtaqueAbstract> ataques) {
        this.ataques = ataques;
    }

}
