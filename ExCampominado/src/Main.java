import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        boolean [][] campo = new boolean[2][2];

        Random rand = new Random();
        int x = rand.nextInt(2);
        int y = rand.nextInt(2);

        for (int i = 0; i < campo.length; i++) {
            for (int j = 0; j < campo[i].length; j++) {
                if( i == x && j == y)
                {
                    campo[i][j] = true;
                }
                else{
                    campo[i][j] = false;
                }
            }
        }

        boolean resultado = true;

        System.out.println("Bem vindo ao campo minado");

        do{
            System.out.print("Digite X: ");
            Scanner entrada = new Scanner(System.in);
            int digitado1 = entrada.nextInt();
            System.out.print("Digite Y: ");
            int digitado2 = entrada.nextInt();


            if(campo[digitado1][digitado2]){
                System.out.println("Bomba encontrada! ");
                resultado = false;
            }
            else{
                System.out.println("Safe");
            }

        }while(resultado == true);

    }
}