package JacopoDeMaio.Spring_Web_2.exceptions;

public class NotFoundException extends RuntimeException {
    public NotFoundException(long id){
        super("Elemento con id " + id + " non trovato!");
    }
}
