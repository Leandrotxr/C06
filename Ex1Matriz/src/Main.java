public class Main {
    public static void main(String[] args) {

        Banda banda = new Banda();

        Musica musica1 = new Musica();
        musica1.nome = "musica1";
        musica1.duracao = 200;

        banda.addMusicanova(musica1);    //Add a primeira musica

        Musica musica2 = new Musica();
        musica2.nome = "musica2";
        musica2.duracao = 220;

        banda.addMusicanova(musica2);     //add a segunda musica

        Musica musica3 = new Musica();
        musica3.nome = "musica3";
        musica3.duracao = 240;

        banda.addMusicanova(musica3);      //add a terceira musica

        Membro membro1 = new Membro();
        membro1.nome = "membro1";
        membro1.funcao = "funcao1";

        banda.addMembro(membro1);        //add o primeiro membro

        Membro membro2 = new Membro();
        membro2.nome = "membro2";
        membro2.funcao = "funcao2";

        banda.addMembro(membro2);        //add o segundo membro

        Membro membro3 = new Membro();
        membro3.nome = "membro3";
        membro3.funcao = "funcao3";

        banda.addMembro(membro3);        //add o terceiro membro

        banda.mostraInfo();

    }
}