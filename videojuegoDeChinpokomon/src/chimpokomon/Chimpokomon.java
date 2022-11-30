package Chimpokomon;

import Naturaleza.Naturaleza;
import java.util.List;
import Ataque.Ataque;

public class Chimpokomon {
    protected String nombre;
    public Integer nivelDeVida;
    protected List<Ataque> ataques;
    public Naturaleza naturaleza;

    public Naturaleza getNaturaleza() {
        return naturaleza;
    }

    public Chimpokomon(List<Ataque> ataques, Naturaleza naturaleza, String nombre) {
        this.naturaleza = naturaleza;
        this.ataques = ataques;
        this.nombre = nombre;
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

    public boolean tieneVentajaSobre(Chimpokomon chipo) {
        return this.getNaturaleza() == Naturaleza.robot && chipo.getNaturaleza() == Naturaleza.animal ||
                this.getNaturaleza() == Naturaleza.animal && chipo.getNaturaleza() == Naturaleza.cosa ||
                this.getNaturaleza() == Naturaleza.cosa && chipo.getNaturaleza() == Naturaleza.robot;
    }

    public Boolean estaDerrotado() {
        return this.getNivelDeVida() <= 0;
    }

    public void restarVida(int vida) {
        this.nivelDeVida -= vida;
    }

    public void pelearContra(Chimpokomon chinpokomon) {
        for (int i = 0; i < this.ataques.size(); i++) {
            this.ataques.get(i).dañar(chinpokomon, this);
        }
    }

}
