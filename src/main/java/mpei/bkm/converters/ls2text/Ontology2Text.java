package mpei.bkm.converters.ls2text;

import mpei.bkm.converters.Converter;
import mpei.bkm.converters.UnconvertableException;
import mpei.bkm.converters.ls2text.expression2Text.Expr2String;
import mpei.bkm.converters.ls2text.expression2Text.Type2String;
import mpei.bkm.model.logic.LSOntology;
import mpei.bkm.model.logic.statement.Statement;

public class Ontology2Text implements Converter<LSOntology, String> {
    public String convert(LSOntology LSOntology) throws UnconvertableException {
        StringBuffer sb = new StringBuffer();
        if (LSOntology.getName() == null || LSOntology.getName().isEmpty()) {
            sb.append("UNNAMED ONTOLOGY");
        }
        else {
            sb.append(LSOntology.getName());
        }
        // seperate the name of the ontology and body with an empty line
        sb.append(System.lineSeparator()).append(System.lineSeparator());

        // use simple expression flag to use identifiers instead of nested expressions
        Expr2String ets = new Expr2String(false);

        Type2String tts = new Type2String();
        for (Statement s : LSOntology.getStatements()) {
            sb.append(ets.convert(s));
            sb.append('.');
            sb.append(System.lineSeparator());
        }
        return sb.toString();
    }
}
