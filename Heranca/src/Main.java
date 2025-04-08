import Brownies.BrownieCafe;
import Brownies.BrownieDoceDeLeite;
import Brownies.BrownieNutella;

public class Main {
    public static void main(String[] args) {

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

        bn.addCarrinhodecompras();
        bn.calculaValorTotalCompra();
        bdl.addCarrinhodecompras();
        bdl.calculaValorTotalCompra();
        bc.addCarrinhodecompras();
        bc.calculaValorTotalCompra();
    }
}