package mpei.bkm.converters.lls12text;

import mpei.bkm.converters.Converter;
import mpei.bkm.converters.UnconvertableException;
import mpei.bkm.converters.lls12text.expression2Text.Expr2String;
import mpei.bkm.converters.lls12text.expression2Text.Type2String;
import mpei.bkm.model.lls1.Expression;
import mpei.bkm.model.lls1.SimpleExpressionOntology;

import java.util.List;
import java.util.Map;

public class SimpleExpressionOntology2Text implements Converter<SimpleExpressionOntology, String> {
    public String convert(SimpleExpressionOntology ontology) throws UnconvertableException {
        StringBuffer sb = new StringBuffer();
        if (ontology.getName() == null || ontology.getName().isEmpty()) {
            sb.append("UNNAMED ONTOLOGY");
        }
        else {
            sb.append(ontology.getName());
        }
        // seperate the name of the ontology and body with an empty line
        sb.append(System.lineSeparator()).append(System.lineSeparator());
        Map<Expression, List<Expression>> erefmap = ontology.getErefmap();

        // use simple expression flag to use identifiers instead of nested expressions
        Expr2String ets = new Expr2String(true);

        Type2String tts = new Type2String();
        for (Expression e : ontology.getExpressions()) {
            if (!erefmap.get(e).isEmpty()) {
                sb.append(tts.convert(e));
                sb.append(" = ");
            }
            sb.append(ets.convert(e));
            sb.append('.');
            sb.append(System.lineSeparator());
        }
        return sb.toString();
    }
}
