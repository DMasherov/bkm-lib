package mpei.bkm.model.structurescheme;

import mpei.bkm.model.structure.objectspecification.concept.Concept;

import java.util.HashSet;
import java.util.Set;

/**
 * BKM scheme.
 */
public class Scheme {
    private String name;
    private Set<Concept> conceptSet = new HashSet<Concept>();

    public Scheme(String name, Set<Concept> conceptSet) {
        this.name = name;
        this.conceptSet = conceptSet;
    }

    public Scheme(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Concept> getConceptSet() {
        return conceptSet;
    }

    public void setConceptSet(Set<Concept> conceptSet) {
        this.conceptSet = conceptSet;
    }
}
