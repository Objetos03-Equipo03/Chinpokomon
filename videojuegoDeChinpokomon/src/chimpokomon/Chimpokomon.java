package chimpokomon;

import Ataque.Ataque;

import java.util.List;

public abstract class Chimpokomon implements IChimpokomon {
    protected String nombre;
    public Integer nivelDeVida;
    protected List<Ataque> ataques;
    Number naturaleza = 0;
    String[] tipoDeNat = new String[] { "ChimpokomonSinNaturaleza", "Animal", "Cosa", "Robot" };
    public String getNaturaleza() {
        return this.tipoDeNat[naturaleza.intValue()];
    }

    public void setNaturaleza(Number naturaleza) {
        this.naturaleza = naturaleza;
    }

    public Chimpokomon(List<Ataque> ataques, Number naturaleza) {
        this.naturaleza = naturaleza;
        this.ataques = ataques;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getNivelDeVida() {
        return nivelDeVida;
    }

    public List<Ataque> getAtaques() {
        return ataques;
    }

    public void setAtaques(List<Ataque> ataques) {
        this.ataques = ataques;
    }

    public void setNivelDeVida(Integer nivelDeVida) {
        this.nivelDeVida = nivelDeVida;
    }

    public Boolean estaDerrotado() {
        if(this.nivelDeVida <=0){
            //LoggerAux.info(this.getNombre() + " ya no puede continuar.\n");

            System.out.printf(this.getNombre() + " ya no puede continuar.\n");
        }
        return this.nivelDeVida <= 0;
    }

    public void restarVida(int vida){
        this.nivelDeVida -= vida;
        System.out.println(this.getNombre()+" le queda " + this.getNivelDeVida() +" de vida.\n");

    }

    public void pelearContra(Chimpokomon chinpokomon) {
        for (int i = 0; i < this.ataques.size(); i++) {

            this.ataques.get(i).dañar(chinpokomon, this );
        }
    }

}
