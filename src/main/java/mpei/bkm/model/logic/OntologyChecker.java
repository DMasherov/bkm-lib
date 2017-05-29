package mpei.bkm.model.logic;

import mpei.bkm.model.commonfeatures.Undeclared;
import mpei.bkm.model.logic.terms.c.WithAttributes;
import mpei.bkm.model.structure.Attribute;
import mpei.bkm.model.structure.objectspecification.attributeconstraints.Constraint;
import mpei.bkm.model.structure.objectspecification.concept.BKMClass;
import mpei.bkm.model.structure.objectspecification.concept.Concept;
import mpei.bkm.model.structure.objectspecification.concepttypes.BKMClassType;

import java.util.*;
import java.util.stream.Collectors;

public class OntologyChecker {
    private LSOntology ont;

    public OntologyChecker(LSOntology ont) {
        this.ont = ont;
    }

    public LSOntology getOnt() {
        return ont;
    }

    public Set<String> getDuplicated() {
        Set<String> unique = new HashSet<>();
        return ont.getDeclarations().stream()
                .map(Concept::getName)
                .filter(name -> !unique.add(name))
                .collect(Collectors.toSet());
    }

    /**
     * Method checks simple cases when a referenced attribute by a concept,
     * c-term or l-term has type of BKM class that was not declared in the
     * ontology and returns the set of names.
     * @return Set of undeclared classes or attributes.
     */
    public Set<Undeclared> getUndeclaredClasses() {

        Map<String, BKMClass> classNames = new HashMap<>();
        ont.getClasses().stream().forEach(c -> classNames.put(c.getName(), c));

        Map<String, BKMClass> attributeNamesOf = new HashMap<>();
        ont.getClasses().stream().forEach(c ->
                c.getAttributes().stream().forEach(a -> attributeNamesOf.put(a.getName(), c))
        );

        Set<Undeclared<BKMClass>> undeclaredClasses = new HashSet<>();
        Set<Undeclared<BKMClass>> undeclaredAttributes = new HashSet<>();


        Set<Concept> allConcepts = new HashSet<>();
        allConcepts.addAll(ont.getClasses());
        allConcepts.addAll(ont.getBinaryLinks());
        for (Concept c : allConcepts) {
            for (Attribute a : c.getAttributes()) {
                if (a.getType() instanceof BKMClassType) {
                    BKMClass classOfAttribute = ((BKMClassType) a.getType()).getBKMClass();
                    if (!classNames.containsKey(classOfAttribute.getName())) {
                        undeclaredClasses.add(
                                new Undeclared<>(classOfAttribute.getName(), (BKMClass)c)
                        );
                    }
                }
            }
        }

        for (WithAttributes c : ont.getClassesTerms()) {
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
