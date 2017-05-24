
package mpei.bkm.parsing.structurescheme.parsers;

import mpei.bkm.model.commonfeatures.Selector;
import mpei.bkm.model.structure.Attribute;
import mpei.bkm.model.structure.datatypespecification.datatypes.*;
import mpei.bkm.model.structure.objectspecification.attributeconstraints.*;
import mpei.bkm.model.structure.objectspecification.attributes.DataTypeAttribute;
import mpei.bkm.model.structure.objectspecification.concept.BKMClass;
import mpei.bkm.model.structure.objectspecification.concept.Concept;
import mpei.bkm.model.structure.objectspecification.concept.ISAConceptAux;
import mpei.bkm.model.structure.objectspecification.concepttypes.*;
import mpei.bkm.model.structure.objectspecification.intervalrestrictions.AtomRestriction;
import mpei.bkm.model.structure.objectspecification.intervalrestrictions.IntervalRestriction;
import mpei.bkm.model.structure.UnresolvedType;
import mpei.bkm.model.structure.objectspecification.intervalrestrictions.number.*;
import mpei.bkm.parsing.ls.parseinfo.ConceptAttributePositioning;
import mpei.bkm.parsing.ls.parseinfo.DataTypeAttributePositioning;
import mpei.bkm.parsing.ls.parseinfo.Positioning;
import mpei.bkm.model.structure.objectspecification.attributes.ConceptAttribute;
import mpei.bkm.model.structure.objectspecification.attributeconstraints.AttributeConstraints;
import mpei.bkm.model.structure.objectspecification.concept.BinaryLink;
import mpei.bkm.model.structure.objectspecification.intervalrestrictions.StarAtomRestriction;
import mpei.bkm.model.structurescheme.Scheme;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StructureSchemeBuildingVisitor extends StructureSchemeBaseVisitor<Object> {
    @Override
    public Scheme visitScheme(@NotNull StructureSchemeParser.SchemeContext ctx) {
        if (ctx.schemeName() == null)
            return null;
        Scheme scheme = new Scheme(ctx.schemeName().getText().replaceAll("^'|'$",""));
        for(StructureSchemeParser.ConceptSentenceContext conceptSentence: ctx.conceptSentence()) {
            Object concept = visit(conceptSentence);
            if (concept != null)
                scheme.getConceptSet().add((Concept) concept);
        }
        return scheme;
    }

    @Override public PrimitiveDataType visitPrimitiveData(@NotNull StructureSchemeParser.PrimitiveDataContext ctx) {
        for(PrimitiveDataType.PRIMITIVEDATATYPE type : PrimitiveDataType.PRIMITIVEDATATYPE.values()) {
            if (type.toString().toLowerCase().equals(ctx.getText().toLowerCase())) {
                return new PrimitiveDataType(type);
            }
        }
        return null;
    }
    @Override public RangeDataType visitRangeDataType(@NotNull StructureSchemeParser.RangeDataTypeContext ctx) {
        String left = "";
        String right = "";
        String rangeText = ctx.getText().replaceAll("^\\[|\\]$", "");
        if (rangeText.startsWith("'") || rangeText.startsWith("\"")) {
            Pattern pattern = Pattern.compile("^.+?(?<!\\\\)'");
            Matcher matcher = pattern.matcher(rangeText);
            if (matcher.find()) {
                left = matcher.group();
            }
            right = rangeText.replace(left, "").replaceAll(" *\\- *'","");
        }
        else {
            left = rangeText.replaceAll("\\-.+$", "");
            right = rangeText.replaceAll("^.+\\-", "");
        }
        return new RangeDataType(left,right);
    }
    @Override public LabeledDataType visitLabeledDataType(@NotNull StructureSchemeParser.LabeledDataTypeContext ctx) {
        return new LabeledDataType(ctx.Name().getText(), (DataType) visit(ctx.dataType()));
    }
    @Override public UnresolvedType visitDefinedTypeName(@NotNull StructureSchemeParser.DefinedTypeNameContext ctx) {
        return new UnresolvedType(ctx.Name().getText());
    }
    @Override public StarDataType visitStarData(@NotNull StructureSchemeParser.StarDataContext ctx) {
        return new StarDataType((DataType) visit(ctx.dataType()));
    }
    @Override public ListDataType visitList(@NotNull StructureSchemeParser.ListContext ctx) {
        return new ListDataType((DataType) visit(ctx.dataType()));
    }
    @Override public LListDataType visitLlist(@NotNull StructureSchemeParser.LlistContext ctx) {
        return new LListDataType((DataType) visit(ctx.dataType()));
    }
    @Override public UnionDataType visitUnionData(@NotNull StructureSchemeParser.UnionDataContext ctx) {
        return new UnionDataType((DataType) visit(ctx.getChild(0)),(DataType) visit(ctx.getChild(2)));
    }
    @Override public CartessianProductDataType visitCartesianProductData(@NotNull StructureSchemeParser.CartesianProductDataContext ctx) {
        List<DataType> types = new ArrayList<DataType>();
        for (StructureSchemeParser.DataTypeContext typeContext : ctx.dataType()) {
            types.add((DataType) visit(typeContext));
        }
        return new CartessianProductDataType(types);
    }    
    @Override public StarConceptType visitStarConcept(@NotNull StructureSchemeParser.StarConceptContext ctx) {
        return new StarConceptType((ConceptType) visit(ctx.conceptType()));
    }
    @Override public UnionConceptType visitUnionConcept(@NotNull StructureSchemeParser.UnionConceptContext ctx) {
        return new UnionConceptType((ConceptType) visit(ctx.getChild(0)),(ConceptType) visit(ctx.getChild(2)));
    }
    @Override public CartessianProductConceptType visitCartesianProductConcept(@NotNull StructureSchemeParser.CartesianProductConceptContext ctx) {
        List<ConceptType> types = new ArrayList<ConceptType>();
        for (StructureSchemeParser.ConceptTypeContext typeContext : ctx.conceptType()) {
            types.add((ConceptType) visit(typeContext));
        }
        return new CartessianProductConceptType(types);
    }
    @Override public EnumType visitEnum(@NotNull StructureSchemeParser.EnumContext ctx) {
        List<String> values = new ArrayList<String>();
        for (TerminalNode valueNode : ctx.Name()) {
            values.add(valueNode.getText());
        }
        return new EnumType(values);
    }
    @Override public DataTypeAttribute visitDataTypeAttribute(@NotNull StructureSchemeParser.DataTypeAttributeContext ctx) {
        return new DataTypeAttributePositioning(ctx.getChild(0).getText(), (DataType) visit(ctx.dataType()),
                new Positioning(ctx.start.getLine(),ctx.start.getCharPositionInLine()));
    }

    @Override public ConceptType visitConceptName(@NotNull StructureSchemeParser.ConceptNameContext ctx) {
        BKMClass bkmClass = new BKMClass(ctx.Name().getText());
        return new BKMClassType(bkmClass);
    }
    @Override public ConceptAttribute visitConceptAttribute(@NotNull StructureSchemeParser.ConceptAttributeContext ctx) {
        if (ctx.getChildCount() > 1) {
            return new ConceptAttributePositioning(ctx.Name().getText(), (ConceptType) visit(ctx.conceptType()),
                    new Positioning(ctx.start.getLine(),ctx.start.getCharPositionInLine()));
        }
        else {
            ConceptType conceptType = (ConceptType) visit(ctx.conceptType());
            return new ConceptAttributePositioning(ctx.getText(), conceptType,
                    new Positioning(ctx.start.getLine(),ctx.start.getCharPositionInLine()));
        }
    }

    @Override public List<Attribute> visitAttributes(@NotNull StructureSchemeParser.AttributesContext ctx) {
        List<Attribute> attributes = new ArrayList<Attribute>();
        for (StructureSchemeParser.AttributeContext attributeContext : ctx.attribute()) {
            attributes.add((Attribute) visit(attributeContext));
        }
        return attributes;
    }

    @Override public BKMClass visitClassSentence(@NotNull StructureSchemeParser.ClassSentenceContext ctx) {
        return new BKMClass(ctx.className().getText(),(List<? extends Attribute>)visit(ctx.attributes()));
    }

    @Override public ISAConceptAux visitIsaSentence(@NotNull StructureSchemeParser.IsaSentenceContext ctx) {
        String conceptName = ctx.Name().get(0).getText();
        String isa = ctx.Name().get(1).getText();
        ISAConceptAux ISAConceptAux = new ISAConceptAux(conceptName, isa);
        return ISAConceptAux;
    }


    @Override public Selector visitSelector(@NotNull StructureSchemeParser.SelectorContext ctx) {
        List<String> values = new ArrayList<String>();
        for (TerminalNode valueNode : ctx.Name()) {
            values.add(valueNode.getText());
        }
        return new Selector(values);
    }
    @Override public Constraint.BinaryOperator visitBinaryOperator(@NotNull StructureSchemeParser.BinaryOperatorContext ctx) {
        Constraint.BinaryOperator binaryoperator = null;
        if (ctx.EQ() != null) binaryoperator = Constraint.BinaryOperator.EQ;
        if (ctx.NOTEQ() != null) binaryoperator = Constraint.BinaryOperator.NOTEQ;
        if (ctx.GE() != null) binaryoperator = Constraint.BinaryOperator.GE;
        if (ctx.GT() != null) binaryoperator = Constraint.BinaryOperator.GT;
        if (ctx.LE() != null) binaryoperator = Constraint.BinaryOperator.LE;
        if (ctx.LT() != null) binaryoperator = Constraint.BinaryOperator.LT;
        return binaryoperator;
    }
    @Override public AtomRestriction visitAtomRestriction(@NotNull StructureSchemeParser.AtomRestrictionContext ctx) {
        Integer intValueLeft = null;
        if (ctx.Int(0) != null) {
            intValueLeft = Integer.parseInt(ctx.Int(0).getText());
        }
        Integer intValueRight = null;
        if (ctx.Int(1) != null)
            intValueRight = Integer.parseInt(ctx.Int(1).getText());
        if (ctx.EQ() != null) return new EQAtomRestriction(intValueLeft);
        else if (ctx.LE() != null) return new LEAtomRestriction(intValueLeft);
        else if (ctx.LT() != null) return new LTAtomRestriction(intValueLeft);
        else if (ctx.GE() != null) return new GEAtomRestriction(intValueLeft);
        else if (ctx.GT() != null) return new GTAtomRestriction(intValueLeft);
        else if (ctx.getChildCount() == 3) return new IntervalAtomRestriction(intValueLeft,intValueRight);
        else if ("*".equals(ctx.getText())) return new StarAtomRestriction();
        return null;
    }
    @Override public IntervalRestriction visitIntervalRestriction(@NotNull StructureSchemeParser.IntervalRestrictionContext ctx) {
        AtomRestriction left;
        AtomRestriction right;
        if (ctx.fullIntervalRestriction() != null) {
            left = (AtomRestriction) visit(ctx.fullIntervalRestriction().atomRestriction(0));
            right = (AtomRestriction) visit(ctx.fullIntervalRestriction().atomRestriction(1));
        }
        else if (ctx.fullIntervalRestriction() != null) {
            left = (AtomRestriction) visit(ctx.fullIntervalRestriction().atomRestriction(0));
            right = left;
        }
        else {
            left = new EQAtomRestriction(1);
            right = new StarAtomRestriction();
        }
        return new IntervalRestriction(left,right);
    }
    @Override public Constraint visitElementaryAttributeCondition(@NotNull StructureSchemeParser.ElementaryAttributeConditionContext ctx) {
        return new Constraint((Selector)visit(ctx.selector(0)), (Constraint.BinaryOperator) visit(ctx.binaryOperator()),(Selector)visit(ctx.selector(1)));
    }
    @Override public AttributeConstraints visitBaseAttributeCondition(@NotNull StructureSchemeParser.BaseAttributeConditionContext ctx) {
        List<Constraint> elementaryAttributeConditions = new ArrayList<Constraint>();
        for (StructureSchemeParser.ElementaryAttributeConditionContext elementaryAttributeCondition : ctx.elementaryAttributeCondition()) {
            elementaryAttributeConditions.add((Constraint)visit(elementaryAttributeCondition));
        }
        return new AttributeConstraints(elementaryAttributeConditions);
    }

    @Override public ClassAttributeCondition visitClassAttributeCondition(@NotNull StructureSchemeParser.ClassAttributeConditionContext ctx) {
        AttributeConstraints attributeConstraints = ctx.baseAttributeCondition() == null ? null : (AttributeConstraints) visit(ctx.baseAttributeCondition());
        return new ClassAttributeCondition((ConceptAttribute)visit(ctx.conceptAttribute()), attributeConstraints);
    }
    @Override public BinaryLink visitBinaryLinkSentence(@NotNull StructureSchemeParser.BinaryLinkSentenceContext ctx) {
        return new BinaryLink(
                (ClassAttributeCondition)visit(ctx.classAttributeCondition(0)),
                ctx.binaryLinkName().getText(),
                ctx.intervalRestriction() == null
                        ? new IntervalRestriction(new StarAtomRestriction(),new StarAtomRestriction())
                        : (IntervalRestriction)visit(ctx.intervalRestriction()),
                (ClassAttributeCondition)visit(ctx.classAttributeCondition(1)),
                ctx.attributes() == null ? null : (List<ConceptAttribute>)visit(ctx.attributes()));
    }
}