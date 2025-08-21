package Brownies;

import interfaces.Opcionais;

public class BrownieNutella  extends Brownie implements Opcionais {

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

    @Override
    public void addOpcionais() {

    }
}
