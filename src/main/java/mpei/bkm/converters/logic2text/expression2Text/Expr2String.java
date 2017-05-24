package mpei.bkm.converters.logic2text.expression2Text;

import mpei.bkm.converters.Converter;
import mpei.bkm.converters.UnconvertableException;
import mpei.bkm.model.commonfeatures.Expression;
import mpei.bkm.model.logic.terms.c.*;
import mpei.bkm.model.logic.terms.c.WithAttributes;

public class Expr2String implements Converter<Expression, String> {

    protected boolean simple;
    private Type2String typeConverter = new Type2String();
    public Expr2String(boolean simple) {
        this.simple = simple;
    }

    public String convert(Expression e) throws UnconvertableException {
        return ett(new StringBuffer(), e).toString();
    }

    protected String idWithType(Expression e) {
        try {
            return typeConverter.convert(e);
        }
        catch (UnconvertableException ignore) {}
        return e.getId().toString();
    }

    private StringBuffer ettid(StringBuffer sb, Expression e) {
        if (simple) {
            if (e instanceof WithAttributes) {
                return sb.append(((WithAttributes) e).getBkmClass().getName());
            }
            if (e instanceof mpei.bkm.model.logic.terms.l.WithAttributes) {
                return sb.append(((mpei.bkm.model.logic.terms.l.WithAttributes) e).getBinaryLink().getName());
            }

            return sb.append(idWithType(e));
        }
        return ett(sb, e);
    }

    private StringBuffer ett(StringBuffer sb, Expression e) {
        if (e instanceof mpei.bkm.model.logic.terms.c.And) return ett(sb, (mpei.bkm.model.logic.terms.c.And) e);
        if (e instanceof ConceptVariable) return ett(sb, (ConceptVariable) e);
        if (e instanceof WithAttributes) return ett(sb, (WithAttributes) e);
        if (e instanceof mpei.bkm.model.logic.terms.c.Not) return ett(sb, (mpei.bkm.model.logic.terms.c.Not) e);
        if (e instanceof mpei.bkm.model.logic.terms.c.Or) return ett(sb, (mpei.bkm.model.logic.terms.c.Or) e);
        if (e instanceof mpei.bkm.model.logic.terms.c.That) return ett(sb, (mpei.bkm.model.logic.terms.c.That) e);
        if (e instanceof mpei.bkm.model.logic.terms.c.Those) return ett(sb, (mpei.bkm.model.logic.terms.c.Those) e);

        if (e instanceof mpei.bkm.model.logic.terms.l.And) return ett(sb, (mpei.bkm.model.logic.terms.l.And) e);
        if (e instanceof mpei.bkm.model.logic.terms.l.Inv) return ett(sb, (mpei.bkm.model.logic.terms.l.Inv) e);
        if (e instanceof mpei.bkm.model.logic.terms.l.WithAttributes) return ett(sb, (mpei.bkm.model.logic.terms.l.WithAttributes) e);
        if (e instanceof mpei.bkm.model.logic.terms.l.Not) return ett(sb, (mpei.bkm.model.logic.terms.l.Not) e);
        if (e instanceof mpei.bkm.model.logic.terms.l.Or) return ett(sb, (mpei.bkm.model.logic.terms.l.Or) e);

        if (e instanceof mpei.bkm.model.logic.terms.p.And) return ett(sb, (mpei.bkm.model.logic.terms.p.And) e);
        if (e instanceof mpei.bkm.model.logic.terms.p.Each) return ett(sb, (mpei.bkm.model.logic.terms.p.Each) e);
        if (e instanceof mpei.bkm.model.logic.terms.p.Not) return ett(sb, (mpei.bkm.model.logic.terms.p.Not) e);
        if (e instanceof mpei.bkm.model.logic.terms.p.Only) return ett(sb, (mpei.bkm.model.logic.terms.p.Only) e);
        if (e instanceof mpei.bkm.model.logic.terms.p.Or) return ett(sb, (mpei.bkm.model.logic.terms.p.Or) e);
        if (e instanceof mpei.bkm.model.logic.terms.p.PredicateVariable) return ett(sb, (mpei.bkm.model.logic.terms.p.PredicateVariable) e);
        if (e instanceof mpei.bkm.model.logic.terms.p.Some) return ett(sb, (mpei.bkm.model.logic.terms.p.Some) e);
        if (e instanceof mpei.bkm.model.logic.terms.p.SurrogateVariable) return ett(sb, (mpei.bkm.model.logic.terms.p.SurrogateVariable) e);

        if (e instanceof mpei.bkm.model.logic.statement.And) return ett(sb, (mpei.bkm.model.logic.statement.And) e);
        if (e instanceof mpei.bkm.model.logic.statement.Each) return ett(sb, (mpei.bkm.model.logic.statement.Each) e);
        if (e instanceof mpei.bkm.model.logic.statement.EqualC) return ett(sb, (mpei.bkm.model.logic.statement.EqualC) e);
        if (e instanceof mpei.bkm.model.logic.statement.EqualL) return ett(sb, (mpei.bkm.model.logic.statement.EqualL) e);
        if (e instanceof mpei.bkm.model.logic.statement.EqualP) return ett(sb, (mpei.bkm.model.logic.statement.EqualP) e);
        if (e instanceof mpei.bkm.model.logic.statement.ExistC) return ett(sb, (mpei.bkm.model.logic.statement.ExistC) e);
        if (e instanceof mpei.bkm.model.logic.statement.ExistL) return ett(sb, (mpei.bkm.model.logic.statement.ExistL) e);
        if (e instanceof mpei.bkm.model.logic.statement.Imp) return ett(sb, (mpei.bkm.model.logic.statement.Imp) e);
        if (e instanceof mpei.bkm.model.logic.statement.IsaC) return ett(sb, (mpei.bkm.model.logic.statement.IsaC) e);
        if (e instanceof mpei.bkm.model.logic.statement.IsaL) return ett(sb, (mpei.bkm.model.logic.statement.IsaL) e);
        if (e instanceof mpei.bkm.model.logic.statement.Not) return ett(sb, (mpei.bkm.model.logic.statement.Not) e);
        if (e instanceof mpei.bkm.model.logic.statement.NullC) return ett(sb, (mpei.bkm.model.logic.statement.NullC) e);
        if (e instanceof mpei.bkm.model.logic.statement.NullL) return ett(sb, (mpei.bkm.model.logic.statement.NullL) e);
        if (e instanceof mpei.bkm.model.logic.statement.Or) return ett(sb, (mpei.bkm.model.logic.statement.Or) e);
        if (e instanceof mpei.bkm.model.logic.statement.Some) return ett(sb, (mpei.bkm.model.logic.statement.Some) e);

        throw new IllegalStateException("Unknown expression type when trying to serialize expression " + e.getId().toString());
    }

