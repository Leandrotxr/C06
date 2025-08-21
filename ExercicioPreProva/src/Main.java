import armas.Arma;
import personagens.Heroi;
import personagens.Vilao;

public class Main {
    public static void main(String[] args) {

        //Heroi--------------------------------------------------------
        Heroi heroi = new Heroi("Leandro",200);

        //Vilao--------------------------------------------------------
        Vilao vilao = new Vilao("PP",100);

        //Arma---------------------------------------------------------
        Arma arma1 = new Arma("Adaga",10,4);
        Arma arma2 = new Arma("Katana",20,3);
        Arma arma3 = new Arma("Fuzil",50,2);
        Arma arma4 = new Arma("Bazuca",100,1);

        heroi.addArma(arma1);
        heroi.addArma(arma3);
        vilao.addArma(arma2);
        vilao.addArma(arma4);

        heroi.mostrarArmas();
        vilao.mostrarArmas();

        heroi.atacar(0,vilao);
        heroi.atacar(1,vilao);

        heroi.usarEspecial(vilao);
        vilao.usarEspecial(heroi);

    }
}