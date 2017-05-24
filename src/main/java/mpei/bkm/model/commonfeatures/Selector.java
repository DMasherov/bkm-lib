package mpei.bkm.model.commonfeatures;

import edu.emory.mathcs.backport.java.util.Arrays;

import java.util.ArrayList;
import java.util.List;

/**
 * Selector is the composition of attributes.
 * The class <code>Selector</code> contains the list of attributes in a selector
 */
public class Selector {
    private List<String> selects = new ArrayList<String>();

    public Selector(List<String> selects) {
        this.selects = selects;
    }

    @SuppressWarnings("unchecked")
    public Selector(String... selects) {
        this(Arrays.asList(selects));
    }

    public List<String> getSelects() {
        return selects;
    }

    /**
     * Determines if this selector contains one or more attributes.
     * @return <code>true</code> if selector contains only one attribute, otherwise
     *         <code>false</code>.
     */
    public boolean isAtomic() {
        return selects != null && selects.size() == 1;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Selector selector = (Selector) o;

        return selects != null ? selects.equals(selector.selects) : selector.selects == null;

    }

    @Override
    public int hashCode() {
        return selects != null ? selects.hashCode() : 0;
    }
}
