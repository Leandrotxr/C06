package Animais.Repteis;

public abstract class Repteis {

    protected String nome;
    protected double vida;

    public Repteis(String nome, double vida) {
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
