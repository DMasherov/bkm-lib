package mpei.bkm.model.query;

import mpei.bkm.model.commonfeatures.Selector;


public class Goal {
    private Selector selector;

    public Goal(Selector selector) {
        this.selector = selector;
    }

    public Selector getSelector() {
        return selector;
    }
}
