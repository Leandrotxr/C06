package Brownies;

public class Brownie {

    protected String nome;
    protected double preco;
    protected String sabor;

    public Brownie(String nome, double preco, String sabor) {
        this.nome = nome;
        this.preco = preco;
        this.sabor = sabor;
    }

    public void addCarrinhodecompras(){
        System.out.println("Adicionando ao carrinho de compras um: " + nome);
    }

    public void calculaValorTotalCompra(){
        System.out.println("Calculando o valor da compra de um: "+ nome + ": " + preco);
    }

    public void mostraInfo(){
        System.out.println("Nome: " + nome);
        System.out.println("Preco: " + preco);
        System.out.println("Sabor: " + sabor);
    }
}
