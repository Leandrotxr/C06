public class Banda {
    String nome;
    String genero;

    Musica [] musicas = new Musica[3];
    Membro [] membros = new Membro[3];

    void mostraInfo(){
        for(int i = 0; i < musicas.length; i++){
            System.out.println("Nome: " + musicas[i].nome + " e Duracao: " + musicas[i].duracao);
        }
        for(int i = 0; i < membros.length; i++){
            System.out.println("Nome: " + membros[i].nome + " e Funcao: " + membros[i].funcao);
        }
    }

    void addMusicanova(Musica musica){
        for(int i = 0; i < musicas.length; i++){
            if(musicas[i] == null){
                musicas[i] = musica;
                break;
            }
        }
    }

    void addMembro(Membro membro){
        for(int i = 0; i < membros.length; i++){
            if(membros[i] == null){
                membros[i] = membro;
                break;
            }
        }
    }
}