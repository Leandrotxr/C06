package personagens;

import armas.Arma;

public abstract class Personagem {

    protected String nome;
    protected int vida;

    protected Arma [] arma = new Arma[2];

    public Personagem(String nome, int vida) {
        this.nome = nome;
        this.vida = vida;
    }

    public void addArma(Arma arma1) {
        for (int i = 0; i < arma.length; i++) {
            if (arma[i] == null) {
                arma[i] = arma1;
                break;
            }
        }
    }

    public void mostrarArmas(){
        System.out.println("\nArmas do personagem: ");
        for (int i = 0; i < arma.length; i++) {
            if (arma[i] != null) {
                System.out.println("Nome da arma " + (i+1) + ": " + arma[i].getNome());
                System.out.println("Dano da arma " + (i+1) + ": " + arma[i].getDano());
                System.out.println("Durabilidade da arma " + (i+1) + ": " + arma[i].getDurabilidade());
            }
        }
    }

    public void atacar(int posicao, Personagem personagem) {
        if(this.vida > 0) {
            if (arma[posicao] != null && arma[posicao].getDurabilidade() > 0) {
                if (personagem.vida <= 0) {
                    System.out.println("Personagem ja derrotado!");
                } else {
                    personagem.vida = personagem.vida - arma[posicao].getDurabilidade();
                    arma[posicao].setDurabilidade(0);
                }
            }else{
                System.out.println("Impossível realizar o ataque.");
            }
        }else{
            System.out.println("O personagem nao ja está morto!");
        }
    }
}
