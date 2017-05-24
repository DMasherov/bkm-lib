package mpei.bkm.parsing.ls.parsers;// Generated from C:/bmd/bkm-lib/src/grammar\LS.g4 by ANTLR 4.6
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class LSParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.6", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, T__37=38, 
		Range=39, Int=40, Float=41, Name=42, EQ=43, NOTEQ=44, LT=45, LE=46, GT=47, 
		GE=48, QuotedString=49, Comment=50, Space=51;
	public static final int
		RULE_ontology = 0, RULE_sentence = 1, RULE_declaration = 2, RULE_logicalSentence = 3, 
		RULE_statement = 4, RULE_existence = 5, RULE_exist = 6, RULE_notExist = 7, 
		RULE_isa = 8, RULE_equality = 9, RULE_quantifier = 10, RULE_c = 11, RULE_l = 12, 
		RULE_p = 13, RULE_classDeclaration = 14, RULE_binaryLinkDeclaration = 15, 
		RULE_attributes = 16, RULE_attribute = 17, RULE_dataTypeAttribute = 18, 
		RULE_conceptAttribute = 19, RULE_classAttributeConstraint = 20, RULE_intervalRestriction = 21, 
		RULE_fullIntervalRestriction = 22, RULE_contractedIntervalRestriction = 23, 
		RULE_atomRestriction = 24, RULE_dataType = 25, RULE_primitiveType = 26, 
		RULE_rangeDataType = 27, RULE_labeledDataType = 28, RULE_conceptType = 29, 
		RULE_attributeConstraints = 30, RULE_constraint = 31, RULE_selector = 32, 
		RULE_className = 33, RULE_binaryLinkName = 34, RULE_attributeValue = 35, 
		RULE_definedTypeName = 36, RULE_variable = 37, RULE_surrogate = 38, RULE_binaryOperator = 39, 
		RULE_dataValue = 40, RULE_trueorfalse = 41, RULE_number = 42, RULE_string = 43;
	public static final String[] ruleNames = {
		"ontology", "sentence", "declaration", "logicalSentence", "statement", 
		"existence", "exist", "notExist", "isa", "equality", "quantifier", "c", 
		"l", "p", "classDeclaration", "binaryLinkDeclaration", "attributes", "attribute", 
		"dataTypeAttribute", "conceptAttribute", "classAttributeConstraint", "intervalRestriction", 
		"fullIntervalRestriction", "contractedIntervalRestriction", "atomRestriction", 
		"dataType", "primitiveType", "rangeDataType", "labeledDataType", "conceptType", 
		"attributeConstraints", "constraint", "selector", "className", "binaryLinkName", 
		"attributeValue", "definedTypeName", "variable", "surrogate", "binaryOperator", 
		"dataValue", "trueorfalse", "number", "string"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'SCHEME'", "':'", "'.'", "'END'", "'NOT'", "'AND'", "'OR'", "'IMP'", 
		"'('", "')'", "'EXIST'", "'NULL'", "'ISA'", "'EACH'", "'SOME'", "'THAT'", 
		"'THOSE'", "'INV'", "'ONLY'", "'['", "']'", "','", "'->'", "'*'", "'|'", 
		"'{'", "'}'", "'LIST'", "'LLIST'", "'Boolean'", "'Number'", "'Integer'", 
		"'Char'", "'String'", "';'", "'#'", "'TRUE'", "'FALSE'", null, null, null, 
		null, "'='", "'=/='", "'<'", "'<='", "'>'", "'>='"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, "Range", "Int", "Float", "Name", "EQ", "NOTEQ", "LT", 
		"LE", "GT", "GE", "QuotedString", "Comment", "Space"
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
	public String getGrammarFileName() { return "LS.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public LSParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class OntologyContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(LSParser.EOF, 0); }
		public TerminalNode Name() { return getToken(LSParser.Name, 0); }
		public List<SentenceContext> sentence() {
			return getRuleContexts(SentenceContext.class);
		}
		public SentenceContext sentence(int i) {
			return getRuleContext(SentenceContext.class,i);
		}
		public OntologyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ontology; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LSListener ) ((LSListener)listener).enterOntology(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LSListener ) ((LSListener)listener).exitOntology(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LSVisitor ) return ((LSVisitor<? extends T>)visitor).visitOntology(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OntologyContext ontology() throws RecognitionException {
		OntologyContext _localctx = new OntologyContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_ontology);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(107);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
				{
				setState(88);
				match(T__0);
				setState(89);
				match(Name);
				setState(90);
				match(T__1);
				setState(94); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(91);
					sentence();
					setState(92);
					match(T__2);
					}
					}
					setState(96); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__8) | (1L << T__10) | (1L << T__11) | (1L << T__13) | (1L << T__14) | (1L << T__16) | (1L << T__17) | (1L << Name))) != 0) );
				setState(98);
				match(T__3);
				}
				break;
			case T__4:
			case T__8:
			case T__10:
			case T__11:
			case T__13:
			case T__14:
			case T__16:
			case T__17:
			case Name:
				{
				setState(103); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(100);
					sentence();
					setState(101);
					match(T__2);
					}
					}
					setState(105); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__8) | (1L << T__10) | (1L << T__11) | (1L << T__13) | (1L << T__14) | (1L << T__16) | (1L << T__17) | (1L << Name))) != 0) );
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(109);
			match(EOF);
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

	public static class SentenceContext extends ParserRuleContext {
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public LogicalSentenceContext logicalSentence() {
			return getRuleContext(LogicalSentenceContext.class,0);
		}
		public SentenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sentence; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LSListener ) ((LSListener)listener).enterSentence(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LSListener ) ((LSListener)listener).exitSentence(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LSVisitor ) return ((LSVisitor<? extends T>)visitor).visitSentence(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SentenceContext sentence() throws RecognitionException {
		SentenceContext _localctx = new SentenceContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_sentence);
		try {
			setState(113);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(111);
				declaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(112);
				logicalSentence(0);
				}
				break;
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

	public static class DeclarationContext extends ParserRuleContext {
		public ClassDeclarationContext classDeclaration() {
			return getRuleContext(ClassDeclarationContext.class,0);
		}
		public BinaryLinkDeclarationContext binaryLinkDeclaration() {
			return getRuleContext(BinaryLinkDeclarationContext.class,0);
		}
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LSListener ) ((LSListener)listener).enterDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LSListener ) ((LSListener)listener).exitDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LSVisitor ) return ((LSVisitor<? extends T>)visitor).visitDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_declaration);
		try {
			setState(117);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Name:
				enterOuterAlt(_localctx, 1);
				{
				setState(115);
				classDeclaration();
				}
				break;
			case T__8:
				enterOuterAlt(_localctx, 2);
				{
				setState(116);
				binaryLinkDeclaration();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class LogicalSentenceContext extends ParserRuleContext {
		public LogicalSentenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logicalSentence; }
	 
		public LogicalSentenceContext() { }
		public void copyFrom(LogicalSentenceContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class AndSentenceContext extends LogicalSentenceContext {
		public List<LogicalSentenceContext> logicalSentence() {
			return getRuleContexts(LogicalSentenceContext.class);
		}
		public LogicalSentenceContext logicalSentence(int i) {
			return getRuleContext(LogicalSentenceContext.class,i);
		}
		public AndSentenceContext(LogicalSentenceContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LSListener ) ((LSListener)listener).enterAndSentence(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LSListener ) ((LSListener)listener).exitAndSentence(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LSVisitor ) return ((LSVisitor<? extends T>)visitor).visitAndSentence(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class OrSentenceContext extends LogicalSentenceContext {
		public List<LogicalSentenceContext> logicalSentence() {
			return getRuleContexts(LogicalSentenceContext.class);
		}
		public LogicalSentenceContext logicalSentence(int i) {
			return getRuleContext(LogicalSentenceContext.class,i);
		}
		public OrSentenceContext(LogicalSentenceContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LSListener ) ((LSListener)listener).enterOrSentence(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LSListener ) ((LSListener)listener).exitOrSentence(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LSVisitor ) return ((LSVisitor<? extends T>)visitor).visitOrSentence(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NotSentenceContext extends LogicalSentenceContext {
		public LogicalSentenceContext logicalSentence() {
			return getRuleContext(LogicalSentenceContext.class,0);
		}
		public NotSentenceContext(LogicalSentenceContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LSListener ) ((LSListener)listener).enterNotSentence(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LSListener ) ((LSListener)listener).exitNotSentence(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LSVisitor ) return ((LSVisitor<? extends T>)visitor).visitNotSentence(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BracketedStatementContext extends LogicalSentenceContext {
		public LogicalSentenceContext logicalSentence() {
			return getRuleContext(LogicalSentenceContext.class,0);
		}
		public BracketedStatementContext(LogicalSentenceContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LSListener ) ((LSListener)listener).enterBracketedStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LSListener ) ((LSListener)listener).exitBracketedStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LSVisitor ) return ((LSVisitor<? extends T>)visitor).visitBracketedStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class JustStatementContext extends LogicalSentenceContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public JustStatementContext(LogicalSentenceContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LSListener ) ((LSListener)listener).enterJustStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LSListener ) ((LSListener)listener).exitJustStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LSVisitor ) return ((LSVisitor<? extends T>)visitor).visitJustStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ImpSentenceContext extends LogicalSentenceContext {
		public List<LogicalSentenceContext> logicalSentence() {
			return getRuleContexts(LogicalSentenceContext.class);
		}
		public LogicalSentenceContext logicalSentence(int i) {
			return getRuleContext(LogicalSentenceContext.class,i);
		}
		public ImpSentenceContext(LogicalSentenceContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LSListener ) ((LSListener)listener).enterImpSentence(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LSListener ) ((LSListener)listener).exitImpSentence(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LSVisitor ) return ((LSVisitor<? extends T>)visitor).visitImpSentence(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LogicalSentenceContext logicalSentence() throws RecognitionException {
		return logicalSentence(0);
	}

	private LogicalSentenceContext logicalSentence(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		LogicalSentenceContext _localctx = new LogicalSentenceContext(_ctx, _parentState);
		LogicalSentenceContext _prevctx = _localctx;
		int _startState = 6;
		enterRecursionRule(_localctx, 6, RULE_logicalSentence, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(127);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				{
				_localctx = new NotSentenceContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(120);
				match(T__4);
				setState(121);
				logicalSentence(6);
				}
				break;
			case 2:
				{
				_localctx = new JustStatementContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(122);
				statement();
				}
				break;
			case 3:
				{
				_localctx = new BracketedStatementContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(123);
				match(T__8);
				setState(124);
				logicalSentence(0);
				setState(125);
				match(T__9);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(140);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(138);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
					case 1:
						{
						_localctx = new AndSentenceContext(new LogicalSentenceContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_logicalSentence);
						setState(129);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(130);
						match(T__5);
						setState(131);
						logicalSentence(6);
						}
						break;
					case 2:
						{
						_localctx = new OrSentenceContext(new LogicalSentenceContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_logicalSentence);
						setState(132);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(133);
						match(T__6);
						setState(134);
						logicalSentence(5);
						}
						break;
					case 3:
						{
						_localctx = new ImpSentenceContext(new LogicalSentenceContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_logicalSentence);
						setState(135);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(136);
						match(T__7);
						setState(137);
						logicalSentence(4);
						}
						break;
					}
					} 
				}
				setState(142);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
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
		public ExistenceContext existence() {
			return getRuleContext(ExistenceContext.class,0);
		}
		public IsaContext isa() {
			return getRuleContext(IsaContext.class,0);
		}
		public EqualityContext equality() {
			return getRuleContext(EqualityContext.class,0);
		}
		public QuantifierContext quantifier() {
			return getRuleContext(QuantifierContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LSListener ) ((LSListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LSListener ) ((LSListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LSVisitor ) return ((LSVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_statement);
		try {
			setState(147);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(143);
				existence();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(144);
				isa();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(145);
				equality();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(146);
				quantifier();
				}
				break;
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

	public static class ExistenceContext extends ParserRuleContext {
		public ExistContext exist() {
			return getRuleContext(ExistContext.class,0);
		}
		public NotExistContext notExist() {
			return getRuleContext(NotExistContext.class,0);
		}
		public ExistenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_existence; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LSListener ) ((LSListener)listener).enterExistence(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LSListener ) ((LSListener)listener).exitExistence(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LSVisitor ) return ((LSVisitor<? extends T>)visitor).visitExistence(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExistenceContext existence() throws RecognitionException {
		ExistenceContext _localctx = new ExistenceContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_existence);
		try {
			setState(151);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__10:
				enterOuterAlt(_localctx, 1);
				{
				setState(149);
				exist();
				}
				break;
			case T__11:
				enterOuterAlt(_localctx, 2);
				{
				setState(150);
				notExist();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class ExistContext extends ParserRuleContext {
		public CContext c() {
			return getRuleContext(CContext.class,0);
		}
		public LContext l() {
			return getRuleContext(LContext.class,0);
		}
		public ExistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LSListener ) ((LSListener)listener).enterExist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LSListener ) ((LSListener)listener).exitExist(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LSVisitor ) return ((LSVisitor<? extends T>)visitor).visitExist(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExistContext exist() throws RecognitionException {
		ExistContext _localctx = new ExistContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_exist);
		try {
			setState(157);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(153);
				match(T__10);
				setState(154);
				c(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(155);
				match(T__10);
				setState(156);
				l(0);
				}
				break;
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

	public static class NotExistContext extends ParserRuleContext {
		public CContext c() {
			return getRuleContext(CContext.class,0);
		}
		public LContext l() {
			return getRuleContext(LContext.class,0);
		}
		public NotExistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_notExist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LSListener ) ((LSListener)listener).enterNotExist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LSListener ) ((LSListener)listener).exitNotExist(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LSVisitor ) return ((LSVisitor<? extends T>)visitor).visitNotExist(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NotExistContext notExist() throws RecognitionException {
		NotExistContext _localctx = new NotExistContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_notExist);
		try {
			setState(163);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(159);
				match(T__11);
				setState(160);
				c(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(161);
				match(T__11);
				setState(162);
				l(0);
				}
				break;
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

	public static class IsaContext extends ParserRuleContext {
		public List<CContext> c() {
			return getRuleContexts(CContext.class);
		}
		public CContext c(int i) {
			return getRuleContext(CContext.class,i);
		}
		public List<LContext> l() {
			return getRuleContexts(LContext.class);
		}
		public LContext l(int i) {
			return getRuleContext(LContext.class,i);
		}
		public IsaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_isa; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LSListener ) ((LSListener)listener).enterIsa(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LSListener ) ((LSListener)listener).exitIsa(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LSVisitor ) return ((LSVisitor<? extends T>)visitor).visitIsa(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IsaContext isa() throws RecognitionException {
		IsaContext _localctx = new IsaContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_isa);
		try {
			setState(173);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(165);
				c(0);
				setState(166);
				match(T__12);
				setState(167);
				c(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(169);
				l(0);
				setState(170);
				match(T__12);
				setState(171);
				l(0);
				}
				break;
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

	public static class EqualityContext extends ParserRuleContext {
		public EqualityContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_equality; }
	 
		public EqualityContext() { }
		public void copyFrom(EqualityContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class EqualsCStatementContext extends EqualityContext {
		public List<CContext> c() {
			return getRuleContexts(CContext.class);
		}
		public CContext c(int i) {
			return getRuleContext(CContext.class,i);
		}
		public EqualsCStatementContext(EqualityContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LSListener ) ((LSListener)listener).enterEqualsCStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LSListener ) ((LSListener)listener).exitEqualsCStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LSVisitor ) return ((LSVisitor<? extends T>)visitor).visitEqualsCStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NotEqualsCStatementContext extends EqualityContext {
		public List<CContext> c() {
			return getRuleContexts(CContext.class);
		}
		public CContext c(int i) {
			return getRuleContext(CContext.class,i);
		}
		public NotEqualsCStatementContext(EqualityContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LSListener ) ((LSListener)listener).enterNotEqualsCStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LSListener ) ((LSListener)listener).exitNotEqualsCStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LSVisitor ) return ((LSVisitor<? extends T>)visitor).visitNotEqualsCStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NotEqualsLStatementContext extends EqualityContext {
		public List<LContext> l() {
			return getRuleContexts(LContext.class);
		}
		public LContext l(int i) {
			return getRuleContext(LContext.class,i);
		}
		public NotEqualsLStatementContext(EqualityContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LSListener ) ((LSListener)listener).enterNotEqualsLStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LSListener ) ((LSListener)listener).exitNotEqualsLStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LSVisitor ) return ((LSVisitor<? extends T>)visitor).visitNotEqualsLStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class EqualsPStatementContext extends EqualityContext {
		public List<PContext> p() {
			return getRuleContexts(PContext.class);
		}
		public PContext p(int i) {
			return getRuleContext(PContext.class,i);
		}
		public EqualsPStatementContext(EqualityContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LSListener ) ((LSListener)listener).enterEqualsPStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LSListener ) ((LSListener)listener).exitEqualsPStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LSVisitor ) return ((LSVisitor<? extends T>)visitor).visitEqualsPStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class EqualsLStatementContext extends EqualityContext {
		public List<LContext> l() {
			return getRuleContexts(LContext.class);
		}
		public LContext l(int i) {
			return getRuleContext(LContext.class,i);
		}
		public EqualsLStatementContext(EqualityContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LSListener ) ((LSListener)listener).enterEqualsLStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LSListener ) ((LSListener)listener).exitEqualsLStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LSVisitor ) return ((LSVisitor<? extends T>)visitor).visitEqualsLStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EqualityContext equality() throws RecognitionException {
		EqualityContext _localctx = new EqualityContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_equality);
		try {
			setState(197);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				_localctx = new EqualsCStatementContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(175);
				c(0);
				setState(176);
				match(EQ);
				setState(177);
				c(0);
				}
				break;
			case 2:
				_localctx = new EqualsLStatementContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(179);
				l(0);
				setState(180);
				match(EQ);
				setState(181);
				l(0);
				}
				break;
			case 3:
				_localctx = new EqualsPStatementContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(183);
				p(0);
				setState(184);
				match(EQ);
				setState(185);
				p(0);
				}
				break;
			case 4:
				_localctx = new NotEqualsCStatementContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(187);
				c(0);
				setState(188);
				match(EQ);
				setState(189);
				match(T__4);
				setState(190);
				c(0);
				}
				break;
			case 5:
				_localctx = new NotEqualsLStatementContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(192);
				l(0);
				setState(193);
				match(EQ);
				setState(194);
				match(T__4);
				setState(195);
				l(0);
				}
				break;
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

	public static class QuantifierContext extends ParserRuleContext {
		public QuantifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_quantifier; }
	 
		public QuantifierContext() { }
		public void copyFrom(QuantifierContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class SomeStatementContext extends QuantifierContext {
		public CContext c() {
			return getRuleContext(CContext.class,0);
		}
		public PContext p() {
			return getRuleContext(PContext.class,0);
		}
		public SomeStatementContext(QuantifierContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LSListener ) ((LSListener)listener).enterSomeStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LSListener ) ((LSListener)listener).exitSomeStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LSVisitor ) return ((LSVisitor<? extends T>)visitor).visitSomeStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class EachStatementContext extends QuantifierContext {
		public CContext c() {
			return getRuleContext(CContext.class,0);
		}
		public PContext p() {
			return getRuleContext(PContext.class,0);
		}
		public EachStatementContext(QuantifierContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LSListener ) ((LSListener)listener).enterEachStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LSListener ) ((LSListener)listener).exitEachStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LSVisitor ) return ((LSVisitor<? extends T>)visitor).visitEachStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QuantifierContext quantifier() throws RecognitionException {
		QuantifierContext _localctx = new QuantifierContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_quantifier);
		try {
			setState(207);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__13:
				_localctx = new EachStatementContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(199);
				match(T__13);
				setState(200);
				c(0);
				setState(201);
				p(0);
				}
				break;
			case T__14:
				_localctx = new SomeStatementContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(203);
				match(T__14);
				setState(204);
				c(0);
				setState(205);
				p(0);
				}
				break;
			default:
				throw new NoViableAltException(this);
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
			if ( listener instanceof LSListener ) ((LSListener)listener).enterBracketedC(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LSListener ) ((LSListener)listener).exitBracketedC(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LSVisitor ) return ((LSVisitor<? extends T>)visitor).visitBracketedC(this);
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
			if ( listener instanceof LSListener ) ((LSListener)listener).enterAndC(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LSListener ) ((LSListener)listener).exitAndC(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LSVisitor ) return ((LSVisitor<? extends T>)visitor).visitAndC(this);
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
			if ( listener instanceof LSListener ) ((LSListener)listener).enterOrC(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LSListener ) ((LSListener)listener).exitOrC(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LSVisitor ) return ((LSVisitor<? extends T>)visitor).visitOrC(this);
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
			if ( listener instanceof LSListener ) ((LSListener)listener).enterNotC(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LSListener ) ((LSListener)listener).exitNotC(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LSVisitor ) return ((LSVisitor<? extends T>)visitor).visitNotC(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class WithAttributesCContext extends CContext {
		public ClassNameContext className() {
			return getRuleContext(ClassNameContext.class,0);
		}
		public AttributeConstraintsContext attributeConstraints() {
			return getRuleContext(AttributeConstraintsContext.class,0);
		}
		public WithAttributesCContext(CContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LSListener ) ((LSListener)listener).enterWithAttributesC(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LSListener ) ((LSListener)listener).exitWithAttributesC(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LSVisitor ) return ((LSVisitor<? extends T>)visitor).visitWithAttributesC(this);
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
			if ( listener instanceof LSListener ) ((LSListener)listener).enterConceptVariableC(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LSListener ) ((LSListener)listener).exitConceptVariableC(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LSVisitor ) return ((LSVisitor<? extends T>)visitor).visitConceptVariableC(this);
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
			if ( listener instanceof LSListener ) ((LSListener)listener).enterThoseC(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LSListener ) ((LSListener)listener).exitThoseC(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LSVisitor ) return ((LSVisitor<? extends T>)visitor).visitThoseC(this);
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
			if ( listener instanceof LSListener ) ((LSListener)listener).enterThatC(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LSListener ) ((LSListener)listener).exitThatC(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LSVisitor ) return ((LSVisitor<? extends T>)visitor).visitThatC(this);
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
		int _startState = 22;
		enterRecursionRule(_localctx, 22, RULE_c, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(222);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Name:
				{
				_localctx = new WithAttributesCContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(210);
				className();
				setState(212);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
				case 1:
					{
					setState(211);
					attributeConstraints();
					}
					break;
				}
				}
				break;
			case T__4:
				{
				_localctx = new NotCContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(214);
				match(T__4);
				setState(215);
				c(7);
				}
				break;
			case T__16:
				{
				_localctx = new ThoseCContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(216);
				match(T__16);
				setState(217);
				p(0);
				}
				break;
			case T__8:
				{
				_localctx = new BracketedCContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(218);
				match(T__8);
				setState(219);
				c(0);
				setState(220);
				match(T__9);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(238);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(236);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
					case 1:
						{
						_localctx = new AndCContext(new CContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_c);
						setState(224);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(225);
						match(T__5);
						setState(226);
						c(6);
						}
						break;
					case 2:
						{
						_localctx = new OrCContext(new CContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_c);
						setState(227);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(228);
						match(T__6);
						setState(229);
						c(5);
						}
						break;
					case 3:
						{
						_localctx = new ConceptVariableCContext(new CContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_c);
						setState(230);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(231);
						match(T__1);
						setState(232);
						variable();
						}
						break;
					case 4:
						{
						_localctx = new ThatCContext(new CContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_c);
						setState(233);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(234);
						match(T__15);
						setState(235);
						p(0);
						}
						break;
					}
					} 
				}
				setState(240);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
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
	public static class BracketedLContext extends LContext {
		public LContext l() {
			return getRuleContext(LContext.class,0);
		}
		public BracketedLContext(LContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LSListener ) ((LSListener)listener).enterBracketedL(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LSListener ) ((LSListener)listener).exitBracketedL(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LSVisitor ) return ((LSVisitor<? extends T>)visitor).visitBracketedL(this);
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
			if ( listener instanceof LSListener ) ((LSListener)listener).enterAndL(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LSListener ) ((LSListener)listener).exitAndL(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LSVisitor ) return ((LSVisitor<? extends T>)visitor).visitAndL(this);
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
			if ( listener instanceof LSListener ) ((LSListener)listener).enterOrL(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LSListener ) ((LSListener)listener).exitOrL(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LSVisitor ) return ((LSVisitor<? extends T>)visitor).visitOrL(this);
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
			if ( listener instanceof LSListener ) ((LSListener)listener).enterNotL(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LSListener ) ((LSListener)listener).exitNotL(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LSVisitor ) return ((LSVisitor<? extends T>)visitor).visitNotL(this);
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
			if ( listener instanceof LSListener ) ((LSListener)listener).enterInvL(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LSListener ) ((LSListener)listener).exitInvL(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LSVisitor ) return ((LSVisitor<? extends T>)visitor).visitInvL(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class WithAttributesLContext extends LContext {
		public BinaryLinkNameContext binaryLinkName() {
			return getRuleContext(BinaryLinkNameContext.class,0);
		}
		public AttributeConstraintsContext attributeConstraints() {
			return getRuleContext(AttributeConstraintsContext.class,0);
		}
		public WithAttributesLContext(LContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LSListener ) ((LSListener)listener).enterWithAttributesL(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LSListener ) ((LSListener)listener).exitWithAttributesL(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LSVisitor ) return ((LSVisitor<? extends T>)visitor).visitWithAttributesL(this);
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
		int _startState = 24;
		enterRecursionRule(_localctx, 24, RULE_l, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(257);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Name:
				{
				_localctx = new WithAttributesLContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(242);
				binaryLinkName();
				setState(244);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
				case 1:
					{
					setState(243);
					attributeConstraints();
					}
					break;
				}
				}
				break;
			case T__4:
				{
				_localctx = new NotLContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(246);
				match(T__4);
				setState(247);
				l(5);
				}
				break;
			case T__17:
				{
				_localctx = new InvLContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(248);
				match(T__17);
				setState(249);
				match(T__8);
				setState(250);
				l(0);
				setState(251);
				match(T__9);
				}
				break;
			case T__8:
				{
				_localctx = new BracketedLContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(253);
				match(T__8);
				setState(254);
				l(0);
				setState(255);
				match(T__9);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(267);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(265);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
					case 1:
						{
						_localctx = new AndLContext(new LContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_l);
						setState(259);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(260);
						match(T__5);
						setState(261);
						l(5);
						}
						break;
					case 2:
						{
						_localctx = new OrLContext(new LContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_l);
						setState(262);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(263);
						match(T__6);
						setState(264);
						l(4);
						}
						break;
					}
					} 
				}
				setState(269);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
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
			if ( listener instanceof LSListener ) ((LSListener)listener).enterEachP(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LSListener ) ((LSListener)listener).exitEachP(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LSVisitor ) return ((LSVisitor<? extends T>)visitor).visitEachP(this);
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
			if ( listener instanceof LSListener ) ((LSListener)listener).enterPredicateVariableP(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LSListener ) ((LSListener)listener).exitPredicateVariableP(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LSVisitor ) return ((LSVisitor<? extends T>)visitor).visitPredicateVariableP(this);
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
			if ( listener instanceof LSListener ) ((LSListener)listener).enterSomeP(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LSListener ) ((LSListener)listener).exitSomeP(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LSVisitor ) return ((LSVisitor<? extends T>)visitor).visitSomeP(this);
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
			if ( listener instanceof LSListener ) ((LSListener)listener).enterBracketedP(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LSListener ) ((LSListener)listener).exitBracketedP(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LSVisitor ) return ((LSVisitor<? extends T>)visitor).visitBracketedP(this);
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
			if ( listener instanceof LSListener ) ((LSListener)listener).enterAndP(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LSListener ) ((LSListener)listener).exitAndP(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LSVisitor ) return ((LSVisitor<? extends T>)visitor).visitAndP(this);
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
			if ( listener instanceof LSListener ) ((LSListener)listener).enterSurrogateVariableP(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LSListener ) ((LSListener)listener).exitSurrogateVariableP(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LSVisitor ) return ((LSVisitor<? extends T>)visitor).visitSurrogateVariableP(this);
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
			if ( listener instanceof LSListener ) ((LSListener)listener).enterOnlyP(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LSListener ) ((LSListener)listener).exitOnlyP(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LSVisitor ) return ((LSVisitor<? extends T>)visitor).visitOnlyP(this);
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
			if ( listener instanceof LSListener ) ((LSListener)listener).enterOrP(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LSListener ) ((LSListener)listener).exitOrP(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LSVisitor ) return ((LSVisitor<? extends T>)visitor).visitOrP(this);
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
			if ( listener instanceof LSListener ) ((LSListener)listener).enterNotP(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LSListener ) ((LSListener)listener).exitNotP(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LSVisitor ) return ((LSVisitor<? extends T>)visitor).visitNotP(this);
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
		int _startState = 26;
		enterRecursionRule(_localctx, 26, RULE_p, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(299);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				{
				_localctx = new NotPContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(271);
				match(T__4);
				setState(272);
				p(9);
				}
				break;
			case 2:
				{
				_localctx = new SomePContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(273);
				l(0);
				setState(274);
				match(T__14);
				setState(275);
				c(0);
				}
				break;
			case 3:
				{
				_localctx = new EachPContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(277);
				l(0);
				setState(278);
				match(T__13);
				setState(279);
				c(0);
				}
				break;
			case 4:
				{
				_localctx = new OnlyPContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(281);
				l(0);
				setState(282);
				match(T__18);
				setState(283);
				c(0);
				}
				break;
			case 5:
				{
				_localctx = new PredicateVariablePContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(285);
				match(T__8);
				setState(286);
				l(0);
				setState(287);
				variable();
				setState(288);
				match(T__9);
				}
				break;
			case 6:
				{
				_localctx = new SurrogateVariablePContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(290);
				match(T__8);
				setState(291);
				l(0);
				setState(292);
				surrogate();
				setState(293);
				match(T__9);
				}
				break;
			case 7:
				{
				_localctx = new BracketedPContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(295);
				match(T__8);
				setState(296);
				p(0);
				setState(297);
				match(T__9);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(309);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(307);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
					case 1:
						{
						_localctx = new AndPContext(new PContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_p);
						setState(301);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(302);
						match(T__5);
						setState(303);
						p(9);
						}
						break;
					case 2:
						{
						_localctx = new OrPContext(new PContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_p);
						setState(304);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(305);
						match(T__6);
						setState(306);
						p(8);
						}
						break;
					}
					} 
				}
				setState(311);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
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

	public static class ClassDeclarationContext extends ParserRuleContext {
		public ClassNameContext className() {
			return getRuleContext(ClassNameContext.class,0);
		}
		public AttributesContext attributes() {
			return getRuleContext(AttributesContext.class,0);
		}
		public ClassDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LSListener ) ((LSListener)listener).enterClassDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LSListener ) ((LSListener)listener).exitClassDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LSVisitor ) return ((LSVisitor<? extends T>)visitor).visitClassDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassDeclarationContext classDeclaration() throws RecognitionException {
		ClassDeclarationContext _localctx = new ClassDeclarationContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_classDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(312);
			className();
			setState(317);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__19) {
				{
				setState(313);
				match(T__19);
				setState(314);
				attributes();
				setState(315);
				match(T__20);
				}
			}

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

	public static class BinaryLinkDeclarationContext extends ParserRuleContext {
		public List<ClassAttributeConstraintContext> classAttributeConstraint() {
			return getRuleContexts(ClassAttributeConstraintContext.class);
		}
		public ClassAttributeConstraintContext classAttributeConstraint(int i) {
			return getRuleContext(ClassAttributeConstraintContext.class,i);
		}
		public BinaryLinkNameContext binaryLinkName() {
			return getRuleContext(BinaryLinkNameContext.class,0);
		}
		public IntervalRestrictionContext intervalRestriction() {
			return getRuleContext(IntervalRestrictionContext.class,0);
		}
		public AttributesContext attributes() {
			return getRuleContext(AttributesContext.class,0);
		}
		public BinaryLinkDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_binaryLinkDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LSListener ) ((LSListener)listener).enterBinaryLinkDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LSListener ) ((LSListener)listener).exitBinaryLinkDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LSVisitor ) return ((LSVisitor<? extends T>)visitor).visitBinaryLinkDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BinaryLinkDeclarationContext binaryLinkDeclaration() throws RecognitionException {
		BinaryLinkDeclarationContext _localctx = new BinaryLinkDeclarationContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_binaryLinkDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(319);
			match(T__8);
			setState(320);
			classAttributeConstraint();
			setState(321);
			binaryLinkName();
			setState(323);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				{
				setState(322);
				intervalRestriction();
				}
				break;
			}
			setState(325);
			classAttributeConstraint();
			setState(326);
			match(T__9);
			setState(331);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__19) {
				{
				setState(327);
				match(T__19);
				setState(328);
				attributes();
				setState(329);
				match(T__20);
				}
			}

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

	public static class AttributesContext extends ParserRuleContext {
		public List<AttributeContext> attribute() {
			return getRuleContexts(AttributeContext.class);
		}
		public AttributeContext attribute(int i) {
			return getRuleContext(AttributeContext.class,i);
		}
		public AttributesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attributes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LSListener ) ((LSListener)listener).enterAttributes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LSListener ) ((LSListener)listener).exitAttributes(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LSVisitor ) return ((LSVisitor<? extends T>)visitor).visitAttributes(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AttributesContext attributes() throws RecognitionException {
		AttributesContext _localctx = new AttributesContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_attributes);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(333);
			attribute();
			setState(338);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__21) {
				{
				{
				setState(334);
				match(T__21);
				setState(335);
				attribute();
				}
				}
				setState(340);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
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

	public static class AttributeContext extends ParserRuleContext {
		public ConceptAttributeContext conceptAttribute() {
			return getRuleContext(ConceptAttributeContext.class,0);
		}
		public DataTypeAttributeContext dataTypeAttribute() {
			return getRuleContext(DataTypeAttributeContext.class,0);
		}
		public AttributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attribute; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LSListener ) ((LSListener)listener).enterAttribute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LSListener ) ((LSListener)listener).exitAttribute(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LSVisitor ) return ((LSVisitor<? extends T>)visitor).visitAttribute(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AttributeContext attribute() throws RecognitionException {
		AttributeContext _localctx = new AttributeContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_attribute);
		try {
			setState(343);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(341);
				conceptAttribute();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(342);
				dataTypeAttribute();
				}
				break;
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

	public static class DataTypeAttributeContext extends ParserRuleContext {
		public TerminalNode Name() { return getToken(LSParser.Name, 0); }
		public DataTypeContext dataType() {
			return getRuleContext(DataTypeContext.class,0);
		}
		public DataTypeAttributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dataTypeAttribute; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LSListener ) ((LSListener)listener).enterDataTypeAttribute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LSListener ) ((LSListener)listener).exitDataTypeAttribute(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LSVisitor ) return ((LSVisitor<? extends T>)visitor).visitDataTypeAttribute(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DataTypeAttributeContext dataTypeAttribute() throws RecognitionException {
		DataTypeAttributeContext _localctx = new DataTypeAttributeContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_dataTypeAttribute);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(345);
			match(Name);
			setState(346);
			match(T__1);
			setState(347);
			dataType(0);
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

	public static class ConceptAttributeContext extends ParserRuleContext {
		public ConceptTypeContext conceptType() {
			return getRuleContext(ConceptTypeContext.class,0);
		}
		public TerminalNode Name() { return getToken(LSParser.Name, 0); }
		public ConceptAttributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conceptAttribute; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LSListener ) ((LSListener)listener).enterConceptAttribute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LSListener ) ((LSListener)listener).exitConceptAttribute(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LSVisitor ) return ((LSVisitor<? extends T>)visitor).visitConceptAttribute(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConceptAttributeContext conceptAttribute() throws RecognitionException {
		ConceptAttributeContext _localctx = new ConceptAttributeContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_conceptAttribute);
		try {
			setState(353);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(349);
				conceptType(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(350);
				match(Name);
				setState(351);
				match(T__1);
				setState(352);
				conceptType(0);
				}
				break;
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

	public static class ClassAttributeConstraintContext extends ParserRuleContext {
		public ConceptAttributeContext conceptAttribute() {
			return getRuleContext(ConceptAttributeContext.class,0);
		}
		public AttributeConstraintsContext attributeConstraints() {
			return getRuleContext(AttributeConstraintsContext.class,0);
		}
		public ClassAttributeConstraintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classAttributeConstraint; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LSListener ) ((LSListener)listener).enterClassAttributeConstraint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LSListener ) ((LSListener)listener).exitClassAttributeConstraint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LSVisitor ) return ((LSVisitor<? extends T>)visitor).visitClassAttributeConstraint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassAttributeConstraintContext classAttributeConstraint() throws RecognitionException {
		ClassAttributeConstraintContext _localctx = new ClassAttributeConstraintContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_classAttributeConstraint);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(355);
			conceptAttribute();
			setState(357);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__8) {
				{
				setState(356);
				attributeConstraints();
				}
			}

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

	public static class IntervalRestrictionContext extends ParserRuleContext {
		public FullIntervalRestrictionContext fullIntervalRestriction() {
			return getRuleContext(FullIntervalRestrictionContext.class,0);
		}
		public ContractedIntervalRestrictionContext contractedIntervalRestriction() {
			return getRuleContext(ContractedIntervalRestrictionContext.class,0);
		}
		public IntervalRestrictionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_intervalRestriction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LSListener ) ((LSListener)listener).enterIntervalRestriction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LSListener ) ((LSListener)listener).exitIntervalRestriction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LSVisitor ) return ((LSVisitor<? extends T>)visitor).visitIntervalRestriction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IntervalRestrictionContext intervalRestriction() throws RecognitionException {
		IntervalRestrictionContext _localctx = new IntervalRestrictionContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_intervalRestriction);
		try {
			setState(362);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(359);
				fullIntervalRestriction();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(360);
				contractedIntervalRestriction();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(361);
				match(T__22);
				}
				break;
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

	public static class FullIntervalRestrictionContext extends ParserRuleContext {
		public List<AtomRestrictionContext> atomRestriction() {
			return getRuleContexts(AtomRestrictionContext.class);
		}
		public AtomRestrictionContext atomRestriction(int i) {
			return getRuleContext(AtomRestrictionContext.class,i);
		}
		public FullIntervalRestrictionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fullIntervalRestriction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LSListener ) ((LSListener)listener).enterFullIntervalRestriction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LSListener ) ((LSListener)listener).exitFullIntervalRestriction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LSVisitor ) return ((LSVisitor<? extends T>)visitor).visitFullIntervalRestriction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FullIntervalRestrictionContext fullIntervalRestriction() throws RecognitionException {
		FullIntervalRestrictionContext _localctx = new FullIntervalRestrictionContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_fullIntervalRestriction);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(364);
			match(T__8);
			setState(365);
			atomRestriction();
			setState(366);
			match(T__21);
			setState(367);
			atomRestriction();
			setState(368);
			match(T__9);
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

	public static class ContractedIntervalRestrictionContext extends ParserRuleContext {
		public AtomRestrictionContext atomRestriction() {
			return getRuleContext(AtomRestrictionContext.class,0);
		}
		public ContractedIntervalRestrictionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_contractedIntervalRestriction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LSListener ) ((LSListener)listener).enterContractedIntervalRestriction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LSListener ) ((LSListener)listener).exitContractedIntervalRestriction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LSVisitor ) return ((LSVisitor<? extends T>)visitor).visitContractedIntervalRestriction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ContractedIntervalRestrictionContext contractedIntervalRestriction() throws RecognitionException {
		ContractedIntervalRestrictionContext _localctx = new ContractedIntervalRestrictionContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_contractedIntervalRestriction);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(370);
			match(T__8);
			setState(371);
			atomRestriction();
			setState(372);
			match(T__9);
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

	public static class AtomRestrictionContext extends ParserRuleContext {
		public TerminalNode EQ() { return getToken(LSParser.EQ, 0); }
		public List<TerminalNode> Int() { return getTokens(LSParser.Int); }
		public TerminalNode Int(int i) {
			return getToken(LSParser.Int, i);
		}
		public TerminalNode LE() { return getToken(LSParser.LE, 0); }
		public TerminalNode LT() { return getToken(LSParser.LT, 0); }
		public TerminalNode GT() { return getToken(LSParser.GT, 0); }
		public TerminalNode GE() { return getToken(LSParser.GE, 0); }
		public AtomRestrictionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atomRestriction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LSListener ) ((LSListener)listener).enterAtomRestriction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LSListener ) ((LSListener)listener).exitAtomRestriction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LSVisitor ) return ((LSVisitor<? extends T>)visitor).visitAtomRestriction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AtomRestrictionContext atomRestriction() throws RecognitionException {
		AtomRestrictionContext _localctx = new AtomRestrictionContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_atomRestriction);
		try {
			setState(388);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case EQ:
				enterOuterAlt(_localctx, 1);
				{
				setState(374);
				match(EQ);
				setState(375);
				match(Int);
				}
				break;
			case LE:
				enterOuterAlt(_localctx, 2);
				{
				setState(376);
				match(LE);
				setState(377);
				match(Int);
				}
				break;
			case LT:
				enterOuterAlt(_localctx, 3);
				{
				setState(378);
				match(LT);
				setState(379);
				match(Int);
				}
				break;
			case GT:
				enterOuterAlt(_localctx, 4);
				{
				setState(380);
				match(GT);
				setState(381);
				match(Int);
				}
				break;
			case GE:
				enterOuterAlt(_localctx, 5);
				{
				setState(382);
				match(GE);
				setState(383);
				match(Int);
				}
				break;
			case Int:
				enterOuterAlt(_localctx, 6);
				{
				setState(384);
				match(Int);
				setState(385);
				match(T__1);
				setState(386);
				match(Int);
				}
				break;
			case T__23:
				enterOuterAlt(_localctx, 7);
				{
				setState(387);
				match(T__23);
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class DataTypeContext extends ParserRuleContext {
		public DataTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dataType; }
	 
		public DataTypeContext() { }
		public void copyFrom(DataTypeContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class DefinedTypeRuleLabelContext extends DataTypeContext {
		public DefinedTypeNameContext definedTypeName() {
			return getRuleContext(DefinedTypeNameContext.class,0);
		}
		public DefinedTypeRuleLabelContext(DataTypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LSListener ) ((LSListener)listener).enterDefinedTypeRuleLabel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LSListener ) ((LSListener)listener).exitDefinedTypeRuleLabel(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LSVisitor ) return ((LSVisitor<? extends T>)visitor).visitDefinedTypeRuleLabel(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PrimitiveDataContext extends DataTypeContext {
		public PrimitiveTypeContext primitiveType() {
			return getRuleContext(PrimitiveTypeContext.class,0);
		}
		public PrimitiveDataContext(DataTypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LSListener ) ((LSListener)listener).enterPrimitiveData(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LSListener ) ((LSListener)listener).exitPrimitiveData(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LSVisitor ) return ((LSVisitor<? extends T>)visitor).visitPrimitiveData(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class UnionDataContext extends DataTypeContext {
		public List<DataTypeContext> dataType() {
			return getRuleContexts(DataTypeContext.class);
		}
		public DataTypeContext dataType(int i) {
			return getRuleContext(DataTypeContext.class,i);
		}
		public UnionDataContext(DataTypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LSListener ) ((LSListener)listener).enterUnionData(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LSListener ) ((LSListener)listener).exitUnionData(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LSVisitor ) return ((LSVisitor<? extends T>)visitor).visitUnionData(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StarDataContext extends DataTypeContext {
		public DataTypeContext dataType() {
			return getRuleContext(DataTypeContext.class,0);
		}
		public StarDataContext(DataTypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LSListener ) ((LSListener)listener).enterStarData(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LSListener ) ((LSListener)listener).exitStarData(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LSVisitor ) return ((LSVisitor<? extends T>)visitor).visitStarData(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RangeDataContext extends DataTypeContext {
		public RangeDataTypeContext rangeDataType() {
			return getRuleContext(RangeDataTypeContext.class,0);
		}
		public RangeDataContext(DataTypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LSListener ) ((LSListener)listener).enterRangeData(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LSListener ) ((LSListener)listener).exitRangeData(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LSVisitor ) return ((LSVisitor<? extends T>)visitor).visitRangeData(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CartesianProductDataContext extends DataTypeContext {
		public List<DataTypeContext> dataType() {
			return getRuleContexts(DataTypeContext.class);
		}
		public DataTypeContext dataType(int i) {
			return getRuleContext(DataTypeContext.class,i);
		}
		public CartesianProductDataContext(DataTypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LSListener ) ((LSListener)listener).enterCartesianProductData(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LSListener ) ((LSListener)listener).exitCartesianProductData(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LSVisitor ) return ((LSVisitor<? extends T>)visitor).visitCartesianProductData(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ListContext extends DataTypeContext {
		public DataTypeContext dataType() {
			return getRuleContext(DataTypeContext.class,0);
		}
		public ListContext(DataTypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LSListener ) ((LSListener)listener).enterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LSListener ) ((LSListener)listener).exitList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LSVisitor ) return ((LSVisitor<? extends T>)visitor).visitList(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LabelRuleLabelContext extends DataTypeContext {
		public LabeledDataTypeContext labeledDataType() {
			return getRuleContext(LabeledDataTypeContext.class,0);
		}
		public LabelRuleLabelContext(DataTypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LSListener ) ((LSListener)listener).enterLabelRuleLabel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LSListener ) ((LSListener)listener).exitLabelRuleLabel(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LSVisitor ) return ((LSVisitor<? extends T>)visitor).visitLabelRuleLabel(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class EnumContext extends DataTypeContext {
		public List<TerminalNode> Name() { return getTokens(LSParser.Name); }
		public TerminalNode Name(int i) {
			return getToken(LSParser.Name, i);
		}
		public EnumContext(DataTypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LSListener ) ((LSListener)listener).enterEnum(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LSListener ) ((LSListener)listener).exitEnum(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LSVisitor ) return ((LSVisitor<? extends T>)visitor).visitEnum(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LlistContext extends DataTypeContext {
		public DataTypeContext dataType() {
			return getRuleContext(DataTypeContext.class,0);
		}
		public LlistContext(DataTypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LSListener ) ((LSListener)listener).enterLlist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LSListener ) ((LSListener)listener).exitLlist(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LSVisitor ) return ((LSVisitor<? extends T>)visitor).visitLlist(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DataTypeContext dataType() throws RecognitionException {
		return dataType(0);
	}

	private DataTypeContext dataType(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		DataTypeContext _localctx = new DataTypeContext(_ctx, _parentState);
		DataTypeContext _prevctx = _localctx;
		int _startState = 50;
		enterRecursionRule(_localctx, 50, RULE_dataType, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(426);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
			case 1:
				{
				_localctx = new PrimitiveDataContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(391);
				primitiveType();
				}
				break;
			case 2:
				{
				_localctx = new RangeDataContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(392);
				rangeDataType();
				}
				break;
			case 3:
				{
				_localctx = new LabelRuleLabelContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(393);
				labeledDataType();
				}
				break;
			case 4:
				{
				_localctx = new DefinedTypeRuleLabelContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(394);
				definedTypeName();
				}
				break;
			case 5:
				{
				_localctx = new CartesianProductDataContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(395);
				match(T__8);
				setState(396);
				dataType(0);
				setState(401);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__21) {
					{
					{
					setState(397);
					match(T__21);
					setState(398);
					dataType(0);
					}
					}
					setState(403);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(404);
				match(T__9);
				}
				break;
			case 6:
				{
				_localctx = new EnumContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(406);
				match(T__25);
				setState(407);
				match(Name);
				setState(412);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__21) {
					{
					{
					setState(408);
					match(T__21);
					setState(409);
					match(Name);
					}
					}
					setState(414);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(415);
				match(T__26);
				}
				break;
			case 7:
				{
				_localctx = new ListContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(416);
				match(T__27);
				setState(417);
				match(T__8);
				setState(418);
				dataType(0);
				setState(419);
				match(T__9);
				}
				break;
			case 8:
				{
				_localctx = new LlistContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(421);
				match(T__28);
				setState(422);
				match(T__8);
				setState(423);
				dataType(0);
				setState(424);
				match(T__9);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(437);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,39,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(435);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
					case 1:
						{
						_localctx = new UnionDataContext(new DataTypeContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_dataType);
						setState(428);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(429);
						match(T__24);
						setState(430);
						dataType(6);
						}
						break;
					case 2:
						{
						_localctx = new StarDataContext(new DataTypeContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_dataType);
						setState(431);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(432);
						match(T__8);
						setState(433);
						match(T__23);
						setState(434);
						match(T__9);
						}
						break;
					}
					} 
				}
				setState(439);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,39,_ctx);
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

	public static class PrimitiveTypeContext extends ParserRuleContext {
		public PrimitiveTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primitiveType; }
	 
		public PrimitiveTypeContext() { }
		public void copyFrom(PrimitiveTypeContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class CharPrimitiveContext extends PrimitiveTypeContext {
		public CharPrimitiveContext(PrimitiveTypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LSListener ) ((LSListener)listener).enterCharPrimitive(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LSListener ) ((LSListener)listener).exitCharPrimitive(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LSVisitor ) return ((LSVisitor<? extends T>)visitor).visitCharPrimitive(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IntegerPrimitiveContext extends PrimitiveTypeContext {
		public IntegerPrimitiveContext(PrimitiveTypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LSListener ) ((LSListener)listener).enterIntegerPrimitive(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LSListener ) ((LSListener)listener).exitIntegerPrimitive(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LSVisitor ) return ((LSVisitor<? extends T>)visitor).visitIntegerPrimitive(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NumberPrimitiveContext extends PrimitiveTypeContext {
		public NumberPrimitiveContext(PrimitiveTypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LSListener ) ((LSListener)listener).enterNumberPrimitive(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LSListener ) ((LSListener)listener).exitNumberPrimitive(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LSVisitor ) return ((LSVisitor<? extends T>)visitor).visitNumberPrimitive(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StringPrimitiveContext extends PrimitiveTypeContext {
		public StringPrimitiveContext(PrimitiveTypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LSListener ) ((LSListener)listener).enterStringPrimitive(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LSListener ) ((LSListener)listener).exitStringPrimitive(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LSVisitor ) return ((LSVisitor<? extends T>)visitor).visitStringPrimitive(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BooleanPrimitiveContext extends PrimitiveTypeContext {
		public BooleanPrimitiveContext(PrimitiveTypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LSListener ) ((LSListener)listener).enterBooleanPrimitive(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LSListener ) ((LSListener)listener).exitBooleanPrimitive(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LSVisitor ) return ((LSVisitor<? extends T>)visitor).visitBooleanPrimitive(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimitiveTypeContext primitiveType() throws RecognitionException {
		PrimitiveTypeContext _localctx = new PrimitiveTypeContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_primitiveType);
		try {
			setState(445);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__29:
				_localctx = new BooleanPrimitiveContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(440);
				match(T__29);
				}
				break;
			case T__30:
				_localctx = new NumberPrimitiveContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(441);
				match(T__30);
				}
				break;
			case T__31:
				_localctx = new IntegerPrimitiveContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(442);
				match(T__31);
				}
				break;
			case T__32:
				_localctx = new CharPrimitiveContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(443);
				match(T__32);
				}
				break;
			case T__33:
				_localctx = new StringPrimitiveContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(444);
				match(T__33);
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class RangeDataTypeContext extends ParserRuleContext {
		public TerminalNode Range() { return getToken(LSParser.Range, 0); }
		public RangeDataTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rangeDataType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LSListener ) ((LSListener)listener).enterRangeDataType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LSListener ) ((LSListener)listener).exitRangeDataType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LSVisitor ) return ((LSVisitor<? extends T>)visitor).visitRangeDataType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RangeDataTypeContext rangeDataType() throws RecognitionException {
		RangeDataTypeContext _localctx = new RangeDataTypeContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_rangeDataType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(447);
			match(T__19);
			setState(448);
			match(Range);
			setState(449);
			match(T__20);
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

	public static class LabeledDataTypeContext extends ParserRuleContext {
		public TerminalNode Name() { return getToken(LSParser.Name, 0); }
		public DataTypeContext dataType() {
			return getRuleContext(DataTypeContext.class,0);
		}
		public LabeledDataTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_labeledDataType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LSListener ) ((LSListener)listener).enterLabeledDataType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LSListener ) ((LSListener)listener).exitLabeledDataType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LSVisitor ) return ((LSVisitor<? extends T>)visitor).visitLabeledDataType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LabeledDataTypeContext labeledDataType() throws RecognitionException {
		LabeledDataTypeContext _localctx = new LabeledDataTypeContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_labeledDataType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(451);
			match(Name);
			setState(452);
			match(T__1);
			setState(453);
			dataType(0);
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

	public static class ConceptTypeContext extends ParserRuleContext {
		public ConceptTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conceptType; }
	 
		public ConceptTypeContext() { }
		public void copyFrom(ConceptTypeContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ConceptNameContext extends ConceptTypeContext {
		public TerminalNode Name() { return getToken(LSParser.Name, 0); }
		public ConceptNameContext(ConceptTypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LSListener ) ((LSListener)listener).enterConceptName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LSListener ) ((LSListener)listener).exitConceptName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LSVisitor ) return ((LSVisitor<? extends T>)visitor).visitConceptName(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CartesianProductConceptContext extends ConceptTypeContext {
		public List<ConceptTypeContext> conceptType() {
			return getRuleContexts(ConceptTypeContext.class);
		}
		public ConceptTypeContext conceptType(int i) {
			return getRuleContext(ConceptTypeContext.class,i);
		}
		public CartesianProductConceptContext(ConceptTypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LSListener ) ((LSListener)listener).enterCartesianProductConcept(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LSListener ) ((LSListener)listener).exitCartesianProductConcept(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LSVisitor ) return ((LSVisitor<? extends T>)visitor).visitCartesianProductConcept(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class UnionConceptContext extends ConceptTypeContext {
		public List<ConceptTypeContext> conceptType() {
			return getRuleContexts(ConceptTypeContext.class);
		}
		public ConceptTypeContext conceptType(int i) {
			return getRuleContext(ConceptTypeContext.class,i);
		}
		public UnionConceptContext(ConceptTypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LSListener ) ((LSListener)listener).enterUnionConcept(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LSListener ) ((LSListener)listener).exitUnionConcept(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LSVisitor ) return ((LSVisitor<? extends T>)visitor).visitUnionConcept(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StarConceptContext extends ConceptTypeContext {
		public ConceptTypeContext conceptType() {
			return getRuleContext(ConceptTypeContext.class,0);
		}
		public StarConceptContext(ConceptTypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LSListener ) ((LSListener)listener).enterStarConcept(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LSListener ) ((LSListener)listener).exitStarConcept(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LSVisitor ) return ((LSVisitor<? extends T>)visitor).visitStarConcept(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConceptTypeContext conceptType() throws RecognitionException {
		return conceptType(0);
	}

	private ConceptTypeContext conceptType(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ConceptTypeContext _localctx = new ConceptTypeContext(_ctx, _parentState);
		ConceptTypeContext _prevctx = _localctx;
		int _startState = 58;
		enterRecursionRule(_localctx, 58, RULE_conceptType, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(468);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Name:
				{
				_localctx = new ConceptNameContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(456);
				match(Name);
				}
				break;
			case T__8:
				{
				_localctx = new CartesianProductConceptContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(457);
				match(T__8);
				setState(458);
				conceptType(0);
				setState(463);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__21) {
					{
					{
					setState(459);
					match(T__21);
					setState(460);
					conceptType(0);
					}
					}
					setState(465);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(466);
				match(T__9);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(479);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,44,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(477);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
					case 1:
						{
						_localctx = new UnionConceptContext(new ConceptTypeContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_conceptType);
						setState(470);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(471);
						match(T__24);
						setState(472);
						conceptType(3);
						}
						break;
					case 2:
						{
						_localctx = new StarConceptContext(new ConceptTypeContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_conceptType);
						setState(473);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(474);
						match(T__8);
						setState(475);
						match(T__23);
						setState(476);
						match(T__9);
						}
						break;
					}
					} 
				}
				setState(481);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,44,_ctx);
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

	public static class AttributeConstraintsContext extends ParserRuleContext {
		public List<ConstraintContext> constraint() {
			return getRuleContexts(ConstraintContext.class);
		}
		public ConstraintContext constraint(int i) {
			return getRuleContext(ConstraintContext.class,i);
		}
		public AttributeConstraintsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attributeConstraints; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LSListener ) ((LSListener)listener).enterAttributeConstraints(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LSListener ) ((LSListener)listener).exitAttributeConstraints(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LSVisitor ) return ((LSVisitor<? extends T>)visitor).visitAttributeConstraints(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AttributeConstraintsContext attributeConstraints() throws RecognitionException {
		AttributeConstraintsContext _localctx = new AttributeConstraintsContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_attributeConstraints);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(482);
			match(T__8);
			setState(483);
			constraint();
			setState(488);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__34) {
				{
				{
				setState(484);
				match(T__34);
				setState(485);
				constraint();
				}
				}
				setState(490);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(491);
			match(T__9);
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

	public static class ConstraintContext extends ParserRuleContext {
		public List<SelectorContext> selector() {
			return getRuleContexts(SelectorContext.class);
		}
		public SelectorContext selector(int i) {
			return getRuleContext(SelectorContext.class,i);
		}
		public BinaryOperatorContext binaryOperator() {
			return getRuleContext(BinaryOperatorContext.class,0);
		}
		public AttributeValueContext attributeValue() {
			return getRuleContext(AttributeValueContext.class,0);
		}
		public ConstraintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constraint; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LSListener ) ((LSListener)listener).enterConstraint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LSListener ) ((LSListener)listener).exitConstraint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LSVisitor ) return ((LSVisitor<? extends T>)visitor).visitConstraint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstraintContext constraint() throws RecognitionException {
		ConstraintContext _localctx = new ConstraintContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_constraint);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(493);
			selector();
			setState(494);
			binaryOperator();
			setState(497);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Name:
				{
				setState(495);
				selector();
				}
				break;
			case T__35:
			case T__36:
			case T__37:
			case Int:
			case Float:
			case QuotedString:
				{
				setState(496);
				attributeValue();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
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

	public static class SelectorContext extends ParserRuleContext {
		public List<TerminalNode> Name() { return getTokens(LSParser.Name); }
		public TerminalNode Name(int i) {
			return getToken(LSParser.Name, i);
		}
		public SelectorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selector; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LSListener ) ((LSListener)listener).enterSelector(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LSListener ) ((LSListener)listener).exitSelector(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LSVisitor ) return ((LSVisitor<? extends T>)visitor).visitSelector(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelectorContext selector() throws RecognitionException {
		SelectorContext _localctx = new SelectorContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_selector);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(499);
			match(Name);
			setState(504);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(500);
				match(T__2);
				setState(501);
				match(Name);
				}
				}
				setState(506);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
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

	public static class ClassNameContext extends ParserRuleContext {
		public TerminalNode Name() { return getToken(LSParser.Name, 0); }
		public ClassNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_className; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LSListener ) ((LSListener)listener).enterClassName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LSListener ) ((LSListener)listener).exitClassName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LSVisitor ) return ((LSVisitor<? extends T>)visitor).visitClassName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassNameContext className() throws RecognitionException {
		ClassNameContext _localctx = new ClassNameContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_className);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(507);
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

	public static class BinaryLinkNameContext extends ParserRuleContext {
		public TerminalNode Name() { return getToken(LSParser.Name, 0); }
		public BinaryLinkNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_binaryLinkName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LSListener ) ((LSListener)listener).enterBinaryLinkName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LSListener ) ((LSListener)listener).exitBinaryLinkName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LSVisitor ) return ((LSVisitor<? extends T>)visitor).visitBinaryLinkName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BinaryLinkNameContext binaryLinkName() throws RecognitionException {
		BinaryLinkNameContext _localctx = new BinaryLinkNameContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_binaryLinkName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(509);
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

	public static class AttributeValueContext extends ParserRuleContext {
		public SurrogateContext surrogate() {
			return getRuleContext(SurrogateContext.class,0);
		}
		public DataValueContext dataValue() {
			return getRuleContext(DataValueContext.class,0);
		}
		public AttributeValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attributeValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LSListener ) ((LSListener)listener).enterAttributeValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LSListener ) ((LSListener)listener).exitAttributeValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LSVisitor ) return ((LSVisitor<? extends T>)visitor).visitAttributeValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AttributeValueContext attributeValue() throws RecognitionException {
		AttributeValueContext _localctx = new AttributeValueContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_attributeValue);
		try {
			setState(513);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__35:
				enterOuterAlt(_localctx, 1);
				{
				setState(511);
				surrogate();
				}
				break;
			case T__36:
			case T__37:
			case Int:
			case Float:
			case QuotedString:
				enterOuterAlt(_localctx, 2);
				{
				setState(512);
				dataValue();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class DefinedTypeNameContext extends ParserRuleContext {
		public TerminalNode Name() { return getToken(LSParser.Name, 0); }
		public DefinedTypeNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_definedTypeName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LSListener ) ((LSListener)listener).enterDefinedTypeName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LSListener ) ((LSListener)listener).exitDefinedTypeName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LSVisitor ) return ((LSVisitor<? extends T>)visitor).visitDefinedTypeName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DefinedTypeNameContext definedTypeName() throws RecognitionException {
		DefinedTypeNameContext _localctx = new DefinedTypeNameContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_definedTypeName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(515);
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

	public static class VariableContext extends ParserRuleContext {
		public TerminalNode Name() { return getToken(LSParser.Name, 0); }
		public VariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LSListener ) ((LSListener)listener).enterVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LSListener ) ((LSListener)listener).exitVariable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LSVisitor ) return ((LSVisitor<? extends T>)visitor).visitVariable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableContext variable() throws RecognitionException {
		VariableContext _localctx = new VariableContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_variable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(517);
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
		public TerminalNode Int() { return getToken(LSParser.Int, 0); }
		public SurrogateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_surrogate; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LSListener ) ((LSListener)listener).enterSurrogate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LSListener ) ((LSListener)listener).exitSurrogate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LSVisitor ) return ((LSVisitor<? extends T>)visitor).visitSurrogate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SurrogateContext surrogate() throws RecognitionException {
		SurrogateContext _localctx = new SurrogateContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_surrogate);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(519);
			match(T__35);
			setState(520);
			match(Int);
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

	public static class BinaryOperatorContext extends ParserRuleContext {
		public TerminalNode EQ() { return getToken(LSParser.EQ, 0); }
		public TerminalNode NOTEQ() { return getToken(LSParser.NOTEQ, 0); }
		public TerminalNode LT() { return getToken(LSParser.LT, 0); }
		public TerminalNode LE() { return getToken(LSParser.LE, 0); }
		public TerminalNode GT() { return getToken(LSParser.GT, 0); }
		public TerminalNode GE() { return getToken(LSParser.GE, 0); }
		public BinaryOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_binaryOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LSListener ) ((LSListener)listener).enterBinaryOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LSListener ) ((LSListener)listener).exitBinaryOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LSVisitor ) return ((LSVisitor<? extends T>)visitor).visitBinaryOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BinaryOperatorContext binaryOperator() throws RecognitionException {
		BinaryOperatorContext _localctx = new BinaryOperatorContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_binaryOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(522);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EQ) | (1L << NOTEQ) | (1L << LT) | (1L << LE) | (1L << GT) | (1L << GE))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
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

	public static class DataValueContext extends ParserRuleContext {
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public TrueorfalseContext trueorfalse() {
			return getRuleContext(TrueorfalseContext.class,0);
		}
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public DataValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dataValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LSListener ) ((LSListener)listener).enterDataValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LSListener ) ((LSListener)listener).exitDataValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LSVisitor ) return ((LSVisitor<? extends T>)visitor).visitDataValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DataValueContext dataValue() throws RecognitionException {
		DataValueContext _localctx = new DataValueContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_dataValue);
		try {
			setState(527);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Int:
			case Float:
				enterOuterAlt(_localctx, 1);
				{
				setState(524);
				number();
				}
				break;
			case T__36:
			case T__37:
				enterOuterAlt(_localctx, 2);
				{
				setState(525);
				trueorfalse();
				}
				break;
			case QuotedString:
				enterOuterAlt(_localctx, 3);
				{
				setState(526);
				string();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class TrueorfalseContext extends ParserRuleContext {
		public TrueorfalseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_trueorfalse; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LSListener ) ((LSListener)listener).enterTrueorfalse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LSListener ) ((LSListener)listener).exitTrueorfalse(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LSVisitor ) return ((LSVisitor<? extends T>)visitor).visitTrueorfalse(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TrueorfalseContext trueorfalse() throws RecognitionException {
		TrueorfalseContext _localctx = new TrueorfalseContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_trueorfalse);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(529);
			_la = _input.LA(1);
			if ( !(_la==T__36 || _la==T__37) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
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

	public static class NumberContext extends ParserRuleContext {
		public TerminalNode Int() { return getToken(LSParser.Int, 0); }
		public TerminalNode Float() { return getToken(LSParser.Float, 0); }
		public NumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_number; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LSListener ) ((LSListener)listener).enterNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LSListener ) ((LSListener)listener).exitNumber(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LSVisitor ) return ((LSVisitor<? extends T>)visitor).visitNumber(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumberContext number() throws RecognitionException {
		NumberContext _localctx = new NumberContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_number);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(531);
			_la = _input.LA(1);
			if ( !(_la==Int || _la==Float) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
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

	public static class StringContext extends ParserRuleContext {
		public TerminalNode QuotedString() { return getToken(LSParser.QuotedString, 0); }
		public StringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_string; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LSListener ) ((LSListener)listener).enterString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LSListener ) ((LSListener)listener).exitString(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LSVisitor ) return ((LSVisitor<? extends T>)visitor).visitString(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StringContext string() throws RecognitionException {
		StringContext _localctx = new StringContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_string);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(533);
			match(QuotedString);
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
		case 3:
			return logicalSentence_sempred((LogicalSentenceContext)_localctx, predIndex);
		case 11:
			return c_sempred((CContext)_localctx, predIndex);
		case 12:
			return l_sempred((LContext)_localctx, predIndex);
		case 13:
			return p_sempred((PContext)_localctx, predIndex);
		case 25:
			return dataType_sempred((DataTypeContext)_localctx, predIndex);
		case 29:
			return conceptType_sempred((ConceptTypeContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean logicalSentence_sempred(LogicalSentenceContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 5);
		case 1:
			return precpred(_ctx, 4);
		case 2:
			return precpred(_ctx, 3);
		}
		return true;
	}
	private boolean c_sempred(CContext _localctx, int predIndex) {
		switch (predIndex) {
		case 3:
			return precpred(_ctx, 5);
		case 4:
			return precpred(_ctx, 4);
		case 5:
			return precpred(_ctx, 6);
		case 6:
			return precpred(_ctx, 3);
		}
		return true;
	}
	private boolean l_sempred(LContext _localctx, int predIndex) {
		switch (predIndex) {
		case 7:
			return precpred(_ctx, 4);
		case 8:
			return precpred(_ctx, 3);
		}
		return true;
	}
	private boolean p_sempred(PContext _localctx, int predIndex) {
		switch (predIndex) {
		case 9:
			return precpred(_ctx, 8);
		case 10:
			return precpred(_ctx, 7);
		}
		return true;
	}
	private boolean dataType_sempred(DataTypeContext _localctx, int predIndex) {
		switch (predIndex) {
		case 11:
			return precpred(_ctx, 5);
		case 12:
			return precpred(_ctx, 6);
		}
		return true;
	}
	private boolean conceptType_sempred(ConceptTypeContext _localctx, int predIndex) {
		switch (predIndex) {
		case 13:
			return precpred(_ctx, 2);
		case 14:
			return precpred(_ctx, 3);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\65\u021a\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\3\2\3\2\3\2\3\2\3\2\3\2\6\2a\n\2\r\2\16\2b\3\2\3\2\3\2\3\2"+
		"\3\2\6\2j\n\2\r\2\16\2k\5\2n\n\2\3\2\3\2\3\3\3\3\5\3t\n\3\3\4\3\4\5\4"+
		"x\n\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5\u0082\n\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\7\5\u008d\n\5\f\5\16\5\u0090\13\5\3\6\3\6\3\6\3\6\5"+
		"\6\u0096\n\6\3\7\3\7\5\7\u009a\n\7\3\b\3\b\3\b\3\b\5\b\u00a0\n\b\3\t\3"+
		"\t\3\t\3\t\5\t\u00a6\n\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u00b0\n\n"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u00c8\n\13\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\5\f\u00d2\n\f\3\r\3\r\3\r\5\r\u00d7\n\r\3\r\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\5\r\u00e1\n\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\3\r\3\r\3\r\7\r\u00ef\n\r\f\r\16\r\u00f2\13\r\3\16\3\16\3\16\5\16\u00f7"+
		"\n\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u0104"+
		"\n\16\3\16\3\16\3\16\3\16\3\16\3\16\7\16\u010c\n\16\f\16\16\16\u010f\13"+
		"\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3"+
		"\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3"+
		"\17\3\17\5\17\u012e\n\17\3\17\3\17\3\17\3\17\3\17\3\17\7\17\u0136\n\17"+
		"\f\17\16\17\u0139\13\17\3\20\3\20\3\20\3\20\3\20\5\20\u0140\n\20\3\21"+
		"\3\21\3\21\3\21\5\21\u0146\n\21\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u014e"+
		"\n\21\3\22\3\22\3\22\7\22\u0153\n\22\f\22\16\22\u0156\13\22\3\23\3\23"+
		"\5\23\u015a\n\23\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\5\25\u0164\n"+
		"\25\3\26\3\26\5\26\u0168\n\26\3\27\3\27\3\27\5\27\u016d\n\27\3\30\3\30"+
		"\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32"+
		"\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\5\32\u0187\n\32\3\33\3\33\3\33"+
		"\3\33\3\33\3\33\3\33\3\33\3\33\7\33\u0192\n\33\f\33\16\33\u0195\13\33"+
		"\3\33\3\33\3\33\3\33\3\33\3\33\7\33\u019d\n\33\f\33\16\33\u01a0\13\33"+
		"\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\5\33\u01ad\n\33"+
		"\3\33\3\33\3\33\3\33\3\33\3\33\3\33\7\33\u01b6\n\33\f\33\16\33\u01b9\13"+
		"\33\3\34\3\34\3\34\3\34\3\34\5\34\u01c0\n\34\3\35\3\35\3\35\3\35\3\36"+
		"\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3\37\7\37\u01d0\n\37\f\37\16"+
		"\37\u01d3\13\37\3\37\3\37\5\37\u01d7\n\37\3\37\3\37\3\37\3\37\3\37\3\37"+
		"\3\37\7\37\u01e0\n\37\f\37\16\37\u01e3\13\37\3 \3 \3 \3 \7 \u01e9\n \f"+
		" \16 \u01ec\13 \3 \3 \3!\3!\3!\3!\5!\u01f4\n!\3\"\3\"\3\"\7\"\u01f9\n"+
		"\"\f\"\16\"\u01fc\13\"\3#\3#\3$\3$\3%\3%\5%\u0204\n%\3&\3&\3\'\3\'\3("+
		"\3(\3(\3)\3)\3*\3*\3*\5*\u0212\n*\3+\3+\3,\3,\3-\3-\3-\2\b\b\30\32\34"+
		"\64<.\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>"+
		"@BDFHJLNPRTVX\2\5\3\2-\62\3\2\'(\3\2*+\u0241\2m\3\2\2\2\4s\3\2\2\2\6w"+
		"\3\2\2\2\b\u0081\3\2\2\2\n\u0095\3\2\2\2\f\u0099\3\2\2\2\16\u009f\3\2"+
		"\2\2\20\u00a5\3\2\2\2\22\u00af\3\2\2\2\24\u00c7\3\2\2\2\26\u00d1\3\2\2"+
		"\2\30\u00e0\3\2\2\2\32\u0103\3\2\2\2\34\u012d\3\2\2\2\36\u013a\3\2\2\2"+
		" \u0141\3\2\2\2\"\u014f\3\2\2\2$\u0159\3\2\2\2&\u015b\3\2\2\2(\u0163\3"+
		"\2\2\2*\u0165\3\2\2\2,\u016c\3\2\2\2.\u016e\3\2\2\2\60\u0174\3\2\2\2\62"+
		"\u0186\3\2\2\2\64\u01ac\3\2\2\2\66\u01bf\3\2\2\28\u01c1\3\2\2\2:\u01c5"+
		"\3\2\2\2<\u01d6\3\2\2\2>\u01e4\3\2\2\2@\u01ef\3\2\2\2B\u01f5\3\2\2\2D"+
		"\u01fd\3\2\2\2F\u01ff\3\2\2\2H\u0203\3\2\2\2J\u0205\3\2\2\2L\u0207\3\2"+
		"\2\2N\u0209\3\2\2\2P\u020c\3\2\2\2R\u0211\3\2\2\2T\u0213\3\2\2\2V\u0215"+
		"\3\2\2\2X\u0217\3\2\2\2Z[\7\3\2\2[\\\7,\2\2\\`\7\4\2\2]^\5\4\3\2^_\7\5"+
		"\2\2_a\3\2\2\2`]\3\2\2\2ab\3\2\2\2b`\3\2\2\2bc\3\2\2\2cd\3\2\2\2de\7\6"+
		"\2\2en\3\2\2\2fg\5\4\3\2gh\7\5\2\2hj\3\2\2\2if\3\2\2\2jk\3\2\2\2ki\3\2"+
		"\2\2kl\3\2\2\2ln\3\2\2\2mZ\3\2\2\2mi\3\2\2\2no\3\2\2\2op\7\2\2\3p\3\3"+
		"\2\2\2qt\5\6\4\2rt\5\b\5\2sq\3\2\2\2sr\3\2\2\2t\5\3\2\2\2ux\5\36\20\2"+
		"vx\5 \21\2wu\3\2\2\2wv\3\2\2\2x\7\3\2\2\2yz\b\5\1\2z{\7\7\2\2{\u0082\5"+
		"\b\5\b|\u0082\5\n\6\2}~\7\13\2\2~\177\5\b\5\2\177\u0080\7\f\2\2\u0080"+
		"\u0082\3\2\2\2\u0081y\3\2\2\2\u0081|\3\2\2\2\u0081}\3\2\2\2\u0082\u008e"+
		"\3\2\2\2\u0083\u0084\f\7\2\2\u0084\u0085\7\b\2\2\u0085\u008d\5\b\5\b\u0086"+
		"\u0087\f\6\2\2\u0087\u0088\7\t\2\2\u0088\u008d\5\b\5\7\u0089\u008a\f\5"+
		"\2\2\u008a\u008b\7\n\2\2\u008b\u008d\5\b\5\6\u008c\u0083\3\2\2\2\u008c"+
		"\u0086\3\2\2\2\u008c\u0089\3\2\2\2\u008d\u0090\3\2\2\2\u008e\u008c\3\2"+
		"\2\2\u008e\u008f\3\2\2\2\u008f\t\3\2\2\2\u0090\u008e\3\2\2\2\u0091\u0096"+
		"\5\f\7\2\u0092\u0096\5\22\n\2\u0093\u0096\5\24\13\2\u0094\u0096\5\26\f"+
		"\2\u0095\u0091\3\2\2\2\u0095\u0092\3\2\2\2\u0095\u0093\3\2\2\2\u0095\u0094"+
		"\3\2\2\2\u0096\13\3\2\2\2\u0097\u009a\5\16\b\2\u0098\u009a\5\20\t\2\u0099"+
		"\u0097\3\2\2\2\u0099\u0098\3\2\2\2\u009a\r\3\2\2\2\u009b\u009c\7\r\2\2"+
		"\u009c\u00a0\5\30\r\2\u009d\u009e\7\r\2\2\u009e\u00a0\5\32\16\2\u009f"+
		"\u009b\3\2\2\2\u009f\u009d\3\2\2\2\u00a0\17\3\2\2\2\u00a1\u00a2\7\16\2"+
		"\2\u00a2\u00a6\5\30\r\2\u00a3\u00a4\7\16\2\2\u00a4\u00a6\5\32\16\2\u00a5"+
		"\u00a1\3\2\2\2\u00a5\u00a3\3\2\2\2\u00a6\21\3\2\2\2\u00a7\u00a8\5\30\r"+
		"\2\u00a8\u00a9\7\17\2\2\u00a9\u00aa\5\30\r\2\u00aa\u00b0\3\2\2\2\u00ab"+
		"\u00ac\5\32\16\2\u00ac\u00ad\7\17\2\2\u00ad\u00ae\5\32\16\2\u00ae\u00b0"+
		"\3\2\2\2\u00af\u00a7\3\2\2\2\u00af\u00ab\3\2\2\2\u00b0\23\3\2\2\2\u00b1"+
		"\u00b2\5\30\r\2\u00b2\u00b3\7-\2\2\u00b3\u00b4\5\30\r\2\u00b4\u00c8\3"+
		"\2\2\2\u00b5\u00b6\5\32\16\2\u00b6\u00b7\7-\2\2\u00b7\u00b8\5\32\16\2"+
		"\u00b8\u00c8\3\2\2\2\u00b9\u00ba\5\34\17\2\u00ba\u00bb\7-\2\2\u00bb\u00bc"+
		"\5\34\17\2\u00bc\u00c8\3\2\2\2\u00bd\u00be\5\30\r\2\u00be\u00bf\7-\2\2"+
		"\u00bf\u00c0\7\7\2\2\u00c0\u00c1\5\30\r\2\u00c1\u00c8\3\2\2\2\u00c2\u00c3"+
		"\5\32\16\2\u00c3\u00c4\7-\2\2\u00c4\u00c5\7\7\2\2\u00c5\u00c6\5\32\16"+
		"\2\u00c6\u00c8\3\2\2\2\u00c7\u00b1\3\2\2\2\u00c7\u00b5\3\2\2\2\u00c7\u00b9"+
		"\3\2\2\2\u00c7\u00bd\3\2\2\2\u00c7\u00c2\3\2\2\2\u00c8\25\3\2\2\2\u00c9"+
		"\u00ca\7\20\2\2\u00ca\u00cb\5\30\r\2\u00cb\u00cc\5\34\17\2\u00cc\u00d2"+
		"\3\2\2\2\u00cd\u00ce\7\21\2\2\u00ce\u00cf\5\30\r\2\u00cf\u00d0\5\34\17"+
		"\2\u00d0\u00d2\3\2\2\2\u00d1\u00c9\3\2\2\2\u00d1\u00cd\3\2\2\2\u00d2\27"+
		"\3\2\2\2\u00d3\u00d4\b\r\1\2\u00d4\u00d6\5D#\2\u00d5\u00d7\5> \2\u00d6"+
		"\u00d5\3\2\2\2\u00d6\u00d7\3\2\2\2\u00d7\u00e1\3\2\2\2\u00d8\u00d9\7\7"+
		"\2\2\u00d9\u00e1\5\30\r\t\u00da\u00db\7\23\2\2\u00db\u00e1\5\34\17\2\u00dc"+
		"\u00dd\7\13\2\2\u00dd\u00de\5\30\r\2\u00de\u00df\7\f\2\2\u00df\u00e1\3"+
		"\2\2\2\u00e0\u00d3\3\2\2\2\u00e0\u00d8\3\2\2\2\u00e0\u00da\3\2\2\2\u00e0"+
		"\u00dc\3\2\2\2\u00e1\u00f0\3\2\2\2\u00e2\u00e3\f\7\2\2\u00e3\u00e4\7\b"+
		"\2\2\u00e4\u00ef\5\30\r\b\u00e5\u00e6\f\6\2\2\u00e6\u00e7\7\t\2\2\u00e7"+
		"\u00ef\5\30\r\7\u00e8\u00e9\f\b\2\2\u00e9\u00ea\7\4\2\2\u00ea\u00ef\5"+
		"L\'\2\u00eb\u00ec\f\5\2\2\u00ec\u00ed\7\22\2\2\u00ed\u00ef\5\34\17\2\u00ee"+
		"\u00e2\3\2\2\2\u00ee\u00e5\3\2\2\2\u00ee\u00e8\3\2\2\2\u00ee\u00eb\3\2"+
		"\2\2\u00ef\u00f2\3\2\2\2\u00f0\u00ee\3\2\2\2\u00f0\u00f1\3\2\2\2\u00f1"+
		"\31\3\2\2\2\u00f2\u00f0\3\2\2\2\u00f3\u00f4\b\16\1\2\u00f4\u00f6\5F$\2"+
		"\u00f5\u00f7\5> \2\u00f6\u00f5\3\2\2\2\u00f6\u00f7\3\2\2\2\u00f7\u0104"+
		"\3\2\2\2\u00f8\u00f9\7\7\2\2\u00f9\u0104\5\32\16\7\u00fa\u00fb\7\24\2"+
		"\2\u00fb\u00fc\7\13\2\2\u00fc\u00fd\5\32\16\2\u00fd\u00fe\7\f\2\2\u00fe"+
		"\u0104\3\2\2\2\u00ff\u0100\7\13\2\2\u0100\u0101\5\32\16\2\u0101\u0102"+
		"\7\f\2\2\u0102\u0104\3\2\2\2\u0103\u00f3\3\2\2\2\u0103\u00f8\3\2\2\2\u0103"+
		"\u00fa\3\2\2\2\u0103\u00ff\3\2\2\2\u0104\u010d\3\2\2\2\u0105\u0106\f\6"+
		"\2\2\u0106\u0107\7\b\2\2\u0107\u010c\5\32\16\7\u0108\u0109\f\5\2\2\u0109"+
		"\u010a\7\t\2\2\u010a\u010c\5\32\16\6\u010b\u0105\3\2\2\2\u010b\u0108\3"+
		"\2\2\2\u010c\u010f\3\2\2\2\u010d\u010b\3\2\2\2\u010d\u010e\3\2\2\2\u010e"+
		"\33\3\2\2\2\u010f\u010d\3\2\2\2\u0110\u0111\b\17\1\2\u0111\u0112\7\7\2"+
		"\2\u0112\u012e\5\34\17\13\u0113\u0114\5\32\16\2\u0114\u0115\7\21\2\2\u0115"+
		"\u0116\5\30\r\2\u0116\u012e\3\2\2\2\u0117\u0118\5\32\16\2\u0118\u0119"+
		"\7\20\2\2\u0119\u011a\5\30\r\2\u011a\u012e\3\2\2\2\u011b\u011c\5\32\16"+
		"\2\u011c\u011d\7\25\2\2\u011d\u011e\5\30\r\2\u011e\u012e\3\2\2\2\u011f"+
		"\u0120\7\13\2\2\u0120\u0121\5\32\16\2\u0121\u0122\5L\'\2\u0122\u0123\7"+
		"\f\2\2\u0123\u012e\3\2\2\2\u0124\u0125\7\13\2\2\u0125\u0126\5\32\16\2"+
		"\u0126\u0127\5N(\2\u0127\u0128\7\f\2\2\u0128\u012e\3\2\2\2\u0129\u012a"+
		"\7\13\2\2\u012a\u012b\5\34\17\2\u012b\u012c\7\f\2\2\u012c\u012e\3\2\2"+
		"\2\u012d\u0110\3\2\2\2\u012d\u0113\3\2\2\2\u012d\u0117\3\2\2\2\u012d\u011b"+
		"\3\2\2\2\u012d\u011f\3\2\2\2\u012d\u0124\3\2\2\2\u012d\u0129\3\2\2\2\u012e"+
		"\u0137\3\2\2\2\u012f\u0130\f\n\2\2\u0130\u0131\7\b\2\2\u0131\u0136\5\34"+
		"\17\13\u0132\u0133\f\t\2\2\u0133\u0134\7\t\2\2\u0134\u0136\5\34\17\n\u0135"+
		"\u012f\3\2\2\2\u0135\u0132\3\2\2\2\u0136\u0139\3\2\2\2\u0137\u0135\3\2"+
		"\2\2\u0137\u0138\3\2\2\2\u0138\35\3\2\2\2\u0139\u0137\3\2\2\2\u013a\u013f"+
		"\5D#\2\u013b\u013c\7\26\2\2\u013c\u013d\5\"\22\2\u013d\u013e\7\27\2\2"+
		"\u013e\u0140\3\2\2\2\u013f\u013b\3\2\2\2\u013f\u0140\3\2\2\2\u0140\37"+
		"\3\2\2\2\u0141\u0142\7\13\2\2\u0142\u0143\5*\26\2\u0143\u0145\5F$\2\u0144"+
		"\u0146\5,\27\2\u0145\u0144\3\2\2\2\u0145\u0146\3\2\2\2\u0146\u0147\3\2"+
		"\2\2\u0147\u0148\5*\26\2\u0148\u014d\7\f\2\2\u0149\u014a\7\26\2\2\u014a"+
		"\u014b\5\"\22\2\u014b\u014c\7\27\2\2\u014c\u014e\3\2\2\2\u014d\u0149\3"+
		"\2\2\2\u014d\u014e\3\2\2\2\u014e!\3\2\2\2\u014f\u0154\5$\23\2\u0150\u0151"+
		"\7\30\2\2\u0151\u0153\5$\23\2\u0152\u0150\3\2\2\2\u0153\u0156\3\2\2\2"+
		"\u0154\u0152\3\2\2\2\u0154\u0155\3\2\2\2\u0155#\3\2\2\2\u0156\u0154\3"+
		"\2\2\2\u0157\u015a\5(\25\2\u0158\u015a\5&\24\2\u0159\u0157\3\2\2\2\u0159"+
		"\u0158\3\2\2\2\u015a%\3\2\2\2\u015b\u015c\7,\2\2\u015c\u015d\7\4\2\2\u015d"+
		"\u015e\5\64\33\2\u015e\'\3\2\2\2\u015f\u0164\5<\37\2\u0160\u0161\7,\2"+
		"\2\u0161\u0162\7\4\2\2\u0162\u0164\5<\37\2\u0163\u015f\3\2\2\2\u0163\u0160"+
		"\3\2\2\2\u0164)\3\2\2\2\u0165\u0167\5(\25\2\u0166\u0168\5> \2\u0167\u0166"+
		"\3\2\2\2\u0167\u0168\3\2\2\2\u0168+\3\2\2\2\u0169\u016d\5.\30\2\u016a"+
		"\u016d\5\60\31\2\u016b\u016d\7\31\2\2\u016c\u0169\3\2\2\2\u016c\u016a"+
		"\3\2\2\2\u016c\u016b\3\2\2\2\u016d-\3\2\2\2\u016e\u016f\7\13\2\2\u016f"+
		"\u0170\5\62\32\2\u0170\u0171\7\30\2\2\u0171\u0172\5\62\32\2\u0172\u0173"+
		"\7\f\2\2\u0173/\3\2\2\2\u0174\u0175\7\13\2\2\u0175\u0176\5\62\32\2\u0176"+
		"\u0177\7\f\2\2\u0177\61\3\2\2\2\u0178\u0179\7-\2\2\u0179\u0187\7*\2\2"+
		"\u017a\u017b\7\60\2\2\u017b\u0187\7*\2\2\u017c\u017d\7/\2\2\u017d\u0187"+
		"\7*\2\2\u017e\u017f\7\61\2\2\u017f\u0187\7*\2\2\u0180\u0181\7\62\2\2\u0181"+
		"\u0187\7*\2\2\u0182\u0183\7*\2\2\u0183\u0184\7\4\2\2\u0184\u0187\7*\2"+
		"\2\u0185\u0187\7\32\2\2\u0186\u0178\3\2\2\2\u0186\u017a\3\2\2\2\u0186"+
		"\u017c\3\2\2\2\u0186\u017e\3\2\2\2\u0186\u0180\3\2\2\2\u0186\u0182\3\2"+
		"\2\2\u0186\u0185\3\2\2\2\u0187\63\3\2\2\2\u0188\u0189\b\33\1\2\u0189\u01ad"+
		"\5\66\34\2\u018a\u01ad\58\35\2\u018b\u01ad\5:\36\2\u018c\u01ad\5J&\2\u018d"+
		"\u018e\7\13\2\2\u018e\u0193\5\64\33\2\u018f\u0190\7\30\2\2\u0190\u0192"+
		"\5\64\33\2\u0191\u018f\3\2\2\2\u0192\u0195\3\2\2\2\u0193\u0191\3\2\2\2"+
		"\u0193\u0194\3\2\2\2\u0194\u0196\3\2\2\2\u0195\u0193\3\2\2\2\u0196\u0197"+
		"\7\f\2\2\u0197\u01ad\3\2\2\2\u0198\u0199\7\34\2\2\u0199\u019e\7,\2\2\u019a"+
		"\u019b\7\30\2\2\u019b\u019d\7,\2\2\u019c\u019a\3\2\2\2\u019d\u01a0\3\2"+
		"\2\2\u019e\u019c\3\2\2\2\u019e\u019f\3\2\2\2\u019f\u01a1\3\2\2\2\u01a0"+
		"\u019e\3\2\2\2\u01a1\u01ad\7\35\2\2\u01a2\u01a3\7\36\2\2\u01a3\u01a4\7"+
		"\13\2\2\u01a4\u01a5\5\64\33\2\u01a5\u01a6\7\f\2\2\u01a6\u01ad\3\2\2\2"+
		"\u01a7\u01a8\7\37\2\2\u01a8\u01a9\7\13\2\2\u01a9\u01aa\5\64\33\2\u01aa"+
		"\u01ab\7\f\2\2\u01ab\u01ad\3\2\2\2\u01ac\u0188\3\2\2\2\u01ac\u018a\3\2"+
		"\2\2\u01ac\u018b\3\2\2\2\u01ac\u018c\3\2\2\2\u01ac\u018d\3\2\2\2\u01ac"+
		"\u0198\3\2\2\2\u01ac\u01a2\3\2\2\2\u01ac\u01a7\3\2\2\2\u01ad\u01b7\3\2"+
		"\2\2\u01ae\u01af\f\7\2\2\u01af\u01b0\7\33\2\2\u01b0\u01b6\5\64\33\b\u01b1"+
		"\u01b2\f\b\2\2\u01b2\u01b3\7\13\2\2\u01b3\u01b4\7\32\2\2\u01b4\u01b6\7"+
		"\f\2\2\u01b5\u01ae\3\2\2\2\u01b5\u01b1\3\2\2\2\u01b6\u01b9\3\2\2\2\u01b7"+
		"\u01b5\3\2\2\2\u01b7\u01b8\3\2\2\2\u01b8\65\3\2\2\2\u01b9\u01b7\3\2\2"+
		"\2\u01ba\u01c0\7 \2\2\u01bb\u01c0\7!\2\2\u01bc\u01c0\7\"\2\2\u01bd\u01c0"+
		"\7#\2\2\u01be\u01c0\7$\2\2\u01bf\u01ba\3\2\2\2\u01bf\u01bb\3\2\2\2\u01bf"+
		"\u01bc\3\2\2\2\u01bf\u01bd\3\2\2\2\u01bf\u01be\3\2\2\2\u01c0\67\3\2\2"+
		"\2\u01c1\u01c2\7\26\2\2\u01c2\u01c3\7)\2\2\u01c3\u01c4\7\27\2\2\u01c4"+
		"9\3\2\2\2\u01c5\u01c6\7,\2\2\u01c6\u01c7\7\4\2\2\u01c7\u01c8\5\64\33\2"+
		"\u01c8;\3\2\2\2\u01c9\u01ca\b\37\1\2\u01ca\u01d7\7,\2\2\u01cb\u01cc\7"+
		"\13\2\2\u01cc\u01d1\5<\37\2\u01cd\u01ce\7\30\2\2\u01ce\u01d0\5<\37\2\u01cf"+
		"\u01cd\3\2\2\2\u01d0\u01d3\3\2\2\2\u01d1\u01cf\3\2\2\2\u01d1\u01d2\3\2"+
		"\2\2\u01d2\u01d4\3\2\2\2\u01d3\u01d1\3\2\2\2\u01d4\u01d5\7\f\2\2\u01d5"+
		"\u01d7\3\2\2\2\u01d6\u01c9\3\2\2\2\u01d6\u01cb\3\2\2\2\u01d7\u01e1\3\2"+
		"\2\2\u01d8\u01d9\f\4\2\2\u01d9\u01da\7\33\2\2\u01da\u01e0\5<\37\5\u01db"+
		"\u01dc\f\5\2\2\u01dc\u01dd\7\13\2\2\u01dd\u01de\7\32\2\2\u01de\u01e0\7"+
		"\f\2\2\u01df\u01d8\3\2\2\2\u01df\u01db\3\2\2\2\u01e0\u01e3\3\2\2\2\u01e1"+
		"\u01df\3\2\2\2\u01e1\u01e2\3\2\2\2\u01e2=\3\2\2\2\u01e3\u01e1\3\2\2\2"+
		"\u01e4\u01e5\7\13\2\2\u01e5\u01ea\5@!\2\u01e6\u01e7\7%\2\2\u01e7\u01e9"+
		"\5@!\2\u01e8\u01e6\3\2\2\2\u01e9\u01ec\3\2\2\2\u01ea\u01e8\3\2\2\2\u01ea"+
		"\u01eb\3\2\2\2\u01eb\u01ed\3\2\2\2\u01ec\u01ea\3\2\2\2\u01ed\u01ee\7\f"+
		"\2\2\u01ee?\3\2\2\2\u01ef\u01f0\5B\"\2\u01f0\u01f3\5P)\2\u01f1\u01f4\5"+
		"B\"\2\u01f2\u01f4\5H%\2\u01f3\u01f1\3\2\2\2\u01f3\u01f2\3\2\2\2\u01f4"+
		"A\3\2\2\2\u01f5\u01fa\7,\2\2\u01f6\u01f7\7\5\2\2\u01f7\u01f9\7,\2\2\u01f8"+
		"\u01f6\3\2\2\2\u01f9\u01fc\3\2\2\2\u01fa\u01f8\3\2\2\2\u01fa\u01fb\3\2"+
		"\2\2\u01fbC\3\2\2\2\u01fc\u01fa\3\2\2\2\u01fd\u01fe\7,\2\2\u01feE\3\2"+
		"\2\2\u01ff\u0200\7,\2\2\u0200G\3\2\2\2\u0201\u0204\5N(\2\u0202\u0204\5"+
		"R*\2\u0203\u0201\3\2\2\2\u0203\u0202\3\2\2\2\u0204I\3\2\2\2\u0205\u0206"+
		"\7,\2\2\u0206K\3\2\2\2\u0207\u0208\7,\2\2\u0208M\3\2\2\2\u0209\u020a\7"+
		"&\2\2\u020a\u020b\7*\2\2\u020bO\3\2\2\2\u020c\u020d\t\2\2\2\u020dQ\3\2"+
		"\2\2\u020e\u0212\5V,\2\u020f\u0212\5T+\2\u0210\u0212\5X-\2\u0211\u020e"+
		"\3\2\2\2\u0211\u020f\3\2\2\2\u0211\u0210\3\2\2\2\u0212S\3\2\2\2\u0213"+
		"\u0214\t\3\2\2\u0214U\3\2\2\2\u0215\u0216\t\4\2\2\u0216W\3\2\2\2\u0217"+
		"\u0218\7\63\2\2\u0218Y\3\2\2\2\64bkmsw\u0081\u008c\u008e\u0095\u0099\u009f"+
		"\u00a5\u00af\u00c7\u00d1\u00d6\u00e0\u00ee\u00f0\u00f6\u0103\u010b\u010d"+
		"\u012d\u0135\u0137\u013f\u0145\u014d\u0154\u0159\u0163\u0167\u016c\u0186"+
		"\u0193\u019e\u01ac\u01b5\u01b7\u01bf\u01d1\u01d6\u01df\u01e1\u01ea\u01f3"+
		"\u01fa\u0203\u0211";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}