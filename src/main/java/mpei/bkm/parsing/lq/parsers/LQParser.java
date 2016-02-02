package mpei.bkm.parsing.lq.parsers;// Generated from C:/plugin/protege/bkmapi-parsing/grammar\LQ.g4 by ANTLR 4.5
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class LQParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, QueryHeadSign=7, QueryBodySign=8, 
		Int=9, Float=10, QuotedString=11, SUM=12, AVG=13, MIN=14, MAX=15, EQ=16, 
		NOTEQ=17, LT=18, LE=19, GT=20, GE=21, LIKE=22, Name=23, Space=24;
	public static final int
		RULE_query = 0, RULE_goals = 1, RULE_goal = 2, RULE_aggregateGoal = 3, 
		RULE_conditions = 4, RULE_condition = 5, RULE_inClass = 6, RULE_attributeConditions = 7, 
		RULE_attributeCondition = 8, RULE_linkCondition = 9, RULE_functionalLinkCondition = 10, 
		RULE_variableOperatorCondition = 11, RULE_variableAttrSelector = 12, RULE_attributeSelector = 13, 
		RULE_variableName = 14, RULE_className = 15, RULE_linkName = 16, RULE_attributeName = 17, 
		RULE_aggregateFunction = 18, RULE_binaryOperator = 19, RULE_value = 20, 
		RULE_number = 21;
	public static final String[] ruleNames = {
		"query", "goals", "goal", "aggregateGoal", "conditions", "condition", 
		"inClass", "attributeConditions", "attributeCondition", "linkCondition", 
		"functionalLinkCondition", "variableOperatorCondition", "variableAttrSelector", 
		"attributeSelector", "variableName", "className", "linkName", "attributeName", 
		"aggregateFunction", "binaryOperator", "value", "number"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "','", "'('", "')'", "';'", "'IN'", "'.'", "'?'", "'-'", null, null, 
		null, "'SUM'", "'AVG'", "'MIN'", "'MAX'", "'='", "'=/='", "'<'", "'<='", 
		"'>'", "'>='", "'LIKE'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, "QueryHeadSign", "QueryBodySign", 
		"Int", "Float", "QuotedString", "SUM", "AVG", "MIN", "MAX", "EQ", "NOTEQ", 
		"LT", "LE", "GT", "GE", "LIKE", "Name", "Space"
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
	@NotNull
	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "LQ.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public LQParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class QueryContext extends ParserRuleContext {
		public TerminalNode QueryHeadSign() { return getToken(LQParser.QueryHeadSign, 0); }
		public GoalsContext goals() {
			return getRuleContext(GoalsContext.class,0);
		}
		public TerminalNode QueryBodySign() { return getToken(LQParser.QueryBodySign, 0); }
		public ConditionsContext conditions() {
			return getRuleContext(ConditionsContext.class,0);
		}
		public TerminalNode EOF() { return getToken(LQParser.EOF, 0); }
		public QueryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_query; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LQListener ) ((LQListener)listener).enterQuery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LQListener ) ((LQListener)listener).exitQuery(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LQVisitor ) return ((LQVisitor<? extends T>)visitor).visitQuery(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QueryContext query() throws RecognitionException {
		QueryContext _localctx = new QueryContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_query);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(44); 
			match(QueryHeadSign);
			setState(45); 
			goals();
			setState(46); 
			match(QueryBodySign);
			setState(47); 
			conditions();
			setState(48); 
			match(Recognizer.EOF);
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

	public static class GoalsContext extends ParserRuleContext {
		public List<GoalContext> goal() {
			return getRuleContexts(GoalContext.class);
		}
		public GoalContext goal(int i) {
			return getRuleContext(GoalContext.class,i);
		}
		public AggregateGoalContext aggregateGoal() {
			return getRuleContext(AggregateGoalContext.class,0);
		}
		public GoalsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_goals; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LQListener ) ((LQListener)listener).enterGoals(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LQListener ) ((LQListener)listener).exitGoals(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LQVisitor ) return ((LQVisitor<? extends T>)visitor).visitGoals(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GoalsContext goals() throws RecognitionException {
		GoalsContext _localctx = new GoalsContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_goals);
		int _la;
		try {
			setState(59);
			switch (_input.LA(1)) {
			case Name:
				enterOuterAlt(_localctx, 1);
				{
				setState(50); 
				goal();
				setState(55);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__0) {
					{
					{
					setState(51); 
					match(T__0);
					setState(52); 
					goal();
					}
					}
					setState(57);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case SUM:
			case AVG:
			case MIN:
			case MAX:
				enterOuterAlt(_localctx, 2);
				{
				setState(58); 
				aggregateGoal();
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

	public static class GoalContext extends ParserRuleContext {
		public VariableAttrSelectorContext variableAttrSelector() {
			return getRuleContext(VariableAttrSelectorContext.class,0);
		}
		public GoalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_goal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LQListener ) ((LQListener)listener).enterGoal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LQListener ) ((LQListener)listener).exitGoal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LQVisitor ) return ((LQVisitor<? extends T>)visitor).visitGoal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GoalContext goal() throws RecognitionException {
		GoalContext _localctx = new GoalContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_goal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(61); 
			variableAttrSelector();
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

	public static class AggregateGoalContext extends ParserRuleContext {
		public AggregateFunctionContext aggregateFunction() {
			return getRuleContext(AggregateFunctionContext.class,0);
		}
		public AttributeSelectorContext attributeSelector() {
			return getRuleContext(AttributeSelectorContext.class,0);
		}
		public AggregateGoalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_aggregateGoal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LQListener ) ((LQListener)listener).enterAggregateGoal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LQListener ) ((LQListener)listener).exitAggregateGoal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LQVisitor ) return ((LQVisitor<? extends T>)visitor).visitAggregateGoal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AggregateGoalContext aggregateGoal() throws RecognitionException {
		AggregateGoalContext _localctx = new AggregateGoalContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_aggregateGoal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(63); 
			aggregateFunction();
			setState(64); 
			match(T__1);
			setState(65); 
			attributeSelector();
			setState(66); 
			match(T__2);
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

	public static class ConditionsContext extends ParserRuleContext {
		public List<ConditionContext> condition() {
			return getRuleContexts(ConditionContext.class);
		}
		public ConditionContext condition(int i) {
			return getRuleContext(ConditionContext.class,i);
		}
		public ConditionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditions; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LQListener ) ((LQListener)listener).enterConditions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LQListener ) ((LQListener)listener).exitConditions(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LQVisitor ) return ((LQVisitor<? extends T>)visitor).visitConditions(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionsContext conditions() throws RecognitionException {
		ConditionsContext _localctx = new ConditionsContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_conditions);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(68); 
			condition();
			setState(73);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(69); 
				match(T__3);
				setState(70); 
				condition();
				}
				}
				setState(75);
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

	public static class ConditionContext extends ParserRuleContext {
		public InClassContext inClass() {
			return getRuleContext(InClassContext.class,0);
		}
		public VariableOperatorConditionContext variableOperatorCondition() {
			return getRuleContext(VariableOperatorConditionContext.class,0);
		}
		public LinkConditionContext linkCondition() {
			return getRuleContext(LinkConditionContext.class,0);
		}
		public FunctionalLinkConditionContext functionalLinkCondition() {
			return getRuleContext(FunctionalLinkConditionContext.class,0);
		}
		public ConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LQListener ) ((LQListener)listener).enterCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LQListener ) ((LQListener)listener).exitCondition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LQVisitor ) return ((LQVisitor<? extends T>)visitor).visitCondition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionContext condition() throws RecognitionException {
		ConditionContext _localctx = new ConditionContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_condition);
		try {
			setState(80);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(76); 
				inClass();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(77); 
				variableOperatorCondition();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(78); 
				linkCondition();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(79); 
				functionalLinkCondition();
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

	public static class InClassContext extends ParserRuleContext {
		public VariableNameContext variableName() {
			return getRuleContext(VariableNameContext.class,0);
		}
		public ClassNameContext className() {
			return getRuleContext(ClassNameContext.class,0);
		}
		public AttributeConditionsContext attributeConditions() {
			return getRuleContext(AttributeConditionsContext.class,0);
		}
		public InClassContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inClass; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LQListener ) ((LQListener)listener).enterInClass(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LQListener ) ((LQListener)listener).exitInClass(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LQVisitor ) return ((LQVisitor<? extends T>)visitor).visitInClass(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InClassContext inClass() throws RecognitionException {
		InClassContext _localctx = new InClassContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_inClass);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(82); 
			variableName();
			setState(83); 
			match(T__4);
			setState(84); 
			className();
			setState(86);
			_la = _input.LA(1);
			if (_la==T__1) {
				{
				setState(85); 
				attributeConditions();
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

	public static class AttributeConditionsContext extends ParserRuleContext {
		public List<AttributeConditionContext> attributeCondition() {
			return getRuleContexts(AttributeConditionContext.class);
		}
		public AttributeConditionContext attributeCondition(int i) {
			return getRuleContext(AttributeConditionContext.class,i);
		}
		public AttributeConditionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attributeConditions; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LQListener ) ((LQListener)listener).enterAttributeConditions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LQListener ) ((LQListener)listener).exitAttributeConditions(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LQVisitor ) return ((LQVisitor<? extends T>)visitor).visitAttributeConditions(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AttributeConditionsContext attributeConditions() throws RecognitionException {
		AttributeConditionsContext _localctx = new AttributeConditionsContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_attributeConditions);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(88); 
			match(T__1);
			setState(89); 
			attributeCondition();
			setState(94);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(90); 
				match(T__3);
				setState(91); 
				attributeCondition();
				}
				}
				setState(96);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(97); 
			match(T__2);
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

	public static class AttributeConditionContext extends ParserRuleContext {
		public AttributeSelectorContext attributeSelector() {
			return getRuleContext(AttributeSelectorContext.class,0);
		}
		public BinaryOperatorContext binaryOperator() {
			return getRuleContext(BinaryOperatorContext.class,0);
		}
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public VariableAttrSelectorContext variableAttrSelector() {
			return getRuleContext(VariableAttrSelectorContext.class,0);
		}
		public AttributeConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attributeCondition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LQListener ) ((LQListener)listener).enterAttributeCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LQListener ) ((LQListener)listener).exitAttributeCondition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LQVisitor ) return ((LQVisitor<? extends T>)visitor).visitAttributeCondition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AttributeConditionContext attributeCondition() throws RecognitionException {
		AttributeConditionContext _localctx = new AttributeConditionContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_attributeCondition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(99); 
			attributeSelector();
			setState(100); 
			binaryOperator();
			setState(103);
			switch (_input.LA(1)) {
			case Int:
			case Float:
			case QuotedString:
				{
				setState(101); 
				value();
				}
				break;
			case Name:
				{
				setState(102); 
				variableAttrSelector();
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

	public static class LinkConditionContext extends ParserRuleContext {
		public List<VariableNameContext> variableName() {
			return getRuleContexts(VariableNameContext.class);
		}
		public VariableNameContext variableName(int i) {
			return getRuleContext(VariableNameContext.class,i);
		}
		public LinkNameContext linkName() {
			return getRuleContext(LinkNameContext.class,0);
		}
		public LinkConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_linkCondition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LQListener ) ((LQListener)listener).enterLinkCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LQListener ) ((LQListener)listener).exitLinkCondition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LQVisitor ) return ((LQVisitor<? extends T>)visitor).visitLinkCondition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LinkConditionContext linkCondition() throws RecognitionException {
		LinkConditionContext _localctx = new LinkConditionContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_linkCondition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(105); 
			match(T__1);
			setState(106); 
			variableName();
			setState(107); 
			linkName();
			setState(109);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				{
				setState(108); 
				variableName();
				}
				break;
			}
			setState(111); 
			variableName();
			setState(112); 
			match(T__2);
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

	public static class FunctionalLinkConditionContext extends ParserRuleContext {
		public LinkNameContext linkName() {
			return getRuleContext(LinkNameContext.class,0);
		}
		public VariableNameContext variableName() {
			return getRuleContext(VariableNameContext.class,0);
		}
		public AttributeConditionContext attributeCondition() {
			return getRuleContext(AttributeConditionContext.class,0);
		}
		public FunctionalLinkConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionalLinkCondition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LQListener ) ((LQListener)listener).enterFunctionalLinkCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LQListener ) ((LQListener)listener).exitFunctionalLinkCondition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LQVisitor ) return ((LQVisitor<? extends T>)visitor).visitFunctionalLinkCondition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionalLinkConditionContext functionalLinkCondition() throws RecognitionException {
		FunctionalLinkConditionContext _localctx = new FunctionalLinkConditionContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_functionalLinkCondition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(114); 
			linkName();
			setState(115); 
			match(T__1);
			setState(116); 
			variableName();
			setState(117); 
			match(T__2);
			setState(118); 
			match(T__5);
			setState(119); 
			attributeCondition();
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

	public static class VariableOperatorConditionContext extends ParserRuleContext {
		public List<VariableAttrSelectorContext> variableAttrSelector() {
			return getRuleContexts(VariableAttrSelectorContext.class);
		}
		public VariableAttrSelectorContext variableAttrSelector(int i) {
			return getRuleContext(VariableAttrSelectorContext.class,i);
		}
		public BinaryOperatorContext binaryOperator() {
			return getRuleContext(BinaryOperatorContext.class,0);
		}
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public VariableOperatorConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableOperatorCondition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LQListener ) ((LQListener)listener).enterVariableOperatorCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LQListener ) ((LQListener)listener).exitVariableOperatorCondition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LQVisitor ) return ((LQVisitor<? extends T>)visitor).visitVariableOperatorCondition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableOperatorConditionContext variableOperatorCondition() throws RecognitionException {
		VariableOperatorConditionContext _localctx = new VariableOperatorConditionContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_variableOperatorCondition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(121); 
			variableAttrSelector();
			setState(122); 
			binaryOperator();
			setState(125);
			switch (_input.LA(1)) {
			case Int:
			case Float:
			case QuotedString:
				{
				setState(123); 
				value();
				}
				break;
			case Name:
				{
				setState(124); 
				variableAttrSelector();
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

	public static class VariableAttrSelectorContext extends ParserRuleContext {
		public VariableNameContext variableName() {
			return getRuleContext(VariableNameContext.class,0);
		}
		public List<AttributeNameContext> attributeName() {
			return getRuleContexts(AttributeNameContext.class);
		}
		public AttributeNameContext attributeName(int i) {
			return getRuleContext(AttributeNameContext.class,i);
		}
		public VariableAttrSelectorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableAttrSelector; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LQListener ) ((LQListener)listener).enterVariableAttrSelector(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LQListener ) ((LQListener)listener).exitVariableAttrSelector(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LQVisitor ) return ((LQVisitor<? extends T>)visitor).visitVariableAttrSelector(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableAttrSelectorContext variableAttrSelector() throws RecognitionException {
		VariableAttrSelectorContext _localctx = new VariableAttrSelectorContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_variableAttrSelector);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(127); 
			variableName();
			setState(132);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__5) {
				{
				{
				setState(128); 
				match(T__5);
				setState(129); 
				attributeName();
				}
				}
				setState(134);
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

	public static class AttributeSelectorContext extends ParserRuleContext {
		public List<AttributeNameContext> attributeName() {
			return getRuleContexts(AttributeNameContext.class);
		}
		public AttributeNameContext attributeName(int i) {
			return getRuleContext(AttributeNameContext.class,i);
		}
		public AttributeSelectorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attributeSelector; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LQListener ) ((LQListener)listener).enterAttributeSelector(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LQListener ) ((LQListener)listener).exitAttributeSelector(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LQVisitor ) return ((LQVisitor<? extends T>)visitor).visitAttributeSelector(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AttributeSelectorContext attributeSelector() throws RecognitionException {
		AttributeSelectorContext _localctx = new AttributeSelectorContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_attributeSelector);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(135); 
			attributeName();
			setState(140);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__5) {
				{
				{
				setState(136); 
				match(T__5);
				setState(137); 
				attributeName();
				}
				}
				setState(142);
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

	public static class VariableNameContext extends ParserRuleContext {
		public TerminalNode Name() { return getToken(LQParser.Name, 0); }
		public VariableNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LQListener ) ((LQListener)listener).enterVariableName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LQListener ) ((LQListener)listener).exitVariableName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LQVisitor ) return ((LQVisitor<? extends T>)visitor).visitVariableName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableNameContext variableName() throws RecognitionException {
		VariableNameContext _localctx = new VariableNameContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_variableName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(143); 
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

	public static class ClassNameContext extends ParserRuleContext {
		public TerminalNode Name() { return getToken(LQParser.Name, 0); }
		public ClassNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_className; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LQListener ) ((LQListener)listener).enterClassName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LQListener ) ((LQListener)listener).exitClassName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LQVisitor ) return ((LQVisitor<? extends T>)visitor).visitClassName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassNameContext className() throws RecognitionException {
		ClassNameContext _localctx = new ClassNameContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_className);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(145); 
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

	public static class LinkNameContext extends ParserRuleContext {
		public TerminalNode Name() { return getToken(LQParser.Name, 0); }
		public LinkNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_linkName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LQListener ) ((LQListener)listener).enterLinkName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LQListener ) ((LQListener)listener).exitLinkName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LQVisitor ) return ((LQVisitor<? extends T>)visitor).visitLinkName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LinkNameContext linkName() throws RecognitionException {
		LinkNameContext _localctx = new LinkNameContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_linkName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(147); 
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

	public static class AttributeNameContext extends ParserRuleContext {
		public TerminalNode Name() { return getToken(LQParser.Name, 0); }
		public AttributeNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attributeName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LQListener ) ((LQListener)listener).enterAttributeName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LQListener ) ((LQListener)listener).exitAttributeName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LQVisitor ) return ((LQVisitor<? extends T>)visitor).visitAttributeName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AttributeNameContext attributeName() throws RecognitionException {
		AttributeNameContext _localctx = new AttributeNameContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_attributeName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(149); 
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

	public static class AggregateFunctionContext extends ParserRuleContext {
		public TerminalNode SUM() { return getToken(LQParser.SUM, 0); }
		public TerminalNode AVG() { return getToken(LQParser.AVG, 0); }
		public TerminalNode MIN() { return getToken(LQParser.MIN, 0); }
		public TerminalNode MAX() { return getToken(LQParser.MAX, 0); }
		public AggregateFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_aggregateFunction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LQListener ) ((LQListener)listener).enterAggregateFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LQListener ) ((LQListener)listener).exitAggregateFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LQVisitor ) return ((LQVisitor<? extends T>)visitor).visitAggregateFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AggregateFunctionContext aggregateFunction() throws RecognitionException {
		AggregateFunctionContext _localctx = new AggregateFunctionContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_aggregateFunction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(151);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SUM) | (1L << AVG) | (1L << MIN) | (1L << MAX))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
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
		public TerminalNode EQ() { return getToken(LQParser.EQ, 0); }
		public TerminalNode NOTEQ() { return getToken(LQParser.NOTEQ, 0); }
		public TerminalNode LT() { return getToken(LQParser.LT, 0); }
		public TerminalNode LE() { return getToken(LQParser.LE, 0); }
		public TerminalNode GT() { return getToken(LQParser.GT, 0); }
		public TerminalNode GE() { return getToken(LQParser.GE, 0); }
		public TerminalNode LIKE() { return getToken(LQParser.LIKE, 0); }
		public BinaryOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_binaryOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LQListener ) ((LQListener)listener).enterBinaryOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LQListener ) ((LQListener)listener).exitBinaryOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LQVisitor ) return ((LQVisitor<? extends T>)visitor).visitBinaryOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BinaryOperatorContext binaryOperator() throws RecognitionException {
		BinaryOperatorContext _localctx = new BinaryOperatorContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_binaryOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(153);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EQ) | (1L << NOTEQ) | (1L << LT) | (1L << LE) | (1L << GT) | (1L << GE) | (1L << LIKE))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
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

	public static class ValueContext extends ParserRuleContext {
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public TerminalNode QuotedString() { return getToken(LQParser.QuotedString, 0); }
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LQListener ) ((LQListener)listener).enterValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LQListener ) ((LQListener)listener).exitValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LQVisitor ) return ((LQVisitor<? extends T>)visitor).visitValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_value);
		try {
			setState(157);
			switch (_input.LA(1)) {
			case Int:
			case Float:
				enterOuterAlt(_localctx, 1);
				{
				setState(155); 
				number();
				}
				break;
			case QuotedString:
				enterOuterAlt(_localctx, 2);
				{
				setState(156); 
				match(QuotedString);
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

	public static class NumberContext extends ParserRuleContext {
		public TerminalNode Int() { return getToken(LQParser.Int, 0); }
		public TerminalNode Float() { return getToken(LQParser.Float, 0); }
		public NumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_number; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LQListener ) ((LQListener)listener).enterNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LQListener ) ((LQListener)listener).exitNumber(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LQVisitor ) return ((LQVisitor<? extends T>)visitor).visitNumber(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumberContext number() throws RecognitionException {
		NumberContext _localctx = new NumberContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_number);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(159);
			_la = _input.LA(1);
			if ( !(_la==Int || _la==Float) ) {
			_errHandler.recoverInline(this);
			}
			consume();
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

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\32\u00a4\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\3\3\3\3\3\3\7\38\n\3\f\3\16\3;\13\3\3\3\5\3>\n\3\3\4\3\4\3\5\3\5"+
		"\3\5\3\5\3\5\3\6\3\6\3\6\7\6J\n\6\f\6\16\6M\13\6\3\7\3\7\3\7\3\7\5\7S"+
		"\n\7\3\b\3\b\3\b\3\b\5\bY\n\b\3\t\3\t\3\t\3\t\7\t_\n\t\f\t\16\tb\13\t"+
		"\3\t\3\t\3\n\3\n\3\n\3\n\5\nj\n\n\3\13\3\13\3\13\3\13\5\13p\n\13\3\13"+
		"\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\5\r\u0080\n\r\3"+
		"\16\3\16\3\16\7\16\u0085\n\16\f\16\16\16\u0088\13\16\3\17\3\17\3\17\7"+
		"\17\u008d\n\17\f\17\16\17\u0090\13\17\3\20\3\20\3\21\3\21\3\22\3\22\3"+
		"\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26\5\26\u00a0\n\26\3\27\3\27\3\27"+
		"\2\2\30\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,\2\5\3\2\16\21\3"+
		"\2\22\30\3\2\13\f\u009b\2.\3\2\2\2\4=\3\2\2\2\6?\3\2\2\2\bA\3\2\2\2\n"+
		"F\3\2\2\2\fR\3\2\2\2\16T\3\2\2\2\20Z\3\2\2\2\22e\3\2\2\2\24k\3\2\2\2\26"+
		"t\3\2\2\2\30{\3\2\2\2\32\u0081\3\2\2\2\34\u0089\3\2\2\2\36\u0091\3\2\2"+
		"\2 \u0093\3\2\2\2\"\u0095\3\2\2\2$\u0097\3\2\2\2&\u0099\3\2\2\2(\u009b"+
		"\3\2\2\2*\u009f\3\2\2\2,\u00a1\3\2\2\2./\7\t\2\2/\60\5\4\3\2\60\61\7\n"+
		"\2\2\61\62\5\n\6\2\62\63\7\2\2\3\63\3\3\2\2\2\649\5\6\4\2\65\66\7\3\2"+
		"\2\668\5\6\4\2\67\65\3\2\2\28;\3\2\2\29\67\3\2\2\29:\3\2\2\2:>\3\2\2\2"+
		";9\3\2\2\2<>\5\b\5\2=\64\3\2\2\2=<\3\2\2\2>\5\3\2\2\2?@\5\32\16\2@\7\3"+
		"\2\2\2AB\5&\24\2BC\7\4\2\2CD\5\34\17\2DE\7\5\2\2E\t\3\2\2\2FK\5\f\7\2"+
		"GH\7\6\2\2HJ\5\f\7\2IG\3\2\2\2JM\3\2\2\2KI\3\2\2\2KL\3\2\2\2L\13\3\2\2"+
		"\2MK\3\2\2\2NS\5\16\b\2OS\5\30\r\2PS\5\24\13\2QS\5\26\f\2RN\3\2\2\2RO"+
		"\3\2\2\2RP\3\2\2\2RQ\3\2\2\2S\r\3\2\2\2TU\5\36\20\2UV\7\7\2\2VX\5 \21"+
		"\2WY\5\20\t\2XW\3\2\2\2XY\3\2\2\2Y\17\3\2\2\2Z[\7\4\2\2[`\5\22\n\2\\]"+
		"\7\6\2\2]_\5\22\n\2^\\\3\2\2\2_b\3\2\2\2`^\3\2\2\2`a\3\2\2\2ac\3\2\2\2"+
		"b`\3\2\2\2cd\7\5\2\2d\21\3\2\2\2ef\5\34\17\2fi\5(\25\2gj\5*\26\2hj\5\32"+
		"\16\2ig\3\2\2\2ih\3\2\2\2j\23\3\2\2\2kl\7\4\2\2lm\5\36\20\2mo\5\"\22\2"+
		"np\5\36\20\2on\3\2\2\2op\3\2\2\2pq\3\2\2\2qr\5\36\20\2rs\7\5\2\2s\25\3"+
		"\2\2\2tu\5\"\22\2uv\7\4\2\2vw\5\36\20\2wx\7\5\2\2xy\7\b\2\2yz\5\22\n\2"+
		"z\27\3\2\2\2{|\5\32\16\2|\177\5(\25\2}\u0080\5*\26\2~\u0080\5\32\16\2"+
		"\177}\3\2\2\2\177~\3\2\2\2\u0080\31\3\2\2\2\u0081\u0086\5\36\20\2\u0082"+
		"\u0083\7\b\2\2\u0083\u0085\5$\23\2\u0084\u0082\3\2\2\2\u0085\u0088\3\2"+
		"\2\2\u0086\u0084\3\2\2\2\u0086\u0087\3\2\2\2\u0087\33\3\2\2\2\u0088\u0086"+
		"\3\2\2\2\u0089\u008e\5$\23\2\u008a\u008b\7\b\2\2\u008b\u008d\5$\23\2\u008c"+
		"\u008a\3\2\2\2\u008d\u0090\3\2\2\2\u008e\u008c\3\2\2\2\u008e\u008f\3\2"+
		"\2\2\u008f\35\3\2\2\2\u0090\u008e\3\2\2\2\u0091\u0092\7\31\2\2\u0092\37"+
		"\3\2\2\2\u0093\u0094\7\31\2\2\u0094!\3\2\2\2\u0095\u0096\7\31\2\2\u0096"+
		"#\3\2\2\2\u0097\u0098\7\31\2\2\u0098%\3\2\2\2\u0099\u009a\t\2\2\2\u009a"+
		"\'\3\2\2\2\u009b\u009c\t\3\2\2\u009c)\3\2\2\2\u009d\u00a0\5,\27\2\u009e"+
		"\u00a0\7\r\2\2\u009f\u009d\3\2\2\2\u009f\u009e\3\2\2\2\u00a0+\3\2\2\2"+
		"\u00a1\u00a2\t\4\2\2\u00a2-\3\2\2\2\169=KRX`io\177\u0086\u008e\u009f";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}