public class App {
    public static void main(String[] args) throws Exception {
        BuscarFilme buscarFilme = new BuscarFilme();
        ValorFilmes valorFilmes = new ValorFilmes();
        EstoqueFilmes estoque = new EstoqueFilmes();
    
        String generoEscolhido = buscarFilme.escolhendoGenero();
        valorFilmes.precoFilmes();
    }
}
