package mpei.bkm.converters.ls2sql;

import mpei.bkm.converters.Converter;
import mpei.bkm.model.lls1.LSOntology;
import mpei.bkm.model.lss.objectspecification.concept.BKMClass;
import mpei.bkm.converters.UnconvertableException;
import mpei.bkm.model.lss.Attribute;
import mpei.bkm.model.lss.datatypespecification.datatypes.EnumType;
import mpei.bkm.model.lss.datatypespecification.datatypes.PrimitiveDataType;
import mpei.bkm.model.lss.objectspecification.concept.BinaryLink;
import mpei.bkm.model.lss.objectspecification.concepttypes.*;
import mpei.bkm.parsing.structurescheme.SchemeCollections;
import mpei.bkm.parsing.structurescheme.SchemeContainer;

import java.util.*;

/**
 * Class creates a number of SQL statements which correspond to the SQL schema from the structure scheme container.
 * <p>
 * Each BKM class and link are converted to a <code>CREATE TABLE</code> statement.
 * @see SchemeContainer
 */
public class LS2Sql implements Converter<LSOntology, String> {
    public static Map<Enum,String> primitiveDataType2SqlType = new HashMap<Enum, String>();
    static {
        primitiveDataType2SqlType.put(PrimitiveDataType.PRIMITIVEDATATYPE.Integer, "integer");
        primitiveDataType2SqlType.put(PrimitiveDataType.PRIMITIVEDATATYPE.String, "varchar");
        primitiveDataType2SqlType.put(PrimitiveDataType.PRIMITIVEDATATYPE.Char, "char");
        primitiveDataType2SqlType.put(PrimitiveDataType.PRIMITIVEDATATYPE.Boolean, "integer");
        primitiveDataType2SqlType.put(PrimitiveDataType.PRIMITIVEDATATYPE.Number, "real");
    }

    private String stripAllExceptAlphaNum(String name) {
        return name.replaceAll("[^\\p{L}0-9_]","_");
    }

