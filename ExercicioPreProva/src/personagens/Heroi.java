package personagens;

import interfaces.Combater;

public class Heroi extends Personagem implements Combater {

    public Heroi(String nome, int vida) {
        super(nome, vida);
    }

    @Override
    public void usarEspecial(Personagem personagem) {
        int vida1 = 0;
        for (int i = 0; i < arma.length; i++) {
            personagem.arma[i] = null;
        }
        personagem.vida = vida1;
        System.out.println();
        System.out.println(personagem.nome + " derrotado.");
    }
}
