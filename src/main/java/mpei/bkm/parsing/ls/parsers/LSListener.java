package mpei.bkm.parsing.ls.parsers;// Generated from C:/bmd/bkm-lib/src/grammar\LS.g4 by ANTLR 4.6
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link LSParser}.
 */
public interface LSListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link LSParser#ontology}.
	 * @param ctx the parse tree
	 */
	void enterOntology(LSParser.OntologyContext ctx);
	/**
	 * Exit a parse tree produced by {@link LSParser#ontology}.
	 * @param ctx the parse tree
	 */
	void exitOntology(LSParser.OntologyContext ctx);
	/**
	 * Enter a parse tree produced by {@link LSParser#sentence}.
	 * @param ctx the parse tree
	 */
	void enterSentence(LSParser.SentenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link LSParser#sentence}.
	 * @param ctx the parse tree
	 */
	void exitSentence(LSParser.SentenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link LSParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration(LSParser.DeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link LSParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration(LSParser.DeclarationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code andSentence}
	 * labeled alternative in {@link LSParser#logicalSentence}.
	 * @param ctx the parse tree
	 */
	void enterAndSentence(LSParser.AndSentenceContext ctx);
	/**
	 * Exit a parse tree produced by the {@code andSentence}
	 * labeled alternative in {@link LSParser#logicalSentence}.
	 * @param ctx the parse tree
	 */
	void exitAndSentence(LSParser.AndSentenceContext ctx);
	/**
	 * Enter a parse tree produced by the {@code orSentence}
	 * labeled alternative in {@link LSParser#logicalSentence}.
	 * @param ctx the parse tree
	 */
	void enterOrSentence(LSParser.OrSentenceContext ctx);
	/**
	 * Exit a parse tree produced by the {@code orSentence}
	 * labeled alternative in {@link LSParser#logicalSentence}.
	 * @param ctx the parse tree
	 */
	void exitOrSentence(LSParser.OrSentenceContext ctx);
	/**
	 * Enter a parse tree produced by the {@code notSentence}
	 * labeled alternative in {@link LSParser#logicalSentence}.
	 * @param ctx the parse tree
	 */
	void enterNotSentence(LSParser.NotSentenceContext ctx);
	/**
	 * Exit a parse tree produced by the {@code notSentence}
	 * labeled alternative in {@link LSParser#logicalSentence}.
	 * @param ctx the parse tree
	 */
	void exitNotSentence(LSParser.NotSentenceContext ctx);
	/**
	 * Enter a parse tree produced by the {@code bracketedStatement}
	 * labeled alternative in {@link LSParser#logicalSentence}.
	 * @param ctx the parse tree
	 */
	void enterBracketedStatement(LSParser.BracketedStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code bracketedStatement}
	 * labeled alternative in {@link LSParser#logicalSentence}.
	 * @param ctx the parse tree
	 */
	void exitBracketedStatement(LSParser.BracketedStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code justStatement}
	 * labeled alternative in {@link LSParser#logicalSentence}.
	 * @param ctx the parse tree
	 */
	void enterJustStatement(LSParser.JustStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code justStatement}
	 * labeled alternative in {@link LSParser#logicalSentence}.
	 * @param ctx the parse tree
	 */
	void exitJustStatement(LSParser.JustStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code impSentence}
	 * labeled alternative in {@link LSParser#logicalSentence}.
	 * @param ctx the parse tree
	 */
	void enterImpSentence(LSParser.ImpSentenceContext ctx);
	/**
	 * Exit a parse tree produced by the {@code impSentence}
	 * labeled alternative in {@link LSParser#logicalSentence}.
	 * @param ctx the parse tree
	 */
	void exitImpSentence(LSParser.ImpSentenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link LSParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(LSParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link LSParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(LSParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link LSParser#existence}.
	 * @param ctx the parse tree
	 */
	void enterExistence(LSParser.ExistenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link LSParser#existence}.
	 * @param ctx the parse tree
	 */
	void exitExistence(LSParser.ExistenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link LSParser#exist}.
	 * @param ctx the parse tree
	 */
	void enterExist(LSParser.ExistContext ctx);
	/**
	 * Exit a parse tree produced by {@link LSParser#exist}.
	 * @param ctx the parse tree
	 */
	void exitExist(LSParser.ExistContext ctx);
	/**
	 * Enter a parse tree produced by {@link LSParser#notExist}.
	 * @param ctx the parse tree
	 */
	void enterNotExist(LSParser.NotExistContext ctx);
	/**
	 * Exit a parse tree produced by {@link LSParser#notExist}.
	 * @param ctx the parse tree
	 */
	void exitNotExist(LSParser.NotExistContext ctx);
	/**
	 * Enter a parse tree produced by {@link LSParser#isa}.
	 * @param ctx the parse tree
	 */
	void enterIsa(LSParser.IsaContext ctx);
	/**
	 * Exit a parse tree produced by {@link LSParser#isa}.
	 * @param ctx the parse tree
	 */
	void exitIsa(LSParser.IsaContext ctx);
	/**
	 * Enter a parse tree produced by the {@code equalsCStatement}
	 * labeled alternative in {@link LSParser#equality}.
	 * @param ctx the parse tree
	 */
	void enterEqualsCStatement(LSParser.EqualsCStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code equalsCStatement}
	 * labeled alternative in {@link LSParser#equality}.
	 * @param ctx the parse tree
	 */
	void exitEqualsCStatement(LSParser.EqualsCStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code equalsLStatement}
	 * labeled alternative in {@link LSParser#equality}.
	 * @param ctx the parse tree
	 */
	void enterEqualsLStatement(LSParser.EqualsLStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code equalsLStatement}
	 * labeled alternative in {@link LSParser#equality}.
	 * @param ctx the parse tree
	 */
	void exitEqualsLStatement(LSParser.EqualsLStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code equalsPStatement}
	 * labeled alternative in {@link LSParser#equality}.
	 * @param ctx the parse tree
	 */
	void enterEqualsPStatement(LSParser.EqualsPStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code equalsPStatement}
	 * labeled alternative in {@link LSParser#equality}.
	 * @param ctx the parse tree
	 */
	void exitEqualsPStatement(LSParser.EqualsPStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code notEqualsCStatement}
	 * labeled alternative in {@link LSParser#equality}.
	 * @param ctx the parse tree
	 */
	void enterNotEqualsCStatement(LSParser.NotEqualsCStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code notEqualsCStatement}
	 * labeled alternative in {@link LSParser#equality}.
	 * @param ctx the parse tree
	 */
	void exitNotEqualsCStatement(LSParser.NotEqualsCStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code notEqualsLStatement}
	 * labeled alternative in {@link LSParser#equality}.
	 * @param ctx the parse tree
	 */
	void enterNotEqualsLStatement(LSParser.NotEqualsLStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code notEqualsLStatement}
	 * labeled alternative in {@link LSParser#equality}.
	 * @param ctx the parse tree
	 */
	void exitNotEqualsLStatement(LSParser.NotEqualsLStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code eachStatement}
	 * labeled alternative in {@link LSParser#quantifier}.
	 * @param ctx the parse tree
	 */
	void enterEachStatement(LSParser.EachStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code eachStatement}
	 * labeled alternative in {@link LSParser#quantifier}.
	 * @param ctx the parse tree
	 */
	void exitEachStatement(LSParser.EachStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code someStatement}
	 * labeled alternative in {@link LSParser#quantifier}.
	 * @param ctx the parse tree
	 */
	void enterSomeStatement(LSParser.SomeStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code someStatement}
	 * labeled alternative in {@link LSParser#quantifier}.
	 * @param ctx the parse tree
	 */
	void exitSomeStatement(LSParser.SomeStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code bracketedC}
	 * labeled alternative in {@link LSParser#c}.
	 * @param ctx the parse tree
	 */
	void enterBracketedC(LSParser.BracketedCContext ctx);
	/**
	 * Exit a parse tree produced by the {@code bracketedC}
	 * labeled alternative in {@link LSParser#c}.
	 * @param ctx the parse tree
	 */
	void exitBracketedC(LSParser.BracketedCContext ctx);
	/**
	 * Enter a parse tree produced by the {@code andC}
	 * labeled alternative in {@link LSParser#c}.
	 * @param ctx the parse tree
	 */
	void enterAndC(LSParser.AndCContext ctx);
	/**
	 * Exit a parse tree produced by the {@code andC}
	 * labeled alternative in {@link LSParser#c}.
	 * @param ctx the parse tree
	 */
	void exitAndC(LSParser.AndCContext ctx);
	/**
	 * Enter a parse tree produced by the {@code orC}
	 * labeled alternative in {@link LSParser#c}.
	 * @param ctx the parse tree
	 */
	void enterOrC(LSParser.OrCContext ctx);
	/**
	 * Exit a parse tree produced by the {@code orC}
	 * labeled alternative in {@link LSParser#c}.
	 * @param ctx the parse tree
	 */
	void exitOrC(LSParser.OrCContext ctx);
	/**
	 * Enter a parse tree produced by the {@code notC}
	 * labeled alternative in {@link LSParser#c}.
	 * @param ctx the parse tree
	 */
	void enterNotC(LSParser.NotCContext ctx);
	/**
	 * Exit a parse tree produced by the {@code notC}
	 * labeled alternative in {@link LSParser#c}.
	 * @param ctx the parse tree
	 */
	void exitNotC(LSParser.NotCContext ctx);
	/**
	 * Enter a parse tree produced by the {@code withAttributesC}
	 * labeled alternative in {@link LSParser#c}.
	 * @param ctx the parse tree
	 */
	void enterWithAttributesC(LSParser.WithAttributesCContext ctx);
	/**
	 * Exit a parse tree produced by the {@code withAttributesC}
	 * labeled alternative in {@link LSParser#c}.
	 * @param ctx the parse tree
	 */
	void exitWithAttributesC(LSParser.WithAttributesCContext ctx);
	/**
	 * Enter a parse tree produced by the {@code conceptVariableC}
	 * labeled alternative in {@link LSParser#c}.
	 * @param ctx the parse tree
	 */
	void enterConceptVariableC(LSParser.ConceptVariableCContext ctx);
	/**
	 * Exit a parse tree produced by the {@code conceptVariableC}
	 * labeled alternative in {@link LSParser#c}.
	 * @param ctx the parse tree
	 */
	void exitConceptVariableC(LSParser.ConceptVariableCContext ctx);
	/**
	 * Enter a parse tree produced by the {@code thoseC}
	 * labeled alternative in {@link LSParser#c}.
	 * @param ctx the parse tree
	 */
	void enterThoseC(LSParser.ThoseCContext ctx);
	/**
	 * Exit a parse tree produced by the {@code thoseC}
	 * labeled alternative in {@link LSParser#c}.
	 * @param ctx the parse tree
	 */
	void exitThoseC(LSParser.ThoseCContext ctx);
	/**
	 * Enter a parse tree produced by the {@code thatC}
	 * labeled alternative in {@link LSParser#c}.
	 * @param ctx the parse tree
	 */
	void enterThatC(LSParser.ThatCContext ctx);
	/**
	 * Exit a parse tree produced by the {@code thatC}
	 * labeled alternative in {@link LSParser#c}.
	 * @param ctx the parse tree
	 */
	void exitThatC(LSParser.ThatCContext ctx);
	/**
	 * Enter a parse tree produced by the {@code bracketedL}
	 * labeled alternative in {@link LSParser#l}.
	 * @param ctx the parse tree
	 */
	void enterBracketedL(LSParser.BracketedLContext ctx);
	/**
	 * Exit a parse tree produced by the {@code bracketedL}
	 * labeled alternative in {@link LSParser#l}.
	 * @param ctx the parse tree
	 */
	void exitBracketedL(LSParser.BracketedLContext ctx);
	/**
	 * Enter a parse tree produced by the {@code andL}
	 * labeled alternative in {@link LSParser#l}.
	 * @param ctx the parse tree
	 */
	void enterAndL(LSParser.AndLContext ctx);
	/**
	 * Exit a parse tree produced by the {@code andL}
	 * labeled alternative in {@link LSParser#l}.
	 * @param ctx the parse tree
	 */
	void exitAndL(LSParser.AndLContext ctx);
	/**
	 * Enter a parse tree produced by the {@code orL}
	 * labeled alternative in {@link LSParser#l}.
	 * @param ctx the parse tree
	 */
	void enterOrL(LSParser.OrLContext ctx);
	/**
	 * Exit a parse tree produced by the {@code orL}
	 * labeled alternative in {@link LSParser#l}.
	 * @param ctx the parse tree
	 */
	void exitOrL(LSParser.OrLContext ctx);
	/**
	 * Enter a parse tree produced by the {@code notL}
	 * labeled alternative in {@link LSParser#l}.
	 * @param ctx the parse tree
	 */
	void enterNotL(LSParser.NotLContext ctx);
	/**
	 * Exit a parse tree produced by the {@code notL}
	 * labeled alternative in {@link LSParser#l}.
	 * @param ctx the parse tree
	 */
	void exitNotL(LSParser.NotLContext ctx);
	/**
	 * Enter a parse tree produced by the {@code invL}
	 * labeled alternative in {@link LSParser#l}.
	 * @param ctx the parse tree
	 */
	void enterInvL(LSParser.InvLContext ctx);
	/**
	 * Exit a parse tree produced by the {@code invL}
	 * labeled alternative in {@link LSParser#l}.
	 * @param ctx the parse tree
	 */
	void exitInvL(LSParser.InvLContext ctx);
	/**
	 * Enter a parse tree produced by the {@code withAttributesL}
	 * labeled alternative in {@link LSParser#l}.
	 * @param ctx the parse tree
	 */
	void enterWithAttributesL(LSParser.WithAttributesLContext ctx);
	/**
	 * Exit a parse tree produced by the {@code withAttributesL}
	 * labeled alternative in {@link LSParser#l}.
	 * @param ctx the parse tree
	 */
	void exitWithAttributesL(LSParser.WithAttributesLContext ctx);
	/**
	 * Enter a parse tree produced by the {@code eachP}
	 * labeled alternative in {@link LSParser#p}.
	 * @param ctx the parse tree
	 */
	void enterEachP(LSParser.EachPContext ctx);
	/**
	 * Exit a parse tree produced by the {@code eachP}
	 * labeled alternative in {@link LSParser#p}.
	 * @param ctx the parse tree
	 */
	void exitEachP(LSParser.EachPContext ctx);
	/**
	 * Enter a parse tree produced by the {@code predicateVariableP}
	 * labeled alternative in {@link LSParser#p}.
	 * @param ctx the parse tree
	 */
	void enterPredicateVariableP(LSParser.PredicateVariablePContext ctx);
	/**
	 * Exit a parse tree produced by the {@code predicateVariableP}
	 * labeled alternative in {@link LSParser#p}.
	 * @param ctx the parse tree
	 */
	void exitPredicateVariableP(LSParser.PredicateVariablePContext ctx);
	/**
	 * Enter a parse tree produced by the {@code someP}
	 * labeled alternative in {@link LSParser#p}.
	 * @param ctx the parse tree
	 */
	void enterSomeP(LSParser.SomePContext ctx);
	/**
	 * Exit a parse tree produced by the {@code someP}
	 * labeled alternative in {@link LSParser#p}.
	 * @param ctx the parse tree
	 */
	void exitSomeP(LSParser.SomePContext ctx);
	/**
	 * Enter a parse tree produced by the {@code bracketedP}
	 * labeled alternative in {@link LSParser#p}.
	 * @param ctx the parse tree
	 */
	void enterBracketedP(LSParser.BracketedPContext ctx);
	/**
	 * Exit a parse tree produced by the {@code bracketedP}
	 * labeled alternative in {@link LSParser#p}.
	 * @param ctx the parse tree
	 */
	void exitBracketedP(LSParser.BracketedPContext ctx);
	/**
	 * Enter a parse tree produced by the {@code andP}
	 * labeled alternative in {@link LSParser#p}.
	 * @param ctx the parse tree
	 */
	void enterAndP(LSParser.AndPContext ctx);
	/**
	 * Exit a parse tree produced by the {@code andP}
	 * labeled alternative in {@link LSParser#p}.
	 * @param ctx the parse tree
	 */
	void exitAndP(LSParser.AndPContext ctx);
	/**
	 * Enter a parse tree produced by the {@code surrogateVariableP}
	 * labeled alternative in {@link LSParser#p}.
	 * @param ctx the parse tree
	 */
	void enterSurrogateVariableP(LSParser.SurrogateVariablePContext ctx);
	/**
	 * Exit a parse tree produced by the {@code surrogateVariableP}
	 * labeled alternative in {@link LSParser#p}.
	 * @param ctx the parse tree
	 */
	void exitSurrogateVariableP(LSParser.SurrogateVariablePContext ctx);
	/**
	 * Enter a parse tree produced by the {@code onlyP}
	 * labeled alternative in {@link LSParser#p}.
	 * @param ctx the parse tree
	 */
	void enterOnlyP(LSParser.OnlyPContext ctx);
	/**
	 * Exit a parse tree produced by the {@code onlyP}
	 * labeled alternative in {@link LSParser#p}.
	 * @param ctx the parse tree
	 */
	void exitOnlyP(LSParser.OnlyPContext ctx);
	/**
	 * Enter a parse tree produced by the {@code orP}
	 * labeled alternative in {@link LSParser#p}.
	 * @param ctx the parse tree
	 */
	void enterOrP(LSParser.OrPContext ctx);
	/**
	 * Exit a parse tree produced by the {@code orP}
	 * labeled alternative in {@link LSParser#p}.
	 * @param ctx the parse tree
	 */
	void exitOrP(LSParser.OrPContext ctx);
	/**
	 * Enter a parse tree produced by the {@code notP}
	 * labeled alternative in {@link LSParser#p}.
	 * @param ctx the parse tree
	 */
	void enterNotP(LSParser.NotPContext ctx);
	/**
	 * Exit a parse tree produced by the {@code notP}
	 * labeled alternative in {@link LSParser#p}.
	 * @param ctx the parse tree
	 */
	void exitNotP(LSParser.NotPContext ctx);
	/**
	 * Enter a parse tree produced by {@link LSParser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterClassDeclaration(LSParser.ClassDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link LSParser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitClassDeclaration(LSParser.ClassDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link LSParser#binaryLinkDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterBinaryLinkDeclaration(LSParser.BinaryLinkDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link LSParser#binaryLinkDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitBinaryLinkDeclaration(LSParser.BinaryLinkDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link LSParser#attributes}.
	 * @param ctx the parse tree
	 */
	void enterAttributes(LSParser.AttributesContext ctx);
	/**
	 * Exit a parse tree produced by {@link LSParser#attributes}.
	 * @param ctx the parse tree
	 */
	void exitAttributes(LSParser.AttributesContext ctx);
	/**
	 * Enter a parse tree produced by {@link LSParser#attribute}.
	 * @param ctx the parse tree
	 */
	void enterAttribute(LSParser.AttributeContext ctx);
	/**
	 * Exit a parse tree produced by {@link LSParser#attribute}.
	 * @param ctx the parse tree
	 */
	void exitAttribute(LSParser.AttributeContext ctx);
	/**
	 * Enter a parse tree produced by {@link LSParser#dataTypeAttribute}.
	 * @param ctx the parse tree
	 */
	void enterDataTypeAttribute(LSParser.DataTypeAttributeContext ctx);
	/**
	 * Exit a parse tree produced by {@link LSParser#dataTypeAttribute}.
	 * @param ctx the parse tree
	 */
	void exitDataTypeAttribute(LSParser.DataTypeAttributeContext ctx);
	/**
	 * Enter a parse tree produced by {@link LSParser#conceptAttribute}.
	 * @param ctx the parse tree
	 */
	void enterConceptAttribute(LSParser.ConceptAttributeContext ctx);
	/**
	 * Exit a parse tree produced by {@link LSParser#conceptAttribute}.
	 * @param ctx the parse tree
	 */
	void exitConceptAttribute(LSParser.ConceptAttributeContext ctx);
	/**
	 * Enter a parse tree produced by {@link LSParser#classAttributeConstraint}.
	 * @param ctx the parse tree
	 */
	void enterClassAttributeConstraint(LSParser.ClassAttributeConstraintContext ctx);
	/**
	 * Exit a parse tree produced by {@link LSParser#classAttributeConstraint}.
	 * @param ctx the parse tree
	 */
	void exitClassAttributeConstraint(LSParser.ClassAttributeConstraintContext ctx);
	/**
	 * Enter a parse tree produced by {@link LSParser#intervalRestriction}.
	 * @param ctx the parse tree
	 */
	void enterIntervalRestriction(LSParser.IntervalRestrictionContext ctx);
	/**
	 * Exit a parse tree produced by {@link LSParser#intervalRestriction}.
	 * @param ctx the parse tree
	 */
	void exitIntervalRestriction(LSParser.IntervalRestrictionContext ctx);
	/**
	 * Enter a parse tree produced by {@link LSParser#fullIntervalRestriction}.
	 * @param ctx the parse tree
	 */
	void enterFullIntervalRestriction(LSParser.FullIntervalRestrictionContext ctx);
	/**
	 * Exit a parse tree produced by {@link LSParser#fullIntervalRestriction}.
	 * @param ctx the parse tree
	 */
	void exitFullIntervalRestriction(LSParser.FullIntervalRestrictionContext ctx);
	/**
	 * Enter a parse tree produced by {@link LSParser#contractedIntervalRestriction}.
	 * @param ctx the parse tree
	 */
	void enterContractedIntervalRestriction(LSParser.ContractedIntervalRestrictionContext ctx);
	/**
	 * Exit a parse tree produced by {@link LSParser#contractedIntervalRestriction}.
	 * @param ctx the parse tree
	 */
	void exitContractedIntervalRestriction(LSParser.ContractedIntervalRestrictionContext ctx);
	/**
	 * Enter a parse tree produced by {@link LSParser#atomRestriction}.
	 * @param ctx the parse tree
	 */
	void enterAtomRestriction(LSParser.AtomRestrictionContext ctx);
	/**
	 * Exit a parse tree produced by {@link LSParser#atomRestriction}.
	 * @param ctx the parse tree
	 */
	void exitAtomRestriction(LSParser.AtomRestrictionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code definedTypeRuleLabel}
	 * labeled alternative in {@link LSParser#dataType}.
	 * @param ctx the parse tree
	 */
	void enterDefinedTypeRuleLabel(LSParser.DefinedTypeRuleLabelContext ctx);
	/**
	 * Exit a parse tree produced by the {@code definedTypeRuleLabel}
	 * labeled alternative in {@link LSParser#dataType}.
	 * @param ctx the parse tree
	 */
	void exitDefinedTypeRuleLabel(LSParser.DefinedTypeRuleLabelContext ctx);
	/**
	 * Enter a parse tree produced by the {@code primitiveData}
	 * labeled alternative in {@link LSParser#dataType}.
	 * @param ctx the parse tree
	 */
	void enterPrimitiveData(LSParser.PrimitiveDataContext ctx);
	/**
	 * Exit a parse tree produced by the {@code primitiveData}
	 * labeled alternative in {@link LSParser#dataType}.
	 * @param ctx the parse tree
	 */
	void exitPrimitiveData(LSParser.PrimitiveDataContext ctx);
	/**
	 * Enter a parse tree produced by the {@code unionData}
	 * labeled alternative in {@link LSParser#dataType}.
	 * @param ctx the parse tree
	 */
	void enterUnionData(LSParser.UnionDataContext ctx);
	/**
	 * Exit a parse tree produced by the {@code unionData}
	 * labeled alternative in {@link LSParser#dataType}.
	 * @param ctx the parse tree
	 */
	void exitUnionData(LSParser.UnionDataContext ctx);
	/**
	 * Enter a parse tree produced by the {@code starData}
	 * labeled alternative in {@link LSParser#dataType}.
	 * @param ctx the parse tree
	 */
	void enterStarData(LSParser.StarDataContext ctx);
	/**
	 * Exit a parse tree produced by the {@code starData}
	 * labeled alternative in {@link LSParser#dataType}.
	 * @param ctx the parse tree
	 */
	void exitStarData(LSParser.StarDataContext ctx);
	/**
	 * Enter a parse tree produced by the {@code rangeData}
	 * labeled alternative in {@link LSParser#dataType}.
	 * @param ctx the parse tree
	 */
	void enterRangeData(LSParser.RangeDataContext ctx);
	/**
	 * Exit a parse tree produced by the {@code rangeData}
	 * labeled alternative in {@link LSParser#dataType}.
	 * @param ctx the parse tree
	 */
	void exitRangeData(LSParser.RangeDataContext ctx);
	/**
	 * Enter a parse tree produced by the {@code cartesianProductData}
	 * labeled alternative in {@link LSParser#dataType}.
	 * @param ctx the parse tree
	 */
	void enterCartesianProductData(LSParser.CartesianProductDataContext ctx);
	/**
	 * Exit a parse tree produced by the {@code cartesianProductData}
	 * labeled alternative in {@link LSParser#dataType}.
	 * @param ctx the parse tree
	 */
	void exitCartesianProductData(LSParser.CartesianProductDataContext ctx);
	/**
	 * Enter a parse tree produced by the {@code list}
	 * labeled alternative in {@link LSParser#dataType}.
	 * @param ctx the parse tree
	 */
	void enterList(LSParser.ListContext ctx);
	/**
	 * Exit a parse tree produced by the {@code list}
	 * labeled alternative in {@link LSParser#dataType}.
	 * @param ctx the parse tree
	 */
	void exitList(LSParser.ListContext ctx);
	/**
	 * Enter a parse tree produced by the {@code labelRuleLabel}
	 * labeled alternative in {@link LSParser#dataType}.
	 * @param ctx the parse tree
	 */
	void enterLabelRuleLabel(LSParser.LabelRuleLabelContext ctx);
	/**
	 * Exit a parse tree produced by the {@code labelRuleLabel}
	 * labeled alternative in {@link LSParser#dataType}.
	 * @param ctx the parse tree
	 */
	void exitLabelRuleLabel(LSParser.LabelRuleLabelContext ctx);
	/**
	 * Enter a parse tree produced by the {@code enum}
	 * labeled alternative in {@link LSParser#dataType}.
	 * @param ctx the parse tree
	 */
	void enterEnum(LSParser.EnumContext ctx);
	/**
	 * Exit a parse tree produced by the {@code enum}
	 * labeled alternative in {@link LSParser#dataType}.
	 * @param ctx the parse tree
	 */
	void exitEnum(LSParser.EnumContext ctx);
	/**
	 * Enter a parse tree produced by the {@code llist}
	 * labeled alternative in {@link LSParser#dataType}.
	 * @param ctx the parse tree
	 */
	void enterLlist(LSParser.LlistContext ctx);
	/**
	 * Exit a parse tree produced by the {@code llist}
	 * labeled alternative in {@link LSParser#dataType}.
	 * @param ctx the parse tree
	 */
	void exitLlist(LSParser.LlistContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BooleanPrimitive}
	 * labeled alternative in {@link LSParser#primitiveType}.
	 * @param ctx the parse tree
	 */
	void enterBooleanPrimitive(LSParser.BooleanPrimitiveContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BooleanPrimitive}
	 * labeled alternative in {@link LSParser#primitiveType}.
	 * @param ctx the parse tree
	 */
	void exitBooleanPrimitive(LSParser.BooleanPrimitiveContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NumberPrimitive}
	 * labeled alternative in {@link LSParser#primitiveType}.
	 * @param ctx the parse tree
	 */
	void enterNumberPrimitive(LSParser.NumberPrimitiveContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NumberPrimitive}
	 * labeled alternative in {@link LSParser#primitiveType}.
	 * @param ctx the parse tree
	 */
	void exitNumberPrimitive(LSParser.NumberPrimitiveContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IntegerPrimitive}
	 * labeled alternative in {@link LSParser#primitiveType}.
	 * @param ctx the parse tree
	 */
	void enterIntegerPrimitive(LSParser.IntegerPrimitiveContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IntegerPrimitive}
	 * labeled alternative in {@link LSParser#primitiveType}.
	 * @param ctx the parse tree
	 */
	void exitIntegerPrimitive(LSParser.IntegerPrimitiveContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CharPrimitive}
	 * labeled alternative in {@link LSParser#primitiveType}.
	 * @param ctx the parse tree
	 */
	void enterCharPrimitive(LSParser.CharPrimitiveContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CharPrimitive}
	 * labeled alternative in {@link LSParser#primitiveType}.
	 * @param ctx the parse tree
	 */
	void exitCharPrimitive(LSParser.CharPrimitiveContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StringPrimitive}
	 * labeled alternative in {@link LSParser#primitiveType}.
	 * @param ctx the parse tree
	 */
	void enterStringPrimitive(LSParser.StringPrimitiveContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StringPrimitive}
	 * labeled alternative in {@link LSParser#primitiveType}.
	 * @param ctx the parse tree
	 */
	void exitStringPrimitive(LSParser.StringPrimitiveContext ctx);
	/**
	 * Enter a parse tree produced by {@link LSParser#rangeDataType}.
	 * @param ctx the parse tree
	 */
	void enterRangeDataType(LSParser.RangeDataTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link LSParser#rangeDataType}.
	 * @param ctx the parse tree
	 */
	void exitRangeDataType(LSParser.RangeDataTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link LSParser#labeledDataType}.
	 * @param ctx the parse tree
	 */
	void enterLabeledDataType(LSParser.LabeledDataTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link LSParser#labeledDataType}.
	 * @param ctx the parse tree
	 */
	void exitLabeledDataType(LSParser.LabeledDataTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code conceptName}
	 * labeled alternative in {@link LSParser#conceptType}.
	 * @param ctx the parse tree
	 */
	void enterConceptName(LSParser.ConceptNameContext ctx);
	/**
	 * Exit a parse tree produced by the {@code conceptName}
	 * labeled alternative in {@link LSParser#conceptType}.
	 * @param ctx the parse tree
	 */
	void exitConceptName(LSParser.ConceptNameContext ctx);
	/**
	 * Enter a parse tree produced by the {@code cartesianProductConcept}
	 * labeled alternative in {@link LSParser#conceptType}.
	 * @param ctx the parse tree
	 */
	void enterCartesianProductConcept(LSParser.CartesianProductConceptContext ctx);
	/**
	 * Exit a parse tree produced by the {@code cartesianProductConcept}
	 * labeled alternative in {@link LSParser#conceptType}.
	 * @param ctx the parse tree
	 */
	void exitCartesianProductConcept(LSParser.CartesianProductConceptContext ctx);
	/**
	 * Enter a parse tree produced by the {@code unionConcept}
	 * labeled alternative in {@link LSParser#conceptType}.
	 * @param ctx the parse tree
	 */
	void enterUnionConcept(LSParser.UnionConceptContext ctx);
	/**
	 * Exit a parse tree produced by the {@code unionConcept}
	 * labeled alternative in {@link LSParser#conceptType}.
	 * @param ctx the parse tree
	 */
	void exitUnionConcept(LSParser.UnionConceptContext ctx);
	/**
	 * Enter a parse tree produced by the {@code starConcept}
	 * labeled alternative in {@link LSParser#conceptType}.
	 * @param ctx the parse tree
	 */
	void enterStarConcept(LSParser.StarConceptContext ctx);
	/**
	 * Exit a parse tree produced by the {@code starConcept}
	 * labeled alternative in {@link LSParser#conceptType}.
	 * @param ctx the parse tree
	 */
	void exitStarConcept(LSParser.StarConceptContext ctx);
	/**
	 * Enter a parse tree produced by {@link LSParser#attributeConstraints}.
	 * @param ctx the parse tree
	 */
	void enterAttributeConstraints(LSParser.AttributeConstraintsContext ctx);
	/**
	 * Exit a parse tree produced by {@link LSParser#attributeConstraints}.
	 * @param ctx the parse tree
	 */
	void exitAttributeConstraints(LSParser.AttributeConstraintsContext ctx);
	/**
	 * Enter a parse tree produced by {@link LSParser#elementaryAttributeConstraint}.
	 * @param ctx the parse tree
	 */
	void enterElementaryAttributeConstraint(LSParser.ElementaryAttributeConstraintContext ctx);
	/**
	 * Exit a parse tree produced by {@link LSParser#elementaryAttributeConstraint}.
	 * @param ctx the parse tree
	 */
	void exitElementaryAttributeConstraint(LSParser.ElementaryAttributeConstraintContext ctx);
	/**
	 * Enter a parse tree produced by {@link LSParser#selector}.
	 * @param ctx the parse tree
	 */
	void enterSelector(LSParser.SelectorContext ctx);
	/**
	 * Exit a parse tree produced by {@link LSParser#selector}.
	 * @param ctx the parse tree
	 */
	void exitSelector(LSParser.SelectorContext ctx);
	/**
	 * Enter a parse tree produced by {@link LSParser#className}.
	 * @param ctx the parse tree
	 */
	void enterClassName(LSParser.ClassNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link LSParser#className}.
	 * @param ctx the parse tree
	 */
	void exitClassName(LSParser.ClassNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link LSParser#binaryLinkName}.
	 * @param ctx the parse tree
	 */
	void enterBinaryLinkName(LSParser.BinaryLinkNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link LSParser#binaryLinkName}.
	 * @param ctx the parse tree
	 */
	void exitBinaryLinkName(LSParser.BinaryLinkNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link LSParser#attributeValue}.
	 * @param ctx the parse tree
	 */
	void enterAttributeValue(LSParser.AttributeValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link LSParser#attributeValue}.
	 * @param ctx the parse tree
	 */
	void exitAttributeValue(LSParser.AttributeValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link LSParser#definedTypeName}.
	 * @param ctx the parse tree
	 */
	void enterDefinedTypeName(LSParser.DefinedTypeNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link LSParser#definedTypeName}.
	 * @param ctx the parse tree
	 */
	void exitDefinedTypeName(LSParser.DefinedTypeNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link LSParser#variable}.
	 * @param ctx the parse tree
	 */
	void enterVariable(LSParser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link LSParser#variable}.
	 * @param ctx the parse tree
	 */
	void exitVariable(LSParser.VariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link LSParser#surrogate}.
	 * @param ctx the parse tree
	 */
	void enterSurrogate(LSParser.SurrogateContext ctx);
	/**
	 * Exit a parse tree produced by {@link LSParser#surrogate}.
	 * @param ctx the parse tree
	 */
	void exitSurrogate(LSParser.SurrogateContext ctx);
	/**
	 * Enter a parse tree produced by {@link LSParser#binaryOperator}.
	 * @param ctx the parse tree
	 */
	void enterBinaryOperator(LSParser.BinaryOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link LSParser#binaryOperator}.
	 * @param ctx the parse tree
	 */
	void exitBinaryOperator(LSParser.BinaryOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link LSParser#dataValue}.
	 * @param ctx the parse tree
	 */
	void enterDataValue(LSParser.DataValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link LSParser#dataValue}.
	 * @param ctx the parse tree
	 */
	void exitDataValue(LSParser.DataValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link LSParser#trueorfalse}.
	 * @param ctx the parse tree
	 */
	void enterTrueorfalse(LSParser.TrueorfalseContext ctx);
	/**
	 * Exit a parse tree produced by {@link LSParser#trueorfalse}.
	 * @param ctx the parse tree
	 */
	void exitTrueorfalse(LSParser.TrueorfalseContext ctx);
	/**
	 * Enter a parse tree produced by {@link LSParser#number}.
	 * @param ctx the parse tree
	 */
	void enterNumber(LSParser.NumberContext ctx);
	/**
	 * Exit a parse tree produced by {@link LSParser#number}.
	 * @param ctx the parse tree
	 */
	void exitNumber(LSParser.NumberContext ctx);
	/**
	 * Enter a parse tree produced by {@link LSParser#string}.
	 * @param ctx the parse tree
	 */
	void enterString(LSParser.StringContext ctx);
	/**
	 * Exit a parse tree produced by {@link LSParser#string}.
	 * @param ctx the parse tree
	 */
	void exitString(LSParser.StringContext ctx);
}