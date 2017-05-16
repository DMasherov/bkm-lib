package mpei.bkm.converters.ls2text.expression2Text;

import mpei.bkm.converters.Converter;
import mpei.bkm.converters.UnconvertableException;
import mpei.bkm.model.lls1.Expression;
import mpei.bkm.model.lls1.statement.Statement;
import mpei.bkm.model.lls1.terms.c.C;
import mpei.bkm.model.lls1.terms.l.L;
import mpei.bkm.model.lls1.terms.p.P;

public class Type2String implements Converter<Expression, String> {
    public String convert(Expression e) throws UnconvertableException {
        StringBuffer sb = new StringBuffer();
        if (e instanceof C) {
            sb.append('C');
        }
        else if (e instanceof P) {
            sb.append('P');
        }
        else if (e instanceof L) {
            sb.append('L');
        }
        else if (e instanceof Statement) {
            sb.append('S');
        }
        sb.append(e.getId());
        return sb.toString();
    }
}
