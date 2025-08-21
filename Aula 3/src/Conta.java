public class Conta {
    //atributos
    float saldo;
    int limite;
    int numero;
    String titular;

    //métodos
    public void sacar(float quantidade){
        if(quantidade <= saldo){
            saldo -= quantidade;
        }
        else{
            System.out.println("Saldo insuficiente");
        }
    }

    void depositar(float quantidade){
        saldo += quantidade;
    }

    void transferir(Conta contaDestino,float quantidade){
        if(quantidade <= saldo){
            saldo -= quantidade;
            contaDestino.saldo += quantidade;
        }
        else{
            System.out.println("Saldo insuficiente");
        }
    }

    void imprimir(Conta conta){
        System.out.println("Cliente: " + titular);
        System.out.println("Saldo: " + saldo);
        System.out.println("Limite: " + limite);
        System.out.println("Numero: " + numero);
    }
}