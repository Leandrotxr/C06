import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite a NPA: ");
        int NPA = entrada.nextInt();

        if( NPA >= 60){
            System.out.println("O aluno foi aprovado!");
        }
        else {
            System.out.println("O aluno ficou de NP3");
            System.out.print("Digite o valor da NP3: ");

            int NP3 = entrada.nextInt();

            float NFA = (NP3 + NPA) / 2;


            if(NFA >= 50){
                System.out.println("O aluno foi aprovado!");
            }
            else {
                System.out.println("O aluno foi reprovado");
            }
        }

        entrada.close();

    }
}