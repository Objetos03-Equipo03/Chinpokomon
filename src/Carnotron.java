import java.util.List;

public class Carnotron extends Chinpokomon {
    public Carnotron(){
        List<IAtaque> ataques;
        this.nombre = "Carnotron";
        this.vida = 20;
        this.ataques.add(new Rayo_veloz());
        this.ataques.add(new Cañon_Conico());
    }
}
