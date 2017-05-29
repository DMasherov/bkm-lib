package mpei.bkm.model.logic;

import mpei.bkm.model.commonfeatures.Expression;
import mpei.bkm.model.logic.statement.Statement;
import mpei.bkm.model.logic.terms.c.WithAttributes;
import mpei.bkm.model.structure.objectspecification.concept.BKMClass;
import mpei.bkm.model.structure.objectspecification.concept.BinaryLink;
import mpei.bkm.model.structure.objectspecification.concept.Concept;

import java.util.*;

/**
 * Representation of a LS ontology.
 */
public class LSOntology {
    private String name;
    private Set<WithAttributes> classesTerms = new HashSet<>();
    private Set<mpei.bkm.model.logic.terms.l.WithAttributes> binaryLinksTerms = new HashSet<>();

    private Set<BKMClass> classes = new HashSet<>();
    private Set<BinaryLink> binaryLinks = new HashSet<>();
    private Set<Statement> statements = new HashSet<>();

    private Set<Concept> declarations = new HashSet<>();

    // Helper field for navigation between subexpressions
    private Map<Expression,List<Expression>> exprMap = new HashMap<>();

    public LSOntology(String name, Set<Statement> statements) {
        if (statements == null) {
            statements = new HashSet<>();
        }
        this.name = name;
        this.statements = statements;
    }

    public LSOntology(Set<Statement> statements) {
        this(null, statements);
    }

    public LSOntology(String name) {
        this(name, new HashSet<>());
    }

    public String getName() {
        return name;
    }

    public Set<WithAttributes> getClassesTerms() {
        return classesTerms;
    }

    public Set<mpei.bkm.model.logic.terms.l.WithAttributes> getBinaryLinksTerms() {
        return binaryLinksTerms;
    }

    public Set<BKMClass> getClasses() {
        return classes;
    }

    public Set<BinaryLink> getBinaryLinks() {
        return binaryLinks;
    }

    public Set<Statement> getStatements() {
        return statements;
    }

    public Map<Expression, List<Expression>> getExprMap() {
        return exprMap;
    }

    public Set<Concept> getDeclarations() {
        return declarations;
    }

}
