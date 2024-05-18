import java.util.Scanner;

public class EstoqueFilmes{
    
    public static void buscarFilmesPorGenero(String genero){
        Filmes catalogo = new Filmes();

        if(genero.equalsIgnoreCase("terror")){
            for(int i = 0; i < catalogo.terror.size(); i++){
                System.out.println(catalogo.terror);
            }
        }else if(genero.equalsIgnoreCase("acao")){
            for(int i = 0; i < catalogo.acao.size(); i++){
                System.out.println(catalogo.acao);
            }
        }else if(genero.equalsIgnoreCase("comedia")){
            for(int i = 0; i < catalogo.comedia.size(); i++){
                System.out.println(catalogo.comedia);
            }
        }
    }
}
    
    

    

    
        
    
