package Ataque;
import Chimpokomon.Chimpokomon;

public abstract class Ataque {
    private Integer dañoValor;
    private String nombre;

    public Ataque(Integer dañoValor, String nombre) {
        this.dañoValor = dañoValor;
        this.nombre = nombre;
     
    }

    public String getNombre() {
        return nombre;
    }

    public Integer getdañoValor() {
        return dañoValor;
    }

    public void setdañoValor(Integer dañoValor) {
        this.dañoValor = dañoValor;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }



    public abstract void dañar(Chimpokomon chimpoAtacante,Chimpokomon chimpoEnemigo ) ;
      

}
