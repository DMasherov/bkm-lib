package mpei.bkm.model.commonfeatures;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * An annotation that is used to identify that a field in a class representing any LLS1 expression
 * is actually an inner part of this expression.
 * <p>
 * For example, class representing <code>L AND R</code> c-term {@link mpei.bkm.model.logic.terms.c.And}
 * contains left and right inner parts.
 * So fields for left and right parts in this class should be annotated with this annotation.
 * </p>
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
public @interface InnerPart {
}
