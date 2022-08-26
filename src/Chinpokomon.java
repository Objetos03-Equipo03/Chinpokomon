import java.util.ArrayList;

public abstract class Chinpokomon implements IChinpokomon{
    protected String nombre;
    protected int vida;
    protected ArrayList<IAtaque> ataques = new ArrayList<IAtaque>();

    public String getNombre() {
        return nombre;
    }

    public int getVida() {
        return vida;
    }

    public Boolean estaDerrotado() {
        if(vida <=0){
            System.out.printf(this.getNombre() + " ya no puede continuar.\n");
        }
        return vida <= 0;
    }
    public void restarVida(int vida){
        this.vida -= vida;
        System.out.printf(this.getNombre()+" le queda " + this.getVida() +" de vida.\n");
    }

    public void pelearContra(IChinpokomon chinpokomon) {
        for (int i = 0; i < this.ataques.size(); i++) {

            this.ataques.get(i).dañar(chinpokomon);
        }
    }
}
