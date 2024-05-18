import java.util.ArrayList;

public class Filmes {
    ArrayList<String> terror = new ArrayList<>();
    ArrayList<String> acao = new ArrayList<>();
    ArrayList<String> comedia = new ArrayList<>();

    public Filmes(){
        terror.add("A Mumia");
        terror.add("Atividade Paranormal");
        terror.add("A Freira");
        terror.add("Anabelle");

        comedia.add("TED");
        comedia.add("Zerando a vida");
        comedia.add("Gente Grande");
        comedia.add("O Pequenino");

        acao.add("Planeta dos Macacos");
        acao.add("Jurassic World");
        acao.add("Indiana Jones");
    }
}
