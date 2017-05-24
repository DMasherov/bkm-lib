package mpei.bkm.model.lls1;

import mpei.bkm.model.lls1.statement.Statement;
import mpei.bkm.model.lls1.terms.c.WithAttributes;
import mpei.bkm.model.lss.Attribute;
import mpei.bkm.model.lss.objectspecification.attributeconstraints.Constraint;
import mpei.bkm.model.lss.objectspecification.concept.BKMClass;
import mpei.bkm.model.lss.objectspecification.concept.BinaryLink;
import mpei.bkm.model.lss.objectspecification.concept.Concept;
import mpei.bkm.model.lss.objectspecification.concepttypes.BKMClassType;

import java.util.*;

/**
 * Representation of a LS ontology.
 */
public class LSOntology {
    private String name;
    private Set<WithAttributes> classesTerms = new HashSet<>();
    private Set<mpei.bkm.model.lls1.terms.l.WithAttributes> binaryLinksTerms = new HashSet<>();

    private Set<BKMClass> classes = new HashSet<>();
    private Set<BinaryLink> binaryLinks = new HashSet<>();
    private Set<Statement> statements = new HashSet<>();

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

    public Set<mpei.bkm.model.lls1.terms.l.WithAttributes> getBinaryLinksTerms() {
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

    /**
     * Method checks simple cases when a referenced attribute by a concept,
     * c-term or l-term has type of BKM class that was not declared in the
     * ontology and returns the set of names.
     * @return Set of undeclared classes or attributes.
     */
    public Set<Undeclared> getUndeclaredClasses() {

        Map<String, BKMClass> classNames = new HashMap<>();
        getClasses().stream().forEach(c -> classNames.put(c.getName(), c));

        Map<String, BKMClass> attributeNamesOf = new HashMap<>();
        getClasses().stream().forEach(c ->
            c.getAttributes().stream().forEach(a -> attributeNamesOf.put(a.getName(), c))
        );

        Set<Undeclared<BKMClass>> undeclaredClasses = new HashSet<>();
        Set<Undeclared<BKMClass>> undeclaredAttributes = new HashSet<>();


        Set<Concept> allConcepts = new HashSet<>();
        allConcepts.addAll(getClasses());
        allConcepts.addAll(getBinaryLinks());
        for (Concept c : allConcepts) {
            for (Attribute a : c.getAttributes()) {
                if (a.getType() instanceof BKMClassType) {
                    BKMClass classOfAttribute = ((BKMClassType) a.getType()).getBKMClass();
                    if (!classNames.containsKey(classOfAttribute.getName())) {
                        undeclaredClasses.add(
                                new Undeclared<>(classOfAttribute.getName(), classOfAttribute)
                        );
                    }
                }
            }
        }

        for (WithAttributes c : getClassesTerms()) {
            if (c.getAttributeConstraints() == null ||
                    c.getAttributeConstraints().getConstraints() == null)
                continue;
            List<Constraint> constraints = c.getAttributeConstraints().getConstraints();
            for (Constraint a : constraints) {
                if (a.getLeft().isAtomic()) {
                    String attrName = a.getLeft().getSelects().get(0);
                    if (!attributeNamesOf.containsKey(attrName)) {
                        undeclaredAttributes.add(
                                new Undeclared<>(attrName, c.getBkmClass())
                        );
                    }
                }
            }
        }

        Set<Undeclared> undeclared = new HashSet<>();
        undeclared.addAll(undeclaredClasses);
        undeclared.addAll(undeclaredAttributes);

        return undeclared;
    }

}
