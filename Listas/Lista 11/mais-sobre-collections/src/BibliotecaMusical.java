import java.util.HashMap;
import java.util.Map;

import Exceptions.MusicaNaoEncontradaException;

public class BibliotecaMusical {

    private Map<String, Musica> acervo;

    public BibliotecaMusical(){
        this.acervo = new HashMap<>();
    }

    public void adicionarMusica(String titulo, Musica musica){
        acervo.put(titulo, musica);
    }

    public void listarMusicas(){
        for(Musica musica : acervo.values()){
            System.out.println(musica);
        }
    }

    public Musica buscarMusica(String titulo) throws MusicaNaoEncontradaException {
        Musica musica = acervo.get(titulo);
        if(musica == null){
            throw new MusicaNaoEncontradaException();
        }
        return musica;
    }

    public void setAcervo(Map<String, Musica> acervo) {
        this.acervo = acervo;
    }

    public Map<String, Musica> getAcervo() {
        return acervo;
    }
}
