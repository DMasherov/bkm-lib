package mpei.bkm.converters.scheme2text;

import mpei.bkm.converters.Converter;
import mpei.bkm.converters.UnconvertableException;
import mpei.bkm.model.structure.datatypespecification.datatypes.*;
import org.apache.commons.lang.StringUtils;

public class DataType2Text implements Converter<DataType, String> {

    @Override
    public String convert(DataType dataType) throws UnconvertableException {
        if (dataType instanceof PrimitiveDataType) {
            return ((PrimitiveDataType) dataType).getType().name();
        }
        DataType2Text dataType2TextConverter = new DataType2Text();
        if (dataType instanceof UnionDataType) {
            return dataType2TextConverter.convert(((UnionDataType) dataType).getLeft()) +
                    "|" + dataType2TextConverter.convert(((UnionDataType) dataType).getRight());
        } else if (dataType instanceof StarDataType) {
            return dataType2TextConverter.convert(((StarDataType) dataType).getType()) + "(*)";
        } else if (dataType instanceof CartessianProductDataType) {
            StringBuffer sb = new StringBuffer();
            sb.append("(");
            boolean first = true;
            for (DataType t : ((CartessianProductDataType) dataType).getTypes()) {
                if (!first) {
                    sb.append(",");
                }
                first = false;
                sb.append(dataType2TextConverter.convert(t));
            }
            sb.append(")");
            return sb.toString();
        } else if (dataType instanceof DefinedType) {
            return ((DefinedType) dataType).getName();
        } else if (dataType instanceof EnumType) {
            return "{" + StringUtils.join(((EnumType) dataType).getValues(), ",") + "}";
        } else if (dataType instanceof RangeDataType) {
            return "[" + ((RangeDataType) dataType).getLeft() + "-" + ((RangeDataType) dataType).getRight() + "]";
        } else if (dataType instanceof LabeledDataType) {
            return ((LabeledDataType) dataType).getLabel() + ":" + dataType2TextConverter.convert(((LabeledDataType) dataType).getType());
        }
        else if (dataType instanceof ListDataType) {
            return "LIST(" + dataType2TextConverter.convert(((ListDataType) dataType).getType()) + ")";
        }
        else if (dataType instanceof LListDataType) {
            return "LLIST(" + dataType2TextConverter.convert(((LListDataType) dataType).getType()) + ")";
        }
        throw new UnconvertableException("Unknown concept type");

    }
}