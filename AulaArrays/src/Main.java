public class Main {
    public static void main(String[] args) {
        //declarações de arrays:
        int []x;
        int[] y;
        int z[];

        int []a = new int[10]; //array com 10 posições
        //int []b = new int[]; não compila
        int []c = {1,2,3,4}; //array com 4 posições inicializado com valores 1,2,3 e 4.

        String [] professores = new String[4];
        professores[0] = "Guilherme";
        professores[1] = "Jane";
        professores[2] = "Mary";
        professores[3] = "Bob";

        Conta[] contas = new Conta[5];  //não foram criados 5 contas, foram criados 5 espaços que podem vir a ter contas
        Conta conta1 = new Conta();
        conta1.deposita(1000);
        contas[0] = conta1; //associando conta1 à uma posição do vetor

        System.out.println(contas[0].saldo);

        //outra maneira (diretamente no array)
        contas[1] = new Conta();
        contas[1].deposita(2000);

        System.out.println(contas[1].saldo);

        //mostrando o array
        for (int i = 0; i < contas.length; i++) {
            System.out.println(contas[i].saldo);
        }

        //Arrays multidimencionais (matrizes)



    }
}