// Generated from C:/bmd/bkm-lib/src/grammar\LLS1.g4 by ANTLR 4.6
package mpei.bkm.parsing.lls1.parsers;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link LLS1Parser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface LLS1Visitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link LLS1Parser#statements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatements(LLS1Parser.StatementsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code bracketedC}
	 * labeled alternative in {@link LLS1Parser#c}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBracketedC(LLS1Parser.BracketedCContext ctx);
	/**
	 * Visit a parse tree produced by the {@code andC}
	 * labeled alternative in {@link LLS1Parser#c}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAndC(LLS1Parser.AndCContext ctx);
	/**
	 * Visit a parse tree produced by the {@code orC}
	 * labeled alternative in {@link LLS1Parser#c}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrC(LLS1Parser.OrCContext ctx);
	/**
	 * Visit a parse tree produced by the {@code notC}
	 * labeled alternative in {@link LLS1Parser#c}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNotC(LLS1Parser.NotCContext ctx);
	/**
	 * Visit a parse tree produced by the {@code conceptVariableC}
	 * labeled alternative in {@link LLS1Parser#c}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConceptVariableC(LLS1Parser.ConceptVariableCContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NamedC}
	 * labeled alternative in {@link LLS1Parser#c}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNamedC(LLS1Parser.NamedCContext ctx);
	/**
	 * Visit a parse tree produced by the {@code thoseC}
	 * labeled alternative in {@link LLS1Parser#c}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitThoseC(LLS1Parser.ThoseCContext ctx);
	/**
	 * Visit a parse tree produced by the {@code thatC}
	 * labeled alternative in {@link LLS1Parser#c}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitThatC(LLS1Parser.ThatCContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NamedL}
	 * labeled alternative in {@link LLS1Parser#l}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNamedL(LLS1Parser.NamedLContext ctx);
	/**
	 * Visit a parse tree produced by the {@code bracketedL}
	 * labeled alternative in {@link LLS1Parser#l}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBracketedL(LLS1Parser.BracketedLContext ctx);
	/**
	 * Visit a parse tree produced by the {@code andL}
	 * labeled alternative in {@link LLS1Parser#l}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAndL(LLS1Parser.AndLContext ctx);
	/**
	 * Visit a parse tree produced by the {@code orL}
	 * labeled alternative in {@link LLS1Parser#l}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrL(LLS1Parser.OrLContext ctx);
	/**
	 * Visit a parse tree produced by the {@code notL}
	 * labeled alternative in {@link LLS1Parser#l}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNotL(LLS1Parser.NotLContext ctx);
	/**
	 * Visit a parse tree produced by the {@code invL}
	 * labeled alternative in {@link LLS1Parser#l}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInvL(LLS1Parser.InvLContext ctx);
	/**
	 * Visit a parse tree produced by the {@code eachP}
	 * labeled alternative in {@link LLS1Parser#p}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEachP(LLS1Parser.EachPContext ctx);
	/**
	 * Visit a parse tree produced by the {@code predicateVariableP}
	 * labeled alternative in {@link LLS1Parser#p}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPredicateVariableP(LLS1Parser.PredicateVariablePContext ctx);
	/**
	 * Visit a parse tree produced by the {@code someP}
	 * labeled alternative in {@link LLS1Parser#p}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSomeP(LLS1Parser.SomePContext ctx);
	/**
	 * Visit a parse tree produced by the {@code bracketedP}
	 * labeled alternative in {@link LLS1Parser#p}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBracketedP(LLS1Parser.BracketedPContext ctx);
	/**
	 * Visit a parse tree produced by the {@code andP}
	 * labeled alternative in {@link LLS1Parser#p}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAndP(LLS1Parser.AndPContext ctx);
	/**
	 * Visit a parse tree produced by the {@code surrogateVariableP}
	 * labeled alternative in {@link LLS1Parser#p}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSurrogateVariableP(LLS1Parser.SurrogateVariablePContext ctx);
	/**
	 * Visit a parse tree produced by the {@code onlyP}
	 * labeled alternative in {@link LLS1Parser#p}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOnlyP(LLS1Parser.OnlyPContext ctx);
	/**
	 * Visit a parse tree produced by the {@code orP}
	 * labeled alternative in {@link LLS1Parser#p}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrP(LLS1Parser.OrPContext ctx);
	/**
	 * Visit a parse tree produced by the {@code notP}
	 * labeled alternative in {@link LLS1Parser#p}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNotP(LLS1Parser.NotPContext ctx);
	/**
	 * Visit a parse tree produced by the {@code impStatement}
	 * labeled alternative in {@link LLS1Parser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImpStatement(LLS1Parser.ImpStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code orStatement}
	 * labeled alternative in {@link LLS1Parser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrStatement(LLS1Parser.OrStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code equalsPStatement}
	 * labeled alternative in {@link LLS1Parser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqualsPStatement(LLS1Parser.EqualsPStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code nullCStatement}
	 * labeled alternative in {@link LLS1Parser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNullCStatement(LLS1Parser.NullCStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code equalsLStatement}
	 * labeled alternative in {@link LLS1Parser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqualsLStatement(LLS1Parser.EqualsLStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code existLStatement}
	 * labeled alternative in {@link LLS1Parser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExistLStatement(LLS1Parser.ExistLStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code equalsCStatement}
	 * labeled alternative in {@link LLS1Parser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqualsCStatement(LLS1Parser.EqualsCStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code notEqualsCStatement}
	 * labeled alternative in {@link LLS1Parser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNotEqualsCStatement(LLS1Parser.NotEqualsCStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code notStatement}
	 * labeled alternative in {@link LLS1Parser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNotStatement(LLS1Parser.NotStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code isaLStatement}
	 * labeled alternative in {@link LLS1Parser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIsaLStatement(LLS1Parser.IsaLStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code notEqualsLStatement}
	 * labeled alternative in {@link LLS1Parser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNotEqualsLStatement(LLS1Parser.NotEqualsLStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code andStatement}
	 * labeled alternative in {@link LLS1Parser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAndStatement(LLS1Parser.AndStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code existCStatement}
	 * labeled alternative in {@link LLS1Parser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExistCStatement(LLS1Parser.ExistCStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code isaCStatement}
	 * labeled alternative in {@link LLS1Parser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIsaCStatement(LLS1Parser.IsaCStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code nullLStatement}
	 * labeled alternative in {@link LLS1Parser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNullLStatement(LLS1Parser.NullLStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code bracketedStatement}
	 * labeled alternative in {@link LLS1Parser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBracketedStatement(LLS1Parser.BracketedStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code someStatement}
	 * labeled alternative in {@link LLS1Parser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSomeStatement(LLS1Parser.SomeStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code eachStatement}
	 * labeled alternative in {@link LLS1Parser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEachStatement(LLS1Parser.EachStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link LLS1Parser#variable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable(LLS1Parser.VariableContext ctx);
	/**
	 * Visit a parse tree produced by {@link LLS1Parser#surrogate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSurrogate(LLS1Parser.SurrogateContext ctx);
}