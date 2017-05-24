package mpei.bkm.converters.scheme2text;

import mpei.bkm.converters.Converter;
import mpei.bkm.converters.UnconvertableException;
import mpei.bkm.model.structure.objectspecification.intervalrestrictions.AtomRestriction;
import mpei.bkm.model.structure.objectspecification.intervalrestrictions.StarAtomRestriction;
import mpei.bkm.model.structure.objectspecification.intervalrestrictions.number.*;

import java.util.HashMap;
import java.util.Map;

public class AtomRestriction2Text implements Converter<AtomRestriction,String> {
    static Map<Class<? extends AtomRestriction>,String> AtomNumberSymbolTable;
    static {
        AtomNumberSymbolTable = new HashMap<Class<? extends AtomRestriction>, String>();
        AtomNumberSymbolTable.put(GTAtomRestriction.class, ">=");
        AtomNumberSymbolTable.put(GEAtomRestriction.class, ">");
        AtomNumberSymbolTable.put(LEAtomRestriction.class, "<=");
        AtomNumberSymbolTable.put(LTAtomRestriction.class, "<");
        AtomNumberSymbolTable.put(EQAtomRestriction.class, "=");
    }
    @Override
    public String convert(AtomRestriction atomRestriction) throws UnconvertableException {
        if (atomRestriction instanceof AtomNumberRestriction && AtomNumberSymbolTable.get(atomRestriction.getClass()) != null) {
            return AtomNumberSymbolTable.get(atomRestriction.getClass()) + ((AtomNumberRestriction) atomRestriction).getValue();
        }
        if (atomRestriction instanceof StarAtomRestriction) {
            return "*";
        }
        if (atomRestriction instanceof IntervalAtomRestriction) {
            return ((IntervalAtomRestriction) atomRestriction).getFrom().toString() + ":"
                    + ((IntervalAtomRestriction) atomRestriction).getTo().toString();
        }
        return "";
    }
}
