// Generated from C:/bmd/bkm-lib/src/grammar\LLS1.g4 by ANTLR 4.6
package mpei.bkm.parsing.lls1.parsers;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class LLS1Parser extends Parser {
	static { RuntimeMetaData.checkVersion("4.6", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, Name=19, Comment=20, Space=21;
	public static final int
		RULE_statements = 0, RULE_c = 1, RULE_l = 2, RULE_p = 3, RULE_statement = 4, 
		RULE_variable = 5, RULE_surrogate = 6;
	public static final String[] ruleNames = {
		"statements", "c", "l", "p", "statement", "variable", "surrogate"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'.'", "'NOT'", "':'", "'AND'", "'OR'", "'THAT'", "'THOSE'", "'('", 
		"')'", "'INV'", "'SOME'", "'EACH'", "'ONLY'", "'IMP'", "'EXIST'", "'NULL'", 
		"'ISA'", "'='"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, "Name", "Comment", "Space"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "LLS1.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public LLS1Parser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class StatementsContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public StatementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statements; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LLS1Listener ) ((LLS1Listener)listener).enterStatements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LLS1Listener ) ((LLS1Listener)listener).exitStatements(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LLS1Visitor ) return ((LLS1Visitor<? extends T>)visitor).visitStatements(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementsContext statements() throws RecognitionException {
		StatementsContext _localctx = new StatementsContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_statements);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(17); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(14);
				statement(0);
				setState(15);
				match(T__0);
				}
				}
				setState(19); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__6) | (1L << T__7) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__14) | (1L << T__15) | (1L << Name))) != 0) );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CContext extends ParserRuleContext {
		public CContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_c; }
	 
		public CContext() { }
		public void copyFrom(CContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class BracketedCContext extends CContext {
		public CContext c() {
			return getRuleContext(CContext.class,0);
		}
		public BracketedCContext(CContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LLS1Listener ) ((LLS1Listener)listener).enterBracketedC(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LLS1Listener ) ((LLS1Listener)listener).exitBracketedC(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LLS1Visitor ) return ((LLS1Visitor<? extends T>)visitor).visitBracketedC(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AndCContext extends CContext {
		public List<CContext> c() {
			return getRuleContexts(CContext.class);
		}
		public CContext c(int i) {
			return getRuleContext(CContext.class,i);
		}
		public AndCContext(CContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LLS1Listener ) ((LLS1Listener)listener).enterAndC(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LLS1Listener ) ((LLS1Listener)listener).exitAndC(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LLS1Visitor ) return ((LLS1Visitor<? extends T>)visitor).visitAndC(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class OrCContext extends CContext {
		public List<CContext> c() {
			return getRuleContexts(CContext.class);
		}
		public CContext c(int i) {
			return getRuleContext(CContext.class,i);
		}
		public OrCContext(CContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LLS1Listener ) ((LLS1Listener)listener).enterOrC(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LLS1Listener ) ((LLS1Listener)listener).exitOrC(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LLS1Visitor ) return ((LLS1Visitor<? extends T>)visitor).visitOrC(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NotCContext extends CContext {
		public CContext c() {
			return getRuleContext(CContext.class,0);
		}
		public NotCContext(CContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LLS1Listener ) ((LLS1Listener)listener).enterNotC(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LLS1Listener ) ((LLS1Listener)listener).exitNotC(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LLS1Visitor ) return ((LLS1Visitor<? extends T>)visitor).visitNotC(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ConceptVariableCContext extends CContext {
		public CContext c() {
			return getRuleContext(CContext.class,0);
		}
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public ConceptVariableCContext(CContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LLS1Listener ) ((LLS1Listener)listener).enterConceptVariableC(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LLS1Listener ) ((LLS1Listener)listener).exitConceptVariableC(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LLS1Visitor ) return ((LLS1Visitor<? extends T>)visitor).visitConceptVariableC(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NamedCContext extends CContext {
		public TerminalNode Name() { return getToken(LLS1Parser.Name, 0); }
		public NamedCContext(CContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LLS1Listener ) ((LLS1Listener)listener).enterNamedC(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LLS1Listener ) ((LLS1Listener)listener).exitNamedC(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LLS1Visitor ) return ((LLS1Visitor<? extends T>)visitor).visitNamedC(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ThoseCContext extends CContext {
		public PContext p() {
			return getRuleContext(PContext.class,0);
		}
		public ThoseCContext(CContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LLS1Listener ) ((LLS1Listener)listener).enterThoseC(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LLS1Listener ) ((LLS1Listener)listener).exitThoseC(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LLS1Visitor ) return ((LLS1Visitor<? extends T>)visitor).visitThoseC(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ThatCContext extends CContext {
		public CContext c() {
			return getRuleContext(CContext.class,0);
		}
		public PContext p() {
			return getRuleContext(PContext.class,0);
		}
		public ThatCContext(CContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LLS1Listener ) ((LLS1Listener)listener).enterThatC(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LLS1Listener ) ((LLS1Listener)listener).exitThatC(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LLS1Visitor ) return ((LLS1Visitor<? extends T>)visitor).visitThatC(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CContext c() throws RecognitionException {
		return c(0);
	}

	private CContext c(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		CContext _localctx = new CContext(_ctx, _parentState);
		CContext _prevctx = _localctx;
		int _startState = 2;
		enterRecursionRule(_localctx, 2, RULE_c, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(31);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Name:
				{
				_localctx = new NamedCContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(22);
				match(Name);
				}
				break;
			case T__1:
				{
				_localctx = new NotCContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(23);
				match(T__1);
				setState(24);
				c(7);
				}
				break;
			case T__6:
				{
				_localctx = new ThoseCContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(25);
				match(T__6);
				setState(26);
				p(0);
				}
				break;
			case T__7:
				{
				_localctx = new BracketedCContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(27);
				match(T__7);
				setState(28);
				c(0);
				setState(29);
				match(T__8);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(47);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(45);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
					case 1:
						{
						_localctx = new AndCContext(new CContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_c);
						setState(33);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(34);
						match(T__3);
						setState(35);
						c(6);
						}
						break;
					case 2:
						{
						_localctx = new OrCContext(new CContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_c);
						setState(36);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(37);
						match(T__4);
						setState(38);
						c(5);
						}
						break;
					case 3:
						{
						_localctx = new ConceptVariableCContext(new CContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_c);
						setState(39);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(40);
						match(T__2);
						setState(41);
						variable();
						}
						break;
					case 4:
						{
						_localctx = new ThatCContext(new CContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_c);
						setState(42);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(43);
						match(T__5);
						setState(44);
						p(0);
						}
						break;
					}
					} 
				}
				setState(49);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class LContext extends ParserRuleContext {
		public LContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_l; }
	 
		public LContext() { }
		public void copyFrom(LContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class NamedLContext extends LContext {
		public TerminalNode Name() { return getToken(LLS1Parser.Name, 0); }
		public NamedLContext(LContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LLS1Listener ) ((LLS1Listener)listener).enterNamedL(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LLS1Listener ) ((LLS1Listener)listener).exitNamedL(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LLS1Visitor ) return ((LLS1Visitor<? extends T>)visitor).visitNamedL(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BracketedLContext extends LContext {
		public LContext l() {
			return getRuleContext(LContext.class,0);
		}
		public BracketedLContext(LContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LLS1Listener ) ((LLS1Listener)listener).enterBracketedL(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LLS1Listener ) ((LLS1Listener)listener).exitBracketedL(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LLS1Visitor ) return ((LLS1Visitor<? extends T>)visitor).visitBracketedL(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AndLContext extends LContext {
		public List<LContext> l() {
			return getRuleContexts(LContext.class);
		}
		public LContext l(int i) {
			return getRuleContext(LContext.class,i);
		}
		public AndLContext(LContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LLS1Listener ) ((LLS1Listener)listener).enterAndL(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LLS1Listener ) ((LLS1Listener)listener).exitAndL(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LLS1Visitor ) return ((LLS1Visitor<? extends T>)visitor).visitAndL(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class OrLContext extends LContext {
		public List<LContext> l() {
			return getRuleContexts(LContext.class);
		}
		public LContext l(int i) {
			return getRuleContext(LContext.class,i);
		}
		public OrLContext(LContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LLS1Listener ) ((LLS1Listener)listener).enterOrL(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LLS1Listener ) ((LLS1Listener)listener).exitOrL(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LLS1Visitor ) return ((LLS1Visitor<? extends T>)visitor).visitOrL(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NotLContext extends LContext {
		public LContext l() {
			return getRuleContext(LContext.class,0);
		}
		public NotLContext(LContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LLS1Listener ) ((LLS1Listener)listener).enterNotL(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LLS1Listener ) ((LLS1Listener)listener).exitNotL(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LLS1Visitor ) return ((LLS1Visitor<? extends T>)visitor).visitNotL(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class InvLContext extends LContext {
		public LContext l() {
			return getRuleContext(LContext.class,0);
		}
		public InvLContext(LContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LLS1Listener ) ((LLS1Listener)listener).enterInvL(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LLS1Listener ) ((LLS1Listener)listener).exitInvL(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LLS1Visitor ) return ((LLS1Visitor<? extends T>)visitor).visitInvL(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LContext l() throws RecognitionException {
		return l(0);
	}

	private LContext l(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		LContext _localctx = new LContext(_ctx, _parentState);
		LContext _prevctx = _localctx;
		int _startState = 4;
		enterRecursionRule(_localctx, 4, RULE_l, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(63);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Name:
				{
				_localctx = new NamedLContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(51);
				match(Name);
				}
				break;
			case T__1:
				{
				_localctx = new NotLContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(52);
				match(T__1);
				setState(53);
				l(5);
				}
				break;
			case T__9:
				{
				_localctx = new InvLContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(54);
				match(T__9);
				setState(55);
				match(T__7);
				setState(56);
				l(0);
				setState(57);
				match(T__8);
				}
				break;
			case T__7:
				{
				_localctx = new BracketedLContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(59);
				match(T__7);
				setState(60);
				l(0);
				setState(61);
				match(T__8);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(73);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(71);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
					case 1:
						{
						_localctx = new AndLContext(new LContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_l);
						setState(65);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(66);
						match(T__3);
						setState(67);
						l(5);
						}
						break;
					case 2:
						{
						_localctx = new OrLContext(new LContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_l);
						setState(68);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(69);
						match(T__4);
						setState(70);
						l(4);
						}
						break;
					}
					} 
				}
				setState(75);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class PContext extends ParserRuleContext {
		public PContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_p; }
	 
		public PContext() { }
		public void copyFrom(PContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class EachPContext extends PContext {
		public LContext l() {
			return getRuleContext(LContext.class,0);
		}
		public CContext c() {
			return getRuleContext(CContext.class,0);
		}
		public EachPContext(PContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LLS1Listener ) ((LLS1Listener)listener).enterEachP(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LLS1Listener ) ((LLS1Listener)listener).exitEachP(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LLS1Visitor ) return ((LLS1Visitor<? extends T>)visitor).visitEachP(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PredicateVariablePContext extends PContext {
		public LContext l() {
			return getRuleContext(LContext.class,0);
		}
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public PredicateVariablePContext(PContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LLS1Listener ) ((LLS1Listener)listener).enterPredicateVariableP(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LLS1Listener ) ((LLS1Listener)listener).exitPredicateVariableP(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LLS1Visitor ) return ((LLS1Visitor<? extends T>)visitor).visitPredicateVariableP(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SomePContext extends PContext {
		public LContext l() {
			return getRuleContext(LContext.class,0);
		}
		public CContext c() {
			return getRuleContext(CContext.class,0);
		}
		public SomePContext(PContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LLS1Listener ) ((LLS1Listener)listener).enterSomeP(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LLS1Listener ) ((LLS1Listener)listener).exitSomeP(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LLS1Visitor ) return ((LLS1Visitor<? extends T>)visitor).visitSomeP(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BracketedPContext extends PContext {
		public PContext p() {
			return getRuleContext(PContext.class,0);
		}
		public BracketedPContext(PContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LLS1Listener ) ((LLS1Listener)listener).enterBracketedP(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LLS1Listener ) ((LLS1Listener)listener).exitBracketedP(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LLS1Visitor ) return ((LLS1Visitor<? extends T>)visitor).visitBracketedP(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AndPContext extends PContext {
		public List<PContext> p() {
			return getRuleContexts(PContext.class);
		}
		public PContext p(int i) {
			return getRuleContext(PContext.class,i);
		}
		public AndPContext(PContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LLS1Listener ) ((LLS1Listener)listener).enterAndP(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LLS1Listener ) ((LLS1Listener)listener).exitAndP(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LLS1Visitor ) return ((LLS1Visitor<? extends T>)visitor).visitAndP(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SurrogateVariablePContext extends PContext {
		public LContext l() {
			return getRuleContext(LContext.class,0);
		}
		public SurrogateContext surrogate() {
			return getRuleContext(SurrogateContext.class,0);
		}
		public SurrogateVariablePContext(PContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LLS1Listener ) ((LLS1Listener)listener).enterSurrogateVariableP(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LLS1Listener ) ((LLS1Listener)listener).exitSurrogateVariableP(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LLS1Visitor ) return ((LLS1Visitor<? extends T>)visitor).visitSurrogateVariableP(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class OnlyPContext extends PContext {
		public LContext l() {
			return getRuleContext(LContext.class,0);
		}
		public CContext c() {
			return getRuleContext(CContext.class,0);
		}
		public OnlyPContext(PContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LLS1Listener ) ((LLS1Listener)listener).enterOnlyP(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LLS1Listener ) ((LLS1Listener)listener).exitOnlyP(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LLS1Visitor ) return ((LLS1Visitor<? extends T>)visitor).visitOnlyP(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class OrPContext extends PContext {
		public List<PContext> p() {
			return getRuleContexts(PContext.class);
		}
		public PContext p(int i) {
			return getRuleContext(PContext.class,i);
		}
		public OrPContext(PContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LLS1Listener ) ((LLS1Listener)listener).enterOrP(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LLS1Listener ) ((LLS1Listener)listener).exitOrP(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LLS1Visitor ) return ((LLS1Visitor<? extends T>)visitor).visitOrP(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NotPContext extends PContext {
		public PContext p() {
			return getRuleContext(PContext.class,0);
		}
		public NotPContext(PContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LLS1Listener ) ((LLS1Listener)listener).enterNotP(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LLS1Listener ) ((LLS1Listener)listener).exitNotP(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LLS1Visitor ) return ((LLS1Visitor<? extends T>)visitor).visitNotP(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PContext p() throws RecognitionException {
		return p(0);
	}

	private PContext p(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		PContext _localctx = new PContext(_ctx, _parentState);
		PContext _prevctx = _localctx;
		int _startState = 6;
		enterRecursionRule(_localctx, 6, RULE_p, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(105);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				{
				_localctx = new NotPContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(77);
				match(T__1);
				setState(78);
				p(9);
				}
				break;
			case 2:
				{
				_localctx = new SomePContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(79);
				l(0);
				setState(80);
				match(T__10);
				setState(81);
				c(0);
				}
				break;
			case 3:
				{
				_localctx = new EachPContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(83);
				l(0);
				setState(84);
				match(T__11);
				setState(85);
				c(0);
				}
				break;
			case 4:
				{
				_localctx = new OnlyPContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(87);
				l(0);
				setState(88);
				match(T__12);
				setState(89);
				c(0);
				}
				break;
			case 5:
				{
				_localctx = new PredicateVariablePContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(91);
				match(T__7);
				setState(92);
				l(0);
				setState(93);
				variable();
				setState(94);
				match(T__8);
				}
				break;
			case 6:
				{
				_localctx = new SurrogateVariablePContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(96);
				match(T__7);
				setState(97);
				l(0);
				setState(98);
				surrogate();
				setState(99);
				match(T__8);
				}
				break;
			case 7:
				{
				_localctx = new BracketedPContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(101);
				match(T__7);
				setState(102);
				p(0);
				setState(103);
				match(T__8);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(115);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(113);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
					case 1:
						{
						_localctx = new AndPContext(new PContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_p);
						setState(107);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(108);
						match(T__3);
						setState(109);
						p(9);
						}
						break;
					case 2:
						{
						_localctx = new OrPContext(new PContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_p);
						setState(110);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(111);
						match(T__4);
						setState(112);
						p(8);
						}
						break;
					}
					} 
				}
				setState(117);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class StatementContext extends ParserRuleContext {
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	 
		public StatementContext() { }
		public void copyFrom(StatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ImpStatementContext extends StatementContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public ImpStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LLS1Listener ) ((LLS1Listener)listener).enterImpStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LLS1Listener ) ((LLS1Listener)listener).exitImpStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LLS1Visitor ) return ((LLS1Visitor<? extends T>)visitor).visitImpStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class OrStatementContext extends StatementContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public OrStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LLS1Listener ) ((LLS1Listener)listener).enterOrStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LLS1Listener ) ((LLS1Listener)listener).exitOrStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LLS1Visitor ) return ((LLS1Visitor<? extends T>)visitor).visitOrStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class EqualsPStatementContext extends StatementContext {
		public List<PContext> p() {
			return getRuleContexts(PContext.class);
		}
		public PContext p(int i) {
			return getRuleContext(PContext.class,i);
		}
		public EqualsPStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LLS1Listener ) ((LLS1Listener)listener).enterEqualsPStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LLS1Listener ) ((LLS1Listener)listener).exitEqualsPStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LLS1Visitor ) return ((LLS1Visitor<? extends T>)visitor).visitEqualsPStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NullCStatementContext extends StatementContext {
		public CContext c() {
			return getRuleContext(CContext.class,0);
		}
		public NullCStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LLS1Listener ) ((LLS1Listener)listener).enterNullCStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LLS1Listener ) ((LLS1Listener)listener).exitNullCStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LLS1Visitor ) return ((LLS1Visitor<? extends T>)visitor).visitNullCStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class EqualsLStatementContext extends StatementContext {
		public List<LContext> l() {
			return getRuleContexts(LContext.class);
		}
		public LContext l(int i) {
			return getRuleContext(LContext.class,i);
		}
		public EqualsLStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LLS1Listener ) ((LLS1Listener)listener).enterEqualsLStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LLS1Listener ) ((LLS1Listener)listener).exitEqualsLStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LLS1Visitor ) return ((LLS1Visitor<? extends T>)visitor).visitEqualsLStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExistLStatementContext extends StatementContext {
		public LContext l() {
			return getRuleContext(LContext.class,0);
		}
		public ExistLStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LLS1Listener ) ((LLS1Listener)listener).enterExistLStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LLS1Listener ) ((LLS1Listener)listener).exitExistLStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LLS1Visitor ) return ((LLS1Visitor<? extends T>)visitor).visitExistLStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class EqualsCStatementContext extends StatementContext {
		public List<CContext> c() {
			return getRuleContexts(CContext.class);
		}
		public CContext c(int i) {
			return getRuleContext(CContext.class,i);
		}
		public EqualsCStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LLS1Listener ) ((LLS1Listener)listener).enterEqualsCStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LLS1Listener ) ((LLS1Listener)listener).exitEqualsCStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LLS1Visitor ) return ((LLS1Visitor<? extends T>)visitor).visitEqualsCStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NotEqualsCStatementContext extends StatementContext {
		public List<CContext> c() {
			return getRuleContexts(CContext.class);
		}
		public CContext c(int i) {
			return getRuleContext(CContext.class,i);
		}
		public NotEqualsCStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LLS1Listener ) ((LLS1Listener)listener).enterNotEqualsCStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LLS1Listener ) ((LLS1Listener)listener).exitNotEqualsCStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LLS1Visitor ) return ((LLS1Visitor<? extends T>)visitor).visitNotEqualsCStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NotStatementContext extends StatementContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public NotStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LLS1Listener ) ((LLS1Listener)listener).enterNotStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LLS1Listener ) ((LLS1Listener)listener).exitNotStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LLS1Visitor ) return ((LLS1Visitor<? extends T>)visitor).visitNotStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IsaLStatementContext extends StatementContext {
		public List<LContext> l() {
			return getRuleContexts(LContext.class);
		}
		public LContext l(int i) {
			return getRuleContext(LContext.class,i);
		}
		public IsaLStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LLS1Listener ) ((LLS1Listener)listener).enterIsaLStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LLS1Listener ) ((LLS1Listener)listener).exitIsaLStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LLS1Visitor ) return ((LLS1Visitor<? extends T>)visitor).visitIsaLStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NotEqualsLStatementContext extends StatementContext {
		public List<LContext> l() {
			return getRuleContexts(LContext.class);
		}
		public LContext l(int i) {
			return getRuleContext(LContext.class,i);
		}
		public NotEqualsLStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LLS1Listener ) ((LLS1Listener)listener).enterNotEqualsLStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LLS1Listener ) ((LLS1Listener)listener).exitNotEqualsLStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LLS1Visitor ) return ((LLS1Visitor<? extends T>)visitor).visitNotEqualsLStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AndStatementContext extends StatementContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public AndStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LLS1Listener ) ((LLS1Listener)listener).enterAndStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LLS1Listener ) ((LLS1Listener)listener).exitAndStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LLS1Visitor ) return ((LLS1Visitor<? extends T>)visitor).visitAndStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExistCStatementContext extends StatementContext {
		public CContext c() {
			return getRuleContext(CContext.class,0);
		}
		public ExistCStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LLS1Listener ) ((LLS1Listener)listener).enterExistCStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LLS1Listener ) ((LLS1Listener)listener).exitExistCStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LLS1Visitor ) return ((LLS1Visitor<? extends T>)visitor).visitExistCStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IsaCStatementContext extends StatementContext {
		public List<CContext> c() {
			return getRuleContexts(CContext.class);
		}
		public CContext c(int i) {
			return getRuleContext(CContext.class,i);
		}
		public IsaCStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LLS1Listener ) ((LLS1Listener)listener).enterIsaCStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LLS1Listener ) ((LLS1Listener)listener).exitIsaCStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LLS1Visitor ) return ((LLS1Visitor<? extends T>)visitor).visitIsaCStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NullLStatementContext extends StatementContext {
		public LContext l() {
			return getRuleContext(LContext.class,0);
		}
		public NullLStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LLS1Listener ) ((LLS1Listener)listener).enterNullLStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LLS1Listener ) ((LLS1Listener)listener).exitNullLStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LLS1Visitor ) return ((LLS1Visitor<? extends T>)visitor).visitNullLStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BracketedStatementContext extends StatementContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public BracketedStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LLS1Listener ) ((LLS1Listener)listener).enterBracketedStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LLS1Listener ) ((LLS1Listener)listener).exitBracketedStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LLS1Visitor ) return ((LLS1Visitor<? extends T>)visitor).visitBracketedStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SomeStatementContext extends StatementContext {
		public CContext c() {
			return getRuleContext(CContext.class,0);
		}
		public PContext p() {
			return getRuleContext(PContext.class,0);
		}
		public SomeStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LLS1Listener ) ((LLS1Listener)listener).enterSomeStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LLS1Listener ) ((LLS1Listener)listener).exitSomeStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LLS1Visitor ) return ((LLS1Visitor<? extends T>)visitor).visitSomeStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class EachStatementContext extends StatementContext {
		public CContext c() {
			return getRuleContext(CContext.class,0);
		}
		public PContext p() {
			return getRuleContext(PContext.class,0);
		}
		public EachStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LLS1Listener ) ((LLS1Listener)listener).enterEachStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LLS1Listener ) ((LLS1Listener)listener).exitEachStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LLS1Visitor ) return ((LLS1Visitor<? extends T>)visitor).visitEachStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		return statement(0);
	}

	private StatementContext statement(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		StatementContext _localctx = new StatementContext(_ctx, _parentState);
		StatementContext _prevctx = _localctx;
		int _startState = 8;
		enterRecursionRule(_localctx, 8, RULE_statement, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(171);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				{
				_localctx = new NotStatementContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(119);
				match(T__1);
				setState(120);
				statement(18);
				}
				break;
			case 2:
				{
				_localctx = new ExistCStatementContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(121);
				match(T__14);
				setState(122);
				c(0);
				}
				break;
			case 3:
				{
				_localctx = new ExistLStatementContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(123);
				match(T__14);
				setState(124);
				l(0);
				}
				break;
			case 4:
				{
				_localctx = new NullCStatementContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(125);
				match(T__15);
				setState(126);
				c(0);
				}
				break;
			case 5:
				{
				_localctx = new NullLStatementContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(127);
				match(T__15);
				setState(128);
				l(0);
				}
				break;
			case 6:
				{
				_localctx = new IsaCStatementContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(129);
				c(0);
				setState(130);
				match(T__16);
				setState(131);
				c(0);
				}
				break;
			case 7:
				{
				_localctx = new IsaLStatementContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(133);
				l(0);
				setState(134);
				match(T__16);
				setState(135);
				l(0);
				}
				break;
			case 8:
				{
				_localctx = new EqualsCStatementContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(137);
				c(0);
				setState(138);
				match(T__17);
				setState(139);
				c(0);
				}
				break;
			case 9:
				{
				_localctx = new EqualsLStatementContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(141);
				l(0);
				setState(142);
				match(T__17);
				setState(143);
				l(0);
				}
				break;
			case 10:
				{
				_localctx = new EqualsPStatementContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(145);
				p(0);
				setState(146);
				match(T__17);
				setState(147);
				p(0);
				}
				break;
			case 11:
				{
				_localctx = new NotEqualsCStatementContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(149);
				c(0);
				setState(150);
				match(T__17);
				setState(151);
				match(T__1);
				setState(152);
				c(0);
				}
				break;
			case 12:
				{
				_localctx = new NotEqualsLStatementContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(154);
				l(0);
				setState(155);
				match(T__17);
				setState(156);
				match(T__1);
				setState(157);
				l(0);
				}
				break;
			case 13:
				{
				_localctx = new EachStatementContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(159);
				match(T__11);
				setState(160);
				c(0);
				setState(161);
				p(0);
				}
				break;
			case 14:
				{
				_localctx = new SomeStatementContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(163);
				match(T__10);
				setState(164);
				c(0);
				setState(165);
				p(0);
				}
				break;
			case 15:
				{
				_localctx = new BracketedStatementContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(167);
				match(T__7);
				setState(168);
				statement(0);
				setState(169);
				match(T__8);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(184);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(182);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
					case 1:
						{
						_localctx = new AndStatementContext(new StatementContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_statement);
						setState(173);
						if (!(precpred(_ctx, 17))) throw new FailedPredicateException(this, "precpred(_ctx, 17)");
						setState(174);
						match(T__3);
						setState(175);
						statement(18);
						}
						break;
					case 2:
						{
						_localctx = new OrStatementContext(new StatementContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_statement);
						setState(176);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(177);
						match(T__4);
						setState(178);
						statement(17);
						}
						break;
					case 3:
						{
						_localctx = new ImpStatementContext(new StatementContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_statement);
						setState(179);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(180);
						match(T__13);
						setState(181);
						statement(16);
						}
						break;
					}
					} 
				}
				setState(186);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class VariableContext extends ParserRuleContext {
		public TerminalNode Name() { return getToken(LLS1Parser.Name, 0); }
		public VariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LLS1Listener ) ((LLS1Listener)listener).enterVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LLS1Listener ) ((LLS1Listener)listener).exitVariable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LLS1Visitor ) return ((LLS1Visitor<? extends T>)visitor).visitVariable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableContext variable() throws RecognitionException {
		VariableContext _localctx = new VariableContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_variable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(187);
			match(Name);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SurrogateContext extends ParserRuleContext {
		public TerminalNode Name() { return getToken(LLS1Parser.Name, 0); }
		public SurrogateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_surrogate; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LLS1Listener ) ((LLS1Listener)listener).enterSurrogate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LLS1Listener ) ((LLS1Listener)listener).exitSurrogate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LLS1Visitor ) return ((LLS1Visitor<? extends T>)visitor).visitSurrogate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SurrogateContext surrogate() throws RecognitionException {
		SurrogateContext _localctx = new SurrogateContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_surrogate);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(189);
			match(Name);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 1:
			return c_sempred((CContext)_localctx, predIndex);
		case 2:
			return l_sempred((LContext)_localctx, predIndex);
		case 3:
			return p_sempred((PContext)_localctx, predIndex);
		case 4:
			return statement_sempred((StatementContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean c_sempred(CContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 5);
		case 1:
			return precpred(_ctx, 4);
		case 2:
			return precpred(_ctx, 6);
		case 3:
			return precpred(_ctx, 3);
		}
		return true;
	}
	private boolean l_sempred(LContext _localctx, int predIndex) {
		switch (predIndex) {
		case 4:
			return precpred(_ctx, 4);
		case 5:
			return precpred(_ctx, 3);
		}
		return true;
	}
	private boolean p_sempred(PContext _localctx, int predIndex) {
		switch (predIndex) {
		case 6:
			return precpred(_ctx, 8);
		case 7:
			return precpred(_ctx, 7);
		}
		return true;
	}
	private boolean statement_sempred(StatementContext _localctx, int predIndex) {
		switch (predIndex) {
		case 8:
			return precpred(_ctx, 17);
		case 9:
			return precpred(_ctx, 16);
		case 10:
			return precpred(_ctx, 15);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\27\u00c2\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\3\2\3\2\3\2\6\2\24\n"+
		"\2\r\2\16\2\25\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3\"\n\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\7\3\60\n\3\f\3\16\3\63\13\3"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4B\n\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\7\4J\n\4\f\4\16\4M\13\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\5\5l\n\5\3\5\3\5\3\5\3\5\3\5\3\5\7\5t\n\5\f\5\16\5w\13"+
		"\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\5\6\u00ae\n\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\7\6\u00b9\n\6\f"+
		"\6\16\6\u00bc\13\6\3\7\3\7\3\b\3\b\3\b\2\6\4\6\b\n\t\2\4\6\b\n\f\16\2"+
		"\2\u00e0\2\23\3\2\2\2\4!\3\2\2\2\6A\3\2\2\2\bk\3\2\2\2\n\u00ad\3\2\2\2"+
		"\f\u00bd\3\2\2\2\16\u00bf\3\2\2\2\20\21\5\n\6\2\21\22\7\3\2\2\22\24\3"+
		"\2\2\2\23\20\3\2\2\2\24\25\3\2\2\2\25\23\3\2\2\2\25\26\3\2\2\2\26\3\3"+
		"\2\2\2\27\30\b\3\1\2\30\"\7\25\2\2\31\32\7\4\2\2\32\"\5\4\3\t\33\34\7"+
		"\t\2\2\34\"\5\b\5\2\35\36\7\n\2\2\36\37\5\4\3\2\37 \7\13\2\2 \"\3\2\2"+
		"\2!\27\3\2\2\2!\31\3\2\2\2!\33\3\2\2\2!\35\3\2\2\2\"\61\3\2\2\2#$\f\7"+
		"\2\2$%\7\6\2\2%\60\5\4\3\b&\'\f\6\2\2\'(\7\7\2\2(\60\5\4\3\7)*\f\b\2\2"+
		"*+\7\5\2\2+\60\5\f\7\2,-\f\5\2\2-.\7\b\2\2.\60\5\b\5\2/#\3\2\2\2/&\3\2"+
		"\2\2/)\3\2\2\2/,\3\2\2\2\60\63\3\2\2\2\61/\3\2\2\2\61\62\3\2\2\2\62\5"+
		"\3\2\2\2\63\61\3\2\2\2\64\65\b\4\1\2\65B\7\25\2\2\66\67\7\4\2\2\67B\5"+
		"\6\4\789\7\f\2\29:\7\n\2\2:;\5\6\4\2;<\7\13\2\2<B\3\2\2\2=>\7\n\2\2>?"+
		"\5\6\4\2?@\7\13\2\2@B\3\2\2\2A\64\3\2\2\2A\66\3\2\2\2A8\3\2\2\2A=\3\2"+
		"\2\2BK\3\2\2\2CD\f\6\2\2DE\7\6\2\2EJ\5\6\4\7FG\f\5\2\2GH\7\7\2\2HJ\5\6"+
		"\4\6IC\3\2\2\2IF\3\2\2\2JM\3\2\2\2KI\3\2\2\2KL\3\2\2\2L\7\3\2\2\2MK\3"+
		"\2\2\2NO\b\5\1\2OP\7\4\2\2Pl\5\b\5\13QR\5\6\4\2RS\7\r\2\2ST\5\4\3\2Tl"+
		"\3\2\2\2UV\5\6\4\2VW\7\16\2\2WX\5\4\3\2Xl\3\2\2\2YZ\5\6\4\2Z[\7\17\2\2"+
		"[\\\5\4\3\2\\l\3\2\2\2]^\7\n\2\2^_\5\6\4\2_`\5\f\7\2`a\7\13\2\2al\3\2"+
		"\2\2bc\7\n\2\2cd\5\6\4\2de\5\16\b\2ef\7\13\2\2fl\3\2\2\2gh\7\n\2\2hi\5"+
		"\b\5\2ij\7\13\2\2jl\3\2\2\2kN\3\2\2\2kQ\3\2\2\2kU\3\2\2\2kY\3\2\2\2k]"+
		"\3\2\2\2kb\3\2\2\2kg\3\2\2\2lu\3\2\2\2mn\f\n\2\2no\7\6\2\2ot\5\b\5\13"+
		"pq\f\t\2\2qr\7\7\2\2rt\5\b\5\nsm\3\2\2\2sp\3\2\2\2tw\3\2\2\2us\3\2\2\2"+
		"uv\3\2\2\2v\t\3\2\2\2wu\3\2\2\2xy\b\6\1\2yz\7\4\2\2z\u00ae\5\n\6\24{|"+
		"\7\21\2\2|\u00ae\5\4\3\2}~\7\21\2\2~\u00ae\5\6\4\2\177\u0080\7\22\2\2"+
		"\u0080\u00ae\5\4\3\2\u0081\u0082\7\22\2\2\u0082\u00ae\5\6\4\2\u0083\u0084"+
		"\5\4\3\2\u0084\u0085\7\23\2\2\u0085\u0086\5\4\3\2\u0086\u00ae\3\2\2\2"+
		"\u0087\u0088\5\6\4\2\u0088\u0089\7\23\2\2\u0089\u008a\5\6\4\2\u008a\u00ae"+
		"\3\2\2\2\u008b\u008c\5\4\3\2\u008c\u008d\7\24\2\2\u008d\u008e\5\4\3\2"+
		"\u008e\u00ae\3\2\2\2\u008f\u0090\5\6\4\2\u0090\u0091\7\24\2\2\u0091\u0092"+
		"\5\6\4\2\u0092\u00ae\3\2\2\2\u0093\u0094\5\b\5\2\u0094\u0095\7\24\2\2"+
		"\u0095\u0096\5\b\5\2\u0096\u00ae\3\2\2\2\u0097\u0098\5\4\3\2\u0098\u0099"+
		"\7\24\2\2\u0099\u009a\7\4\2\2\u009a\u009b\5\4\3\2\u009b\u00ae\3\2\2\2"+
		"\u009c\u009d\5\6\4\2\u009d\u009e\7\24\2\2\u009e\u009f\7\4\2\2\u009f\u00a0"+
		"\5\6\4\2\u00a0\u00ae\3\2\2\2\u00a1\u00a2\7\16\2\2\u00a2\u00a3\5\4\3\2"+
		"\u00a3\u00a4\5\b\5\2\u00a4\u00ae\3\2\2\2\u00a5\u00a6\7\r\2\2\u00a6\u00a7"+
		"\5\4\3\2\u00a7\u00a8\5\b\5\2\u00a8\u00ae\3\2\2\2\u00a9\u00aa\7\n\2\2\u00aa"+
		"\u00ab\5\n\6\2\u00ab\u00ac\7\13\2\2\u00ac\u00ae\3\2\2\2\u00adx\3\2\2\2"+
		"\u00ad{\3\2\2\2\u00ad}\3\2\2\2\u00ad\177\3\2\2\2\u00ad\u0081\3\2\2\2\u00ad"+
		"\u0083\3\2\2\2\u00ad\u0087\3\2\2\2\u00ad\u008b\3\2\2\2\u00ad\u008f\3\2"+
		"\2\2\u00ad\u0093\3\2\2\2\u00ad\u0097\3\2\2\2\u00ad\u009c\3\2\2\2\u00ad"+
		"\u00a1\3\2\2\2\u00ad\u00a5\3\2\2\2\u00ad\u00a9\3\2\2\2\u00ae\u00ba\3\2"+
		"\2\2\u00af\u00b0\f\23\2\2\u00b0\u00b1\7\6\2\2\u00b1\u00b9\5\n\6\24\u00b2"+
		"\u00b3\f\22\2\2\u00b3\u00b4\7\7\2\2\u00b4\u00b9\5\n\6\23\u00b5\u00b6\f"+
		"\21\2\2\u00b6\u00b7\7\20\2\2\u00b7\u00b9\5\n\6\22\u00b8\u00af\3\2\2\2"+
		"\u00b8\u00b2\3\2\2\2\u00b8\u00b5\3\2\2\2\u00b9\u00bc\3\2\2\2\u00ba\u00b8"+
		"\3\2\2\2\u00ba\u00bb\3\2\2\2\u00bb\13\3\2\2\2\u00bc\u00ba\3\2\2\2\u00bd"+
		"\u00be\7\25\2\2\u00be\r\3\2\2\2\u00bf\u00c0\7\25\2\2\u00c0\17\3\2\2\2"+
		"\17\25!/\61AIKksu\u00ad\u00b8\u00ba";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}