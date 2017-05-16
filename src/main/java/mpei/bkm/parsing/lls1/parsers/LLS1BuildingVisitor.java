package mpei.bkm.parsing.lls1.parsers;

import mpei.bkm.model.lls1.Expression;
import mpei.bkm.model.lls1.LSOntology;
import mpei.bkm.model.lls1.statement.*;
import mpei.bkm.model.lls1.terms.c.*;
import mpei.bkm.model.lls1.terms.l.L;
import mpei.bkm.model.lls1.terms.p.P;
import mpei.bkm.model.lss.objectspecification.concept.BKMClass;
import mpei.bkm.model.lss.objectspecification.concept.BinaryLink;
import mpei.bkm.parsing.lls1.mapping.ExprMapping;

import java.util.*;

public class LLS1BuildingVisitor extends LLS1BaseVisitor {
    private LSOntology ont;
    private List<Expression> expressions = new ArrayList<Expression>();
    private Set<mpei.bkm.model.lls1.terms.c.Named> namedCTerms = new HashSet<>();
    private Set<mpei.bkm.model.lls1.terms.l.Named> namedLTerms = new HashSet<>();

    @Override public LSOntology visitStatements(LLS1Parser.StatementsContext ctx) {

        List<Statement> statements = new ArrayList<Statement>();
        expressions = new ArrayList<Expression>();
        namedCTerms = new HashSet<>();
        namedLTerms = new HashSet<>();
        ont = new LSOntology("", new HashSet<Statement>());

        // visit each statement an create the list of statements by visiting statements
        // after visiting an expression node it should be added to the expression list
        for (LLS1Parser.StatementContext sc : ctx.statement()) {
            Statement s = (Statement) visit(sc);
            statements.add(s);
        }
        ont.getStatements().addAll(statements);
        ont.getClassesTerms().addAll(namedCTerms);
        ont.getBinaryLinksTerms().addAll(namedLTerms);
        ont.getExprMap().putAll(ExprMapping.makeReferenceMap(expressions));
        return ont;
    }

