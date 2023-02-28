package epam.practic.edition.exception;

public class EditionFactoryNotFound extends Exception{
    public EditionFactoryNotFound(String message){
        super(message);
    }
    public EditionFactoryNotFound(String message, Throwable cause){
        super(message, cause);
    }
    public EditionFactoryNotFound(Throwable cause){
        super(cause);
    }
}
