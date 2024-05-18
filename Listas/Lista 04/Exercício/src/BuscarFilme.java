import java.util.Scanner;

public class BuscarFilme {
   
    public static String escolhendoGenero(){
        Scanner SCAN = new Scanner(System.in);
        
        System.out.println("Digite um genero: Terror, Acao, comedia");
        String genero = SCAN.nextLine();
        
        return genero;

        
        
    }
    
}
