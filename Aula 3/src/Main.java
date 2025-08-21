import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Criando uma nova instancia de conta e atribuindo a uma variavel do tipo Conta
        Conta c = new Conta();

        Conta conta1 = new Conta();
        Conta conta2 = new Conta();
        Conta conta3 = new Conta();

        conta1.saldo = 10000;
        conta2.saldo = 20000;

        System.out.println("Saldo conta 1: " + conta1.saldo);
        System.out.println("Saldo conta 2: " + conta2.saldo);

        //depositando
        conta1.depositar(20000);
        System.out.println("Saldo conta 1: " + conta1.saldo);

        //transferindo
        conta1.transferir(conta2, 20000);
        System.out.println("Saldo conta 1: " + conta1.saldo);
        System.out.println("Saldo conta 2: " + conta2.saldo);
    }
}