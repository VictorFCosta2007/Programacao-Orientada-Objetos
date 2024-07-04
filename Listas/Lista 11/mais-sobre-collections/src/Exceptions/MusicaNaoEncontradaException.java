package Exceptions;

public class MusicaNaoEncontradaException extends Exception{
    public MusicaNaoEncontradaException(){
        super("Musica não encontrada na biblioteca");
    }

}
