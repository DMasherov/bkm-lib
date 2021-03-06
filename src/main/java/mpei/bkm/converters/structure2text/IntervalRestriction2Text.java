package mpei.bkm.converters.structure2text;

import mpei.bkm.converters.Converter;
import mpei.bkm.converters.UnconvertableException;
import mpei.bkm.model.structure.objectspecification.intervalrestrictions.IntervalRestriction;

public class IntervalRestriction2Text implements Converter<IntervalRestriction,String> {
    @Override
    public String convert(IntervalRestriction intervalRestriction) throws UnconvertableException {
        StringBuffer sb = new StringBuffer();
        AtomRestriction2Text atomRestriction2TextConverter = new AtomRestriction2Text();
        if (intervalRestriction.isFunctional()) {
            sb.append(" -> ");
        }
        else {
            sb.append("(");
            sb.append(atomRestriction2TextConverter.convert(intervalRestriction.getLeft()));
            sb.append(",");
            sb.append(atomRestriction2TextConverter.convert(intervalRestriction.getRight()));
            sb.append(")");
        }
        return sb.toString();
    }
}