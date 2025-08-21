public class Zumbi {

    String nome;
    double vida;
    int dano;

    void seAlimentar() {
        System.out.println("Zumbi " + nome + "está se alimentando...");
    }

    void mostraInfo(){
        System.out.println("Nome: " + nome);
        System.out.println("Vida: " + vida);
        System.out.println("Dano: " + dano);
    }

    void causarDano(Zumbi zumbiAlvo, int qtdDano){
        zumbiAlvo.vida -= qtdDano;
    }

    void transfereVida(Zumbi zumbiAlvo, int qtdVida){
        zumbiAlvo.vida += qtdVida;
        vida -= qtdVida;
    }

    double mostraVida(){
        return vida;
    }

    boolean transfereVida2(Zumbi zumbiAlvo, int qtdVida){

        if(qtdVida > vida){
            return false;
        }
        else {
            zumbiAlvo.vida += qtdVida;
            vida -= qtdVida;
            return true;
        }
    }
}
