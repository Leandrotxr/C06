package Brownies;

public class BrownieNutella  extends Brownie {

    public BrownieNutella(String nome, double preco, String sabor) {
        super(nome,preco,sabor);
    }

    public void addNutella(){
        System.out.println("Nutella adicionada.");
    }

    @Override
    public void addCarrinhodecompras(){
        System.out.println("Adicionando ao carrinho de compras um brownie de nutella.");
    }
}
