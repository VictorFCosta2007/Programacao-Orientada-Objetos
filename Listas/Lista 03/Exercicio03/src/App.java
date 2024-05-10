import java.util.Scanner;

public class App {
    
    private static final Scanner SCAN = new Scanner(System.in);
    public static void main(String[] args) throws Exception {
        String primeiraPalavra = SCAN.nextLine();
        String segundaPalavra = SCAN.nextLine();
        
        imprimirVerificaçaoDasPalavras(primeiraPalavra, segundaPalavra);
    }

    public static void imprimirVerificaçaoDasPalavras(String primeiraPalavra, String segundaPalavra){

        if(primeiraPalavra.equals(segundaPalavra)){
            System.out.println("As palavras sao indenticas");
        }else if (primeiraPalavra.equalsIgnoreCase(segundaPalavra)){
            System.out.println("As palavras sao iguais ignorando maiusculo e minusculo");
        }else{
            System.out.println("As palavras sao diferentes");
        }
    }
}