    private StringBuffer ett(StringBuffer sb, mpei.bkm.model.logic.terms.c.And c) {
        ettid(sb, c.getLeft());
        sb.append(" AND ");
        ettid(sb, c.getRight());
        return sb;
    }
    private StringBuffer ett(StringBuffer sb, ConceptVariable c) {
        sb.append(c.getVarName());
        sb.append(":");
        ettid(sb, c.getC());
        return sb;
    }
    private StringBuffer ett(StringBuffer sb, WithAttributes c) {
        sb.append(c.getBkmClass().getName());
        return sb;
    }
    private StringBuffer ett(StringBuffer sb, mpei.bkm.model.logic.terms.c.Not c) {
        sb.append("NOT ");
        ettid(sb, c.getC());
        return sb;
    }
    private StringBuffer ett(StringBuffer sb, mpei.bkm.model.logic.terms.c.Or c) {
        ettid(sb, c.getLeft());
        sb.append(" OR ");
        ettid(sb, c.getRight());
        return sb;
    }
    private StringBuffer ett(StringBuffer sb, mpei.bkm.model.logic.terms.c.That c) {
        ettid(sb, c.getC());
        sb.append(" THAT ");
        ettid(sb, c.getP());
        return sb;
    }
    private StringBuffer ett(StringBuffer sb, mpei.bkm.model.logic.terms.c.Those c) {
        sb.append(" THOSE ");
        ettid(sb, c.getP());
        return sb;
    }

    private StringBuffer ett(StringBuffer sb, mpei.bkm.model.logic.terms.l.And l) {
        ettid(sb, l.getLeft());
        sb.append(" AND ");
        ettid(sb, l.getRight());
        return sb;
    }
    private StringBuffer ett(StringBuffer sb, mpei.bkm.model.logic.terms.l.Inv l) {
        sb.append("INV ");
        ettid(sb, l.getL());
        return sb;
    }
    private StringBuffer ett(StringBuffer sb, mpei.bkm.model.logic.terms.l.WithAttributes l) {
        sb.append(l.getBinaryLink().getName());
        return sb;
    }
    private StringBuffer ett(StringBuffer sb, mpei.bkm.model.logic.terms.l.Not l) {
        sb.append("NOT ");
        ettid(sb, l.getL());
        return sb;
    }
    private StringBuffer ett(StringBuffer sb, mpei.bkm.model.logic.terms.l.Or l) {
        ettid(sb, l.getLeft());
        sb.append(" OR ");
        ettid(sb, l.getRight());
        return sb;
    }

