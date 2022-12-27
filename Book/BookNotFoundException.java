package PracticJavaFromEpam.practicOOPJavaFromEpam.Book;

public class BookNotFoundException extends Exception {
    /**
     * Constructs a new exception with {@code null} as its detail message.
     * The cause is not initialized, and may subsequently be initialized by a
     * call to {@link #initCause}.
     */
    public BookNotFoundException(String message) {
        super(message);
    }
    public BookNotFoundException(){

    }

    public BookNotFoundException(String message, Throwable cause){
        super(message, cause);
    }

    public BookNotFoundException(Throwable cause){
        super(cause);
    }

}