    @Override public C visitBracketedC(LLS1Parser.BracketedCContext ctx) {
        return (C)(visit(ctx.c()));
    }
    @Override public mpei.bkm.model.lls1.terms.c.And visitAndC(LLS1Parser.AndCContext ctx) {
        C left = (C)(visit(ctx.c(0)));
        C right = (C)(visit(ctx.c(1)));
        mpei.bkm.model.lls1.terms.c.And k = new mpei.bkm.model.lls1.terms.c.And(left, right);
        expressions.add(k);
        return k;
    }
    @Override public mpei.bkm.model.lls1.terms.c.Or visitOrC(LLS1Parser.OrCContext ctx) {
        C left = (C)(visit(ctx.c(0)));
        C right = (C)(visit(ctx.c(1)));
        mpei.bkm.model.lls1.terms.c.Or k = new mpei.bkm.model.lls1.terms.c.Or(left, right);
        expressions.add(k);
        return k;
    }
    @Override public mpei.bkm.model.lls1.terms.c.Not visitNotC(LLS1Parser.NotCContext ctx) {
        C c = (C) visit(ctx.c());
        mpei.bkm.model.lls1.terms.c.Not k = new mpei.bkm.model.lls1.terms.c.Not(c);
        expressions.add(k);
        return k;
    }
    @Override public mpei.bkm.model.lls1.terms.c.ConceptVariable visitConceptVariableC(LLS1Parser.ConceptVariableCContext ctx) {
        C c = (C)visit(ctx.c());
        String varName = ctx.variable().getText();
        mpei.bkm.model.lls1.terms.c.ConceptVariable k = new mpei.bkm.model.lls1.terms.c.ConceptVariable(c, varName);
        expressions.add(k);
        return k;
    }
    @Override public mpei.bkm.model.lls1.terms.c.Named visitNamedC(LLS1Parser.NamedCContext ctx) {
        String name = ctx.getText();
        BKMClass bkmClass = new BKMClass(name);
        mpei.bkm.model.lls1.terms.c.Named classTerm = new mpei.bkm.model.lls1.terms.c.Named(bkmClass);
        namedCTerms.add(classTerm);
        return classTerm;
    }
    @Override public Those visitThoseC(LLS1Parser.ThoseCContext ctx) {
        P p = (P)visit(ctx.p());
        mpei.bkm.model.lls1.terms.c.Those k = new mpei.bkm.model.lls1.terms.c.Those(p);
        expressions.add(k);
        return k;
    }
    @Override public That visitThatC(LLS1Parser.ThatCContext ctx) {
        C c = (C)visit(ctx.c());
        P p = (P)visit(ctx.p());
        mpei.bkm.model.lls1.terms.c.That k = new mpei.bkm.model.lls1.terms.c.That(c, p);
        expressions.add(k);
        return k;
    }
    @Override public mpei.bkm.model.lls1.terms.l.Named visitNamedL(LLS1Parser.NamedLContext ctx) {
        String name = ctx.getText();
        BinaryLink link = new BinaryLink(name);
        mpei.bkm.model.lls1.terms.l.Named linkTerm = new mpei.bkm.model.lls1.terms.l.Named(link);
        namedLTerms.add(linkTerm);
        return linkTerm;
    }
    @Override public L visitBracketedL(LLS1Parser.BracketedLContext ctx) {
        return (L)(visit(ctx.l()));
    }
    @Override public mpei.bkm.model.lls1.terms.l.And visitAndL(LLS1Parser.AndLContext ctx) {
        L left = (L)(visit(ctx.l(0)));
        L right = (L)(visit(ctx.l(1)));
        mpei.bkm.model.lls1.terms.l.And k = new mpei.bkm.model.lls1.terms.l.And(left, right);
        expressions.add(k);
        return k;
    }
    @Override public mpei.bkm.model.lls1.terms.l.Or visitOrL(LLS1Parser.OrLContext ctx) {
        L left = (L)(visit(ctx.l(0)));
        L right = (L)(visit(ctx.l(1)));
        mpei.bkm.model.lls1.terms.l.Or k = new mpei.bkm.model.lls1.terms.l.Or(left, right);
        expressions.add(k);
        return k;
    }
    @Override public mpei.bkm.model.lls1.terms.l.Not visitNotL(LLS1Parser.NotLContext ctx) {
        L l = (L)visit(ctx.l());
        mpei.bkm.model.lls1.terms.l.Not k = new mpei.bkm.model.lls1.terms.l.Not(l);
        expressions.add(k);
        return k;
    }
    @Override public mpei.bkm.model.lls1.terms.l.Inv visitInvL(LLS1Parser.InvLContext ctx) {
        L l = (L)visit(ctx.l());
        mpei.bkm.model.lls1.terms.l.Inv k = new mpei.bkm.model.lls1.terms.l.Inv(l);
        expressions.add(k);
        return k;
    }
    @Override public mpei.bkm.model.lls1.terms.p.Not visitNotP(LLS1Parser.NotPContext ctx) {
        P p = (P)visit(ctx.p());
        mpei.bkm.model.lls1.terms.p.Not k = new mpei.bkm.model.lls1.terms.p.Not(p);
        expressions.add(k);
        return k;
    }
    @Override public mpei.bkm.model.lls1.terms.p.And visitAndP(LLS1Parser.AndPContext ctx) {
        P left = (P)(visit(ctx.p(0)));
        P right = (P)(visit(ctx.p(1)));
        mpei.bkm.model.lls1.terms.p.And k = new mpei.bkm.model.lls1.terms.p.And(left, right);
        expressions.add(k);
        return k;
    }
    @Override public mpei.bkm.model.lls1.terms.p.Or visitOrP(LLS1Parser.OrPContext ctx) {
        P left = (P)(visit(ctx.p(0)));
        P right = (P)(visit(ctx.p(1)));
        mpei.bkm.model.lls1.terms.p.Or k = new mpei.bkm.model.lls1.terms.p.Or(left, right);
        expressions.add(k);
        return k;
    }
    @Override public mpei.bkm.model.lls1.terms.p.Some visitSomeP(LLS1Parser.SomePContext ctx) {
        L l = (L)(visit(ctx.l()));
        C c = (C)(visit(ctx.c()));
        mpei.bkm.model.lls1.terms.p.Some k = new mpei.bkm.model.lls1.terms.p.Some(l, c);
        expressions.add(k);
        return k;
    }
    @Override public mpei.bkm.model.lls1.terms.p.Each visitEachP(LLS1Parser.EachPContext ctx) {
        L l = (L)(visit(ctx.l()));
        C c = (C)(visit(ctx.c()));
        mpei.bkm.model.lls1.terms.p.Each k = new mpei.bkm.model.lls1.terms.p.Each(l, c);
        expressions.add(k);
        return k;
    }
    @Override public mpei.bkm.model.lls1.terms.p.Only visitOnlyP(LLS1Parser.OnlyPContext ctx) {
        L l = (L)(visit(ctx.l()));
        C c = (C)(visit(ctx.c()));
        mpei.bkm.model.lls1.terms.p.Only k = new mpei.bkm.model.lls1.terms.p.Only(l, c);
        expressions.add(k);
        return k;
    }
    @Override public mpei.bkm.model.lls1.terms.p.PredicateVariable visitPredicateVariableP(LLS1Parser.PredicateVariablePContext ctx) {
        L l = (L)(visit(ctx.l()));
        String varName = ctx.variable().getText();
        mpei.bkm.model.lls1.terms.p.PredicateVariable k = new mpei.bkm.model.lls1.terms.p.PredicateVariable(l, varName);
        expressions.add(k);
        return k;
    }
    @Override public mpei.bkm.model.lls1.terms.p.SurrogateVariable visitSurrogateVariableP(LLS1Parser.SurrogateVariablePContext ctx) {
        L l = (L)(visit(ctx.l()));
        String surName = ctx.surrogate().getText();
        mpei.bkm.model.lls1.terms.p.SurrogateVariable k = new mpei.bkm.model.lls1.terms.p.SurrogateVariable(l, surName);
        expressions.add(k);
        return k;
    }
    @Override public P visitBracketedP(LLS1Parser.BracketedPContext ctx) {
        return (P)(visit(ctx.p()));
    }
    @Override public mpei.bkm.model.lls1.statement.Not visitNotStatement(LLS1Parser.NotStatementContext ctx) {
        Statement s = (Statement) visit(ctx.statement());
        mpei.bkm.model.lls1.statement.Not k = new mpei.bkm.model.lls1.statement.Not(s);
        expressions.add(k);
        return k;
    }
    @Override public mpei.bkm.model.lls1.statement.And visitAndStatement(LLS1Parser.AndStatementContext ctx) {
        Statement left = (Statement) visit(ctx.statement(0));
        Statement right = (Statement) visit(ctx.statement(1));
        mpei.bkm.model.lls1.statement.And k = new mpei.bkm.model.lls1.statement.And(left, right);
        expressions.add(k);
        return k;
    }
    @Override public mpei.bkm.model.lls1.statement.Or visitOrStatement(LLS1Parser.OrStatementContext ctx) {
        Statement left = (Statement) visit(ctx.statement(0));
        Statement right = (Statement) visit(ctx.statement(1));
        mpei.bkm.model.lls1.statement.Or k = new mpei.bkm.model.lls1.statement.Or(left, right);
        expressions.add(k);
        return k;
    }
    @Override public mpei.bkm.model.lls1.statement.Imp visitImpStatement(LLS1Parser.ImpStatementContext ctx) {
        Statement left = (Statement) visit(ctx.statement(0));
        Statement right = (Statement) visit(ctx.statement(1));
        mpei.bkm.model.lls1.statement.Imp k = new mpei.bkm.model.lls1.statement.Imp(left, right);
        expressions.add(k);
        return k;
    }
    @Override public mpei.bkm.model.lls1.statement.ExistC visitExistCStatement(LLS1Parser.ExistCStatementContext ctx) {
        C c = (C) visit(ctx.c());
        mpei.bkm.model.lls1.statement.ExistC k = new mpei.bkm.model.lls1.statement.ExistC(c);
        expressions.add(k);
        return k;
    }
    @Override public mpei.bkm.model.lls1.statement.ExistL visitExistLStatement(LLS1Parser.ExistLStatementContext ctx) {
        L l = (L) visit(ctx.l());
        mpei.bkm.model.lls1.statement.ExistL k = new mpei.bkm.model.lls1.statement.ExistL(l);
        expressions.add(k);
        return k;
    }
    @Override public mpei.bkm.model.lls1.statement.NullC visitNullCStatement(LLS1Parser.NullCStatementContext ctx) {
        C c = (C) visit(ctx.c());
        mpei.bkm.model.lls1.statement.NullC k = new mpei.bkm.model.lls1.statement.NullC(c);
        expressions.add(k);
        return k;
    }
    @Override public mpei.bkm.model.lls1.statement.NullL visitNullLStatement(LLS1Parser.NullLStatementContext ctx) {
        L l = (L) visit(ctx.l());
        mpei.bkm.model.lls1.statement.NullL k = new mpei.bkm.model.lls1.statement.NullL(l);
        expressions.add(k);
        return k;
    }
    @Override public mpei.bkm.model.lls1.statement.IsaC visitIsaCStatement(LLS1Parser.IsaCStatementContext ctx) {
        C sub = (C) visit(ctx.c(0));
        C sup = (C) visit(ctx.c(1));
        mpei.bkm.model.lls1.statement.IsaC k = new mpei.bkm.model.lls1.statement.IsaC(sub, sup);
        expressions.add(k);
        return k;
    }
    @Override public mpei.bkm.model.lls1.statement.IsaL visitIsaLStatement(LLS1Parser.IsaLStatementContext ctx) {
        L sup = (L) visit(ctx.l(0));
        L sub = (L) visit(ctx.l(1));
        mpei.bkm.model.lls1.statement.IsaL k = new mpei.bkm.model.lls1.statement.IsaL(sub, sup);
        expressions.add(k);
        return k;
    }
    @Override public mpei.bkm.model.lls1.statement.EqualC visitEqualsCStatement(LLS1Parser.EqualsCStatementContext ctx) {
        C left = (C) visit(ctx.c(0));
        C right = (C) visit(ctx.c(1));
        mpei.bkm.model.lls1.statement.EqualC k = new mpei.bkm.model.lls1.statement.EqualC(left, right);
        expressions.add(k);
        return k;
    }
    @Override public mpei.bkm.model.lls1.statement.EqualP visitEqualsPStatement(LLS1Parser.EqualsPStatementContext ctx) {
        P left = (P) visit(ctx.p(0));
        P right = (P) visit(ctx.p(1));
        mpei.bkm.model.lls1.statement.EqualP k = new mpei.bkm.model.lls1.statement.EqualP(left, right);
        expressions.add(k);
        return k;
    }
    @Override public mpei.bkm.model.lls1.statement.Not visitNotEqualsCStatement(LLS1Parser.NotEqualsCStatementContext ctx) {
        C left = (C) visit(ctx.c(0));
        C right = (C) visit(ctx.c(1));
        mpei.bkm.model.lls1.statement.EqualC e = new mpei.bkm.model.lls1.statement.EqualC(left, right);
        mpei.bkm.model.lls1.statement.Not k = new mpei.bkm.model.lls1.statement.Not(e);
        expressions.add(k);
        return k;
    }
    @Override public mpei.bkm.model.lls1.statement.EqualL visitEqualsLStatement(LLS1Parser.EqualsLStatementContext ctx) {
        L left = (L) visit(ctx.l(0));
        L right = (L) visit(ctx.l(1));
        mpei.bkm.model.lls1.statement.EqualL k = new mpei.bkm.model.lls1.statement.EqualL(left, right);
        expressions.add(k);
        return k;
    }
    @Override public mpei.bkm.model.lls1.statement.Not visitNotEqualsLStatement(LLS1Parser.NotEqualsLStatementContext ctx) {
        L left = (L) visit(ctx.l(0));
        L right = (L) visit(ctx.l(1));
        mpei.bkm.model.lls1.statement.EqualL e = new mpei.bkm.model.lls1.statement.EqualL(left, right);
        mpei.bkm.model.lls1.statement.Not k = new mpei.bkm.model.lls1.statement.Not(e);
        expressions.add(k);
        return k;
    }
    @Override public mpei.bkm.model.lls1.statement.Some visitSomeStatement(LLS1Parser.SomeStatementContext ctx) {
        C c = (C) visit(ctx.c());
        P p = (P) visit(ctx.p());
        mpei.bkm.model.lls1.statement.Some k = new mpei.bkm.model.lls1.statement.Some(c, p);
        expressions.add(k);
        return k;
    }
    @Override public mpei.bkm.model.lls1.statement.Each visitEachStatement(LLS1Parser.EachStatementContext ctx) {
        C c = (C) visit(ctx.c());
        P p = (P) visit(ctx.p());
        mpei.bkm.model.lls1.statement.Each k = new mpei.bkm.model.lls1.statement.Each(c, p);
        expressions.add(k);
        return k;
    }
    @Override public mpei.bkm.model.lls1.statement.Statement visitBracketedStatement(LLS1Parser.BracketedStatementContext ctx) {
        return (Statement)(visit(ctx.statement()));
    }
    @Override public String visitVariable(LLS1Parser.VariableContext ctx) {
        return ctx.getText();
    }
    @Override public String visitSurrogate(LLS1Parser.SurrogateContext ctx) {
        return ctx.getText();
    }

}
