package mpei.bkm.converters;

/**
 * This exception is thrown when an error occurs in {@link Converter#convert}.
 */
public class UnconvertableException extends Exception {
    public UnconvertableException() {
    }

    public UnconvertableException(String message) {
        super(message);
    }

    public UnconvertableException(String message, Throwable cause) {
        super(message, cause);
    }

    public UnconvertableException(Throwable cause) {
        super(cause);
    }
}
