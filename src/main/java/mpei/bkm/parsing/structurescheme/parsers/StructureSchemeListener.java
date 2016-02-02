package mpei.bkm.parsing.structurescheme.parsers;
// Generated from StructureScheme.g4 by ANTLR 4.5.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link StructureSchemeParser}.
 */
public interface StructureSchemeListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link StructureSchemeParser#scheme}.
	 * @param ctx the parse tree
	 */
	void enterScheme(StructureSchemeParser.SchemeContext ctx);
	/**
	 * Exit a parse tree produced by {@link StructureSchemeParser#scheme}.
	 * @param ctx the parse tree
	 */
	void exitScheme(StructureSchemeParser.SchemeContext ctx);
	/**
	 * Enter a parse tree produced by {@link StructureSchemeParser#schemeName}.
	 * @param ctx the parse tree
	 */
	void enterSchemeName(StructureSchemeParser.SchemeNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link StructureSchemeParser#schemeName}.
	 * @param ctx the parse tree
	 */
	void exitSchemeName(StructureSchemeParser.SchemeNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link StructureSchemeParser#conceptSentence}.
	 * @param ctx the parse tree
	 */
	void enterConceptSentence(StructureSchemeParser.ConceptSentenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link StructureSchemeParser#conceptSentence}.
	 * @param ctx the parse tree
	 */
	void exitConceptSentence(StructureSchemeParser.ConceptSentenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link StructureSchemeParser#classSentence}.
	 * @param ctx the parse tree
	 */
	void enterClassSentence(StructureSchemeParser.ClassSentenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link StructureSchemeParser#classSentence}.
	 * @param ctx the parse tree
	 */
	void exitClassSentence(StructureSchemeParser.ClassSentenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link StructureSchemeParser#binaryLinkSentence}.
	 * @param ctx the parse tree
	 */
	void enterBinaryLinkSentence(StructureSchemeParser.BinaryLinkSentenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link StructureSchemeParser#binaryLinkSentence}.
	 * @param ctx the parse tree
	 */
	void exitBinaryLinkSentence(StructureSchemeParser.BinaryLinkSentenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link StructureSchemeParser#isaSentence}.
	 * @param ctx the parse tree
	 */
	void enterIsaSentence(StructureSchemeParser.IsaSentenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link StructureSchemeParser#isaSentence}.
	 * @param ctx the parse tree
	 */
	void exitIsaSentence(StructureSchemeParser.IsaSentenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link StructureSchemeParser#attributes}.
	 * @param ctx the parse tree
	 */
	void enterAttributes(StructureSchemeParser.AttributesContext ctx);
	/**
	 * Exit a parse tree produced by {@link StructureSchemeParser#attributes}.
	 * @param ctx the parse tree
	 */
	void exitAttributes(StructureSchemeParser.AttributesContext ctx);
	/**
	 * Enter a parse tree produced by {@link StructureSchemeParser#attribute}.
	 * @param ctx the parse tree
	 */
	void enterAttribute(StructureSchemeParser.AttributeContext ctx);
	/**
	 * Exit a parse tree produced by {@link StructureSchemeParser#attribute}.
	 * @param ctx the parse tree
	 */
	void exitAttribute(StructureSchemeParser.AttributeContext ctx);
	/**
	 * Enter a parse tree produced by {@link StructureSchemeParser#dataTypeAttribute}.
	 * @param ctx the parse tree
	 */
	void enterDataTypeAttribute(StructureSchemeParser.DataTypeAttributeContext ctx);
	/**
	 * Exit a parse tree produced by {@link StructureSchemeParser#dataTypeAttribute}.
	 * @param ctx the parse tree
	 */
	void exitDataTypeAttribute(StructureSchemeParser.DataTypeAttributeContext ctx);
	/**
	 * Enter a parse tree produced by {@link StructureSchemeParser#conceptAttribute}.
	 * @param ctx the parse tree
	 */
	void enterConceptAttribute(StructureSchemeParser.ConceptAttributeContext ctx);
	/**
	 * Exit a parse tree produced by {@link StructureSchemeParser#conceptAttribute}.
	 * @param ctx the parse tree
	 */
	void exitConceptAttribute(StructureSchemeParser.ConceptAttributeContext ctx);
	/**
	 * Enter a parse tree produced by {@link StructureSchemeParser#classAttributeCondition}.
	 * @param ctx the parse tree
	 */
	void enterClassAttributeCondition(StructureSchemeParser.ClassAttributeConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link StructureSchemeParser#classAttributeCondition}.
	 * @param ctx the parse tree
	 */
	void exitClassAttributeCondition(StructureSchemeParser.ClassAttributeConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link StructureSchemeParser#baseAttributeCondition}.
	 * @param ctx the parse tree
	 */
	void enterBaseAttributeCondition(StructureSchemeParser.BaseAttributeConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link StructureSchemeParser#baseAttributeCondition}.
	 * @param ctx the parse tree
	 */
	void exitBaseAttributeCondition(StructureSchemeParser.BaseAttributeConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link StructureSchemeParser#elementaryAttributeCondition}.
	 * @param ctx the parse tree
	 */
	void enterElementaryAttributeCondition(StructureSchemeParser.ElementaryAttributeConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link StructureSchemeParser#elementaryAttributeCondition}.
	 * @param ctx the parse tree
	 */
	void exitElementaryAttributeCondition(StructureSchemeParser.ElementaryAttributeConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link StructureSchemeParser#intervalRestriction}.
	 * @param ctx the parse tree
	 */
	void enterIntervalRestriction(StructureSchemeParser.IntervalRestrictionContext ctx);
	/**
	 * Exit a parse tree produced by {@link StructureSchemeParser#intervalRestriction}.
	 * @param ctx the parse tree
	 */
	void exitIntervalRestriction(StructureSchemeParser.IntervalRestrictionContext ctx);
	/**
	 * Enter a parse tree produced by {@link StructureSchemeParser#fullIntervalRestriction}.
	 * @param ctx the parse tree
	 */
	void enterFullIntervalRestriction(StructureSchemeParser.FullIntervalRestrictionContext ctx);
	/**
	 * Exit a parse tree produced by {@link StructureSchemeParser#fullIntervalRestriction}.
	 * @param ctx the parse tree
	 */
	void exitFullIntervalRestriction(StructureSchemeParser.FullIntervalRestrictionContext ctx);
	/**
	 * Enter a parse tree produced by {@link StructureSchemeParser#contractedIntervalRestriction}.
	 * @param ctx the parse tree
	 */
	void enterContractedIntervalRestriction(StructureSchemeParser.ContractedIntervalRestrictionContext ctx);
	/**
	 * Exit a parse tree produced by {@link StructureSchemeParser#contractedIntervalRestriction}.
	 * @param ctx the parse tree
	 */
	void exitContractedIntervalRestriction(StructureSchemeParser.ContractedIntervalRestrictionContext ctx);
	/**
	 * Enter a parse tree produced by {@link StructureSchemeParser#atomRestriction}.
	 * @param ctx the parse tree
	 */
	void enterAtomRestriction(StructureSchemeParser.AtomRestrictionContext ctx);
	/**
	 * Exit a parse tree produced by {@link StructureSchemeParser#atomRestriction}.
	 * @param ctx the parse tree
	 */
	void exitAtomRestriction(StructureSchemeParser.AtomRestrictionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code definedTypeRuleLabel}
	 * labeled alternative in {@link StructureSchemeParser#dataType}.
	 * @param ctx the parse tree
	 */
	void enterDefinedTypeRuleLabel(StructureSchemeParser.DefinedTypeRuleLabelContext ctx);
	/**
	 * Exit a parse tree produced by the {@code definedTypeRuleLabel}
	 * labeled alternative in {@link StructureSchemeParser#dataType}.
	 * @param ctx the parse tree
	 */
	void exitDefinedTypeRuleLabel(StructureSchemeParser.DefinedTypeRuleLabelContext ctx);
	/**
	 * Enter a parse tree produced by the {@code primitiveData}
	 * labeled alternative in {@link StructureSchemeParser#dataType}.
	 * @param ctx the parse tree
	 */
	void enterPrimitiveData(StructureSchemeParser.PrimitiveDataContext ctx);
	/**
	 * Exit a parse tree produced by the {@code primitiveData}
	 * labeled alternative in {@link StructureSchemeParser#dataType}.
	 * @param ctx the parse tree
	 */
	void exitPrimitiveData(StructureSchemeParser.PrimitiveDataContext ctx);
	/**
	 * Enter a parse tree produced by the {@code unionData}
	 * labeled alternative in {@link StructureSchemeParser#dataType}.
	 * @param ctx the parse tree
	 */
	void enterUnionData(StructureSchemeParser.UnionDataContext ctx);
	/**
	 * Exit a parse tree produced by the {@code unionData}
	 * labeled alternative in {@link StructureSchemeParser#dataType}.
	 * @param ctx the parse tree
	 */
	void exitUnionData(StructureSchemeParser.UnionDataContext ctx);
	/**
	 * Enter a parse tree produced by the {@code starData}
	 * labeled alternative in {@link StructureSchemeParser#dataType}.
	 * @param ctx the parse tree
	 */
	void enterStarData(StructureSchemeParser.StarDataContext ctx);
	/**
	 * Exit a parse tree produced by the {@code starData}
	 * labeled alternative in {@link StructureSchemeParser#dataType}.
	 * @param ctx the parse tree
	 */
	void exitStarData(StructureSchemeParser.StarDataContext ctx);
	/**
	 * Enter a parse tree produced by the {@code rangeData}
	 * labeled alternative in {@link StructureSchemeParser#dataType}.
	 * @param ctx the parse tree
	 */
	void enterRangeData(StructureSchemeParser.RangeDataContext ctx);
	/**
	 * Exit a parse tree produced by the {@code rangeData}
	 * labeled alternative in {@link StructureSchemeParser#dataType}.
	 * @param ctx the parse tree
	 */
	void exitRangeData(StructureSchemeParser.RangeDataContext ctx);
	/**
	 * Enter a parse tree produced by the {@code cartesianProductData}
	 * labeled alternative in {@link StructureSchemeParser#dataType}.
	 * @param ctx the parse tree
	 */
	void enterCartesianProductData(StructureSchemeParser.CartesianProductDataContext ctx);
	/**
	 * Exit a parse tree produced by the {@code cartesianProductData}
	 * labeled alternative in {@link StructureSchemeParser#dataType}.
	 * @param ctx the parse tree
	 */
	void exitCartesianProductData(StructureSchemeParser.CartesianProductDataContext ctx);
	/**
	 * Enter a parse tree produced by the {@code list}
	 * labeled alternative in {@link StructureSchemeParser#dataType}.
	 * @param ctx the parse tree
	 */
	void enterList(StructureSchemeParser.ListContext ctx);
	/**
	 * Exit a parse tree produced by the {@code list}
	 * labeled alternative in {@link StructureSchemeParser#dataType}.
	 * @param ctx the parse tree
	 */
	void exitList(StructureSchemeParser.ListContext ctx);
	/**
	 * Enter a parse tree produced by the {@code labelRuleLabel}
	 * labeled alternative in {@link StructureSchemeParser#dataType}.
	 * @param ctx the parse tree
	 */
	void enterLabelRuleLabel(StructureSchemeParser.LabelRuleLabelContext ctx);
	/**
	 * Exit a parse tree produced by the {@code labelRuleLabel}
	 * labeled alternative in {@link StructureSchemeParser#dataType}.
	 * @param ctx the parse tree
	 */
	void exitLabelRuleLabel(StructureSchemeParser.LabelRuleLabelContext ctx);
	/**
	 * Enter a parse tree produced by the {@code enum}
	 * labeled alternative in {@link StructureSchemeParser#dataType}.
	 * @param ctx the parse tree
	 */
	void enterEnum(StructureSchemeParser.EnumContext ctx);
	/**
	 * Exit a parse tree produced by the {@code enum}
	 * labeled alternative in {@link StructureSchemeParser#dataType}.
	 * @param ctx the parse tree
	 */
	void exitEnum(StructureSchemeParser.EnumContext ctx);
	/**
	 * Enter a parse tree produced by the {@code llist}
	 * labeled alternative in {@link StructureSchemeParser#dataType}.
	 * @param ctx the parse tree
	 */
	void enterLlist(StructureSchemeParser.LlistContext ctx);
	/**
	 * Exit a parse tree produced by the {@code llist}
	 * labeled alternative in {@link StructureSchemeParser#dataType}.
	 * @param ctx the parse tree
	 */
	void exitLlist(StructureSchemeParser.LlistContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BooleanPrimitive}
	 * labeled alternative in {@link StructureSchemeParser#primitiveType}.
	 * @param ctx the parse tree
	 */
	void enterBooleanPrimitive(StructureSchemeParser.BooleanPrimitiveContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BooleanPrimitive}
	 * labeled alternative in {@link StructureSchemeParser#primitiveType}.
	 * @param ctx the parse tree
	 */
	void exitBooleanPrimitive(StructureSchemeParser.BooleanPrimitiveContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NumberPrimitive}
	 * labeled alternative in {@link StructureSchemeParser#primitiveType}.
	 * @param ctx the parse tree
	 */
	void enterNumberPrimitive(StructureSchemeParser.NumberPrimitiveContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NumberPrimitive}
	 * labeled alternative in {@link StructureSchemeParser#primitiveType}.
	 * @param ctx the parse tree
	 */
	void exitNumberPrimitive(StructureSchemeParser.NumberPrimitiveContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IntegerPrimitive}
	 * labeled alternative in {@link StructureSchemeParser#primitiveType}.
	 * @param ctx the parse tree
	 */
	void enterIntegerPrimitive(StructureSchemeParser.IntegerPrimitiveContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IntegerPrimitive}
	 * labeled alternative in {@link StructureSchemeParser#primitiveType}.
	 * @param ctx the parse tree
	 */
	void exitIntegerPrimitive(StructureSchemeParser.IntegerPrimitiveContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CharPrimitive}
	 * labeled alternative in {@link StructureSchemeParser#primitiveType}.
	 * @param ctx the parse tree
	 */
	void enterCharPrimitive(StructureSchemeParser.CharPrimitiveContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CharPrimitive}
	 * labeled alternative in {@link StructureSchemeParser#primitiveType}.
	 * @param ctx the parse tree
	 */
	void exitCharPrimitive(StructureSchemeParser.CharPrimitiveContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StringPrimitive}
	 * labeled alternative in {@link StructureSchemeParser#primitiveType}.
	 * @param ctx the parse tree
	 */
	void enterStringPrimitive(StructureSchemeParser.StringPrimitiveContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StringPrimitive}
	 * labeled alternative in {@link StructureSchemeParser#primitiveType}.
	 * @param ctx the parse tree
	 */
	void exitStringPrimitive(StructureSchemeParser.StringPrimitiveContext ctx);
	/**
	 * Enter a parse tree produced by {@link StructureSchemeParser#rangeDataType}.
	 * @param ctx the parse tree
	 */
	void enterRangeDataType(StructureSchemeParser.RangeDataTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link StructureSchemeParser#rangeDataType}.
	 * @param ctx the parse tree
	 */
	void exitRangeDataType(StructureSchemeParser.RangeDataTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link StructureSchemeParser#labeledDataType}.
	 * @param ctx the parse tree
	 */
	void enterLabeledDataType(StructureSchemeParser.LabeledDataTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link StructureSchemeParser#labeledDataType}.
	 * @param ctx the parse tree
	 */
	void exitLabeledDataType(StructureSchemeParser.LabeledDataTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code conceptName}
	 * labeled alternative in {@link StructureSchemeParser#conceptType}.
	 * @param ctx the parse tree
	 */
	void enterConceptName(StructureSchemeParser.ConceptNameContext ctx);
	/**
	 * Exit a parse tree produced by the {@code conceptName}
	 * labeled alternative in {@link StructureSchemeParser#conceptType}.
	 * @param ctx the parse tree
	 */
	void exitConceptName(StructureSchemeParser.ConceptNameContext ctx);
	/**
	 * Enter a parse tree produced by the {@code cartesianProductConcept}
	 * labeled alternative in {@link StructureSchemeParser#conceptType}.
	 * @param ctx the parse tree
	 */
	void enterCartesianProductConcept(StructureSchemeParser.CartesianProductConceptContext ctx);
	/**
	 * Exit a parse tree produced by the {@code cartesianProductConcept}
	 * labeled alternative in {@link StructureSchemeParser#conceptType}.
	 * @param ctx the parse tree
	 */
	void exitCartesianProductConcept(StructureSchemeParser.CartesianProductConceptContext ctx);
	/**
	 * Enter a parse tree produced by the {@code unionConcept}
	 * labeled alternative in {@link StructureSchemeParser#conceptType}.
	 * @param ctx the parse tree
	 */
	void enterUnionConcept(StructureSchemeParser.UnionConceptContext ctx);
	/**
	 * Exit a parse tree produced by the {@code unionConcept}
	 * labeled alternative in {@link StructureSchemeParser#conceptType}.
	 * @param ctx the parse tree
	 */
	void exitUnionConcept(StructureSchemeParser.UnionConceptContext ctx);
	/**
	 * Enter a parse tree produced by the {@code starConcept}
	 * labeled alternative in {@link StructureSchemeParser#conceptType}.
	 * @param ctx the parse tree
	 */
	void enterStarConcept(StructureSchemeParser.StarConceptContext ctx);
	/**
	 * Exit a parse tree produced by the {@code starConcept}
	 * labeled alternative in {@link StructureSchemeParser#conceptType}.
	 * @param ctx the parse tree
	 */
	void exitStarConcept(StructureSchemeParser.StarConceptContext ctx);
	/**
	 * Enter a parse tree produced by {@link StructureSchemeParser#selector}.
	 * @param ctx the parse tree
	 */
	void enterSelector(StructureSchemeParser.SelectorContext ctx);
	/**
	 * Exit a parse tree produced by {@link StructureSchemeParser#selector}.
	 * @param ctx the parse tree
	 */
	void exitSelector(StructureSchemeParser.SelectorContext ctx);
	/**
	 * Enter a parse tree produced by {@link StructureSchemeParser#className}.
	 * @param ctx the parse tree
	 */
	void enterClassName(StructureSchemeParser.ClassNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link StructureSchemeParser#className}.
	 * @param ctx the parse tree
	 */
	void exitClassName(StructureSchemeParser.ClassNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link StructureSchemeParser#binaryLinkName}.
	 * @param ctx the parse tree
	 */
	void enterBinaryLinkName(StructureSchemeParser.BinaryLinkNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link StructureSchemeParser#binaryLinkName}.
	 * @param ctx the parse tree
	 */
	void exitBinaryLinkName(StructureSchemeParser.BinaryLinkNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link StructureSchemeParser#attributeValue}.
	 * @param ctx the parse tree
	 */
	void enterAttributeValue(StructureSchemeParser.AttributeValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link StructureSchemeParser#attributeValue}.
	 * @param ctx the parse tree
	 */
	void exitAttributeValue(StructureSchemeParser.AttributeValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link StructureSchemeParser#definedTypeName}.
	 * @param ctx the parse tree
	 */
	void enterDefinedTypeName(StructureSchemeParser.DefinedTypeNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link StructureSchemeParser#definedTypeName}.
	 * @param ctx the parse tree
	 */
	void exitDefinedTypeName(StructureSchemeParser.DefinedTypeNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link StructureSchemeParser#binaryOperator}.
	 * @param ctx the parse tree
	 */
	void enterBinaryOperator(StructureSchemeParser.BinaryOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link StructureSchemeParser#binaryOperator}.
	 * @param ctx the parse tree
	 */
	void exitBinaryOperator(StructureSchemeParser.BinaryOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link StructureSchemeParser#number}.
	 * @param ctx the parse tree
	 */
	void enterNumber(StructureSchemeParser.NumberContext ctx);
	/**
	 * Exit a parse tree produced by {@link StructureSchemeParser#number}.
	 * @param ctx the parse tree
	 */
	void exitNumber(StructureSchemeParser.NumberContext ctx);
}