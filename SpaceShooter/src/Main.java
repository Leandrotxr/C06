import br.inatel.cdg.inimigo.Asteroide;
import br.inatel.cdg.jogador.Nave;

public class Main {
    public static void main(String[] args) {

        Asteroide ast1 = new Asteroide("Asteroide1", "Grande");
        Asteroide ast2 = new Asteroide("Asteroide2", "Pequeno");

        Nave nav1 = new Nave("Nave1", 100, "Explosivo");
        Nave nav2 = new Nave("Nave2", 90, "Normal");

        nav1.atirar(ast1);
        nav1.atirar(ast2);

        nav2.atirar(ast1);
        nav2.atirar(ast2);
    }
}