package mpei.bkm.utils.identifier;

/**
 * Created by dmasherov on 2/23/17.
 */
public interface IdentifierCreator<T> {
    Identifier<T> getId();
}
