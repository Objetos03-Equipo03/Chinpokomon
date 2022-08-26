import java.util.List;

public interface IChinpokomon {
     int getVida();
     String getNombre();
     Boolean estaDerrotado();

     void restarVida(int vida);

     void pelearContra(IChinpokomon chinpokomon);
}
