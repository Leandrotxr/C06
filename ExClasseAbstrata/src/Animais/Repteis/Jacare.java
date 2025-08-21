package Animais.Repteis;

import Interfaces.Aquaticos;

public class Jacare extends Repteis implements Aquaticos {

    public Jacare(String nome, double vida) {
        super(nome, vida);
    }

    @Override
    public void emitirSom() {
        System.out.println("Som do jacare: JACARES");
        System.out.println();
    }

    @Override
    public void nadar() {
        System.out.println("O jacare " + nome + " é capaz de nadar");
    }
}
