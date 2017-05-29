package mpei.bkm.parsing.ls.parsers;

import mpei.bkm.model.commonfeatures.Selector;
import mpei.bkm.model.commonfeatures.Expression;
import mpei.bkm.model.logic.LSOntology;
import mpei.bkm.model.logic.statement.Statement;
import mpei.bkm.model.logic.terms.c.C;
import mpei.bkm.model.logic.terms.c.That;
import mpei.bkm.model.logic.terms.c.Those;
import mpei.bkm.model.logic.terms.c.WithAttributes;
import mpei.bkm.model.logic.terms.l.L;
import mpei.bkm.model.logic.terms.p.P;
import mpei.bkm.model.structure.Attribute;
import mpei.bkm.model.structure.UnresolvedType;
import mpei.bkm.model.structure.datatypespecification.datatypes.*;
import mpei.bkm.model.structure.objectspecification.attributeconstraints.AttributeConstraints;
import mpei.bkm.model.structure.objectspecification.attributeconstraints.ClassAttributeCondition;
import mpei.bkm.model.structure.objectspecification.attributeconstraints.Constraint;
import mpei.bkm.model.structure.objectspecification.attributes.ConceptAttribute;
import mpei.bkm.model.structure.objectspecification.attributes.DataTypeAttribute;
import mpei.bkm.model.structure.objectspecification.concept.BKMClass;
import mpei.bkm.model.structure.objectspecification.concept.BinaryLink;
import mpei.bkm.model.structure.objectspecification.concept.Concept;
import mpei.bkm.model.structure.objectspecification.concepttypes.*;
import mpei.bkm.model.structure.objectspecification.intervalrestrictions.AtomRestriction;
import mpei.bkm.model.structure.objectspecification.intervalrestrictions.IntervalRestriction;
import mpei.bkm.model.structure.objectspecification.intervalrestrictions.StarAtomRestriction;
import mpei.bkm.model.structure.objectspecification.intervalrestrictions.number.*;
import mpei.bkm.parsing.ls.mapping.ExprMapping;
import mpei.bkm.parsing.ls.parseinfo.ConceptAttributePositioning;
import mpei.bkm.parsing.ls.parseinfo.DataTypeAttributePositioning;
import mpei.bkm.parsing.ls.parseinfo.Positioning;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LSBuildingVisitor extends LSBaseVisitor {
    protected LSOntology ont;
    private List<Expression> expressions = new ArrayList<>();

    @Override
    public LSOntology visitOntology(LSParser.OntologyContext ctx) {

        String ontologyName = null;
        if (ctx.Name() != null) {
            ontologyName = ctx.Name().getText();
        }
        ont = new LSOntology(ontologyName);

        expressions = new ArrayList<>();

        for (LSParser.SentenceContext sentence : ctx.sentence()) {
            if (sentence.declaration() != null) {
                visit(sentence.declaration());
            }
            if (sentence.logicalSentence() != null) {
                Statement s = (Statement) visit(sentence.logicalSentence());
                ont.getStatements().add(s);
            }
        }

        ont.getExprMap().putAll(ExprMapping.makeReferenceMap(expressions));
        return ont;
    }

    @Override
    public Concept visitDeclaration(LSParser.DeclarationContext declarationContext) {
        if (declarationContext.classDeclaration() != null) {
            return visitClassDeclaration(declarationContext.classDeclaration());
        } else if (declarationContext.binaryLinkDeclaration() != null) {
            return visitBinaryLinkDeclaration(declarationContext.binaryLinkDeclaration());
        }
        return null;
    }

    @Override
    @SuppressWarnings("unchecked")
    public BKMClass visitClassDeclaration(LSParser.ClassDeclarationContext ctx) {
        List<? extends Attribute> attrs = new ArrayList<>();
        if (ctx.attributes() != null) {
            attrs = (List<? extends Attribute>) visit(ctx.attributes());
        }
        BKMClass bkmClass =  new BKMClass(ctx.className().getText(), attrs);
        attrs.stream().forEach(a -> a.setConcept(bkmClass));

        ont.getDeclarations().add(bkmClass);
        ont.getClasses().add(bkmClass);

        return bkmClass;
    }

    @Override
    public BinaryLink visitBinaryLinkDeclaration(LSParser.BinaryLinkDeclarationContext ctx) {

        List<? extends Attribute> attrs =
                ctx.attributes() == null ? new ArrayList<>() : (List<? extends Attribute>) visit(ctx.attributes());

        BinaryLink link = new BinaryLink(
                (ClassAttributeCondition) visit(ctx.classAttributeConstraint(0)),
                ctx.binaryLinkName().getText(),
                ctx.intervalRestriction() == null
                        ? new IntervalRestriction(new StarAtomRestriction(), new StarAtomRestriction())
                        : (IntervalRestriction) visit(ctx.intervalRestriction()),
                (ClassAttributeCondition) visit(ctx.classAttributeConstraint(1)),
                attrs);

        ont.getDeclarations().add(link);
        ont.getBinaryLinks().add(link);

        return link;
    }

    @Override
    public C visitBracketedC(LSParser.BracketedCContext ctx) {
        return (C) (visit(ctx.c()));
    }

    @Override
    public mpei.bkm.model.logic.terms.c.And visitAndC(LSParser.AndCContext ctx) {
        C left = (C) (visit(ctx.c(0)));
        C right = (C) (visit(ctx.c(1)));
        mpei.bkm.model.logic.terms.c.And k = new mpei.bkm.model.logic.terms.c.And(left, right);
        expressions.add(k);
        return k;
    }

    @Override
    public mpei.bkm.model.logic.terms.c.Or visitOrC(LSParser.OrCContext ctx) {
        C left = (C) (visit(ctx.c(0)));
        C right = (C) (visit(ctx.c(1)));
        mpei.bkm.model.logic.terms.c.Or k = new mpei.bkm.model.logic.terms.c.Or(left, right);
        expressions.add(k);
        return k;
    }

    @Override
    public mpei.bkm.model.logic.terms.c.Not visitNotC(LSParser.NotCContext ctx) {
        C c = (C) visit(ctx.c());
        mpei.bkm.model.logic.terms.c.Not k = new mpei.bkm.model.logic.terms.c.Not(c);
        expressions.add(k);
        return k;
    }

    @Override
    public mpei.bkm.model.logic.terms.c.ConceptVariable visitConceptVariableC(LSParser.ConceptVariableCContext ctx) {
        C c = (C) visit(ctx.c());
        String varName = ctx.variable().getText();
        mpei.bkm.model.logic.terms.c.ConceptVariable k = new mpei.bkm.model.logic.terms.c.ConceptVariable(c, varName);
        expressions.add(k);
        return k;
    }

    @Override
    public WithAttributes visitWithAttributesC(LSParser.WithAttributesCContext ctx) {
        String name = ctx.className().getText();

        BKMClass bkmClass;
        final BKMClass parsedClass = new BKMClass(name);
        Optional<BKMClass> classInParsed = ont.getClasses().stream()
                .filter(c -> c.equals(parsedClass)).findAny();
        if (classInParsed.isPresent()) {
            bkmClass = classInParsed.get();
        }
        else {
            bkmClass = parsedClass;
            ont.getClasses().add(bkmClass);
        }

        AttributeConstraints constraints = new AttributeConstraints(Collections.emptyList());
        if (ctx.attributeConstraints() != null) {
            constraints = (AttributeConstraints) visit(ctx.attributeConstraints());
        }
        WithAttributes classTerm = new WithAttributes(bkmClass, constraints);
        ont.getClassesTerms().add(classTerm);
        return classTerm;
    }

    @Override
    public Those visitThoseC(LSParser.ThoseCContext ctx) {
        P p = (P) visit(ctx.p());
        mpei.bkm.model.logic.terms.c.Those k = new mpei.bkm.model.logic.terms.c.Those(p);
        expressions.add(k);
        return k;
    }

    @Override
    public That visitThatC(LSParser.ThatCContext ctx) {
        C c = (C) visit(ctx.c());
        P p = (P) visit(ctx.p());
        mpei.bkm.model.logic.terms.c.That k = new mpei.bkm.model.logic.terms.c.That(c, p);
        expressions.add(k);
        return k;
    }

    @Override
    public mpei.bkm.model.logic.terms.l.WithAttributes visitWithAttributesL(LSParser.WithAttributesLContext ctx) {
        String name = ctx.binaryLinkName().getText();;


        BinaryLink link;
        final BinaryLink parsedLink = new BinaryLink(name);
        Optional<BinaryLink> linkInParsed = ont.getBinaryLinks().stream()
                .filter(c -> c.equals(parsedLink)).findAny();
        if (linkInParsed.isPresent()) {
            link = linkInParsed.get();
        }
        else {
            link = parsedLink;
            ont.getBinaryLinks().add(link);
        }

        AttributeConstraints constraints = new AttributeConstraints(Collections.emptyList());
        if (ctx.attributeConstraints() != null) {
            constraints = (AttributeConstraints) visit(ctx.attributeConstraints());
        }
        mpei.bkm.model.logic.terms.l.WithAttributes linkTerm =
                new mpei.bkm.model.logic.terms.l.WithAttributes(link, constraints);
        ont.getBinaryLinksTerms().add(linkTerm);
        return linkTerm;
    }

    @Override
    public L visitBracketedL(LSParser.BracketedLContext ctx) {
        return (L) (visit(ctx.l()));
    }

    @Override
    public mpei.bkm.model.logic.terms.l.And visitAndL(LSParser.AndLContext ctx) {
        L left = (L) (visit(ctx.l(0)));
        L right = (L) (visit(ctx.l(1)));
        mpei.bkm.model.logic.terms.l.And k = new mpei.bkm.model.logic.terms.l.And(left, right);
        expressions.add(k);
        return k;
    }

    @Override
    public mpei.bkm.model.logic.terms.l.Or visitOrL(LSParser.OrLContext ctx) {
        L left = (L) (visit(ctx.l(0)));
        L right = (L) (visit(ctx.l(1)));
        mpei.bkm.model.logic.terms.l.Or k = new mpei.bkm.model.logic.terms.l.Or(left, right);
        expressions.add(k);
        return k;
    }

    @Override
    public mpei.bkm.model.logic.terms.l.Not visitNotL(LSParser.NotLContext ctx) {
        L l = (L) visit(ctx.l());
        mpei.bkm.model.logic.terms.l.Not k = new mpei.bkm.model.logic.terms.l.Not(l);
        expressions.add(k);
        return k;
    }

    @Override
    public mpei.bkm.model.logic.terms.l.Inv visitInvL(LSParser.InvLContext ctx) {
        L l = (L) visit(ctx.l());
        mpei.bkm.model.logic.terms.l.Inv k = new mpei.bkm.model.logic.terms.l.Inv(l);
        expressions.add(k);
        return k;
    }

    @Override
    public mpei.bkm.model.logic.terms.p.Not visitNotP(LSParser.NotPContext ctx) {
        P p = (P) visit(ctx.p());
        mpei.bkm.model.logic.terms.p.Not k = new mpei.bkm.model.logic.terms.p.Not(p);
        expressions.add(k);
        return k;
    }

    @Override
    public mpei.bkm.model.logic.terms.p.And visitAndP(LSParser.AndPContext ctx) {
        P left = (P) (visit(ctx.p(0)));
        P right = (P) (visit(ctx.p(1)));
        mpei.bkm.model.logic.terms.p.And k = new mpei.bkm.model.logic.terms.p.And(left, right);
        expressions.add(k);
        return k;
    }

    @Override
    public mpei.bkm.model.logic.terms.p.Or visitOrP(LSParser.OrPContext ctx) {
        P left = (P) (visit(ctx.p(0)));
        P right = (P) (visit(ctx.p(1)));
        mpei.bkm.model.logic.terms.p.Or k = new mpei.bkm.model.logic.terms.p.Or(left, right);
        expressions.add(k);
        return k;
    }

    @Override
    public mpei.bkm.model.logic.terms.p.Some visitSomeP(LSParser.SomePContext ctx) {
        L l = (L) (visit(ctx.l()));
        C c = (C) (visit(ctx.c()));
        mpei.bkm.model.logic.terms.p.Some k = new mpei.bkm.model.logic.terms.p.Some(l, c);
        expressions.add(k);
        return k;
    }

    @Override
    public mpei.bkm.model.logic.terms.p.Each visitEachP(LSParser.EachPContext ctx) {
        L l = (L) (visit(ctx.l()));
        C c = (C) (visit(ctx.c()));
        mpei.bkm.model.logic.terms.p.Each k = new mpei.bkm.model.logic.terms.p.Each(l, c);
        expressions.add(k);
        return k;
    }

    @Override
    public mpei.bkm.model.logic.terms.p.Only visitOnlyP(LSParser.OnlyPContext ctx) {
        L l = (L) (visit(ctx.l()));
        C c = (C) (visit(ctx.c()));
        mpei.bkm.model.logic.terms.p.Only k = new mpei.bkm.model.logic.terms.p.Only(l, c);
        expressions.add(k);
        return k;
    }

    @Override
    public mpei.bkm.model.logic.terms.p.PredicateVariable visitPredicateVariableP(LSParser.PredicateVariablePContext ctx) {
        L l = (L) (visit(ctx.l()));
        String varName = ctx.variable().getText();
        mpei.bkm.model.logic.terms.p.PredicateVariable k = new mpei.bkm.model.logic.terms.p.PredicateVariable(l, varName);
        expressions.add(k);
        return k;
    }

    @Override
    public mpei.bkm.model.logic.terms.p.SurrogateVariable visitSurrogateVariableP(LSParser.SurrogateVariablePContext ctx) {
        L l = (L) (visit(ctx.l()));
        String surName = ctx.surrogate().getText();
        mpei.bkm.model.logic.terms.p.SurrogateVariable k = new mpei.bkm.model.logic.terms.p.SurrogateVariable(l, surName);
        expressions.add(k);
        return k;
    }

    @Override
    public P visitBracketedP(LSParser.BracketedPContext ctx) {
        return (P) (visit(ctx.p()));
    }

    @Override
    public mpei.bkm.model.logic.statement.Not visitNotSentence(LSParser.NotSentenceContext ctx) {
        Statement s = (Statement) visit(ctx.logicalSentence());
        mpei.bkm.model.logic.statement.Not k = new mpei.bkm.model.logic.statement.Not(s);
        expressions.add(k);
        return k;
    }

    @Override
    public mpei.bkm.model.logic.statement.And visitAndSentence(LSParser.AndSentenceContext ctx) {
        Statement left = (Statement) visit(ctx.logicalSentence(0));
        Statement right = (Statement) visit(ctx.logicalSentence(1));
        mpei.bkm.model.logic.statement.And k = new mpei.bkm.model.logic.statement.And(left, right);
        expressions.add(k);
        return k;
    }

    @Override
    public mpei.bkm.model.logic.statement.Or visitOrSentence(LSParser.OrSentenceContext ctx) {
        Statement left = (Statement) visit(ctx.logicalSentence(0));
        Statement right = (Statement) visit(ctx.logicalSentence(1));
        mpei.bkm.model.logic.statement.Or k = new mpei.bkm.model.logic.statement.Or(left, right);
        expressions.add(k);
        return k;
    }

    @Override
    public mpei.bkm.model.logic.statement.Imp visitImpSentence(LSParser.ImpSentenceContext ctx) {
        Statement left = (Statement) visit(ctx.logicalSentence(0));
        Statement right = (Statement) visit(ctx.logicalSentence(1));
        mpei.bkm.model.logic.statement.Imp k = new mpei.bkm.model.logic.statement.Imp(left, right);
        expressions.add(k);
        return k;
    }

    @Override
    public mpei.bkm.model.logic.statement.Statement visitJustStatement(LSParser.JustStatementContext ctx) {
        Statement statement = (Statement) visit(ctx.statement());
        expressions.add(statement);
        return statement;
    }

    @Override
    public mpei.bkm.model.logic.statement.Statement visitExist(LSParser.ExistContext ctx) {
        C c = (C) visit(ctx.c());
        mpei.bkm.model.logic.statement.ExistC k = new mpei.bkm.model.logic.statement.ExistC(c);
        expressions.add(k);
        return k;
    }

    @Override
    public mpei.bkm.model.logic.statement.Statement visitNotExist(LSParser.NotExistContext ctx) {
        C c = (C) visit(ctx.c());
        mpei.bkm.model.logic.statement.NullC k = new mpei.bkm.model.logic.statement.NullC(c);
        expressions.add(k);
        return k;
    }

    @Override
    public mpei.bkm.model.logic.statement.IsaC visitIsa(LSParser.IsaContext ctx) {
        C sub = (C) visit(ctx.c(0));
        C sup = (C) visit(ctx.c(1));
        mpei.bkm.model.logic.statement.IsaC k = new mpei.bkm.model.logic.statement.IsaC(sub, sup);
        expressions.add(k);
        return k;
    }

    @Override
    public mpei.bkm.model.logic.statement.EqualC visitEqualsCStatement(LSParser.EqualsCStatementContext ctx) {
        C left = (C) visit(ctx.c(0));
        C right = (C) visit(ctx.c(1));
        mpei.bkm.model.logic.statement.EqualC k = new mpei.bkm.model.logic.statement.EqualC(left, right);
        expressions.add(k);
        return k;
    }

    @Override
    public mpei.bkm.model.logic.statement.EqualP visitEqualsPStatement(LSParser.EqualsPStatementContext ctx) {
        P left = (P) visit(ctx.p(0));
        P right = (P) visit(ctx.p(1));
        mpei.bkm.model.logic.statement.EqualP k = new mpei.bkm.model.logic.statement.EqualP(left, right);
        expressions.add(k);
        return k;
    }

    @Override
    public mpei.bkm.model.logic.statement.Not visitNotEqualsCStatement(LSParser.NotEqualsCStatementContext ctx) {
        C left = (C) visit(ctx.c(0));
        C right = (C) visit(ctx.c(1));
        mpei.bkm.model.logic.statement.EqualC e = new mpei.bkm.model.logic.statement.EqualC(left, right);
        mpei.bkm.model.logic.statement.Not k = new mpei.bkm.model.logic.statement.Not(e);
        expressions.add(k);
        return k;
    }

    @Override
    public mpei.bkm.model.logic.statement.EqualL visitEqualsLStatement(LSParser.EqualsLStatementContext ctx) {
        L left = (L) visit(ctx.l(0));
        L right = (L) visit(ctx.l(1));
        mpei.bkm.model.logic.statement.EqualL k = new mpei.bkm.model.logic.statement.EqualL(left, right);
        expressions.add(k);
        return k;
    }

    @Override
    public mpei.bkm.model.logic.statement.Not visitNotEqualsLStatement(LSParser.NotEqualsLStatementContext ctx) {
        L left = (L) visit(ctx.l(0));
        L right = (L) visit(ctx.l(1));
        mpei.bkm.model.logic.statement.EqualL e = new mpei.bkm.model.logic.statement.EqualL(left, right);
        mpei.bkm.model.logic.statement.Not k = new mpei.bkm.model.logic.statement.Not(e);
        expressions.add(k);
        return k;
    }

    @Override
    public mpei.bkm.model.logic.statement.Some visitSomeStatement(LSParser.SomeStatementContext ctx) {
        C c = (C) visit(ctx.c());
        P p = (P) visit(ctx.p());
        mpei.bkm.model.logic.statement.Some k = new mpei.bkm.model.logic.statement.Some(c, p);
        expressions.add(k);
        return k;
    }

    @Override
    public mpei.bkm.model.logic.statement.Each visitEachStatement(LSParser.EachStatementContext ctx) {
        C c = (C) visit(ctx.c());
        P p = (P) visit(ctx.p());
        mpei.bkm.model.logic.statement.Each k = new mpei.bkm.model.logic.statement.Each(c, p);
        expressions.add(k);
        return k;
    }

    @Override
    public mpei.bkm.model.logic.statement.Statement visitBracketedStatement(LSParser.BracketedStatementContext ctx) {
        return (Statement) (visit(ctx.logicalSentence()));
    }

    @Override
    public String visitVariable(LSParser.VariableContext ctx) {
        return ctx.getText();
    }

    @Override
    public String visitSurrogate(LSParser.SurrogateContext ctx) {
        return ctx.getText();
    }


    @Override
    public PrimitiveDataType visitPrimitiveData(LSParser.PrimitiveDataContext ctx) {
        for (PrimitiveDataType.PRIMITIVEDATATYPE type : PrimitiveDataType.PRIMITIVEDATATYPE.values()) {
            if (type.toString().toLowerCase().equals(ctx.getText().toLowerCase())) {
                return new PrimitiveDataType(type);
            }
        }
        return null;
    }

    @Override
    public RangeDataType visitRangeDataType(LSParser.RangeDataTypeContext ctx) {
        String left = "";
        String right = "";
        String rangeText = ctx.getText().replaceAll("^\\[|\\]$", "");
        if (rangeText.startsWith("'")) {
            Pattern pattern = Pattern.compile("^.+?(?<!\\\\)'");
            Matcher matcher = pattern.matcher(rangeText);
            if (matcher.find()) {
                left = matcher.group();
            }
            right = rangeText.replace(left, "").replaceAll(" *\\- *'", "");
        } else {
            left = rangeText.replaceAll("\\-.+$", "");
            right = rangeText.replaceAll("^.+\\-", "");
        }
        return new RangeDataType(left, right);
    }

    @Override
    public LabeledDataType visitLabeledDataType(LSParser.LabeledDataTypeContext ctx) {
        return new LabeledDataType(ctx.Name().getText(), (DataType) visit(ctx.dataType()));
    }

    @Override
    public UnresolvedType visitDefinedTypeName(LSParser.DefinedTypeNameContext ctx) {
        return new UnresolvedType(ctx.Name().getText());
    }

    @Override
    public StarDataType visitStarData(LSParser.StarDataContext ctx) {
        return new StarDataType((DataType) visit(ctx.dataType()));
    }

    @Override
    public ListDataType visitList(LSParser.ListContext ctx) {
        return new ListDataType((DataType) visit(ctx.dataType()));
    }

    @Override
    public LListDataType visitLlist(LSParser.LlistContext ctx) {
        return new LListDataType((DataType) visit(ctx.dataType()));
    }

    @Override
    public UnionDataType visitUnionData(LSParser.UnionDataContext ctx) {
        return new UnionDataType((DataType) visit(ctx.getChild(0)), (DataType) visit(ctx.getChild(2)));
    }

    @Override
    public CartessianProductDataType visitCartesianProductData(LSParser.CartesianProductDataContext ctx) {
        List<DataType> types = new ArrayList<>();
        for (LSParser.DataTypeContext typeContext : ctx.dataType()) {
            types.add((DataType) visit(typeContext));
        }
        return new CartessianProductDataType(types);
    }

    @Override
    public StarConceptType visitStarConcept(LSParser.StarConceptContext ctx) {
        return new StarConceptType((ConceptType) visit(ctx.conceptType()));
    }

    @Override
    public UnionConceptType visitUnionConcept(LSParser.UnionConceptContext ctx) {
        return new UnionConceptType((ConceptType) visit(ctx.getChild(0)), (ConceptType) visit(ctx.getChild(2)));
    }

    @Override
    public CartessianProductConceptType visitCartesianProductConcept(LSParser.CartesianProductConceptContext ctx) {
        List<ConceptType> types = new ArrayList<>();
        for (LSParser.ConceptTypeContext typeContext : ctx.conceptType()) {
            types.add((ConceptType) visit(typeContext));
        }
        return new CartessianProductConceptType(types);
    }

    @Override
    public EnumType visitEnum(LSParser.EnumContext ctx) {
        List<String> values = new ArrayList<>();
        for (TerminalNode valueNode : ctx.Name()) {
            values.add(valueNode.getText());
        }
        return new EnumType(values);
    }

    @Override
    public DataTypeAttribute visitDataTypeAttribute(LSParser.DataTypeAttributeContext ctx) {
        return new DataTypeAttributePositioning(ctx.getChild(0).getText(), (DataType) visit(ctx.dataType()),
                new Positioning(ctx.start.getLine(), ctx.start.getCharPositionInLine()));
    }

    @Override
    public ConceptType visitConceptName(LSParser.ConceptNameContext ctx) {
        BKMClass bkmClass = new BKMClass(ctx.Name().getText());
        return new BKMClassType(bkmClass);
    }

    @Override
    public ConceptAttribute visitConceptAttribute(LSParser.ConceptAttributeContext ctx) {
        if (ctx.getChildCount() > 1) {
            return new ConceptAttributePositioning(ctx.Name().getText(), (ConceptType) visit(ctx.conceptType()),
                    new Positioning(ctx.start.getLine(), ctx.start.getCharPositionInLine()));
        } else {
            ConceptType conceptType = (ConceptType) visit(ctx.conceptType());
            return new ConceptAttributePositioning(ctx.getText(), conceptType,
                    new Positioning(ctx.start.getLine(), ctx.start.getCharPositionInLine()));
        }
    }

    @Override
    public List<Attribute> visitAttributes(LSParser.AttributesContext ctx) {
        List<Attribute> attributes = new ArrayList<>();
        for (LSParser.AttributeContext attributeContext : ctx.attribute()) {
            attributes.add((Attribute) visit(attributeContext));
        }
        return attributes;
    }


    @Override
    public Selector visitSelector(LSParser.SelectorContext ctx) {
        List<String> values = new ArrayList<>();
        for (TerminalNode valueNode : ctx.Name()) {
            values.add(valueNode.getText());
        }
        return new Selector(values);
    }

    @Override
    public Constraint.BinaryOperator visitBinaryOperator(LSParser.BinaryOperatorContext ctx) {
        Constraint.BinaryOperator binaryoperator = null;
        if (ctx.EQ() != null) binaryoperator = Constraint.BinaryOperator.EQ;
        if (ctx.NOTEQ() != null) binaryoperator = Constraint.BinaryOperator.NOTEQ;
        if (ctx.GE() != null) binaryoperator = Constraint.BinaryOperator.GE;
        if (ctx.GT() != null) binaryoperator = Constraint.BinaryOperator.GT;
        if (ctx.LE() != null) binaryoperator = Constraint.BinaryOperator.LE;
        if (ctx.LT() != null) binaryoperator = Constraint.BinaryOperator.LT;
        return binaryoperator;
    }

    @Override
    public AtomRestriction visitAtomRestriction(LSParser.AtomRestrictionContext ctx) {
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
        else if (ctx.getChildCount() == 3) return new IntervalAtomRestriction(intValueLeft, intValueRight);
        else if ("*".equals(ctx.getText())) return new StarAtomRestriction();
        return null;
    }

    @Override
    public IntervalRestriction visitIntervalRestriction(LSParser.IntervalRestrictionContext ctx) {
        AtomRestriction left;
        AtomRestriction right;
        if (ctx.fullIntervalRestriction() != null) {
            left = (AtomRestriction) visit(ctx.fullIntervalRestriction().atomRestriction(0));
            right = (AtomRestriction) visit(ctx.fullIntervalRestriction().atomRestriction(1));
        } else if (ctx.fullIntervalRestriction() != null) {
            left = (AtomRestriction) visit(ctx.fullIntervalRestriction().atomRestriction(0));
            right = left;
        } else {
            left = new EQAtomRestriction(1);
            right = new StarAtomRestriction();
        }
        return new IntervalRestriction(left, right);
    }

    @Override
    public Constraint visitConstraint(LSParser.ConstraintContext ctx) {
        Selector rhs;
        if (ctx.selector(1) != null) {
            rhs = (Selector) visit(ctx.selector(1));
        }
        else {
            rhs = new Selector(ctx.attributeValue().getText());
        }

        return new Constraint(
                (Selector) visit(ctx.selector(0)),
                (Constraint.BinaryOperator) visit(ctx.binaryOperator()),
                rhs
        );
    }

    @Override
    public AttributeConstraints visitAttributeConstraints(LSParser.AttributeConstraintsContext ctx) {
        List<Constraint> eacs = new ArrayList<>();
        for (LSParser.ConstraintContext constraint : ctx.constraint()) {
            eacs.add((Constraint) visit(constraint));
        }
        return new AttributeConstraints(eacs);
    }

    @Override
    public ClassAttributeCondition visitClassAttributeConstraint(LSParser.ClassAttributeConstraintContext ctx) {
        AttributeConstraints attributeConstraints = ctx.attributeConstraints() == null
                        ? null
                        : (AttributeConstraints) visit(ctx.attributeConstraints());
        return new ClassAttributeCondition((ConceptAttribute) visit(ctx.conceptAttribute()), attributeConstraints);
    }
}
