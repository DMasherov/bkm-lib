package mpei.bkm.converters.lls12text;

import mpei.bkm.converters.Converter;
import mpei.bkm.converters.UnconvertableException;
import mpei.bkm.converters.lls12text.expression2Text.Expr2String;
import mpei.bkm.converters.lls12text.expression2Text.Type2String;
import mpei.bkm.model.lls1.Expression;
import mpei.bkm.model.lls1.Ontology;
import mpei.bkm.model.lls1.statement.Statement;

import java.util.List;
import java.util.Map;

public class Ontology2Text implements Converter<Ontology, String> {
    public String convert(Ontology ontology) throws UnconvertableException {
        StringBuffer sb = new StringBuffer();
        if (ontology.getName() == null || ontology.getName().isEmpty()) {
            sb.append("UNNAMED ONTOLOGY");
        }
        else {
            sb.append(ontology.getName());
        }
        // seperate the name of the ontology and body with an empty line
        sb.append(System.lineSeparator()).append(System.lineSeparator());

        // use simple expression flag to use identifiers instead of nested expressions
        Expr2String ets = new Expr2String(false);

        Type2String tts = new Type2String();
        for (Statement s : ontology.getStatements()) {
            sb.append(ets.convert(s));
            sb.append('.');
            sb.append(System.lineSeparator());
        }
        return sb.toString();
    }
}
