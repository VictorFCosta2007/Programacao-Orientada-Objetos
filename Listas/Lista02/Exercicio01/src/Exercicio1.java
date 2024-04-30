import java.util.Scanner;

public class Exercicio1 {
    private static final int QTDE_PERGUNTAS = 3;
    private static final int QTDE_TENTATIVAS = 1;
    
    private static final String[] RESPOSTAS = new String[QTDE_PERGUNTAS];
    private static final String[] GABARITO = new String[QTDE_PERGUNTAS];
    private static final Scanner SCAN = new Scanner(System.in);
    
    public static void main(String[] args) throws Exception {
        String nomeJogador = nomeJogador();

        iniciarQuiz(nomeJogador);

        primeiraPergunta(nomeJogador);

        SegundaPergunta(nomeJogador);

        resultadoDoQuiz(nomeJogador);
    }
   
        /* Da a Liberdade do Jogador escrever o nome */
    public static String nomeJogador(){
       System.out.println(
            """
            Bem vindo ao quiz mais aleatório que existe!!
            Está pronto para inicar?
            
            Comece digitando seu nome:
            """);
        
        return formatarNome(SCAN.nextLine());
    }
          /*Formata o nome do jogador para ficar somente com a primeira letra Maiúscula */
          public static String formatarNome(String nome){
            if(nome.isBlank() || nome.isEmpty()){
                return "Espaço vazio";
            }
            nome = nome.trim();
    
            String[] nomeGrudado = nome.split(" ");
            String analisandoNome = nomeGrudado[0];
            
            String dividindoNome = String.valueOf(analisandoNome.charAt(0));
            String primeiraLetra = dividindoNome;
            
            String nomeSemPrimeiraLetra = analisandoNome.substring(1);
    
            String nomeModificado = primeiraLetra.toUpperCase() + nomeSemPrimeiraLetra.toLowerCase();
    
            return nomeModificado; 
        }

   
            /*Regra do quiz e inicia o mesmo */
    public static void iniciarQuiz(String nomeJogador){
        
        System.out.println(String.format(
            """
        
            Olá novamente %s!!!
            Antes de iniciarmos o quiz, você precisa saber de algo importante para que esse
            que você não acabe errando por besteira, se a letra que você escolher como resposta for diferente
            das disponíveis, vai ser considerado errada! Só porque você ou não leu o aviso ou achou que eu estava blefando.

            Tome cuidado então seu zé da manga.

            após ler a mensagem, pode precionar "enter".     
            """, nomeJogador
        ));

        SCAN.nextLine();
    }

    
    /* Mostra a primeira pergunta e armazena a resposta do usuario */
    public static void primeiraPergunta(String nome){
        String resposta = "";
        
        do{
            System.out.println(
                """
                1 - Qual é o masculino de mula?

                a. Jumento
                b. Jegue
                c. Burro
                d. Asno      
                """
            );

            resposta = SCAN.nextLine();
        
        }while(!acertouAPergunta(resposta));
        
        GABARITO[0] = "C";
        RESPOSTAS[0] = resposta;

    }

    public static boolean acertouAPergunta(String resposta){
        if(resposta.isBlank()){
            System.out.println(
                """
                Oque eu te disse seu James.
                vou deixar tu ir denovo porque tenho misericórdia.
                Mas n seja mais teimoso nesse nível não.
                        
                """
            );
            return false;
        }

        return true;
 
    }

    public static void SegundaPergunta(String nome){
        String resposta = "";
        
        do{
            
            
            System.out.println(
                """
                
                2 - Ora, ora, ora... Parece que tu não cansou ainda de fazer esse quiz incrivel, se é assim...
                Vamos para a ultima pergunta!(Porque to sem ideias para quiz kkkkkkk)

                Há dois patos na frente de um pato, dois patos atrás de um pato e um pato no meio.
                
                QUANTOS PATOS TEM?
                        
                a. 3     b. 5
               
                c. 6     d. 7
                
                """
            );

            resposta = SCAN.nextLine();
        
        }while(!acertouAPergunta2(resposta));

        RESPOSTAS[1] = resposta;
        GABARITO[1] = "A";

    }

    public static boolean acertouAPergunta2(String resposta){
        if(resposta.isBlank()){
            System.out.println(
            """
            Oque eu te disse seu James.
            Se foi a segunda vez eu vou descobrir viu.
            
            Mais uma chance porque sou bonzinho...
            """
            );
            return false;
        }

        return true;
        
    }

    public static void resultadoDoQuiz(String nomeJogador){
        System.out.println(String.format(
        """
        
        %s, sei que esse quiz foi extremamente curto. Mas vamos ser otimistas e dizer que
        foi o melhor quiz de todos os tempos. E com isso, vamos para seus resultado!! 
        QUE EMOCIONANTE!!     
        """,
        nomeJogador
        ));

        for(int i = 0; i < QTDE_PERGUNTAS; i++){
            System.out.println(String.format(
            "%s - %s",
                (i + 1), RESPOSTAS[i].equalsIgnoreCase(GABARITO[i]) ? "CORRETO" : "INCORRETO"
            )); 
        }
    }
}
