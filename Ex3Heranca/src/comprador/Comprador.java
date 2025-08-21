package comprador;

import Brownies.Brownie;
import interfaces.Opcionais;

public class Comprador implements Opcionais {

    private String nome;
    private double saldo;

    public Comprador(String nome, double saldo) {
        this.nome = nome;
        this.saldo = saldo;
    }

    public void efetuarCompra(Brownie brownie){
        if(saldo >= brownie.getPreco()){
            System.out.println(nome + " efetuou a compra de um " + brownie.getNome());
            saldo -= brownie.getPreco();
        }else{
            System.out.println("Saldo insuficiente.");
        }
    }

    @Override
    public void addOpcionais() {

    }
}
