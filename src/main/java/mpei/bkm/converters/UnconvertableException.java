package mpei.bkm.converters;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * This exception is thrown when an error occurs in {@link Converter#convert}.
 */
public class UnconvertableException extends Exception {
    protected List<String> reasons = new ArrayList<>();
    public UnconvertableException(String... reasons) {
        this(null, reasons);
    }

    @SuppressWarnings("unchecked")
    public UnconvertableException(Throwable cause, String... reasons) {
        super(cause);
        this.reasons = Arrays.asList(reasons);
    }

    @Override
    public String getMessage() {
        return String.join(", ", reasons);
    }

    public List<String> getReasons() {
        return reasons;
    }
}
