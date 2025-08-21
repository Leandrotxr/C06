import Animais.Mamiferos.Boi;
import Animais.Mamiferos.Cachorro;
import Animais.Mamiferos.Lontra;
import Animais.Repteis.Jacare;

public class Main {
    public static void main(String[] args) {

        Cachorro c = new Cachorro("Pedro",15);
        Lontra l = new Lontra("Luis", 40);
        Boi b = new Boi("Antonio",22);
        Jacare j = new Jacare("PP",30);

        c.emitirSom();
        l.emitirSom();
        b.emitirSom();
        j.emitirSom();

        c.mostraInfo();
        l.mostraInfo();
        b.mostraInfo();
        j.mostraInfo();

        l.nadar();
        j.nadar();


    }
}