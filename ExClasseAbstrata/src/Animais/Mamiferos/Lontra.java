package Animais.Mamiferos;

import Interfaces.Aquaticos;

public class Lontra extends Mamiferos implements Aquaticos {
    public Lontra(String nome, double vida) {
        super(nome, vida);
    }

    @Override
    public void emitirSom() {
        System.out.println("Som da lontra: LONTRES");
        System.out.println();
    }

    @Override
    public void nadar() {
        System.out.println("A lontra " + nome + " é capaz de nadar");
    }
}
