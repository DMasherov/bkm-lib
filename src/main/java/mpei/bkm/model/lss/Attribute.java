package mpei.bkm.model.lss;

import mpei.bkm.model.lss.objectspecification.concept.Concept;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;

public class Attribute<T extends Type> {
    /**
     * Attribute name.
     */
    private String name;
    /**
     * Attribute type.
     */
    private T type;
    /**
     * Concept in which the attribute is defined.
     */
    private Concept concept;

    public Attribute(String name, T type, Concept concept) {
        this.name = name;
        this.type = type;
        this.concept = concept;
    }

    public Attribute(String name, T type) {
        this.name = name;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public T getType() {
        return type;
    }

    public Concept getConcept() {
        return concept;
    }

    public void setConcept(Concept concept) {
        this.concept = concept;
    }

    @Override
    public boolean equals(Object o) {
        return EqualsBuilder.reflectionEquals(this, o);
    }

    @Override
    public int hashCode() {
        return HashCodeBuilder.reflectionHashCode(this);
    }
}
