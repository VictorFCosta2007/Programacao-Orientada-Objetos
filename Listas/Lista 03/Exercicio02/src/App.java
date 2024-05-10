import java.util.Scanner;

public class App {
    
    private static final Scanner SCAN = new Scanner(System.in);

    private static final int NOTAS_CRITICOS = 3;
    
    public static void main(String[] args) throws Exception {
        int[] notasRegistradas = new int[NOTAS_CRITICOS];

        inserirNotas(notasRegistradas);
        
        System.out.println(imprimirMedia(notasRegistradas));
    }

    public static void inserirNotas(int[] notasRegistradas){
        for(int i = 0; i < NOTAS_CRITICOS; i++){
            notasRegistradas[i] = SCAN.nextInt();
        }
    }

    public static int imprimirMedia(int[] notasRegistradas){
        int media = 0;
        
        for(int i = 0; i < NOTAS_CRITICOS; i++){
            media += (notasRegistradas[i]);
        }
        media =  media / NOTAS_CRITICOS;

        return media;
    }
}
