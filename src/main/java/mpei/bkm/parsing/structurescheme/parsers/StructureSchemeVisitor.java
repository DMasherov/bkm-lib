package mpei.bkm.parsing.structurescheme.parsers;

// Generated from StructureScheme.g4 by ANTLR 4.5.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link StructureSchemeParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface StructureSchemeVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link StructureSchemeParser#scheme}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScheme(StructureSchemeParser.SchemeContext ctx);
	/**
	 * Visit a parse tree produced by {@link StructureSchemeParser#schemeName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSchemeName(StructureSchemeParser.SchemeNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link StructureSchemeParser#conceptSentence}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConceptSentence(StructureSchemeParser.ConceptSentenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link StructureSchemeParser#classSentence}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassSentence(StructureSchemeParser.ClassSentenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link StructureSchemeParser#binaryLinkSentence}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinaryLinkSentence(StructureSchemeParser.BinaryLinkSentenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link StructureSchemeParser#isaSentence}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIsaSentence(StructureSchemeParser.IsaSentenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link StructureSchemeParser#attributes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttributes(StructureSchemeParser.AttributesContext ctx);
	/**
	 * Visit a parse tree produced by {@link StructureSchemeParser#attribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttribute(StructureSchemeParser.AttributeContext ctx);
	/**
	 * Visit a parse tree produced by {@link StructureSchemeParser#dataTypeAttribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDataTypeAttribute(StructureSchemeParser.DataTypeAttributeContext ctx);
	/**
	 * Visit a parse tree produced by {@link StructureSchemeParser#conceptAttribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConceptAttribute(StructureSchemeParser.ConceptAttributeContext ctx);
	/**
	 * Visit a parse tree produced by {@link StructureSchemeParser#classAttributeCondition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassAttributeCondition(StructureSchemeParser.ClassAttributeConditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link StructureSchemeParser#baseAttributeCondition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBaseAttributeCondition(StructureSchemeParser.BaseAttributeConditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link StructureSchemeParser#elementaryAttributeCondition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElementaryAttributeCondition(StructureSchemeParser.ElementaryAttributeConditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link StructureSchemeParser#intervalRestriction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntervalRestriction(StructureSchemeParser.IntervalRestrictionContext ctx);
	/**
	 * Visit a parse tree produced by {@link StructureSchemeParser#fullIntervalRestriction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFullIntervalRestriction(StructureSchemeParser.FullIntervalRestrictionContext ctx);
	/**
	 * Visit a parse tree produced by {@link StructureSchemeParser#contractedIntervalRestriction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContractedIntervalRestriction(StructureSchemeParser.ContractedIntervalRestrictionContext ctx);
	/**
	 * Visit a parse tree produced by {@link StructureSchemeParser#atomRestriction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtomRestriction(StructureSchemeParser.AtomRestrictionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code definedTypeRuleLabel}
	 * labeled alternative in {@link StructureSchemeParser#dataType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefinedTypeRuleLabel(StructureSchemeParser.DefinedTypeRuleLabelContext ctx);
	/**
	 * Visit a parse tree produced by the {@code primitiveData}
	 * labeled alternative in {@link StructureSchemeParser#dataType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimitiveData(StructureSchemeParser.PrimitiveDataContext ctx);
	/**
	 * Visit a parse tree produced by the {@code unionData}
	 * labeled alternative in {@link StructureSchemeParser#dataType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnionData(StructureSchemeParser.UnionDataContext ctx);
	/**
	 * Visit a parse tree produced by the {@code starData}
	 * labeled alternative in {@link StructureSchemeParser#dataType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStarData(StructureSchemeParser.StarDataContext ctx);
	/**
	 * Visit a parse tree produced by the {@code rangeData}
	 * labeled alternative in {@link StructureSchemeParser#dataType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRangeData(StructureSchemeParser.RangeDataContext ctx);
	/**
	 * Visit a parse tree produced by the {@code cartesianProductData}
	 * labeled alternative in {@link StructureSchemeParser#dataType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCartesianProductData(StructureSchemeParser.CartesianProductDataContext ctx);
	/**
	 * Visit a parse tree produced by the {@code list}
	 * labeled alternative in {@link StructureSchemeParser#dataType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitList(StructureSchemeParser.ListContext ctx);
	/**
	 * Visit a parse tree produced by the {@code labelRuleLabel}
	 * labeled alternative in {@link StructureSchemeParser#dataType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLabelRuleLabel(StructureSchemeParser.LabelRuleLabelContext ctx);
	/**
	 * Visit a parse tree produced by the {@code enum}
	 * labeled alternative in {@link StructureSchemeParser#dataType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnum(StructureSchemeParser.EnumContext ctx);
	/**
	 * Visit a parse tree produced by the {@code llist}
	 * labeled alternative in {@link StructureSchemeParser#dataType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLlist(StructureSchemeParser.LlistContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BooleanPrimitive}
	 * labeled alternative in {@link StructureSchemeParser#primitiveType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanPrimitive(StructureSchemeParser.BooleanPrimitiveContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NumberPrimitive}
	 * labeled alternative in {@link StructureSchemeParser#primitiveType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumberPrimitive(StructureSchemeParser.NumberPrimitiveContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IntegerPrimitive}
	 * labeled alternative in {@link StructureSchemeParser#primitiveType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntegerPrimitive(StructureSchemeParser.IntegerPrimitiveContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CharPrimitive}
	 * labeled alternative in {@link StructureSchemeParser#primitiveType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCharPrimitive(StructureSchemeParser.CharPrimitiveContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StringPrimitive}
	 * labeled alternative in {@link StructureSchemeParser#primitiveType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringPrimitive(StructureSchemeParser.StringPrimitiveContext ctx);
	/**
	 * Visit a parse tree produced by {@link StructureSchemeParser#rangeDataType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRangeDataType(StructureSchemeParser.RangeDataTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link StructureSchemeParser#labeledDataType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLabeledDataType(StructureSchemeParser.LabeledDataTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code conceptName}
	 * labeled alternative in {@link StructureSchemeParser#conceptType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConceptName(StructureSchemeParser.ConceptNameContext ctx);
	/**
	 * Visit a parse tree produced by the {@code cartesianProductConcept}
	 * labeled alternative in {@link StructureSchemeParser#conceptType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCartesianProductConcept(StructureSchemeParser.CartesianProductConceptContext ctx);
	/**
	 * Visit a parse tree produced by the {@code unionConcept}
	 * labeled alternative in {@link StructureSchemeParser#conceptType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnionConcept(StructureSchemeParser.UnionConceptContext ctx);
	/**
	 * Visit a parse tree produced by the {@code starConcept}
	 * labeled alternative in {@link StructureSchemeParser#conceptType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStarConcept(StructureSchemeParser.StarConceptContext ctx);
	/**
	 * Visit a parse tree produced by {@link StructureSchemeParser#selector}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelector(StructureSchemeParser.SelectorContext ctx);
	/**
	 * Visit a parse tree produced by {@link StructureSchemeParser#className}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassName(StructureSchemeParser.ClassNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link StructureSchemeParser#binaryLinkName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinaryLinkName(StructureSchemeParser.BinaryLinkNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link StructureSchemeParser#attributeValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttributeValue(StructureSchemeParser.AttributeValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link StructureSchemeParser#definedTypeName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefinedTypeName(StructureSchemeParser.DefinedTypeNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link StructureSchemeParser#binaryOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinaryOperator(StructureSchemeParser.BinaryOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link StructureSchemeParser#number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumber(StructureSchemeParser.NumberContext ctx);
}