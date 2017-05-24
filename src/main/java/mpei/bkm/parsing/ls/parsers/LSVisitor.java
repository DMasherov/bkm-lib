package mpei.bkm.parsing.ls.parsers;// Generated from C:/bmd/bkm-lib/src/grammar\LS.g4 by ANTLR 4.6
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link LSParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface LSVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link LSParser#ontology}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOntology(LSParser.OntologyContext ctx);
	/**
	 * Visit a parse tree produced by {@link LSParser#sentence}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSentence(LSParser.SentenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link LSParser#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaration(LSParser.DeclarationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code andSentence}
	 * labeled alternative in {@link LSParser#logicalSentence}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAndSentence(LSParser.AndSentenceContext ctx);
	/**
	 * Visit a parse tree produced by the {@code orSentence}
	 * labeled alternative in {@link LSParser#logicalSentence}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrSentence(LSParser.OrSentenceContext ctx);
	/**
	 * Visit a parse tree produced by the {@code notSentence}
	 * labeled alternative in {@link LSParser#logicalSentence}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNotSentence(LSParser.NotSentenceContext ctx);
	/**
	 * Visit a parse tree produced by the {@code bracketedStatement}
	 * labeled alternative in {@link LSParser#logicalSentence}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBracketedStatement(LSParser.BracketedStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code justStatement}
	 * labeled alternative in {@link LSParser#logicalSentence}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJustStatement(LSParser.JustStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code impSentence}
	 * labeled alternative in {@link LSParser#logicalSentence}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImpSentence(LSParser.ImpSentenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link LSParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(LSParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link LSParser#existence}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExistence(LSParser.ExistenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link LSParser#exist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExist(LSParser.ExistContext ctx);
	/**
	 * Visit a parse tree produced by {@link LSParser#notExist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNotExist(LSParser.NotExistContext ctx);
	/**
	 * Visit a parse tree produced by {@link LSParser#isa}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIsa(LSParser.IsaContext ctx);
	/**
	 * Visit a parse tree produced by the {@code equalsCStatement}
	 * labeled alternative in {@link LSParser#equality}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqualsCStatement(LSParser.EqualsCStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code equalsLStatement}
	 * labeled alternative in {@link LSParser#equality}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqualsLStatement(LSParser.EqualsLStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code equalsPStatement}
	 * labeled alternative in {@link LSParser#equality}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqualsPStatement(LSParser.EqualsPStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code notEqualsCStatement}
	 * labeled alternative in {@link LSParser#equality}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNotEqualsCStatement(LSParser.NotEqualsCStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code notEqualsLStatement}
	 * labeled alternative in {@link LSParser#equality}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNotEqualsLStatement(LSParser.NotEqualsLStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code eachStatement}
	 * labeled alternative in {@link LSParser#quantifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEachStatement(LSParser.EachStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code someStatement}
	 * labeled alternative in {@link LSParser#quantifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSomeStatement(LSParser.SomeStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code bracketedC}
	 * labeled alternative in {@link LSParser#c}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBracketedC(LSParser.BracketedCContext ctx);
	/**
	 * Visit a parse tree produced by the {@code andC}
	 * labeled alternative in {@link LSParser#c}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAndC(LSParser.AndCContext ctx);
	/**
	 * Visit a parse tree produced by the {@code orC}
	 * labeled alternative in {@link LSParser#c}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrC(LSParser.OrCContext ctx);
	/**
	 * Visit a parse tree produced by the {@code notC}
	 * labeled alternative in {@link LSParser#c}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNotC(LSParser.NotCContext ctx);
	/**
	 * Visit a parse tree produced by the {@code withAttributesC}
	 * labeled alternative in {@link LSParser#c}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWithAttributesC(LSParser.WithAttributesCContext ctx);
	/**
	 * Visit a parse tree produced by the {@code conceptVariableC}
	 * labeled alternative in {@link LSParser#c}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConceptVariableC(LSParser.ConceptVariableCContext ctx);
	/**
	 * Visit a parse tree produced by the {@code thoseC}
	 * labeled alternative in {@link LSParser#c}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitThoseC(LSParser.ThoseCContext ctx);
	/**
	 * Visit a parse tree produced by the {@code thatC}
	 * labeled alternative in {@link LSParser#c}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitThatC(LSParser.ThatCContext ctx);
	/**
	 * Visit a parse tree produced by the {@code bracketedL}
	 * labeled alternative in {@link LSParser#l}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBracketedL(LSParser.BracketedLContext ctx);
	/**
	 * Visit a parse tree produced by the {@code andL}
	 * labeled alternative in {@link LSParser#l}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAndL(LSParser.AndLContext ctx);
	/**
	 * Visit a parse tree produced by the {@code orL}
	 * labeled alternative in {@link LSParser#l}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrL(LSParser.OrLContext ctx);
	/**
	 * Visit a parse tree produced by the {@code notL}
	 * labeled alternative in {@link LSParser#l}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNotL(LSParser.NotLContext ctx);
	/**
	 * Visit a parse tree produced by the {@code invL}
	 * labeled alternative in {@link LSParser#l}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInvL(LSParser.InvLContext ctx);
	/**
	 * Visit a parse tree produced by the {@code withAttributesL}
	 * labeled alternative in {@link LSParser#l}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWithAttributesL(LSParser.WithAttributesLContext ctx);
	/**
	 * Visit a parse tree produced by the {@code eachP}
	 * labeled alternative in {@link LSParser#p}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEachP(LSParser.EachPContext ctx);
	/**
	 * Visit a parse tree produced by the {@code predicateVariableP}
	 * labeled alternative in {@link LSParser#p}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPredicateVariableP(LSParser.PredicateVariablePContext ctx);
	/**
	 * Visit a parse tree produced by the {@code someP}
	 * labeled alternative in {@link LSParser#p}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSomeP(LSParser.SomePContext ctx);
	/**
	 * Visit a parse tree produced by the {@code bracketedP}
	 * labeled alternative in {@link LSParser#p}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBracketedP(LSParser.BracketedPContext ctx);
	/**
	 * Visit a parse tree produced by the {@code andP}
	 * labeled alternative in {@link LSParser#p}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAndP(LSParser.AndPContext ctx);
	/**
	 * Visit a parse tree produced by the {@code surrogateVariableP}
	 * labeled alternative in {@link LSParser#p}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSurrogateVariableP(LSParser.SurrogateVariablePContext ctx);
	/**
	 * Visit a parse tree produced by the {@code onlyP}
	 * labeled alternative in {@link LSParser#p}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOnlyP(LSParser.OnlyPContext ctx);
	/**
	 * Visit a parse tree produced by the {@code orP}
	 * labeled alternative in {@link LSParser#p}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrP(LSParser.OrPContext ctx);
	/**
	 * Visit a parse tree produced by the {@code notP}
	 * labeled alternative in {@link LSParser#p}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNotP(LSParser.NotPContext ctx);
	/**
	 * Visit a parse tree produced by {@link LSParser#classDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassDeclaration(LSParser.ClassDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link LSParser#binaryLinkDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinaryLinkDeclaration(LSParser.BinaryLinkDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link LSParser#attributes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttributes(LSParser.AttributesContext ctx);
	/**
	 * Visit a parse tree produced by {@link LSParser#attribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttribute(LSParser.AttributeContext ctx);
	/**
	 * Visit a parse tree produced by {@link LSParser#dataTypeAttribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDataTypeAttribute(LSParser.DataTypeAttributeContext ctx);
	/**
	 * Visit a parse tree produced by {@link LSParser#conceptAttribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConceptAttribute(LSParser.ConceptAttributeContext ctx);
	/**
	 * Visit a parse tree produced by {@link LSParser#classAttributeConstraint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassAttributeConstraint(LSParser.ClassAttributeConstraintContext ctx);
	/**
	 * Visit a parse tree produced by {@link LSParser#intervalRestriction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntervalRestriction(LSParser.IntervalRestrictionContext ctx);
	/**
	 * Visit a parse tree produced by {@link LSParser#fullIntervalRestriction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFullIntervalRestriction(LSParser.FullIntervalRestrictionContext ctx);
	/**
	 * Visit a parse tree produced by {@link LSParser#contractedIntervalRestriction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContractedIntervalRestriction(LSParser.ContractedIntervalRestrictionContext ctx);
	/**
	 * Visit a parse tree produced by {@link LSParser#atomRestriction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtomRestriction(LSParser.AtomRestrictionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code definedTypeRuleLabel}
	 * labeled alternative in {@link LSParser#dataType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefinedTypeRuleLabel(LSParser.DefinedTypeRuleLabelContext ctx);
	/**
	 * Visit a parse tree produced by the {@code primitiveData}
	 * labeled alternative in {@link LSParser#dataType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimitiveData(LSParser.PrimitiveDataContext ctx);
	/**
	 * Visit a parse tree produced by the {@code unionData}
	 * labeled alternative in {@link LSParser#dataType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnionData(LSParser.UnionDataContext ctx);
	/**
	 * Visit a parse tree produced by the {@code starData}
	 * labeled alternative in {@link LSParser#dataType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStarData(LSParser.StarDataContext ctx);
	/**
	 * Visit a parse tree produced by the {@code rangeData}
	 * labeled alternative in {@link LSParser#dataType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRangeData(LSParser.RangeDataContext ctx);
	/**
	 * Visit a parse tree produced by the {@code cartesianProductData}
	 * labeled alternative in {@link LSParser#dataType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCartesianProductData(LSParser.CartesianProductDataContext ctx);
	/**
	 * Visit a parse tree produced by the {@code list}
	 * labeled alternative in {@link LSParser#dataType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitList(LSParser.ListContext ctx);
	/**
	 * Visit a parse tree produced by the {@code labelRuleLabel}
	 * labeled alternative in {@link LSParser#dataType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLabelRuleLabel(LSParser.LabelRuleLabelContext ctx);
	/**
	 * Visit a parse tree produced by the {@code enum}
	 * labeled alternative in {@link LSParser#dataType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnum(LSParser.EnumContext ctx);
	/**
	 * Visit a parse tree produced by the {@code llist}
	 * labeled alternative in {@link LSParser#dataType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLlist(LSParser.LlistContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BooleanPrimitive}
	 * labeled alternative in {@link LSParser#primitiveType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanPrimitive(LSParser.BooleanPrimitiveContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NumberPrimitive}
	 * labeled alternative in {@link LSParser#primitiveType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumberPrimitive(LSParser.NumberPrimitiveContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IntegerPrimitive}
	 * labeled alternative in {@link LSParser#primitiveType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntegerPrimitive(LSParser.IntegerPrimitiveContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CharPrimitive}
	 * labeled alternative in {@link LSParser#primitiveType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCharPrimitive(LSParser.CharPrimitiveContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StringPrimitive}
	 * labeled alternative in {@link LSParser#primitiveType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringPrimitive(LSParser.StringPrimitiveContext ctx);
	/**
	 * Visit a parse tree produced by {@link LSParser#rangeDataType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRangeDataType(LSParser.RangeDataTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link LSParser#labeledDataType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLabeledDataType(LSParser.LabeledDataTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code conceptName}
	 * labeled alternative in {@link LSParser#conceptType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConceptName(LSParser.ConceptNameContext ctx);
	/**
	 * Visit a parse tree produced by the {@code cartesianProductConcept}
	 * labeled alternative in {@link LSParser#conceptType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCartesianProductConcept(LSParser.CartesianProductConceptContext ctx);
	/**
	 * Visit a parse tree produced by the {@code unionConcept}
	 * labeled alternative in {@link LSParser#conceptType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnionConcept(LSParser.UnionConceptContext ctx);
	/**
	 * Visit a parse tree produced by the {@code starConcept}
	 * labeled alternative in {@link LSParser#conceptType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStarConcept(LSParser.StarConceptContext ctx);
	/**
	 * Visit a parse tree produced by {@link LSParser#attributeConstraints}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttributeConstraints(LSParser.AttributeConstraintsContext ctx);
	/**
	 * Visit a parse tree produced by {@link LSParser#constraint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstraint(LSParser.ConstraintContext ctx);
	/**
	 * Visit a parse tree produced by {@link LSParser#selector}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelector(LSParser.SelectorContext ctx);
	/**
	 * Visit a parse tree produced by {@link LSParser#className}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassName(LSParser.ClassNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link LSParser#binaryLinkName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinaryLinkName(LSParser.BinaryLinkNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link LSParser#attributeValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttributeValue(LSParser.AttributeValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link LSParser#definedTypeName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefinedTypeName(LSParser.DefinedTypeNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link LSParser#variable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable(LSParser.VariableContext ctx);
	/**
	 * Visit a parse tree produced by {@link LSParser#surrogate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSurrogate(LSParser.SurrogateContext ctx);
	/**
	 * Visit a parse tree produced by {@link LSParser#binaryOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinaryOperator(LSParser.BinaryOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link LSParser#dataValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDataValue(LSParser.DataValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link LSParser#trueorfalse}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrueorfalse(LSParser.TrueorfalseContext ctx);
	/**
	 * Visit a parse tree produced by {@link LSParser#number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumber(LSParser.NumberContext ctx);
	/**
	 * Visit a parse tree produced by {@link LSParser#string}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitString(LSParser.StringContext ctx);
}