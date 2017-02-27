// Generated from C:/bmd/bkm-lib/src/grammar\LLS1.g4 by ANTLR 4.6
package mpei.bkm.parsing.lls1.parsers;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link LLS1Parser}.
 */
public interface LLS1Listener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link LLS1Parser#statements}.
	 * @param ctx the parse tree
	 */
	void enterStatements(LLS1Parser.StatementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link LLS1Parser#statements}.
	 * @param ctx the parse tree
	 */
	void exitStatements(LLS1Parser.StatementsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code bracketedC}
	 * labeled alternative in {@link LLS1Parser#c}.
	 * @param ctx the parse tree
	 */
	void enterBracketedC(LLS1Parser.BracketedCContext ctx);
	/**
	 * Exit a parse tree produced by the {@code bracketedC}
	 * labeled alternative in {@link LLS1Parser#c}.
	 * @param ctx the parse tree
	 */
	void exitBracketedC(LLS1Parser.BracketedCContext ctx);
	/**
	 * Enter a parse tree produced by the {@code andC}
	 * labeled alternative in {@link LLS1Parser#c}.
	 * @param ctx the parse tree
	 */
	void enterAndC(LLS1Parser.AndCContext ctx);
	/**
	 * Exit a parse tree produced by the {@code andC}
	 * labeled alternative in {@link LLS1Parser#c}.
	 * @param ctx the parse tree
	 */
	void exitAndC(LLS1Parser.AndCContext ctx);
	/**
	 * Enter a parse tree produced by the {@code orC}
	 * labeled alternative in {@link LLS1Parser#c}.
	 * @param ctx the parse tree
	 */
	void enterOrC(LLS1Parser.OrCContext ctx);
	/**
	 * Exit a parse tree produced by the {@code orC}
	 * labeled alternative in {@link LLS1Parser#c}.
	 * @param ctx the parse tree
	 */
	void exitOrC(LLS1Parser.OrCContext ctx);
	/**
	 * Enter a parse tree produced by the {@code notC}
	 * labeled alternative in {@link LLS1Parser#c}.
	 * @param ctx the parse tree
	 */
	void enterNotC(LLS1Parser.NotCContext ctx);
	/**
	 * Exit a parse tree produced by the {@code notC}
	 * labeled alternative in {@link LLS1Parser#c}.
	 * @param ctx the parse tree
	 */
	void exitNotC(LLS1Parser.NotCContext ctx);
	/**
	 * Enter a parse tree produced by the {@code conceptVariableC}
	 * labeled alternative in {@link LLS1Parser#c}.
	 * @param ctx the parse tree
	 */
	void enterConceptVariableC(LLS1Parser.ConceptVariableCContext ctx);
	/**
	 * Exit a parse tree produced by the {@code conceptVariableC}
	 * labeled alternative in {@link LLS1Parser#c}.
	 * @param ctx the parse tree
	 */
	void exitConceptVariableC(LLS1Parser.ConceptVariableCContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NamedC}
	 * labeled alternative in {@link LLS1Parser#c}.
	 * @param ctx the parse tree
	 */
	void enterNamedC(LLS1Parser.NamedCContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NamedC}
	 * labeled alternative in {@link LLS1Parser#c}.
	 * @param ctx the parse tree
	 */
	void exitNamedC(LLS1Parser.NamedCContext ctx);
	/**
	 * Enter a parse tree produced by the {@code thoseC}
	 * labeled alternative in {@link LLS1Parser#c}.
	 * @param ctx the parse tree
	 */
	void enterThoseC(LLS1Parser.ThoseCContext ctx);
	/**
	 * Exit a parse tree produced by the {@code thoseC}
	 * labeled alternative in {@link LLS1Parser#c}.
	 * @param ctx the parse tree
	 */
	void exitThoseC(LLS1Parser.ThoseCContext ctx);
	/**
	 * Enter a parse tree produced by the {@code thatC}
	 * labeled alternative in {@link LLS1Parser#c}.
	 * @param ctx the parse tree
	 */
	void enterThatC(LLS1Parser.ThatCContext ctx);
	/**
	 * Exit a parse tree produced by the {@code thatC}
	 * labeled alternative in {@link LLS1Parser#c}.
	 * @param ctx the parse tree
	 */
	void exitThatC(LLS1Parser.ThatCContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NamedL}
	 * labeled alternative in {@link LLS1Parser#l}.
	 * @param ctx the parse tree
	 */
	void enterNamedL(LLS1Parser.NamedLContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NamedL}
	 * labeled alternative in {@link LLS1Parser#l}.
	 * @param ctx the parse tree
	 */
	void exitNamedL(LLS1Parser.NamedLContext ctx);
	/**
	 * Enter a parse tree produced by the {@code bracketedL}
	 * labeled alternative in {@link LLS1Parser#l}.
	 * @param ctx the parse tree
	 */
	void enterBracketedL(LLS1Parser.BracketedLContext ctx);
	/**
	 * Exit a parse tree produced by the {@code bracketedL}
	 * labeled alternative in {@link LLS1Parser#l}.
	 * @param ctx the parse tree
	 */
	void exitBracketedL(LLS1Parser.BracketedLContext ctx);
	/**
	 * Enter a parse tree produced by the {@code andL}
	 * labeled alternative in {@link LLS1Parser#l}.
	 * @param ctx the parse tree
	 */
	void enterAndL(LLS1Parser.AndLContext ctx);
	/**
	 * Exit a parse tree produced by the {@code andL}
	 * labeled alternative in {@link LLS1Parser#l}.
	 * @param ctx the parse tree
	 */
	void exitAndL(LLS1Parser.AndLContext ctx);
	/**
	 * Enter a parse tree produced by the {@code orL}
	 * labeled alternative in {@link LLS1Parser#l}.
	 * @param ctx the parse tree
	 */
	void enterOrL(LLS1Parser.OrLContext ctx);
	/**
	 * Exit a parse tree produced by the {@code orL}
	 * labeled alternative in {@link LLS1Parser#l}.
	 * @param ctx the parse tree
	 */
	void exitOrL(LLS1Parser.OrLContext ctx);
	/**
	 * Enter a parse tree produced by the {@code notL}
	 * labeled alternative in {@link LLS1Parser#l}.
	 * @param ctx the parse tree
	 */
	void enterNotL(LLS1Parser.NotLContext ctx);
	/**
	 * Exit a parse tree produced by the {@code notL}
	 * labeled alternative in {@link LLS1Parser#l}.
	 * @param ctx the parse tree
	 */
	void exitNotL(LLS1Parser.NotLContext ctx);
	/**
	 * Enter a parse tree produced by the {@code invL}
	 * labeled alternative in {@link LLS1Parser#l}.
	 * @param ctx the parse tree
	 */
	void enterInvL(LLS1Parser.InvLContext ctx);
	/**
	 * Exit a parse tree produced by the {@code invL}
	 * labeled alternative in {@link LLS1Parser#l}.
	 * @param ctx the parse tree
	 */
	void exitInvL(LLS1Parser.InvLContext ctx);
	/**
	 * Enter a parse tree produced by the {@code eachP}
	 * labeled alternative in {@link LLS1Parser#p}.
	 * @param ctx the parse tree
	 */
	void enterEachP(LLS1Parser.EachPContext ctx);
	/**
	 * Exit a parse tree produced by the {@code eachP}
	 * labeled alternative in {@link LLS1Parser#p}.
	 * @param ctx the parse tree
	 */
	void exitEachP(LLS1Parser.EachPContext ctx);
	/**
	 * Enter a parse tree produced by the {@code predicateVariableP}
	 * labeled alternative in {@link LLS1Parser#p}.
	 * @param ctx the parse tree
	 */
	void enterPredicateVariableP(LLS1Parser.PredicateVariablePContext ctx);
	/**
	 * Exit a parse tree produced by the {@code predicateVariableP}
	 * labeled alternative in {@link LLS1Parser#p}.
	 * @param ctx the parse tree
	 */
	void exitPredicateVariableP(LLS1Parser.PredicateVariablePContext ctx);
	/**
	 * Enter a parse tree produced by the {@code someP}
	 * labeled alternative in {@link LLS1Parser#p}.
	 * @param ctx the parse tree
	 */
	void enterSomeP(LLS1Parser.SomePContext ctx);
	/**
	 * Exit a parse tree produced by the {@code someP}
	 * labeled alternative in {@link LLS1Parser#p}.
	 * @param ctx the parse tree
	 */
	void exitSomeP(LLS1Parser.SomePContext ctx);
	/**
	 * Enter a parse tree produced by the {@code bracketedP}
	 * labeled alternative in {@link LLS1Parser#p}.
	 * @param ctx the parse tree
	 */
	void enterBracketedP(LLS1Parser.BracketedPContext ctx);
	/**
	 * Exit a parse tree produced by the {@code bracketedP}
	 * labeled alternative in {@link LLS1Parser#p}.
	 * @param ctx the parse tree
	 */
	void exitBracketedP(LLS1Parser.BracketedPContext ctx);
	/**
	 * Enter a parse tree produced by the {@code andP}
	 * labeled alternative in {@link LLS1Parser#p}.
	 * @param ctx the parse tree
	 */
	void enterAndP(LLS1Parser.AndPContext ctx);
	/**
	 * Exit a parse tree produced by the {@code andP}
	 * labeled alternative in {@link LLS1Parser#p}.
	 * @param ctx the parse tree
	 */
	void exitAndP(LLS1Parser.AndPContext ctx);
	/**
	 * Enter a parse tree produced by the {@code surrogateVariableP}
	 * labeled alternative in {@link LLS1Parser#p}.
	 * @param ctx the parse tree
	 */
	void enterSurrogateVariableP(LLS1Parser.SurrogateVariablePContext ctx);
	/**
	 * Exit a parse tree produced by the {@code surrogateVariableP}
	 * labeled alternative in {@link LLS1Parser#p}.
	 * @param ctx the parse tree
	 */
	void exitSurrogateVariableP(LLS1Parser.SurrogateVariablePContext ctx);
	/**
	 * Enter a parse tree produced by the {@code onlyP}
	 * labeled alternative in {@link LLS1Parser#p}.
	 * @param ctx the parse tree
	 */
	void enterOnlyP(LLS1Parser.OnlyPContext ctx);
	/**
	 * Exit a parse tree produced by the {@code onlyP}
	 * labeled alternative in {@link LLS1Parser#p}.
	 * @param ctx the parse tree
	 */
	void exitOnlyP(LLS1Parser.OnlyPContext ctx);
	/**
	 * Enter a parse tree produced by the {@code orP}
	 * labeled alternative in {@link LLS1Parser#p}.
	 * @param ctx the parse tree
	 */
	void enterOrP(LLS1Parser.OrPContext ctx);
	/**
	 * Exit a parse tree produced by the {@code orP}
	 * labeled alternative in {@link LLS1Parser#p}.
	 * @param ctx the parse tree
	 */
	void exitOrP(LLS1Parser.OrPContext ctx);
	/**
	 * Enter a parse tree produced by the {@code notP}
	 * labeled alternative in {@link LLS1Parser#p}.
	 * @param ctx the parse tree
	 */
	void enterNotP(LLS1Parser.NotPContext ctx);
	/**
	 * Exit a parse tree produced by the {@code notP}
	 * labeled alternative in {@link LLS1Parser#p}.
	 * @param ctx the parse tree
	 */
	void exitNotP(LLS1Parser.NotPContext ctx);
	/**
	 * Enter a parse tree produced by the {@code impStatement}
	 * labeled alternative in {@link LLS1Parser#statement}.
	 * @param ctx the parse tree
	 */
	void enterImpStatement(LLS1Parser.ImpStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code impStatement}
	 * labeled alternative in {@link LLS1Parser#statement}.
	 * @param ctx the parse tree
	 */
	void exitImpStatement(LLS1Parser.ImpStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code orStatement}
	 * labeled alternative in {@link LLS1Parser#statement}.
	 * @param ctx the parse tree
	 */
	void enterOrStatement(LLS1Parser.OrStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code orStatement}
	 * labeled alternative in {@link LLS1Parser#statement}.
	 * @param ctx the parse tree
	 */
	void exitOrStatement(LLS1Parser.OrStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code equalsPStatement}
	 * labeled alternative in {@link LLS1Parser#statement}.
	 * @param ctx the parse tree
	 */
	void enterEqualsPStatement(LLS1Parser.EqualsPStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code equalsPStatement}
	 * labeled alternative in {@link LLS1Parser#statement}.
	 * @param ctx the parse tree
	 */
	void exitEqualsPStatement(LLS1Parser.EqualsPStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code nullCStatement}
	 * labeled alternative in {@link LLS1Parser#statement}.
	 * @param ctx the parse tree
	 */
	void enterNullCStatement(LLS1Parser.NullCStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code nullCStatement}
	 * labeled alternative in {@link LLS1Parser#statement}.
	 * @param ctx the parse tree
	 */
	void exitNullCStatement(LLS1Parser.NullCStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code equalsLStatement}
	 * labeled alternative in {@link LLS1Parser#statement}.
	 * @param ctx the parse tree
	 */
	void enterEqualsLStatement(LLS1Parser.EqualsLStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code equalsLStatement}
	 * labeled alternative in {@link LLS1Parser#statement}.
	 * @param ctx the parse tree
	 */
	void exitEqualsLStatement(LLS1Parser.EqualsLStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code existLStatement}
	 * labeled alternative in {@link LLS1Parser#statement}.
	 * @param ctx the parse tree
	 */
	void enterExistLStatement(LLS1Parser.ExistLStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code existLStatement}
	 * labeled alternative in {@link LLS1Parser#statement}.
	 * @param ctx the parse tree
	 */
	void exitExistLStatement(LLS1Parser.ExistLStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code equalsCStatement}
	 * labeled alternative in {@link LLS1Parser#statement}.
	 * @param ctx the parse tree
	 */
	void enterEqualsCStatement(LLS1Parser.EqualsCStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code equalsCStatement}
	 * labeled alternative in {@link LLS1Parser#statement}.
	 * @param ctx the parse tree
	 */
	void exitEqualsCStatement(LLS1Parser.EqualsCStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code notEqualsCStatement}
	 * labeled alternative in {@link LLS1Parser#statement}.
	 * @param ctx the parse tree
	 */
	void enterNotEqualsCStatement(LLS1Parser.NotEqualsCStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code notEqualsCStatement}
	 * labeled alternative in {@link LLS1Parser#statement}.
	 * @param ctx the parse tree
	 */
	void exitNotEqualsCStatement(LLS1Parser.NotEqualsCStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code notStatement}
	 * labeled alternative in {@link LLS1Parser#statement}.
	 * @param ctx the parse tree
	 */
	void enterNotStatement(LLS1Parser.NotStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code notStatement}
	 * labeled alternative in {@link LLS1Parser#statement}.
	 * @param ctx the parse tree
	 */
	void exitNotStatement(LLS1Parser.NotStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code isaLStatement}
	 * labeled alternative in {@link LLS1Parser#statement}.
	 * @param ctx the parse tree
	 */
	void enterIsaLStatement(LLS1Parser.IsaLStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code isaLStatement}
	 * labeled alternative in {@link LLS1Parser#statement}.
	 * @param ctx the parse tree
	 */
	void exitIsaLStatement(LLS1Parser.IsaLStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code notEqualsLStatement}
	 * labeled alternative in {@link LLS1Parser#statement}.
	 * @param ctx the parse tree
	 */
	void enterNotEqualsLStatement(LLS1Parser.NotEqualsLStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code notEqualsLStatement}
	 * labeled alternative in {@link LLS1Parser#statement}.
	 * @param ctx the parse tree
	 */
	void exitNotEqualsLStatement(LLS1Parser.NotEqualsLStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code andStatement}
	 * labeled alternative in {@link LLS1Parser#statement}.
	 * @param ctx the parse tree
	 */
	void enterAndStatement(LLS1Parser.AndStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code andStatement}
	 * labeled alternative in {@link LLS1Parser#statement}.
	 * @param ctx the parse tree
	 */
	void exitAndStatement(LLS1Parser.AndStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code existCStatement}
	 * labeled alternative in {@link LLS1Parser#statement}.
	 * @param ctx the parse tree
	 */
	void enterExistCStatement(LLS1Parser.ExistCStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code existCStatement}
	 * labeled alternative in {@link LLS1Parser#statement}.
	 * @param ctx the parse tree
	 */
	void exitExistCStatement(LLS1Parser.ExistCStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code isaCStatement}
	 * labeled alternative in {@link LLS1Parser#statement}.
	 * @param ctx the parse tree
	 */
	void enterIsaCStatement(LLS1Parser.IsaCStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code isaCStatement}
	 * labeled alternative in {@link LLS1Parser#statement}.
	 * @param ctx the parse tree
	 */
	void exitIsaCStatement(LLS1Parser.IsaCStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code nullLStatement}
	 * labeled alternative in {@link LLS1Parser#statement}.
	 * @param ctx the parse tree
	 */
	void enterNullLStatement(LLS1Parser.NullLStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code nullLStatement}
	 * labeled alternative in {@link LLS1Parser#statement}.
	 * @param ctx the parse tree
	 */
	void exitNullLStatement(LLS1Parser.NullLStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code bracketedStatement}
	 * labeled alternative in {@link LLS1Parser#statement}.
	 * @param ctx the parse tree
	 */
	void enterBracketedStatement(LLS1Parser.BracketedStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code bracketedStatement}
	 * labeled alternative in {@link LLS1Parser#statement}.
	 * @param ctx the parse tree
	 */
	void exitBracketedStatement(LLS1Parser.BracketedStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code someStatement}
	 * labeled alternative in {@link LLS1Parser#statement}.
	 * @param ctx the parse tree
	 */
	void enterSomeStatement(LLS1Parser.SomeStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code someStatement}
	 * labeled alternative in {@link LLS1Parser#statement}.
	 * @param ctx the parse tree
	 */
	void exitSomeStatement(LLS1Parser.SomeStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code eachStatement}
	 * labeled alternative in {@link LLS1Parser#statement}.
	 * @param ctx the parse tree
	 */
	void enterEachStatement(LLS1Parser.EachStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code eachStatement}
	 * labeled alternative in {@link LLS1Parser#statement}.
	 * @param ctx the parse tree
	 */
	void exitEachStatement(LLS1Parser.EachStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link LLS1Parser#variable}.
	 * @param ctx the parse tree
	 */
	void enterVariable(LLS1Parser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link LLS1Parser#variable}.
	 * @param ctx the parse tree
	 */
	void exitVariable(LLS1Parser.VariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link LLS1Parser#surrogate}.
	 * @param ctx the parse tree
	 */
	void enterSurrogate(LLS1Parser.SurrogateContext ctx);
	/**
	 * Exit a parse tree produced by {@link LLS1Parser#surrogate}.
	 * @param ctx the parse tree
	 */
	void exitSurrogate(LLS1Parser.SurrogateContext ctx);
}