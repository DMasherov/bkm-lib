package mpei.bkm.model.lls1.terms.c;

import mpei.bkm.model.lls1.ExpressionFactory;
import mpei.bkm.model.lls1.terms.p.P;

@ExpressionFactory
public class CCreator {
    public static And AND(C left, C right) {
        return new And(left, right);
    }
    public static ConceptVariable CONCEPTVARIABLE(C c, String name) {
        return new ConceptVariable(c, name);
    }
    public static Not NOT(C c) {
        return new Not(c);
    }
    public static Or OR(C left, C right) {
        return new Or(left, right);
    }
    public static That THAT(C c, P p) {
        return new That(c, p);
    }
    public static Those THOSE(P p) {
        return new Those(p);
    }
}
