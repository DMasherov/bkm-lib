package mpei.bkm.model.lls1.terms.l;

import mpei.bkm.model.lss.objectspecification.concept.BinaryLink;

public class Named extends L {
    private BinaryLink binaryLink;

    public Named(BinaryLink binaryLink) {
        this.binaryLink = binaryLink;
    }

    public BinaryLink getBinaryLink() {
        return binaryLink;
    }

    public void setBinaryLink(BinaryLink binaryLink) {
        this.binaryLink = binaryLink;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Named)) return false;

        Named named = (Named) o;

        if (binaryLink != null ? !binaryLink.equals(named.binaryLink) : named.binaryLink != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return binaryLink != null ? binaryLink.hashCode() : 0;
    }
}
