package Animais.Mamiferos;

public abstract class Mamiferos {

    protected String nome;
    protected double vida;

    public Mamiferos(String nome, double vida) {
        this.nome = nome;
        this.vida = vida;
    }

    public abstract void emitirSom();

    public void mostraInfo(){
        System.out.println("Nome: " + nome);
        System.out.println("Vida: " + vida);
        System.out.println();
    }
}
