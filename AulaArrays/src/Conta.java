public class Conta {

    private double saldo;
    private double limite;
    private int numero;
    private Cliente clientes[];

    void deposita(int valor) {

        saldo += valor;
    }


}
