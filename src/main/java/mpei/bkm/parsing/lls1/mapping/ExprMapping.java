package mpei.bkm.parsing.lls1.mapping;

import mpei.bkm.model.lls1.Expression;
import mpei.bkm.model.lls1.InnerPart;

import java.lang.reflect.Field;
import java.util.*;

/**
 * This class is used by LLS1 parser traverse class.
 * <br>
 * Provides methods that completes an expression map.
 */
public class ExprMapping {
    /**
     * Creates an expression map so that each key references the list of expression
     * that contain this key.
     * @param expressions a list of expressions
     * @return a map
     */
    public static Map<Expression, List<Expression>> makeReferenceMap(List<Expression> expressions) {
        Map<Expression, List<Expression>> erefmap = new HashMap<Expression, List<Expression>>();
        for (Expression e : expressions) {
            if (!erefmap.containsKey(e)) {
                erefmap.put(e, new ArrayList<Expression>());
            }
            for (Expression oe : expressions) {
                if (e.equals(oe)) continue;
                if (inner(oe).contains(e)) {
                    erefmap.get(e).add(oe);
                }
            }
        }
        return erefmap;
    }

    /**
     * Get inner parts of an expression.
     * <br>
     * When a field in model is marked with {@link InnerPart} annotation and is an {@link Expression},
     * then this method adds it to the result list.
     * @param e a LLS1 expression
     * @return list of inner parts
     */
    private static List<Expression> inner(Expression e) {
        List<Expression> inner = new ArrayList<Expression>();
        try {
            for (Field f : e.getClass().getDeclaredFields()) {
                if (f.isAnnotationPresent(InnerPart.class) && Expression.class.isAssignableFrom(f.getType())) {
                    f.setAccessible(true);
                    inner.add((Expression) f.get(e));
                    f.setAccessible(false);
                }
            }
        }
        catch (IllegalAccessException exc) {
            exc.printStackTrace();
        }
        return inner;
    }
}
