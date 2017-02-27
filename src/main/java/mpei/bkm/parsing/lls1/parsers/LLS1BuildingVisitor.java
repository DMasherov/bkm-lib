package mpei.bkm.parsing.lls1.parsers;

import mpei.bkm.model.lls1.Expression;
import mpei.bkm.model.lls1.Ontology;
import mpei.bkm.model.lls1.SimpleExpressionOntology;
import mpei.bkm.model.lls1.statement.*;
import mpei.bkm.model.lls1.terms.c.*;
import mpei.bkm.model.lls1.terms.l.L;
import mpei.bkm.model.lls1.terms.p.P;
import mpei.bkm.parsing.lls1.mapping.ExprMapping;
import org.antlr.v4.runtime.misc.NotNull;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class LLS1BuildingVisitor extends LLS1BaseVisitor {
    private SimpleExpressionOntology ont;
    private List<Expression> expressions = new ArrayList<Expression>();

    @Override public Ontology visitStatements(@NotNull LLS1Parser.StatementsContext ctx) {
        List<Statement> statements = new ArrayList<Statement>();
        expressions = new ArrayList<Expression>();
        ont = new SimpleExpressionOntology();

        // visit each statement an create the list of statements by visiting statements
        // after visiting an expression node it should be added to the expression list
        for (LLS1Parser.StatementContext sc : ctx.statement()) {
            Statement s = (Statement) visit(sc);
            statements.add(s);
        }
        ont.getStatements().addAll(statements);
        ont.getExpressions().addAll(expressions);
        ont.getErefmap().putAll(ExprMapping.makeReferenceMap(expressions));
        return ont;
    }

    @Override public C visitBracketedC(@NotNull LLS1Parser.BracketedCContext ctx) {
        return (C)(visit(ctx.c()));
    }
    @Override public mpei.bkm.model.lls1.terms.c.And visitAndC(@NotNull LLS1Parser.AndCContext ctx) {
        C left = (C)(visit(ctx.c(0)));
        C right = (C)(visit(ctx.c(1)));
        mpei.bkm.model.lls1.terms.c.And k = new mpei.bkm.model.lls1.terms.c.And(left, right);
        expressions.add(k);
        return k;
    }
    @Override public mpei.bkm.model.lls1.terms.c.Or visitOrC(@NotNull LLS1Parser.OrCContext ctx) {
        C left = (C)(visit(ctx.c(0)));
        C right = (C)(visit(ctx.c(1)));
        mpei.bkm.model.lls1.terms.c.Or k = new mpei.bkm.model.lls1.terms.c.Or(left, right);
        expressions.add(k);
        return k;
    }
    @Override public mpei.bkm.model.lls1.terms.c.Not visitNotC(@NotNull LLS1Parser.NotCContext ctx) {
        C c = (C) visit(ctx.c());
        mpei.bkm.model.lls1.terms.c.Not k = new mpei.bkm.model.lls1.terms.c.Not(c);
        expressions.add(k);
        return k;
    }
    @Override public mpei.bkm.model.lls1.terms.c.ConceptVariable visitConceptVariableC(@NotNull LLS1Parser.ConceptVariableCContext ctx) {
        C c = (C)visit(ctx.c());
        String varName = ctx.variable().getText();
        mpei.bkm.model.lls1.terms.c.ConceptVariable k = new mpei.bkm.model.lls1.terms.c.ConceptVariable(c, varName);
        expressions.add(k);
        return k;
    }
    @Override public mpei.bkm.model.lls1.terms.c.Named visitNamedC(@NotNull LLS1Parser.NamedCContext ctx) {
        String name = ctx.getText();
        return new mpei.bkm.model.lls1.terms.c.Named(name);
    }
    @Override public Those visitThoseC(@NotNull LLS1Parser.ThoseCContext ctx) {
        P p = (P)visit(ctx.p());
        mpei.bkm.model.lls1.terms.c.Those k = new mpei.bkm.model.lls1.terms.c.Those(p);
        expressions.add(k);
        return k;
    }
    @Override public That visitThatC(@NotNull LLS1Parser.ThatCContext ctx) {
        C c = (C)visit(ctx.c());
        P p = (P)visit(ctx.p());
        mpei.bkm.model.lls1.terms.c.That k = new mpei.bkm.model.lls1.terms.c.That(c, p);
        expressions.add(k);
        return k;
    }
    @Override public mpei.bkm.model.lls1.terms.l.Named visitNamedL(@NotNull LLS1Parser.NamedLContext ctx) {
        String name = ctx.getText();
        return new mpei.bkm.model.lls1.terms.l.Named(name);
    }
    @Override public L visitBracketedL(@NotNull LLS1Parser.BracketedLContext ctx) {
        return (L)(visit(ctx.l()));
    }
    @Override public mpei.bkm.model.lls1.terms.l.And visitAndL(@NotNull LLS1Parser.AndLContext ctx) {
        L left = (L)(visit(ctx.l(0)));
        L right = (L)(visit(ctx.l(1)));
        mpei.bkm.model.lls1.terms.l.And k = new mpei.bkm.model.lls1.terms.l.And(left, right);
        expressions.add(k);
        return k;
    }
    @Override public mpei.bkm.model.lls1.terms.l.Or visitOrL(@NotNull LLS1Parser.OrLContext ctx) {
        L left = (L)(visit(ctx.l(0)));
        L right = (L)(visit(ctx.l(1)));
        mpei.bkm.model.lls1.terms.l.Or k = new mpei.bkm.model.lls1.terms.l.Or(left, right);
        expressions.add(k);
        return k;
    }
    @Override public mpei.bkm.model.lls1.terms.l.Not visitNotL(@NotNull LLS1Parser.NotLContext ctx) {
        L l = (L)visit(ctx.l());
        mpei.bkm.model.lls1.terms.l.Not k = new mpei.bkm.model.lls1.terms.l.Not(l);
        expressions.add(k);
        return k;
    }
    @Override public mpei.bkm.model.lls1.terms.l.Inv visitInvL(@NotNull LLS1Parser.InvLContext ctx) {
        L l = (L)visit(ctx.l());
        mpei.bkm.model.lls1.terms.l.Inv k = new mpei.bkm.model.lls1.terms.l.Inv(l);
        expressions.add(k);
        return k;
    }
    @Override public mpei.bkm.model.lls1.terms.p.Not visitNotP(@NotNull LLS1Parser.NotPContext ctx) {
        P p = (P)visit(ctx.p());
        mpei.bkm.model.lls1.terms.p.Not k = new mpei.bkm.model.lls1.terms.p.Not(p);
        expressions.add(k);
        return k;
    }
    @Override public mpei.bkm.model.lls1.terms.p.And visitAndP(@NotNull LLS1Parser.AndPContext ctx) {
        P left = (P)(visit(ctx.p(0)));
        P right = (P)(visit(ctx.p(1)));
        mpei.bkm.model.lls1.terms.p.And k = new mpei.bkm.model.lls1.terms.p.And(left, right);
        expressions.add(k);
        return k;
    }
    @Override public mpei.bkm.model.lls1.terms.p.Or visitOrP(@NotNull LLS1Parser.OrPContext ctx) {
        P left = (P)(visit(ctx.p(0)));
        P right = (P)(visit(ctx.p(1)));
        mpei.bkm.model.lls1.terms.p.Or k = new mpei.bkm.model.lls1.terms.p.Or(left, right);
        expressions.add(k);
        return k;
    }
    @Override public mpei.bkm.model.lls1.terms.p.Some visitSomeP(@NotNull LLS1Parser.SomePContext ctx) {
        L l = (L)(visit(ctx.l()));
        C c = (C)(visit(ctx.c()));
        mpei.bkm.model.lls1.terms.p.Some k = new mpei.bkm.model.lls1.terms.p.Some(l, c);
        expressions.add(k);
        return k;
    }
    @Override public mpei.bkm.model.lls1.terms.p.Each visitEachP(@NotNull LLS1Parser.EachPContext ctx) {
        L l = (L)(visit(ctx.l()));
        C c = (C)(visit(ctx.c()));
        mpei.bkm.model.lls1.terms.p.Each k = new mpei.bkm.model.lls1.terms.p.Each(l, c);
        expressions.add(k);
        return k;
    }
    @Override public mpei.bkm.model.lls1.terms.p.Only visitOnlyP(@NotNull LLS1Parser.OnlyPContext ctx) {
        L l = (L)(visit(ctx.l()));
        C c = (C)(visit(ctx.c()));
        mpei.bkm.model.lls1.terms.p.Only k = new mpei.bkm.model.lls1.terms.p.Only(l, c);
        expressions.add(k);
        return k;
    }
    @Override public mpei.bkm.model.lls1.terms.p.PredicateVariable visitPredicateVariableP(@NotNull LLS1Parser.PredicateVariablePContext ctx) {
        L l = (L)(visit(ctx.l()));
        String varName = ctx.variable().getText();
        mpei.bkm.model.lls1.terms.p.PredicateVariable k = new mpei.bkm.model.lls1.terms.p.PredicateVariable(l, varName);
        expressions.add(k);
        return k;
    }
    @Override public mpei.bkm.model.lls1.terms.p.SurrogateVariable visitSurrogateVariableP(@NotNull LLS1Parser.SurrogateVariablePContext ctx) {
        L l = (L)(visit(ctx.l()));
        String surName = ctx.surrogate().getText();
        mpei.bkm.model.lls1.terms.p.SurrogateVariable k = new mpei.bkm.model.lls1.terms.p.SurrogateVariable(l, surName);
        expressions.add(k);
        return k;
    }
    @Override public P visitBracketedP(@NotNull LLS1Parser.BracketedPContext ctx) {
        return (P)(visit(ctx.p()));
    }
    @Override public mpei.bkm.model.lls1.statement.Not visitNotStatement(@NotNull LLS1Parser.NotStatementContext ctx) {
        Statement s = (Statement) visit(ctx.statement());
        mpei.bkm.model.lls1.statement.Not k = new mpei.bkm.model.lls1.statement.Not(s);
        expressions.add(k);
        return k;
    }
    @Override public mpei.bkm.model.lls1.statement.And visitAndStatement(@NotNull LLS1Parser.AndStatementContext ctx) {
        Statement left = (Statement) visit(ctx.statement(0));
        Statement right = (Statement) visit(ctx.statement(1));
        mpei.bkm.model.lls1.statement.And k = new mpei.bkm.model.lls1.statement.And(left, right);
        expressions.add(k);
        return k;
    }
    @Override public mpei.bkm.model.lls1.statement.Or visitOrStatement(@NotNull LLS1Parser.OrStatementContext ctx) {
        Statement left = (Statement) visit(ctx.statement(0));
        Statement right = (Statement) visit(ctx.statement(1));
        mpei.bkm.model.lls1.statement.Or k = new mpei.bkm.model.lls1.statement.Or(left, right);
        expressions.add(k);
        return k;
    }
    @Override public mpei.bkm.model.lls1.statement.Imp visitImpStatement(@NotNull LLS1Parser.ImpStatementContext ctx) {
        Statement left = (Statement) visit(ctx.statement(0));
        Statement right = (Statement) visit(ctx.statement(1));
        mpei.bkm.model.lls1.statement.Imp k = new mpei.bkm.model.lls1.statement.Imp(left, right);
        expressions.add(k);
        return k;
    }
    @Override public mpei.bkm.model.lls1.statement.ExistC visitExistCStatement(@NotNull LLS1Parser.ExistCStatementContext ctx) {
        C c = (C) visit(ctx.c());
        mpei.bkm.model.lls1.statement.ExistC k = new mpei.bkm.model.lls1.statement.ExistC(c);
        expressions.add(k);
        return k;
    }
    @Override public mpei.bkm.model.lls1.statement.ExistL visitExistLStatement(@NotNull LLS1Parser.ExistLStatementContext ctx) {
        L l = (L) visit(ctx.l());
        mpei.bkm.model.lls1.statement.ExistL k = new mpei.bkm.model.lls1.statement.ExistL(l);
        expressions.add(k);
        return k;
    }
    @Override public mpei.bkm.model.lls1.statement.NullC visitNullCStatement(@NotNull LLS1Parser.NullCStatementContext ctx) {
        C c = (C) visit(ctx.c());
        mpei.bkm.model.lls1.statement.NullC k = new mpei.bkm.model.lls1.statement.NullC(c);
        expressions.add(k);
        return k;
    }
    @Override public mpei.bkm.model.lls1.statement.NullL visitNullLStatement(@NotNull LLS1Parser.NullLStatementContext ctx) {
        L l = (L) visit(ctx.l());
        mpei.bkm.model.lls1.statement.NullL k = new mpei.bkm.model.lls1.statement.NullL(l);
        expressions.add(k);
        return k;
    }
    @Override public mpei.bkm.model.lls1.statement.IsaC visitIsaCStatement(@NotNull LLS1Parser.IsaCStatementContext ctx) {
        C child = (C) visit(ctx.c(0));
        C parent = (C) visit(ctx.c(1));
        mpei.bkm.model.lls1.statement.IsaC k = new mpei.bkm.model.lls1.statement.IsaC(child, parent);
        expressions.add(k);
        return k;
    }
    @Override public mpei.bkm.model.lls1.statement.IsaL visitIsaLStatement(@NotNull LLS1Parser.IsaLStatementContext ctx) {
        L child = (L) visit(ctx.l(0));
        L parent = (L) visit(ctx.l(1));
        mpei.bkm.model.lls1.statement.IsaL k = new mpei.bkm.model.lls1.statement.IsaL(child, parent);
        expressions.add(k);
        return k;
    }
    @Override public mpei.bkm.model.lls1.statement.EqualC visitEqualsCStatement(@NotNull LLS1Parser.EqualsCStatementContext ctx) {
        C left = (C) visit(ctx.c(0));
        C right = (C) visit(ctx.c(1));
        mpei.bkm.model.lls1.statement.EqualC k = new mpei.bkm.model.lls1.statement.EqualC(left, right);
        expressions.add(k);
        return k;
    }
    @Override public mpei.bkm.model.lls1.statement.EqualP visitEqualsPStatement(@NotNull LLS1Parser.EqualsPStatementContext ctx) {
        P left = (P) visit(ctx.p(0));
        P right = (P) visit(ctx.p(1));
        mpei.bkm.model.lls1.statement.EqualP k = new mpei.bkm.model.lls1.statement.EqualP(left, right);
        expressions.add(k);
        return k;
    }
    @Override public mpei.bkm.model.lls1.statement.Not visitNotEqualsCStatement(@NotNull LLS1Parser.NotEqualsCStatementContext ctx) {
        C left = (C) visit(ctx.c(0));
        C right = (C) visit(ctx.c(1));
        mpei.bkm.model.lls1.statement.EqualC e = new mpei.bkm.model.lls1.statement.EqualC(left, right);
        mpei.bkm.model.lls1.statement.Not k = new mpei.bkm.model.lls1.statement.Not(e);
        expressions.add(k);
        return k;
    }
    @Override public mpei.bkm.model.lls1.statement.EqualL visitEqualsLStatement(@NotNull LLS1Parser.EqualsLStatementContext ctx) {
        L left = (L) visit(ctx.l(0));
        L right = (L) visit(ctx.l(1));
        mpei.bkm.model.lls1.statement.EqualL k = new mpei.bkm.model.lls1.statement.EqualL(left, right);
        expressions.add(k);
        return k;
    }
    @Override public mpei.bkm.model.lls1.statement.Not visitNotEqualsLStatement(@NotNull LLS1Parser.NotEqualsLStatementContext ctx) {
        L left = (L) visit(ctx.l(0));
        L right = (L) visit(ctx.l(1));
        mpei.bkm.model.lls1.statement.EqualL e = new mpei.bkm.model.lls1.statement.EqualL(left, right);
        mpei.bkm.model.lls1.statement.Not k = new mpei.bkm.model.lls1.statement.Not(e);
        expressions.add(k);
        return k;
    }
    @Override public mpei.bkm.model.lls1.statement.Some visitSomeStatement(@NotNull LLS1Parser.SomeStatementContext ctx) {
        C c = (C) visit(ctx.c());
        P p = (P) visit(ctx.p());
        mpei.bkm.model.lls1.statement.Some k = new mpei.bkm.model.lls1.statement.Some(c, p);
        expressions.add(k);
        return k;
    }
    @Override public mpei.bkm.model.lls1.statement.Each visitEachStatement(@NotNull LLS1Parser.EachStatementContext ctx) {
        C c = (C) visit(ctx.c());
        P p = (P) visit(ctx.p());
        mpei.bkm.model.lls1.statement.Each k = new mpei.bkm.model.lls1.statement.Each(c, p);
        expressions.add(k);
        return k;
    }
    @Override public mpei.bkm.model.lls1.statement.Statement visitBracketedStatement(@NotNull LLS1Parser.BracketedStatementContext ctx) {
        return (Statement)(visit(ctx.statement()));
    }
    @Override public String visitVariable(@NotNull LLS1Parser.VariableContext ctx) {
        return ctx.getText();
    }
    @Override public String visitSurrogate(@NotNull LLS1Parser.SurrogateContext ctx) {
        return ctx.getText();
    }

}
