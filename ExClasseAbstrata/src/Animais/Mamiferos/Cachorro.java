package Animais.Mamiferos;

public class Cachorro extends Mamiferos {

    public Cachorro(String nome, double vida) {
        super(nome, vida);
    }

    @Override
    public void emitirSom() {
        System.out.println("Som de Cachorro: CACHORRES");
        System.out.println();
    }
}
