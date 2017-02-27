package mpei.bkm.converters.lls12text.expression2Text;

import mpei.bkm.converters.Converter;
import mpei.bkm.converters.UnconvertableException;
import mpei.bkm.model.lls1.Expression;
import mpei.bkm.model.lls1.statement.*;
import mpei.bkm.model.lls1.statement.Named;
import mpei.bkm.model.lls1.terms.c.*;
import mpei.bkm.model.lls1.terms.l.*;
import mpei.bkm.model.lls1.terms.p.*;

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
            if (e instanceof mpei.bkm.model.lls1.terms.c.Named) {
                return sb.append(((mpei.bkm.model.lls1.terms.c.Named) e).getName());
            }
            if (e instanceof mpei.bkm.model.lls1.terms.l.Named) {
                return sb.append(((mpei.bkm.model.lls1.terms.l.Named) e).getName());
            }
            if (e instanceof mpei.bkm.model.lls1.statement.Named) {
                return sb.append(((mpei.bkm.model.lls1.statement.Named) e).getName());
            }

            return sb.append(idWithType(e));
        }
        return ett(sb, e);
    }

    private StringBuffer ett(StringBuffer sb, Expression e) {
        if (e instanceof mpei.bkm.model.lls1.terms.c.And) return ett(sb, (mpei.bkm.model.lls1.terms.c.And) e);
        if (e instanceof ConceptVariable) return ett(sb, (ConceptVariable) e);
        if (e instanceof mpei.bkm.model.lls1.terms.c.Named) return ett(sb, (mpei.bkm.model.lls1.terms.c.Named) e);
        if (e instanceof mpei.bkm.model.lls1.terms.c.Not) return ett(sb, (mpei.bkm.model.lls1.terms.c.Not) e);
        if (e instanceof mpei.bkm.model.lls1.terms.c.Or) return ett(sb, (mpei.bkm.model.lls1.terms.c.Or) e);
        if (e instanceof mpei.bkm.model.lls1.terms.c.That) return ett(sb, (mpei.bkm.model.lls1.terms.c.That) e);
        if (e instanceof mpei.bkm.model.lls1.terms.c.Those) return ett(sb, (mpei.bkm.model.lls1.terms.c.Those) e);

        if (e instanceof mpei.bkm.model.lls1.terms.l.And) return ett(sb, (mpei.bkm.model.lls1.terms.l.And) e);
        if (e instanceof mpei.bkm.model.lls1.terms.l.Inv) return ett(sb, (mpei.bkm.model.lls1.terms.l.Inv) e);
        if (e instanceof mpei.bkm.model.lls1.terms.l.Named) return ett(sb, (mpei.bkm.model.lls1.terms.l.Named) e);
        if (e instanceof mpei.bkm.model.lls1.terms.l.Not) return ett(sb, (mpei.bkm.model.lls1.terms.l.Not) e);
        if (e instanceof mpei.bkm.model.lls1.terms.l.Or) return ett(sb, (mpei.bkm.model.lls1.terms.l.Or) e);

        if (e instanceof mpei.bkm.model.lls1.terms.p.And) return ett(sb, (mpei.bkm.model.lls1.terms.p.And) e);
        if (e instanceof mpei.bkm.model.lls1.terms.p.Each) return ett(sb, (mpei.bkm.model.lls1.terms.p.Each) e);
        if (e instanceof mpei.bkm.model.lls1.terms.p.Not) return ett(sb, (mpei.bkm.model.lls1.terms.p.Not) e);
        if (e instanceof mpei.bkm.model.lls1.terms.p.Only) return ett(sb, (mpei.bkm.model.lls1.terms.p.Only) e);
        if (e instanceof mpei.bkm.model.lls1.terms.p.Or) return ett(sb, (mpei.bkm.model.lls1.terms.p.Or) e);
        if (e instanceof mpei.bkm.model.lls1.terms.p.PredicateVariable) return ett(sb, (mpei.bkm.model.lls1.terms.p.PredicateVariable) e);
        if (e instanceof mpei.bkm.model.lls1.terms.p.Some) return ett(sb, (mpei.bkm.model.lls1.terms.p.Some) e);
        if (e instanceof mpei.bkm.model.lls1.terms.p.SurrogateVariable) return ett(sb, (mpei.bkm.model.lls1.terms.p.SurrogateVariable) e);

        if (e instanceof mpei.bkm.model.lls1.statement.And) return ett(sb, (mpei.bkm.model.lls1.statement.And) e);
        if (e instanceof mpei.bkm.model.lls1.statement.Each) return ett(sb, (mpei.bkm.model.lls1.statement.Each) e);
        if (e instanceof mpei.bkm.model.lls1.statement.EqualC) return ett(sb, (mpei.bkm.model.lls1.statement.EqualC) e);
        if (e instanceof mpei.bkm.model.lls1.statement.EqualL) return ett(sb, (mpei.bkm.model.lls1.statement.EqualL) e);
        if (e instanceof mpei.bkm.model.lls1.statement.EqualP) return ett(sb, (mpei.bkm.model.lls1.statement.EqualP) e);
        if (e instanceof mpei.bkm.model.lls1.statement.ExistC) return ett(sb, (mpei.bkm.model.lls1.statement.ExistC) e);
        if (e instanceof mpei.bkm.model.lls1.statement.ExistL) return ett(sb, (mpei.bkm.model.lls1.statement.ExistL) e);
        if (e instanceof mpei.bkm.model.lls1.statement.Imp) return ett(sb, (mpei.bkm.model.lls1.statement.Imp) e);
        if (e instanceof mpei.bkm.model.lls1.statement.IsaC) return ett(sb, (mpei.bkm.model.lls1.statement.IsaC) e);
        if (e instanceof mpei.bkm.model.lls1.statement.IsaL) return ett(sb, (mpei.bkm.model.lls1.statement.IsaL) e);
        if (e instanceof mpei.bkm.model.lls1.statement.Named) return ett(sb, (mpei.bkm.model.lls1.statement.Named) e);
        if (e instanceof mpei.bkm.model.lls1.statement.Not) return ett(sb, (mpei.bkm.model.lls1.statement.Not) e);
        if (e instanceof mpei.bkm.model.lls1.statement.NullC) return ett(sb, (mpei.bkm.model.lls1.statement.NullC) e);
        if (e instanceof mpei.bkm.model.lls1.statement.NullL) return ett(sb, (mpei.bkm.model.lls1.statement.NullL) e);
        if (e instanceof mpei.bkm.model.lls1.statement.Or) return ett(sb, (mpei.bkm.model.lls1.statement.Or) e);
        if (e instanceof mpei.bkm.model.lls1.statement.Some) return ett(sb, (mpei.bkm.model.lls1.statement.Some) e);

        throw new IllegalStateException("Unknown expression type when trying to serialize expression " + e.getId().toString());
    }

    private StringBuffer ett(StringBuffer sb, mpei.bkm.model.lls1.terms.c.And c) {
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
    private StringBuffer ett(StringBuffer sb, mpei.bkm.model.lls1.terms.c.Named c) {
        sb.append(c.getName());
        return sb;
    }
    private StringBuffer ett(StringBuffer sb, mpei.bkm.model.lls1.terms.c.Not c) {
        sb.append("NOT ");
        ettid(sb, c.getC());
        return sb;
    }
    private StringBuffer ett(StringBuffer sb, mpei.bkm.model.lls1.terms.c.Or c) {
        ettid(sb, c.getLeft());
        sb.append(" OR ");
        ettid(sb, c.getRight());
        return sb;
    }
    private StringBuffer ett(StringBuffer sb, mpei.bkm.model.lls1.terms.c.That c) {
        ettid(sb, c.getC());
        sb.append(" THAT ");
        ettid(sb, c.getP());
        return sb;
    }
    private StringBuffer ett(StringBuffer sb, mpei.bkm.model.lls1.terms.c.Those c) {
        sb.append(" THOSE ");
        ettid(sb, c.getP());
        return sb;
    }

    private StringBuffer ett(StringBuffer sb, mpei.bkm.model.lls1.terms.l.And l) {
        ettid(sb, l.getLeft());
        sb.append(" AND ");
        ettid(sb, l.getRight());
        return sb;
    }
    private StringBuffer ett(StringBuffer sb, mpei.bkm.model.lls1.terms.l.Inv l) {
        sb.append("INV ");
        ettid(sb, l.getL());
        return sb;
    }
    private StringBuffer ett(StringBuffer sb, mpei.bkm.model.lls1.terms.l.Named l) {
        sb.append(l.getName());
        return sb;
    }
    private StringBuffer ett(StringBuffer sb, mpei.bkm.model.lls1.terms.l.Not l) {
        sb.append("NOT ");
        ettid(sb, l.getL());
        return sb;
    }
    private StringBuffer ett(StringBuffer sb, mpei.bkm.model.lls1.terms.l.Or l) {
        ettid(sb, l.getLeft());
        sb.append(" OR ");
        ettid(sb, l.getRight());
        return sb;
    }

    private StringBuffer ett(StringBuffer sb, mpei.bkm.model.lls1.terms.p.And p) {
        ettid(sb, p.getLeft());
        sb.append(" AND ");
        ettid(sb, p.getRight());
        return sb;
    }
    private StringBuffer ett(StringBuffer sb, mpei.bkm.model.lls1.terms.p.Each p) {
        ettid(sb, p.getL());
        sb.append(" EACH ");
        ettid(sb, p.getC());
        return sb;
    }
    private StringBuffer ett(StringBuffer sb, mpei.bkm.model.lls1.terms.p.Not p) {
        sb.append("NOT ");
        ettid(sb, p.getNot());
        return sb;
    }
    private StringBuffer ett(StringBuffer sb, mpei.bkm.model.lls1.terms.p.Only p) {
        ettid(sb, p.getL());
        sb.append(" ONLY ");
        ettid(sb, p.getC());
        return sb;
    }
    private StringBuffer ett(StringBuffer sb, mpei.bkm.model.lls1.terms.p.Or p) {
        ettid(sb, p.getLeft());
        sb.append(" OR ");
        ettid(sb, p.getRight());
        return sb;
    }
    private StringBuffer ett(StringBuffer sb, mpei.bkm.model.lls1.terms.p.PredicateVariable p) {
        sb.append(p.getVarName());
        sb.append(":");
        ettid(sb, p.getL());
        return sb;
    }
    private StringBuffer ett(StringBuffer sb, mpei.bkm.model.lls1.terms.p.Some p) {
        ettid(sb, p.getL());
        sb.append(" SOME ");
        ettid(sb, p.getC());
        return sb;
    }
    private StringBuffer ett(StringBuffer sb, mpei.bkm.model.lls1.terms.p.SurrogateVariable p) {
        sb.append(p.getSurr());
        sb.append(":");
        ettid(sb, p.getL());
        return sb;
    }

    private StringBuffer ett(StringBuffer sb, mpei.bkm.model.lls1.statement.And s) {
        ettid(sb, s.getLeft());
        sb.append(" AND ");
        ettid(sb, s.getRight());
        return sb;
    }
    private StringBuffer ett(StringBuffer sb, mpei.bkm.model.lls1.statement.Each s) {
        sb.append("EACH ");
        ettid(sb, s.getC());
        sb.append(' ');
        ettid(sb, s.getP());
        return sb;
    }
    private StringBuffer ett(StringBuffer sb, mpei.bkm.model.lls1.statement.EqualC s) {
        ettid(sb, s.getLeft());
        sb.append(" = ");
        ettid(sb, s.getRight());
        return sb;
    }
    private StringBuffer ett(StringBuffer sb, mpei.bkm.model.lls1.statement.EqualP s) {
        ettid(sb, s.getLeft());
        sb.append(" = ");
        ettid(sb, s.getRight());
        return sb;
    }
    private StringBuffer ett(StringBuffer sb, mpei.bkm.model.lls1.statement.EqualL s) {
        ettid(sb, s.getLeft());
        sb.append(" = ");
        ettid(sb, s.getRight());
        return sb;
    }
    private StringBuffer ett(StringBuffer sb, mpei.bkm.model.lls1.statement.ExistC s) {
        sb.append("EXIST ");
        ettid(sb, s.getC());
        return sb;
    }
    private StringBuffer ett(StringBuffer sb, mpei.bkm.model.lls1.statement.ExistL s) {
        sb.append("EXIST ");
        ettid(sb, s.getL());
        return sb;
    }

    private StringBuffer ett(StringBuffer sb, mpei.bkm.model.lls1.statement.Imp s) {
        ettid(sb, s.getLeft());
        sb.append(" IMP ");
        ettid(sb, s.getRight());
        return sb;
    }

    private StringBuffer ett(StringBuffer sb, mpei.bkm.model.lls1.statement.IsaC s) {
        ettid(sb, s.getChild());
        sb.append(" ISA ");
        ettid(sb, s.getParent());
        return sb;
    }
    private StringBuffer ett(StringBuffer sb, mpei.bkm.model.lls1.statement.IsaL s) {
        ettid(sb, s.getChild());
        sb.append(" ISA ");
        ettid(sb, s.getParent());
        return sb;
    }
    private StringBuffer ett(StringBuffer sb, mpei.bkm.model.lls1.statement.Named s) {
        sb.append(s.getName());
        return sb;
    }
    private StringBuffer ett(StringBuffer sb, mpei.bkm.model.lls1.statement.Not s) {
        sb.append("NOT ");
        ettid(sb, s.getS());
        return sb;
    }
    private StringBuffer ett(StringBuffer sb, mpei.bkm.model.lls1.statement.NullC s) {
        sb.append("NULL ");
        ettid(sb, s.getC());
        return sb;
    }
    private StringBuffer ett(StringBuffer sb, mpei.bkm.model.lls1.statement.NullL s) {
        sb.append("NULL ");
        ettid(sb, s.getL());
        return sb;
    }
    private StringBuffer ett(StringBuffer sb, mpei.bkm.model.lls1.statement.Or s) {
        ettid(sb, s.getLeft());
        sb.append(" OR ");
        ettid(sb, s.getRight());
        return sb;
    }
    private StringBuffer ett(StringBuffer sb, mpei.bkm.model.lls1.statement.Some s) {
        sb.append("SOME ");
        ettid(sb, s.getC());
        sb.append(' ');
        ettid(sb, s.getP());
        return sb;
    }
}

