import java.util.ArrayList;

import evetos.Show;
import evetos.StandUp;

public class App {
    public static void main(String[] args) throws Exception {
        
        ArrayList<String> artistas = new ArrayList<>();
        artistas.add("James Hetfield");
        artistas.add("Kirk Hammett");
        artistas.add("Lars Ulrich");
        
        
        Show show = new Show("Metallica", "Lolapalooza", 
        "Quinta-feira,1 de Agosto", artistas);

        show.exibirIformacoes();
        show.comecarEvento();
        show.comecarEvento(true);
        show.comecarEvento(false);


        StandUp comedia = new StandUp("Club da comedia", "Tatuapé", "22 de junho", "Thiago Ventura");

        comedia.exibirIformacoes();
        comedia.comecarEvento();
        comedia.comecarEvento("To tao sem grana que minha ultima conversa foi fiada");
    }
}