    @Override
    public String convert(LSOntology lsOnt) throws UnconvertableException {
        Set<BKMClass> BKMClassSet =  lsOnt.getClasses();
        Set<BinaryLink> relSet =  lsOnt.getBinaryLinks();
        StringBuffer script = new StringBuffer();
        StringBuffer alterScript = new StringBuffer();
        StringBuffer enumScripts = new StringBuffer();
        for (BKMClass BKMClass : BKMClassSet) {
            List<String> columns = new ArrayList<String>();
            String conceptName = stripAllExceptAlphaNum(BKMClass.getName());
            columns.add(String.format("\t%s %s", "sur", "integer"));
            for (Attribute attribute : BKMClass.getAttributes()) {
                String attrName = stripAllExceptAlphaNum(attribute.getName());
                if (attribute.getType() instanceof PrimitiveDataType) {
                    PrimitiveDataType.PRIMITIVEDATATYPE primitivedatatype = ((PrimitiveDataType) attribute.getType()).getType();
                    String sqlEquivalent = primitiveDataType2SqlType.get(primitivedatatype);
                    columns.add(String.format("\t%s %s", attrName, sqlEquivalent));
                }
                else if (attribute.getType() instanceof EnumType) {
                    String sqlEquivalent = "integer";
                    columns.add(String.format("\t%s %s", attrName, sqlEquivalent));

                    String enumTableName = String.format("ENUM_%s_%s", conceptName, attrName);
                    enumScripts.append(String.format("CREATE TABLE %s (\n", enumTableName));
                    enumScripts.append("\tenumsur integer,\n\tvalue varchar \n);\n\n");
                    List<String> enumValues = ((EnumType) attribute.getType()).getValues();
                    for (int i = 0; i < enumValues.size(); i++) {
                        String value = ((EnumType) attribute.getType()).getValues().get(i);
                        enumScripts.append(String.format("INSERT INTO %s(enumsur,value) VALUES (%d, '%s');\n", enumTableName, i, value));
                    }
                    enumScripts.append("\n");
                }
                else if (attribute.getType() instanceof BKMClassType || attribute.getType() instanceof UnionConceptType) {
                    String sqlEquivalent = "integer";
                    columns.add(String.format("\t%s %s",  attrName, sqlEquivalent));
                }
                else if (attribute.getType() instanceof StarConceptType) {
                    if (((StarConceptType) attribute.getType()).getType() instanceof BKMClassType) {
                        String name = ((BKMClassType) ((StarConceptType) attribute.getType()).getType()).getBKMClass().getName();
                        name = stripAllExceptAlphaNum(name);
                        alterScript.append(String.format(
                                "ALTER TABLE %s ADD COLUMN %s_%s integer;\n",
                                name,
                                conceptName, attrName));
                    }
                }
                else if (attribute.getType() instanceof CartessianProductConceptType) {
                    String sqlEquivalent = "integer";
                    List<ConceptType> conceptTypes = ((CartessianProductConceptType) attribute.getType()).getTypes();
                    for (int i = 0; i < conceptTypes.size(); i++) {
                        ConceptType type = conceptTypes.get(i);
                        columns.add(String.format("\t%s_%s_%i %s",
                                conceptName, attrName, i+1, sqlEquivalent));
                    }
                }
            }
            script.append("CREATE TABLE " + conceptName + " (\n");
            script.append(String.join(",\n", columns)).append("\n);\n");
        }
        for (BinaryLink rel  : relSet) {
            List<String> columns = new ArrayList<String>();
            columns.add(String.format("\t%s %s", "sur", "integer"));
            columns.add(String.format("\t%s_%s %s", rel.getName(), "LEFT", "integer"));
            columns.add(String.format("\t%s_%s %s", rel.getName(), "RIGHT", "integer"));
            String conceptName = stripAllExceptAlphaNum(rel.getName());
            for (Attribute attribute : rel.getAttributes()) {
                String attrName = stripAllExceptAlphaNum(attribute.getName());
                if (attribute.getType() instanceof PrimitiveDataType) {
                    PrimitiveDataType.PRIMITIVEDATATYPE primitivedatatype = ((PrimitiveDataType) attribute.getType()).getType();
                    String sqlEquivalent = primitiveDataType2SqlType.get(primitivedatatype);
                    columns.add(String.format("\t%s %s", attrName, sqlEquivalent));
                }
                else if (attribute.getType() instanceof EnumType) {
                    String sqlEquivalent = "integer";
                    columns.add(String.format("\t%s %s", attrName, sqlEquivalent));

                    String enumTableName = String.format("ENUM_%s_%s", conceptName, attrName);
                    enumScripts.append(String.format("CREATE TABLE %s (\n", enumTableName));
                    enumScripts.append("\tenumsur integer,\n\tvalue varchar \n);\n\n");
                    List<String> enumValues = ((EnumType) attribute.getType()).getValues();
                    for (int i = 0; i < enumValues.size(); i++) {
                        String value = ((EnumType) attribute.getType()).getValues().get(i);
                        enumScripts.append(String.format("INSERT INTO %s(enumsur,value) VALUES (%d, '%s');\n", enumTableName, i, value));
                    }
                    enumScripts.append("\n");
                }
                else if (attribute.getType() instanceof BKMClassType || attribute.getType() instanceof UnionConceptType) {
                    String sqlEquivalent = "integer";
                    columns.add(String.format("\t%s %s",  attrName, sqlEquivalent));
                }
                else if (attribute.getType() instanceof StarConceptType) {
                    if (((StarConceptType) attribute.getType()).getType() instanceof BKMClassType) {
                        String name = ((BKMClassType) ((StarConceptType) attribute.getType()).getType()).getBKMClass().getName();
                        name = stripAllExceptAlphaNum(name);
                        alterScript.append(String.format(
                                "ALTER TABLE %s ADD COLUMN %s_%s integer;\n",
                                name,
                                conceptName, attrName));
                    }
                }
                else if (attribute.getType() instanceof CartessianProductConceptType) {
                    String sqlEquivalent = "integer";
                    List<ConceptType> conceptTypes = ((CartessianProductConceptType) attribute.getType()).getTypes();
                    for (int i = 0; i < conceptTypes.size(); i++) {
                        ConceptType type = conceptTypes.get(i);
                        columns.add(String.format("\t%s_%s_%i %s",
                                conceptName, attrName, i+1, sqlEquivalent));
                    }
                }
            }
            script.append("CREATE TABLE " + rel.getName() + " (\n");
            script.append(String.join(",\n", columns)).append("\n);\n");
        }
        return script.toString() + "\n" + alterScript.toString() + "\n" + enumScripts;
    }
}
