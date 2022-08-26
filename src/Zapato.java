import java.util.List;

public class Zapato extends Chinpokomon{
    public Zapato(){
        List<IAtaque> ataques;
        this.nombre = "Zapato";
        this.vida = 30;
        this.ataques.add(new Zapatazo());
    }
}
