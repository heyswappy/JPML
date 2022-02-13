package Exception;

public class TagInstantiationException extends RuntimeException {

    public TagInstantiationException(String message) {
        super(message);
    }

    public TagInstantiationException(String message, Throwable cause) {
        super(message, cause);
    }

    public TagInstantiationException(Throwable cause) {
        super(cause);
    }
}
