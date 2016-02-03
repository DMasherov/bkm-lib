package mpei.bkm.model.lss.objectspecification.concept;

import mpei.bkm.model.lss.Attribute;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;

import java.util.ArrayList;
import java.util.List;

public abstract class Concept {
    private String name;
    private List<? extends Attribute> attributes = new ArrayList<Attribute>();

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
        if (o instanceof BKMClass && this instanceof BKMClass
            && this.getName() != null
            && this.getName().equals(((BKMClass) o).getName())) {
            return true;
        }
        if (o instanceof BinaryLink && this instanceof BinaryLink
                && this.getName() != null
                && this.getName().equals(((BinaryLink) o).getName())) {
            return true;
        }
        return EqualsBuilder.reflectionEquals(this, o);

    }

    @Override
    public int hashCode() {
        return HashCodeBuilder.reflectionHashCode(this);
    }
}
