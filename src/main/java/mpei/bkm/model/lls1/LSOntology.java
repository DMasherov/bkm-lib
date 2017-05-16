package mpei.bkm.model.lls1;

import mpei.bkm.model.lls1.statement.Statement;

import java.util.*;

/**
 * Representation of a LS ontology.
 */
public class LSOntology {
    private String name;
    private Set<mpei.bkm.model.lls1.terms.c.Named> classesTerms = new HashSet<>();
    private Set<mpei.bkm.model.lls1.terms.l.Named> binaryLinksTerms = new HashSet<>();
    private Set<Statement> statements = new HashSet<>();

    // Helper field for navigation between subexpressions
    private Map<Expression,List<Expression>> exprMap = new HashMap<Expression, List<Expression>>();

    public LSOntology(String name, Set<Statement> statements) {
        this.name = name;
        this.statements = statements;
    }

    public LSOntology(Set<Statement> statements) {
        this.name = "anonymous";
        this.statements = statements;
    }

    public String getName() {
        return name;
    }

    public Set<mpei.bkm.model.lls1.terms.c.Named> getClassesTerms() {
        return classesTerms;
    }

    public Set<mpei.bkm.model.lls1.terms.l.Named> getBinaryLinksTerms() {
        return binaryLinksTerms;
    }

    public Set<Statement> getStatements() {
        return statements;
    }

    public Map<Expression, List<Expression>> getExprMap() {
        return exprMap;
    }
}
