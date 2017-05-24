package mpei.bkm.model.commonfeatures;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Used for creating terms and statement to avoid much boilerplate
 */
@Retention(RetentionPolicy.CLASS)
@Target(ElementType.TYPE)
public @interface ExpressionFactory {
}
