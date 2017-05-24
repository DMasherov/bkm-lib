package mpei.bkm.parsing.lq.parsers;

import mpei.bkm.model.commonfeatures.Selector;
import mpei.bkm.model.query.AggregateGoal;
import mpei.bkm.model.query.Condition;
import mpei.bkm.model.query.Goal;
import mpei.bkm.model.query.InClass;
import mpei.bkm.model.query.variable.*;
import org.antlr.v4.runtime.misc.NotNull;

import java.util.ArrayList;
import java.util.List;

public class LQBuildingVisitor extends LQBaseVisitor {
    private QueryVariableCollection queryVariableCollection = new QueryVariableCollection();

    private void addGoal(Selector selector, QueryVariableCollection variableCollection) {
        VariableAttribute va = simplify(selector);
        queryVariableCollection.getGoals().add(va);
    }

    private void addCondition(Selector selector, VariableAttributeCondition.BinaryOperator b, String value) {
        VariableAttribute va = simplify(selector);
        queryVariableCollection.getValueConditions().add(new VariableAttributeConditionValue(va,b,value));
    }

    private void addCondition(Selector left, VariableAttributeCondition.BinaryOperator b, Selector right) {
        VariableAttribute leftVA = simplify(left);
        VariableAttribute rightVA = simplify(right);
        queryVariableCollection.getVariableConditions().add(new VariableAttributeConditionVariable(leftVA, b, rightVA));
    }

    private VariableAttribute simplify(Selector selector) {
        int size = selector.getSelects().size();
        String currentVariableName = selector.getSelects().get(0);
        for (int i = 1; i < size - 1; i++) {
            String select = selector.getSelects().get(i);
            VariableAttribute left = new VariableAttribute(new Variable(currentVariableName),select);
            currentVariableName = "__" + i;
            VariableAttribute right = new VariableAttribute(new Variable(currentVariableName),null);
            queryVariableCollection.getVariableConditions().add(new VariableAttributeConditionVariable(left,right));
        }
        return new VariableAttribute(new Variable(currentVariableName),selector.getSelects().get(size - 1));
    }

    @Override
    public QueryVariableCollection visitQuery(LQParser.QueryContext ctx) {
        queryVariableCollection = new QueryVariableCollection();
        List<Goal> goals = new ArrayList<Goal>();
        List<Condition> conditions = new ArrayList<Condition>();
        if (ctx.goals() != null) {
            if (ctx.goals().aggregateGoal() != null) {
                queryVariableCollection.setAggregateGoals((List<AggregateVariableAttribute>) visit(ctx.goals().aggregateGoal()));
            }
            else if (ctx.goals().goal() != null) {
                for (LQParser.GoalContext goalContext : ctx.goals().goal()) {
                    Selector s = (Selector) visit(goalContext.variableAttrSelector());
                    addGoal(s,queryVariableCollection);
                }
            }
        }
        if (ctx.conditions() != null && ctx.conditions().condition() != null) {
            for (LQParser.ConditionContext conditionContext: ctx.conditions().condition()) {
                visit(conditionContext);
            }
        }
        return queryVariableCollection;
    }

    @Override
    public InClass visitInClass(LQParser.InClassContext ctx) {
        String variableName = ctx.variableName().getText();
        String className = ctx.className().getText();
        queryVariableCollection.getClassCondition().add(new Variable(variableName,className));

        if (ctx.attributeConditions() != null) {
            for (LQParser.AttributeConditionContext acc: ctx.attributeConditions().attributeCondition()) {
                Selector leftSelector = (Selector) visit(acc.attributeSelector());
                leftSelector.getSelects().add(0,variableName);
                VariableAttributeCondition.BinaryOperator bo = (VariableAttributeCondition.BinaryOperator)visit(acc.binaryOperator());
                if (acc.variableAttrSelector() == null) {
                    addCondition(leftSelector, bo, acc.value().getText());
                }
                else {
                    addCondition(leftSelector, bo, (Selector) visit(acc.variableAttrSelector()));
                }
            }
        }
        return new InClass(ctx.variableName().getText(),ctx.className().getText(),null);
    }

