//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Zumbi zumbi1 = new Zumbi();
        zumbi1.nome = "Robson";
        zumbi1.vida = 100;
        zumbi1.dano = 100;

        Zumbi zumbi2 = new Zumbi();
        zumbi2.nome = "Jose";
        zumbi2.vida = 200;
        zumbi2.dano = 50;

        /*System.out.println(zumbi2.vida);
        zumbi1.causarDano(zumbi2, 20);
        System.out.println(zumbi2.vida);*/

        zumbi1.transfereVida(zumbi2,50);
        System.out.println("Vida do zumbi1: " + zumbi1.mostraVida());
        System.out.println("Vida do zumbi2: " + zumbi2.mostraVida());

        //zumbi1 = zumbi2;

        System.out.println("Vida do zumbi1: " + zumbi1.mostraVida());
        System.out.println("Vida do zumbi2: " + zumbi2.mostraVida());

        boolean x = zumbi1.transfereVida2(zumbi2,50);
        if(x){
            System.out.println("Transferencia realizada com sucesso!");
            System.out.println("Vida do zumbi1: " + zumbi1.mostraVida());
            System.out.println("Vida do zumbi2: " + zumbi2.mostraVida());
        }
        else{
            System.out.println("Transferencia nao realizada!");
        }

    }
}