package mpei.bkm.model.logic.statement;

import mpei.bkm.model.commonfeatures.ExpressionFactory;
import mpei.bkm.model.logic.terms.c.C;
import mpei.bkm.model.logic.terms.l.L;
import mpei.bkm.model.logic.terms.p.P;

@ExpressionFactory
public class StatementCreator{
    public static And AND(Statement left, Statement right) {
        return new And(left, right);
    }
    public static Each EACH(C c, P p) {
        return new Each(c, p);
    }
    public static EqualC EQUALC(C left, C right) {
        return new EqualC(left, right);
    }
    public static EqualL EQUALL(L left, L right) {
        return new EqualL(left, right);
    }
    public static EqualP EQUALP(P left, P right) {
        return new EqualP(left, right);
    }
    public static ExistC EXISTC(C c) {
        return new ExistC(c);
    }
    public static ExistL EXISTL(L l) {
        return new ExistL(l);
    }
    public static Imp IMP(Statement left, Statement right) {
        return new Imp(left, right);
    }
    public static IsaC ISAC(C parent, C child) {
        return new IsaC(parent, child);
    }
    public static IsaL ISAL(L parent, L child) {
        return new IsaL(parent, child);
    }
    public static Not NOT(Statement s) {
        return new Not(s);
    }
    public static NullC NULLC(C c) {
        return new NullC(c);
    }
    public static NullL NULLL(L l) {
        return new NullL(l);
    }
    public static Or OR(Statement left, Statement right) {
        return new Or(left, right);
    }
    public static Some SOME(C c, P p) {
        return new Some(c, p);
    }
}
