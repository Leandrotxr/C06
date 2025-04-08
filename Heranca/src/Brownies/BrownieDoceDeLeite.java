package Brownies;

public class BrownieDoceDeLeite extends Brownie {

    public BrownieDoceDeLeite(String nome, double preco, String sabor) {
        super(nome,preco,sabor);
    }

    public void addDoceDeLeite(){
        System.out.println("Doce de leite adicionado.");
    }

    @Override
    public void addCarrinhodecompras(){
        System.out.println("Adicionando ao carrinho de compras um brownie de doce de leite.");
    }
}
