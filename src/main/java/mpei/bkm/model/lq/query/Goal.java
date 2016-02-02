package mpei.bkm.model.lq.query;

import mpei.bkm.model.commonlangfeatures.Selector;


public class Goal {
    private Selector selector;

    public Goal(Selector selector) {
        this.selector = selector;
    }

    public Selector getSelector() {
        return selector;
    }
}
