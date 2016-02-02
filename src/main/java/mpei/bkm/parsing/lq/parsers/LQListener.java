package mpei.bkm.parsing.lq.parsers;// Generated from C:/plugin/protege/bkmapi-parsing/grammar\LQ.g4 by ANTLR 4.5
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link LQParser}.
 */
public interface LQListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link LQParser#query}.
	 * @param ctx the parse tree
	 */
	void enterQuery(@NotNull LQParser.QueryContext ctx);
	/**
	 * Exit a parse tree produced by {@link LQParser#query}.
	 * @param ctx the parse tree
	 */
	void exitQuery(@NotNull LQParser.QueryContext ctx);
	/**
	 * Enter a parse tree produced by {@link LQParser#goals}.
	 * @param ctx the parse tree
	 */
	void enterGoals(@NotNull LQParser.GoalsContext ctx);
	/**
	 * Exit a parse tree produced by {@link LQParser#goals}.
	 * @param ctx the parse tree
	 */
	void exitGoals(@NotNull LQParser.GoalsContext ctx);
	/**
	 * Enter a parse tree produced by {@link LQParser#goal}.
	 * @param ctx the parse tree
	 */
	void enterGoal(@NotNull LQParser.GoalContext ctx);
	/**
	 * Exit a parse tree produced by {@link LQParser#goal}.
	 * @param ctx the parse tree
	 */
	void exitGoal(@NotNull LQParser.GoalContext ctx);
	/**
	 * Enter a parse tree produced by {@link LQParser#aggregateGoal}.
	 * @param ctx the parse tree
	 */
	void enterAggregateGoal(@NotNull LQParser.AggregateGoalContext ctx);
	/**
	 * Exit a parse tree produced by {@link LQParser#aggregateGoal}.
	 * @param ctx the parse tree
	 */
	void exitAggregateGoal(@NotNull LQParser.AggregateGoalContext ctx);
	/**
	 * Enter a parse tree produced by {@link LQParser#conditions}.
	 * @param ctx the parse tree
	 */
	void enterConditions(@NotNull LQParser.ConditionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link LQParser#conditions}.
	 * @param ctx the parse tree
	 */
	void exitConditions(@NotNull LQParser.ConditionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link LQParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterCondition(@NotNull LQParser.ConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link LQParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitCondition(@NotNull LQParser.ConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link LQParser#inClass}.
	 * @param ctx the parse tree
	 */
	void enterInClass(@NotNull LQParser.InClassContext ctx);
	/**
	 * Exit a parse tree produced by {@link LQParser#inClass}.
	 * @param ctx the parse tree
	 */
	void exitInClass(@NotNull LQParser.InClassContext ctx);
	/**
	 * Enter a parse tree produced by {@link LQParser#attributeConditions}.
	 * @param ctx the parse tree
	 */
	void enterAttributeConditions(@NotNull LQParser.AttributeConditionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link LQParser#attributeConditions}.
	 * @param ctx the parse tree
	 */
	void exitAttributeConditions(@NotNull LQParser.AttributeConditionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link LQParser#attributeCondition}.
	 * @param ctx the parse tree
	 */
	void enterAttributeCondition(@NotNull LQParser.AttributeConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link LQParser#attributeCondition}.
	 * @param ctx the parse tree
	 */
	void exitAttributeCondition(@NotNull LQParser.AttributeConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link LQParser#linkCondition}.
	 * @param ctx the parse tree
	 */
	void enterLinkCondition(@NotNull LQParser.LinkConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link LQParser#linkCondition}.
	 * @param ctx the parse tree
	 */
	void exitLinkCondition(@NotNull LQParser.LinkConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link LQParser#functionalLinkCondition}.
	 * @param ctx the parse tree
	 */
	void enterFunctionalLinkCondition(@NotNull LQParser.FunctionalLinkConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link LQParser#functionalLinkCondition}.
	 * @param ctx the parse tree
	 */
	void exitFunctionalLinkCondition(@NotNull LQParser.FunctionalLinkConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link LQParser#variableOperatorCondition}.
	 * @param ctx the parse tree
	 */
	void enterVariableOperatorCondition(@NotNull LQParser.VariableOperatorConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link LQParser#variableOperatorCondition}.
	 * @param ctx the parse tree
	 */
	void exitVariableOperatorCondition(@NotNull LQParser.VariableOperatorConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link LQParser#variableAttrSelector}.
	 * @param ctx the parse tree
	 */
	void enterVariableAttrSelector(@NotNull LQParser.VariableAttrSelectorContext ctx);
	/**
	 * Exit a parse tree produced by {@link LQParser#variableAttrSelector}.
	 * @param ctx the parse tree
	 */
	void exitVariableAttrSelector(@NotNull LQParser.VariableAttrSelectorContext ctx);
	/**
	 * Enter a parse tree produced by {@link LQParser#attributeSelector}.
	 * @param ctx the parse tree
	 */
	void enterAttributeSelector(@NotNull LQParser.AttributeSelectorContext ctx);
	/**
	 * Exit a parse tree produced by {@link LQParser#attributeSelector}.
	 * @param ctx the parse tree
	 */
	void exitAttributeSelector(@NotNull LQParser.AttributeSelectorContext ctx);
	/**
	 * Enter a parse tree produced by {@link LQParser#variableName}.
	 * @param ctx the parse tree
	 */
	void enterVariableName(@NotNull LQParser.VariableNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link LQParser#variableName}.
	 * @param ctx the parse tree
	 */
	void exitVariableName(@NotNull LQParser.VariableNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link LQParser#className}.
	 * @param ctx the parse tree
	 */
	void enterClassName(@NotNull LQParser.ClassNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link LQParser#className}.
	 * @param ctx the parse tree
	 */
	void exitClassName(@NotNull LQParser.ClassNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link LQParser#linkName}.
	 * @param ctx the parse tree
	 */
	void enterLinkName(@NotNull LQParser.LinkNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link LQParser#linkName}.
	 * @param ctx the parse tree
	 */
	void exitLinkName(@NotNull LQParser.LinkNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link LQParser#attributeName}.
	 * @param ctx the parse tree
	 */
	void enterAttributeName(@NotNull LQParser.AttributeNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link LQParser#attributeName}.
	 * @param ctx the parse tree
	 */
	void exitAttributeName(@NotNull LQParser.AttributeNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link LQParser#aggregateFunction}.
	 * @param ctx the parse tree
	 */
	void enterAggregateFunction(@NotNull LQParser.AggregateFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link LQParser#aggregateFunction}.
	 * @param ctx the parse tree
	 */
	void exitAggregateFunction(@NotNull LQParser.AggregateFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link LQParser#binaryOperator}.
	 * @param ctx the parse tree
	 */
	void enterBinaryOperator(@NotNull LQParser.BinaryOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link LQParser#binaryOperator}.
	 * @param ctx the parse tree
	 */
	void exitBinaryOperator(@NotNull LQParser.BinaryOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link LQParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValue(@NotNull LQParser.ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link LQParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValue(@NotNull LQParser.ValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link LQParser#number}.
	 * @param ctx the parse tree
	 */
	void enterNumber(@NotNull LQParser.NumberContext ctx);
	/**
	 * Exit a parse tree produced by {@link LQParser#number}.
	 * @param ctx the parse tree
	 */
	void exitNumber(@NotNull LQParser.NumberContext ctx);
}