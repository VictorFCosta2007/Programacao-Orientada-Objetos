import Exceptions.MusicaNaoEncontradaException;

public class App {
    public static void main(String[] args) throws Exception {
        Musica musica = new Musica("Ela vai voltar", "Charlie Brown", "Charlie Brown Junior");
        Musica musica2 = new Musica("Gato Schrödiger","Chrono" ,"Chrono Verso" );
        Musica musica3 = new Musica("Takaba", "Chrono", "Chrono Music");

        BibliotecaMusical biblioteca = new BibliotecaMusical();
        biblioteca.adicionarMusica(musica.getTitulo(),musica );
        biblioteca.adicionarMusica(musica2.getTitulo(), musica2);
        


        biblioteca.buscarMusica(musica3.getTitulo());
        try {
            System.out.println(biblioteca.buscarMusica(musica.getTitulo()));
        } catch(MusicaNaoEncontradaException e){
            System.out.println(e.getMessage());
        }
    }
}
