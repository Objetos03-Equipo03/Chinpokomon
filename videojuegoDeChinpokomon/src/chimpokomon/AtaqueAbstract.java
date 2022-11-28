package Chimpokomon;

public  class AtaqueAbstract {

    private String nombre;
    private int daño;

    public AtaqueAbstract(String nombre, int daño) {
        this.nombre = nombre;
        this.daño = daño;
    }

    public String getNombre() {
        return nombre;
    }

    public int getDaño() {
        return daño;
    }

    @Override
    public String toString() {
        return "AtaqueAbstract{" + "nombre=" + nombre + ", da\u00f1o=" + daño + '}';
    }

    // public  void pelea(Chimpokomon atacante, Chimpokomon atacado);
}