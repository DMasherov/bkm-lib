package mpei.bkm.parsing.lq.parsers;// Generated from C:/plugin/protege/bkmapi-parsing/grammar\LQ.g4 by ANTLR 4.5
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link LQParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface LQVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link LQParser#query}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuery(@NotNull LQParser.QueryContext ctx);
	/**
	 * Visit a parse tree produced by {@link LQParser#goals}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGoals(@NotNull LQParser.GoalsContext ctx);
	/**
	 * Visit a parse tree produced by {@link LQParser#goal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGoal(@NotNull LQParser.GoalContext ctx);
	/**
	 * Visit a parse tree produced by {@link LQParser#aggregateGoal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAggregateGoal(@NotNull LQParser.AggregateGoalContext ctx);
	/**
	 * Visit a parse tree produced by {@link LQParser#conditions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditions(@NotNull LQParser.ConditionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link LQParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondition(@NotNull LQParser.ConditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link LQParser#inClass}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInClass(@NotNull LQParser.InClassContext ctx);
	/**
	 * Visit a parse tree produced by {@link LQParser#attributeConditions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttributeConditions(@NotNull LQParser.AttributeConditionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link LQParser#attributeCondition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttributeCondition(@NotNull LQParser.AttributeConditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link LQParser#linkCondition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLinkCondition(@NotNull LQParser.LinkConditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link LQParser#functionalLinkCondition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionalLinkCondition(@NotNull LQParser.FunctionalLinkConditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link LQParser#variableOperatorCondition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableOperatorCondition(@NotNull LQParser.VariableOperatorConditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link LQParser#variableAttrSelector}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableAttrSelector(@NotNull LQParser.VariableAttrSelectorContext ctx);
	/**
	 * Visit a parse tree produced by {@link LQParser#attributeSelector}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttributeSelector(@NotNull LQParser.AttributeSelectorContext ctx);
	/**
	 * Visit a parse tree produced by {@link LQParser#variableName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableName(@NotNull LQParser.VariableNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link LQParser#className}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassName(@NotNull LQParser.ClassNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link LQParser#linkName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLinkName(@NotNull LQParser.LinkNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link LQParser#attributeName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttributeName(@NotNull LQParser.AttributeNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link LQParser#aggregateFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAggregateFunction(@NotNull LQParser.AggregateFunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link LQParser#binaryOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinaryOperator(@NotNull LQParser.BinaryOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link LQParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValue(@NotNull LQParser.ValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link LQParser#number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumber(@NotNull LQParser.NumberContext ctx);
}