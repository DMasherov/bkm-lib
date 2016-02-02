package mpei.bkm.converters.text2query;

import mpei.bkm.converters.Converter;
import mpei.bkm.converters.UnconvertableException;
import mpei.bkm.parsing.lq.parsers.LQBuildingVisitor;
import mpei.bkm.model.lq.query.Query;
import mpei.bkm.model.lq.query.variable.QueryVariableCollection;
import mpei.bkm.parsing.lq.parsers.LQLexer;
import mpei.bkm.parsing.lq.parsers.LQParser;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;

/**
 * Class creates a BKM query from its text representation.
 *
 * @see QueryVariableCollection
 * @see Query
 */
public class Text2QueryVariableCollection implements Converter<String,QueryVariableCollection> {
    @Override
    public QueryVariableCollection convert(String s) throws UnconvertableException {
        ANTLRInputStream stream = new ANTLRInputStream(s);
        LQLexer lexer = new LQLexer(stream);

        LQParser parser = new LQParser(new CommonTokenStream(lexer));
        parser.removeErrorListeners();

        LQBuildingVisitor v = new LQBuildingVisitor();
        QueryVariableCollection qvc = (QueryVariableCollection) v.visit(parser.query());
        return qvc;
    }
}
