package mpei.bkm.model.lss.objectspecification.attributeconditions;

import java.util.ArrayList;
import java.util.List;

public class BaseAttributeCondition {
    private List<ElementaryAttributeCondition> elementaryAttributeConditions = new ArrayList<ElementaryAttributeCondition>();

    public BaseAttributeCondition(List<ElementaryAttributeCondition> elementaryAttributeConditions) {
        this.elementaryAttributeConditions = elementaryAttributeConditions;
    }

    public List<ElementaryAttributeCondition> getElementaryAttributeConditions() {
        return elementaryAttributeConditions;
    }
}
