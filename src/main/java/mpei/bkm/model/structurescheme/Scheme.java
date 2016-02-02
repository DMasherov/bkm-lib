package mpei.bkm.model.structurescheme;

import mpei.bkm.model.lss.objectspecification.concept.Concept;

import java.util.ArrayList;
import java.util.List;

/**
 * BKM scheme.
 */
public class Scheme {
    private String name;
    private List<Concept> conceptList = new ArrayList<Concept>();

    public Scheme(String name, List<Concept> conceptList) {
        this.name = name;
        this.conceptList = conceptList;
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

    public List<Concept> getConceptList() {
        return conceptList;
    }

    public void setConceptList(List<Concept> conceptList) {
        this.conceptList = conceptList;
    }
}
