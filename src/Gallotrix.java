import java.util.List;

public class Gallotrix extends Chinpokomon{
    public Gallotrix(){
        List<IAtaque> ataques;
        this.nombre = "Gallotrix";
        this.vida = 25;
        this.ataques.add(new Garra_mecanica());
    }
}
