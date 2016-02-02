package mpei.bkm.model.commonlangfeatures;

import java.util.ArrayList;
import java.util.List;

/**
 * The class <code>Selector</code> contains the list of attributes in a selector
 * (a selector is the composition of attributes).
 */
public class Selector {
    private List<String> selects = new ArrayList<String>();

    public Selector(List<String> selects) {
        this.selects = selects;
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
}
