public class ValorFilmes {
   
    BuscarFilme estoque = new BuscarFilme();
        
    String preco = estoque.escolhendoGenero();
        
    
    public void precoFilmes(){
        if(preco.equalsIgnoreCase("terror")){
            System.out.println("O valor destes filmes e de R$ 35,00 cada");
        } else if(preco.equalsIgnoreCase("acao")){
            System.out.println("O valor destes filmes e de R$ 45,00 cada");
         }else if(preco.equalsIgnoreCase("comedia")){
            System.out.println("O preco destes filmes e de R$ 55,00 cada");
        } 
    }     
}
