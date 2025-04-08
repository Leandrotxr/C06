package Brownies;

public class BrownieCafe extends Brownie {

    public BrownieCafe(String nome, double preco, String sabor) {
        super(nome,preco,sabor);
    }

    public void addCafe(){
        System.out.println("Café adicionado.");
    }

    @Override
    public void addCarrinhodecompras(){
        System.out.println("Adicionando ao carrinho de compras um brownie de cafe.");
    }
}
