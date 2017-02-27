package mpei.bkm.utils.identifier;

import java.util.concurrent.atomic.AtomicInteger;

public class Counter implements IdentifierCreator<Integer> {

    private AtomicInteger c = new AtomicInteger(0);

    public Identifier<Integer> getId() {
        return new Identifier<Integer>(c.addAndGet(1));
    }
}
