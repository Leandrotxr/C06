import Brownies.BrownieCafe;
import Brownies.BrownieDoceDeLeite;
import Brownies.BrownieNutella;
import comprador.Comprador;

public class Main {
    public static void main(String[] args) {

        Comprador comprador = new Comprador("Leandro", 10);

        BrownieNutella bn = new BrownieNutella("Brownie de Nutella", 5, "nutella");
        BrownieDoceDeLeite bdl = new BrownieDoceDeLeite("Brownie de Doce de Leite", 5, "doce de leite");
        BrownieCafe bc = new BrownieCafe("Brownie de Cafe", 5, "cafe");

        bn.addNutella();
        bdl.addDoceDeLeite();
        bc.addCafe();

        System.out.println();

        bn.mostraInfo();
        System.out.println();
        bdl.mostraInfo();
        System.out.println();
        bc.mostraInfo();
        System.out.println();

        comprador.efetuarCompra(bn);

        bn.addCarrinhodecompras();
        bn.calculaValorTotalCompra();
        bdl.addCarrinhodecompras();
        bdl.calculaValorTotalCompra();
        bc.addCarrinhodecompras();
        bc.calculaValorTotalCompra();
    }
}