    @Override
    public Void visitVariableOperatorCondition(LQParser.VariableOperatorConditionContext ctx) {
        Selector leftSelector = (Selector) visit(ctx.variableAttrSelector(0));
        VariableAttributeCondition.BinaryOperator bo = (VariableAttributeCondition.BinaryOperator)visit(ctx.binaryOperator());
        if (ctx.value() != null) {
            addCondition(leftSelector, bo, ctx.value().getText());
        }
        else {
            addCondition(leftSelector, bo, (Selector) visit(ctx.variableAttrSelector(1)));
        }
        return null;
    }

    @Override
    public Void visitLinkCondition(LQParser.LinkConditionContext ctx) {
        Variable left = new Variable(ctx.variableName(0).getText());
        Variable right = new Variable(ctx.variableName(ctx.variableName().size() - 1).getText());
        String relName;
        if (ctx.variableName().size() == 2) {
            relName = "__relName";
        }
        else {
            relName = ctx.variableName(1).getText();
        }
        Variable rel = new Variable(relName,ctx.linkName().getText());
        queryVariableCollection.getLinks().add(new VariableLink(left,rel,right));
        return null;
    }

    @Override
    public Void visitFunctionalLinkCondition(LQParser.FunctionalLinkConditionContext ctx) {
        Variable left = new Variable(ctx.variableName().getText());
        Variable rel = new Variable("__relName",ctx.linkName().getText());
        Variable right = new Variable("__varName");
        queryVariableCollection.getLinks().add(new VariableLink(left,rel,right));

        LQParser.AttributeConditionContext acc = ctx.attributeCondition();
        Selector leftSelector = (Selector) visit(acc.attributeSelector());
        leftSelector.getSelects().add(0,right.getName());
        VariableAttributeCondition.BinaryOperator bo = (VariableAttributeCondition.BinaryOperator)visit(acc.binaryOperator());
        if (acc.variableAttrSelector() == null) {
            addCondition(leftSelector, bo, acc.value().getText());
        }
        else {
            addCondition(leftSelector, bo, (Selector) visit(acc.variableAttrSelector()));
        }
        return null;
    }
    @Override public Selector visitVariableAttrSelector(@NotNull LQParser.VariableAttrSelectorContext ctx) {
        List<String> values = new ArrayList<String>();
        values.add(ctx.variableName().getText());
        for (LQParser.AttributeNameContext value : ctx.attributeName()) {
            values.add(value.getText());
        }
        return new Selector(values);
    }

    @Override public Selector visitAttributeSelector(@NotNull LQParser.AttributeSelectorContext ctx) {
        List<String> values = new ArrayList<String>();
        for (LQParser.AttributeNameContext value : ctx.attributeName()) {
            values.add(value.getText());
        }
        return new Selector(values);
    }

    @Override public VariableAttributeCondition.BinaryOperator visitBinaryOperator(@NotNull LQParser.BinaryOperatorContext ctx) {
        VariableAttributeCondition.BinaryOperator binaryoperator = null;
        if (ctx.EQ() != null) binaryoperator = VariableAttributeCondition.BinaryOperator.EQ;
        if (ctx.NOTEQ() != null) binaryoperator = VariableAttributeCondition.BinaryOperator.NOTEQ;
        if (ctx.GE() != null) binaryoperator = VariableAttributeCondition.BinaryOperator.GE;
        if (ctx.GT() != null) binaryoperator = VariableAttributeCondition.BinaryOperator.GT;
        if (ctx.LE() != null) binaryoperator = VariableAttributeCondition.BinaryOperator.LE;
        if (ctx.LT() != null) binaryoperator = VariableAttributeCondition.BinaryOperator.LT;
        if (ctx.LIKE() != null) binaryoperator = VariableAttributeCondition.BinaryOperator.LIKE;
        return binaryoperator;
    }

    @Override public AggregateGoal.Aggregate visitAggregateFunction(@NotNull LQParser.AggregateFunctionContext ctx) {
        AggregateGoal.Aggregate aggregate = null;
        if (ctx.SUM() != null) aggregate = AggregateGoal.Aggregate.SUM;
        if (ctx.AVG() != null) aggregate = AggregateGoal.Aggregate.AVG;
        if (ctx.MAX() != null) aggregate = AggregateGoal.Aggregate.MAX;
        if (ctx.MIN() != null) aggregate = AggregateGoal.Aggregate.MIN;
        return aggregate;
    }
}
