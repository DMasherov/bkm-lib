package mpei.bkm.utils.identifier;

import java.util.UUID;

public class UUIDCreator implements IdentifierCreator<UUID> {

    public Identifier<UUID> getId() {
        return new Identifier<UUID>(UUID.randomUUID());
    }
}
