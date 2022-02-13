package Exception;

public class WrongTagClosedException extends RuntimeException {

    public WrongTagClosedException(String message) {
        super(message);
    }

    public WrongTagClosedException(String message, Throwable cause) {
        super(message, cause);
    }

    public WrongTagClosedException(Throwable cause) {
        super(cause);
    }
}
