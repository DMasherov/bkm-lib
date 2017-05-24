package mpei.bkm.model.lss.objectspecification.concept;

import mpei.bkm.model.lss.Attribute;

import java.util.ArrayList;
import java.util.List;

public abstract class Concept {
    protected String name;
    protected List<? extends Attribute> attributes = new ArrayList<>();

    public Concept(String name, List<? extends Attribute> attributes) {
        this.name = name;
        this.attributes = attributes;
    }
    public Concept(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public List<? extends Attribute> getAttributes() {
        if (attributes == null) {
            attributes = new ArrayList<Attribute>();
        }
        return attributes;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Concept concept = (Concept) o;

        if (name != null ? !name.equals(concept.name) : concept.name != null) return false;
        return attributes != null ? attributes.equals(concept.attributes) : concept.attributes == null;

    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (attributes != null ? attributes.hashCode() : 0);
        return result;
    }
}
