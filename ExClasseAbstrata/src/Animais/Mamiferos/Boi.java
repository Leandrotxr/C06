package Animais.Mamiferos;

public class Boi extends Mamiferos {

    public Boi(String nome, double vida) {
        super(nome, vida);
    }

    @Override
    public void emitirSom() {
        System.out.println("Som da Boi: BOIES");
        System.out.println();
    }
}
