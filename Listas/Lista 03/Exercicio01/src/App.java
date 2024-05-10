import java.util.Scanner;

public class App {
    
    private static final Scanner SCAN = new Scanner(System.in);
    private static final int ANO_ATUAL = 2024;

    public static void main(String[] args) throws Exception {
        int anoDeNascimento = SCAN.nextInt();

        int idadeAtual = idadeDoUsuario(anoDeNascimento);
        
        System.out.println(String.format("""
            Ate o final de 2024 voce tera %s anos 
                """,idadeAtual));
        
    }

    public static int idadeDoUsuario(int anoDeNascimento){
        int resultado = ANO_ATUAL - anoDeNascimento;
        return resultado;
    }
}
