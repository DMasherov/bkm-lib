package mpei.bkm.converters;

public interface Converter<S,T> {
    /**
     * Converts source object to target.
     * @param s Source object
     * @return Target object
     * @throws UnconvertableException
     */
    T convert(S s) throws UnconvertableException;
}
