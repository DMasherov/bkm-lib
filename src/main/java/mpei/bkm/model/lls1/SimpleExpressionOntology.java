package mpei.bkm.model.lls1;

import mpei.bkm.model.lls1.statement.Statement;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Container for simple erefmap in an ontology.
 * <p>
 * A <b>simple expression</b> is an expression that consist of no more than three
 * simple names (that is, terms of type <code>Name</code>).
 * </p>
 */
public class SimpleExpressionOntology extends Ontology {
    private List<Expression> expressions = new ArrayList<Expression>();

    private Map<Expression,List<Expression>> erefmap = new HashMap<Expression, List<Expression>>();

    public SimpleExpressionOntology() {
        super("", new ArrayList<Statement>());
    }

    public SimpleExpressionOntology(String name, List<Statement> statements, List<Expression> expressions, Map<Expression,List<Expression>> erefmap) {
        super(name, statements);
        this.expressions = expressions;
        this.erefmap = erefmap;
    }

    public SimpleExpressionOntology(List<Statement> statements, List<Expression> expressions, Map<Expression,List<Expression>> erefmap) {
        super(statements);
        this.expressions = expressions;
        this.erefmap = erefmap;
    }

    public List<Expression> getExpressions() {
        return expressions;
    }

    public Map<Expression,List<Expression>> getErefmap() {
        return erefmap;
    }
}
