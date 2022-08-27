package chimpokomon;

import java.util.List;

public abstract class Chimpokomon implements IChimpokomon{
    protected String nombre;
    protected Integer nivelDeVida;
    protected List<Ataque> ataques;

    public Chimpokomon(List<Ataque> ataques) {
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
            System.out.printf(this.getNombre() + " ya no puede continuar.\n");
        }
        return this.nivelDeVida <= 0;
    }

    public void restarVida(int vida){
        this.nivelDeVida -= vida;
        System.out.printf(this.getNombre()+" le queda " + this.getNivelDeVida() +" de vida.\n");
    }

    public void pelearContra(Chimpokomon chinpokomon) {
        for (int i = 0; i < this.ataques.size(); i++) {

            this.ataques.get(i).dañar(chinpokomon, this );
        }
    }

}