    private StringBuffer ett(StringBuffer sb, mpei.bkm.model.logic.terms.p.And p) {
        ettid(sb, p.getLeft());
        sb.append(" AND ");
        ettid(sb, p.getRight());
        return sb;
    }
    private StringBuffer ett(StringBuffer sb, mpei.bkm.model.logic.terms.p.Each p) {
        ettid(sb, p.getL());
        sb.append(" EACH ");
        ettid(sb, p.getC());
        return sb;
    }
    private StringBuffer ett(StringBuffer sb, mpei.bkm.model.logic.terms.p.Not p) {
        sb.append("NOT ");
        ettid(sb, p.getNot());
        return sb;
    }
    private StringBuffer ett(StringBuffer sb, mpei.bkm.model.logic.terms.p.Only p) {
        ettid(sb, p.getL());
        sb.append(" ONLY ");
        ettid(sb, p.getC());
        return sb;
    }
    private StringBuffer ett(StringBuffer sb, mpei.bkm.model.logic.terms.p.Or p) {
        ettid(sb, p.getLeft());
        sb.append(" OR ");
        ettid(sb, p.getRight());
        return sb;
    }
    private StringBuffer ett(StringBuffer sb, mpei.bkm.model.logic.terms.p.PredicateVariable p) {
        sb.append(p.getVarName());
        sb.append(":");
        ettid(sb, p.getL());
        return sb;
    }
    private StringBuffer ett(StringBuffer sb, mpei.bkm.model.logic.terms.p.Some p) {
        ettid(sb, p.getL());
        sb.append(" SOME ");
        ettid(sb, p.getC());
        return sb;
    }
    private StringBuffer ett(StringBuffer sb, mpei.bkm.model.logic.terms.p.SurrogateVariable p) {
        sb.append(p.getSurr());
        sb.append(":");
        ettid(sb, p.getL());
        return sb;
    }

    private StringBuffer ett(StringBuffer sb, mpei.bkm.model.logic.statement.And s) {
        ettid(sb, s.getLeft());
        sb.append(" AND ");
        ettid(sb, s.getRight());
        return sb;
    }
    private StringBuffer ett(StringBuffer sb, mpei.bkm.model.logic.statement.Each s) {
        sb.append("EACH ");
        ettid(sb, s.getC());
        sb.append(' ');
        ettid(sb, s.getP());
        return sb;
    }
    private StringBuffer ett(StringBuffer sb, mpei.bkm.model.logic.statement.EqualC s) {
        ettid(sb, s.getLeft());
        sb.append(" = ");
        ettid(sb, s.getRight());
        return sb;
    }
    private StringBuffer ett(StringBuffer sb, mpei.bkm.model.logic.statement.EqualP s) {
        ettid(sb, s.getLeft());
        sb.append(" = ");
        ettid(sb, s.getRight());
        return sb;
    }
    private StringBuffer ett(StringBuffer sb, mpei.bkm.model.logic.statement.EqualL s) {
        ettid(sb, s.getLeft());
        sb.append(" = ");
        ettid(sb, s.getRight());
        return sb;
    }
    private StringBuffer ett(StringBuffer sb, mpei.bkm.model.logic.statement.ExistC s) {
        sb.append("EXIST ");
        ettid(sb, s.getC());
        return sb;
    }
    private StringBuffer ett(StringBuffer sb, mpei.bkm.model.logic.statement.ExistL s) {
        sb.append("EXIST ");
        ettid(sb, s.getL());
        return sb;
    }

    private StringBuffer ett(StringBuffer sb, mpei.bkm.model.logic.statement.Imp s) {
        ettid(sb, s.getLeft());
        sb.append(" IMP ");
        ettid(sb, s.getRight());
        return sb;
    }

    private StringBuffer ett(StringBuffer sb, mpei.bkm.model.logic.statement.IsaC s) {
        ettid(sb, s.getSup());
        sb.append(" ISA ");
        ettid(sb, s.getSub());
        return sb;
    }
    private StringBuffer ett(StringBuffer sb, mpei.bkm.model.logic.statement.IsaL s) {
        ettid(sb, s.getSup());
        sb.append(" ISA ");
        ettid(sb, s.getSub());
        return sb;
    }
    private StringBuffer ett(StringBuffer sb, mpei.bkm.model.logic.statement.Not s) {
        sb.append("NOT ");
        ettid(sb, s.getS());
        return sb;
    }
    private StringBuffer ett(StringBuffer sb, mpei.bkm.model.logic.statement.NullC s) {
        sb.append("NULL ");
        ettid(sb, s.getC());
        return sb;
    }
    private StringBuffer ett(StringBuffer sb, mpei.bkm.model.logic.statement.NullL s) {
        sb.append("NULL ");
        ettid(sb, s.getL());
        return sb;
    }
    private StringBuffer ett(StringBuffer sb, mpei.bkm.model.logic.statement.Or s) {
        ettid(sb, s.getLeft());
        sb.append(" OR ");
        ettid(sb, s.getRight());
        return sb;
    }
    private StringBuffer ett(StringBuffer sb, mpei.bkm.model.logic.statement.Some s) {
        sb.append("SOME ");
        ettid(sb, s.getC());
        sb.append(' ');
        ettid(sb, s.getP());
        return sb;
    }
}

