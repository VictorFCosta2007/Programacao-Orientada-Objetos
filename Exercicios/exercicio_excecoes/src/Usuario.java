public class Usuario {
    private String nome;
    private int idade;

    public Usuario(String nome, int idade) throws NomeInvalidoException{
        setNome(nome);
        setIdade(idade);
    }

    public void setNome(String nome) throws NomeInvalidoException{
        if(!isBlank()) {
            this.nome = nome;
            return;
        }

        throws new NomeInvalidoException();
    }

    public String getNome(){
        return this.nome;
    }

    public void setIdade(int idade) throws IdadeInvalidaException{
        if(!isBlank() && idade >=0){
            this.idade = idade;
            return;
        }
        throws new IdadeInvalidaException();
    }

    public String getIdade(){
        return this.idade;
    }

}