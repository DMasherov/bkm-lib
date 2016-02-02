package mpei.bkm.parsing.structurescheme.parsers;

// Generated from StructureScheme.g4 by ANTLR 4.5.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class StructureSchemeParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, Range=24, 
		Int=25, Float=26, Name=27, EQ=28, NOTEQ=29, LT=30, LE=31, GT=32, GE=33, 
		QuotedString=34, Comment=35, Space=36;
	public static final int
		RULE_scheme = 0, RULE_schemeName = 1, RULE_conceptSentence = 2, RULE_classSentence = 3, 
		RULE_binaryLinkSentence = 4, RULE_isaSentence = 5, RULE_attributes = 6, 
		RULE_attribute = 7, RULE_dataTypeAttribute = 8, RULE_conceptAttribute = 9, 
		RULE_classAttributeCondition = 10, RULE_baseAttributeCondition = 11, RULE_elementaryAttributeCondition = 12, 
		RULE_intervalRestriction = 13, RULE_fullIntervalRestriction = 14, RULE_contractedIntervalRestriction = 15, 
		RULE_atomRestriction = 16, RULE_dataType = 17, RULE_primitiveType = 18, 
		RULE_rangeDataType = 19, RULE_labeledDataType = 20, RULE_conceptType = 21, 
		RULE_selector = 22, RULE_className = 23, RULE_binaryLinkName = 24, RULE_attributeValue = 25, 
		RULE_definedTypeName = 26, RULE_binaryOperator = 27, RULE_number = 28;
	public static final String[] ruleNames = {
		"scheme", "schemeName", "conceptSentence", "classSentence", "binaryLinkSentence", 
		"isaSentence", "attributes", "attribute", "dataTypeAttribute", "conceptAttribute", 
		"classAttributeCondition", "baseAttributeCondition", "elementaryAttributeCondition", 
		"intervalRestriction", "fullIntervalRestriction", "contractedIntervalRestriction", 
		"atomRestriction", "dataType", "primitiveType", "rangeDataType", "labeledDataType", 
		"conceptType", "selector", "className", "binaryLinkName", "attributeValue", 
		"definedTypeName", "binaryOperator", "number"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'SCHEME'", "':'", "'.'", "'END'", "'['", "']'", "'('", "')'", "'ISA'", 
		"','", "';'", "'->'", "'*'", "'|'", "'{'", "'}'", "'LIST'", "'LLIST'", 
		"'Boolean'", "'Number'", "'Integer'", "'Char'", "'String'", null, null, 
		null, null, "'='", "'=/='", "'<'", "'<='", "'>'", "'>='"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		"Range", "Int", "Float", "Name", "EQ", "NOTEQ", "LT", "LE", "GT", "GE", 
		"QuotedString", "Comment", "Space"
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
	public String getGrammarFileName() { return "StructureScheme.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public StructureSchemeParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class SchemeContext extends ParserRuleContext {
		public SchemeNameContext schemeName() {
			return getRuleContext(SchemeNameContext.class,0);
		}
		public TerminalNode EOF() { return getToken(StructureSchemeParser.EOF, 0); }
		public List<ConceptSentenceContext> conceptSentence() {
			return getRuleContexts(ConceptSentenceContext.class);
		}
		public ConceptSentenceContext conceptSentence(int i) {
			return getRuleContext(ConceptSentenceContext.class,i);
		}
		public SchemeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_scheme; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StructureSchemeListener ) ((StructureSchemeListener)listener).enterScheme(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StructureSchemeListener ) ((StructureSchemeListener)listener).exitScheme(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StructureSchemeVisitor ) return ((StructureSchemeVisitor<? extends T>)visitor).visitScheme(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SchemeContext scheme() throws RecognitionException {
		SchemeContext _localctx = new SchemeContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_scheme);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(58);
			match(T__0);
			setState(59);
			schemeName();
			setState(60);
			match(T__1);
			setState(64); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(61);
				conceptSentence();
				setState(62);
				match(T__2);
				}
				}
				setState(66); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__6 || _la==Name );
			setState(68);
			match(T__3);
			setState(69);
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

	public static class SchemeNameContext extends ParserRuleContext {
		public TerminalNode QuotedString() { return getToken(StructureSchemeParser.QuotedString, 0); }
		public SchemeNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_schemeName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StructureSchemeListener ) ((StructureSchemeListener)listener).enterSchemeName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StructureSchemeListener ) ((StructureSchemeListener)listener).exitSchemeName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StructureSchemeVisitor ) return ((StructureSchemeVisitor<? extends T>)visitor).visitSchemeName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SchemeNameContext schemeName() throws RecognitionException {
		SchemeNameContext _localctx = new SchemeNameContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_schemeName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(71);
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

	public static class ConceptSentenceContext extends ParserRuleContext {
		public ClassSentenceContext classSentence() {
			return getRuleContext(ClassSentenceContext.class,0);
		}
		public BinaryLinkSentenceContext binaryLinkSentence() {
			return getRuleContext(BinaryLinkSentenceContext.class,0);
		}
		public IsaSentenceContext isaSentence() {
			return getRuleContext(IsaSentenceContext.class,0);
		}
		public ConceptSentenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conceptSentence; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StructureSchemeListener ) ((StructureSchemeListener)listener).enterConceptSentence(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StructureSchemeListener ) ((StructureSchemeListener)listener).exitConceptSentence(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StructureSchemeVisitor ) return ((StructureSchemeVisitor<? extends T>)visitor).visitConceptSentence(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConceptSentenceContext conceptSentence() throws RecognitionException {
		ConceptSentenceContext _localctx = new ConceptSentenceContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_conceptSentence);
		try {
			setState(76);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(73);
				classSentence();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(74);
				binaryLinkSentence();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(75);
				isaSentence();
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

	public static class ClassSentenceContext extends ParserRuleContext {
		public ClassNameContext className() {
			return getRuleContext(ClassNameContext.class,0);
		}
		public AttributesContext attributes() {
			return getRuleContext(AttributesContext.class,0);
		}
		public ClassSentenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classSentence; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StructureSchemeListener ) ((StructureSchemeListener)listener).enterClassSentence(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StructureSchemeListener ) ((StructureSchemeListener)listener).exitClassSentence(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StructureSchemeVisitor ) return ((StructureSchemeVisitor<? extends T>)visitor).visitClassSentence(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassSentenceContext classSentence() throws RecognitionException {
		ClassSentenceContext _localctx = new ClassSentenceContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_classSentence);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(78);
			className();
			setState(79);
			match(T__4);
			setState(80);
			attributes();
			setState(81);
			match(T__5);
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

	public static class BinaryLinkSentenceContext extends ParserRuleContext {
		public List<ClassAttributeConditionContext> classAttributeCondition() {
			return getRuleContexts(ClassAttributeConditionContext.class);
		}
		public ClassAttributeConditionContext classAttributeCondition(int i) {
			return getRuleContext(ClassAttributeConditionContext.class,i);
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
		public BinaryLinkSentenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_binaryLinkSentence; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StructureSchemeListener ) ((StructureSchemeListener)listener).enterBinaryLinkSentence(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StructureSchemeListener ) ((StructureSchemeListener)listener).exitBinaryLinkSentence(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StructureSchemeVisitor ) return ((StructureSchemeVisitor<? extends T>)visitor).visitBinaryLinkSentence(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BinaryLinkSentenceContext binaryLinkSentence() throws RecognitionException {
		BinaryLinkSentenceContext _localctx = new BinaryLinkSentenceContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_binaryLinkSentence);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(83);
			match(T__6);
			setState(84);
			classAttributeCondition();
			setState(85);
			binaryLinkName();
			setState(87);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				{
				setState(86);
				intervalRestriction();
				}
				break;
			}
			setState(89);
			classAttributeCondition();
			setState(90);
			match(T__7);
			setState(95);
			_la = _input.LA(1);
			if (_la==T__4) {
				{
				setState(91);
				match(T__4);
				setState(92);
				attributes();
				setState(93);
				match(T__5);
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

	public static class IsaSentenceContext extends ParserRuleContext {
		public List<TerminalNode> Name() { return getTokens(StructureSchemeParser.Name); }
		public TerminalNode Name(int i) {
			return getToken(StructureSchemeParser.Name, i);
		}
		public IsaSentenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_isaSentence; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StructureSchemeListener ) ((StructureSchemeListener)listener).enterIsaSentence(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StructureSchemeListener ) ((StructureSchemeListener)listener).exitIsaSentence(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StructureSchemeVisitor ) return ((StructureSchemeVisitor<? extends T>)visitor).visitIsaSentence(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IsaSentenceContext isaSentence() throws RecognitionException {
		IsaSentenceContext _localctx = new IsaSentenceContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_isaSentence);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(97);
			match(Name);
			setState(98);
			match(T__8);
			setState(99);
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
			if ( listener instanceof StructureSchemeListener ) ((StructureSchemeListener)listener).enterAttributes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StructureSchemeListener ) ((StructureSchemeListener)listener).exitAttributes(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StructureSchemeVisitor ) return ((StructureSchemeVisitor<? extends T>)visitor).visitAttributes(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AttributesContext attributes() throws RecognitionException {
		AttributesContext _localctx = new AttributesContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_attributes);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(101);
			attribute();
			setState(106);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__9) {
				{
				{
				setState(102);
				match(T__9);
				setState(103);
				attribute();
				}
				}
				setState(108);
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
			if ( listener instanceof StructureSchemeListener ) ((StructureSchemeListener)listener).enterAttribute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StructureSchemeListener ) ((StructureSchemeListener)listener).exitAttribute(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StructureSchemeVisitor ) return ((StructureSchemeVisitor<? extends T>)visitor).visitAttribute(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AttributeContext attribute() throws RecognitionException {
		AttributeContext _localctx = new AttributeContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_attribute);
		try {
			setState(111);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(109);
				conceptAttribute();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(110);
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
		public TerminalNode Name() { return getToken(StructureSchemeParser.Name, 0); }
		public DataTypeContext dataType() {
			return getRuleContext(DataTypeContext.class,0);
		}
		public DataTypeAttributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dataTypeAttribute; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StructureSchemeListener ) ((StructureSchemeListener)listener).enterDataTypeAttribute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StructureSchemeListener ) ((StructureSchemeListener)listener).exitDataTypeAttribute(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StructureSchemeVisitor ) return ((StructureSchemeVisitor<? extends T>)visitor).visitDataTypeAttribute(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DataTypeAttributeContext dataTypeAttribute() throws RecognitionException {
		DataTypeAttributeContext _localctx = new DataTypeAttributeContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_dataTypeAttribute);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(113);
			match(Name);
			setState(114);
			match(T__1);
			setState(115);
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
		public TerminalNode Name() { return getToken(StructureSchemeParser.Name, 0); }
		public ConceptAttributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conceptAttribute; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StructureSchemeListener ) ((StructureSchemeListener)listener).enterConceptAttribute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StructureSchemeListener ) ((StructureSchemeListener)listener).exitConceptAttribute(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StructureSchemeVisitor ) return ((StructureSchemeVisitor<? extends T>)visitor).visitConceptAttribute(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConceptAttributeContext conceptAttribute() throws RecognitionException {
		ConceptAttributeContext _localctx = new ConceptAttributeContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_conceptAttribute);
		try {
			setState(121);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(117);
				conceptType(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(118);
				match(Name);
				setState(119);
				match(T__1);
				setState(120);
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

	public static class ClassAttributeConditionContext extends ParserRuleContext {
		public ConceptAttributeContext conceptAttribute() {
			return getRuleContext(ConceptAttributeContext.class,0);
		}
		public BaseAttributeConditionContext baseAttributeCondition() {
			return getRuleContext(BaseAttributeConditionContext.class,0);
		}
		public ClassAttributeConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classAttributeCondition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StructureSchemeListener ) ((StructureSchemeListener)listener).enterClassAttributeCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StructureSchemeListener ) ((StructureSchemeListener)listener).exitClassAttributeCondition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StructureSchemeVisitor ) return ((StructureSchemeVisitor<? extends T>)visitor).visitClassAttributeCondition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassAttributeConditionContext classAttributeCondition() throws RecognitionException {
		ClassAttributeConditionContext _localctx = new ClassAttributeConditionContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_classAttributeCondition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(123);
			conceptAttribute();
			setState(125);
			_la = _input.LA(1);
			if (_la==T__6) {
				{
				setState(124);
				baseAttributeCondition();
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

	public static class BaseAttributeConditionContext extends ParserRuleContext {
		public List<ElementaryAttributeConditionContext> elementaryAttributeCondition() {
			return getRuleContexts(ElementaryAttributeConditionContext.class);
		}
		public ElementaryAttributeConditionContext elementaryAttributeCondition(int i) {
			return getRuleContext(ElementaryAttributeConditionContext.class,i);
		}
		public BaseAttributeConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_baseAttributeCondition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StructureSchemeListener ) ((StructureSchemeListener)listener).enterBaseAttributeCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StructureSchemeListener ) ((StructureSchemeListener)listener).exitBaseAttributeCondition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StructureSchemeVisitor ) return ((StructureSchemeVisitor<? extends T>)visitor).visitBaseAttributeCondition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BaseAttributeConditionContext baseAttributeCondition() throws RecognitionException {
		BaseAttributeConditionContext _localctx = new BaseAttributeConditionContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_baseAttributeCondition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(127);
			match(T__6);
			setState(128);
			elementaryAttributeCondition();
			setState(133);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__10) {
				{
				{
				setState(129);
				match(T__10);
				setState(130);
				elementaryAttributeCondition();
				}
				}
				setState(135);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(136);
			match(T__7);
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

	public static class ElementaryAttributeConditionContext extends ParserRuleContext {
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
		public ElementaryAttributeConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementaryAttributeCondition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StructureSchemeListener ) ((StructureSchemeListener)listener).enterElementaryAttributeCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StructureSchemeListener ) ((StructureSchemeListener)listener).exitElementaryAttributeCondition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StructureSchemeVisitor ) return ((StructureSchemeVisitor<? extends T>)visitor).visitElementaryAttributeCondition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElementaryAttributeConditionContext elementaryAttributeCondition() throws RecognitionException {
		ElementaryAttributeConditionContext _localctx = new ElementaryAttributeConditionContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_elementaryAttributeCondition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(138);
			selector();
			setState(139);
			binaryOperator();
			setState(142);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				{
				setState(140);
				selector();
				}
				break;
			case 2:
				{
				setState(141);
				attributeValue();
				}
				break;
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
			if ( listener instanceof StructureSchemeListener ) ((StructureSchemeListener)listener).enterIntervalRestriction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StructureSchemeListener ) ((StructureSchemeListener)listener).exitIntervalRestriction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StructureSchemeVisitor ) return ((StructureSchemeVisitor<? extends T>)visitor).visitIntervalRestriction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IntervalRestrictionContext intervalRestriction() throws RecognitionException {
		IntervalRestrictionContext _localctx = new IntervalRestrictionContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_intervalRestriction);
		try {
			setState(147);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(144);
				fullIntervalRestriction();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(145);
				contractedIntervalRestriction();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(146);
				match(T__11);
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
			if ( listener instanceof StructureSchemeListener ) ((StructureSchemeListener)listener).enterFullIntervalRestriction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StructureSchemeListener ) ((StructureSchemeListener)listener).exitFullIntervalRestriction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StructureSchemeVisitor ) return ((StructureSchemeVisitor<? extends T>)visitor).visitFullIntervalRestriction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FullIntervalRestrictionContext fullIntervalRestriction() throws RecognitionException {
		FullIntervalRestrictionContext _localctx = new FullIntervalRestrictionContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_fullIntervalRestriction);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(149);
			match(T__6);
			setState(150);
			atomRestriction();
			setState(151);
			match(T__9);
			setState(152);
			atomRestriction();
			setState(153);
			match(T__7);
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
			if ( listener instanceof StructureSchemeListener ) ((StructureSchemeListener)listener).enterContractedIntervalRestriction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StructureSchemeListener ) ((StructureSchemeListener)listener).exitContractedIntervalRestriction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StructureSchemeVisitor ) return ((StructureSchemeVisitor<? extends T>)visitor).visitContractedIntervalRestriction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ContractedIntervalRestrictionContext contractedIntervalRestriction() throws RecognitionException {
		ContractedIntervalRestrictionContext _localctx = new ContractedIntervalRestrictionContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_contractedIntervalRestriction);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(155);
			match(T__6);
			setState(156);
			atomRestriction();
			setState(157);
			match(T__7);
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
		public TerminalNode EQ() { return getToken(StructureSchemeParser.EQ, 0); }
		public List<TerminalNode> Int() { return getTokens(StructureSchemeParser.Int); }
		public TerminalNode Int(int i) {
			return getToken(StructureSchemeParser.Int, i);
		}
		public TerminalNode LE() { return getToken(StructureSchemeParser.LE, 0); }
		public TerminalNode LT() { return getToken(StructureSchemeParser.LT, 0); }
		public TerminalNode GT() { return getToken(StructureSchemeParser.GT, 0); }
		public TerminalNode GE() { return getToken(StructureSchemeParser.GE, 0); }
		public AtomRestrictionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atomRestriction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StructureSchemeListener ) ((StructureSchemeListener)listener).enterAtomRestriction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StructureSchemeListener ) ((StructureSchemeListener)listener).exitAtomRestriction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StructureSchemeVisitor ) return ((StructureSchemeVisitor<? extends T>)visitor).visitAtomRestriction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AtomRestrictionContext atomRestriction() throws RecognitionException {
		AtomRestrictionContext _localctx = new AtomRestrictionContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_atomRestriction);
		try {
			setState(173);
			switch (_input.LA(1)) {
			case EQ:
				enterOuterAlt(_localctx, 1);
				{
				setState(159);
				match(EQ);
				setState(160);
				match(Int);
				}
				break;
			case LE:
				enterOuterAlt(_localctx, 2);
				{
				setState(161);
				match(LE);
				setState(162);
				match(Int);
				}
				break;
			case LT:
				enterOuterAlt(_localctx, 3);
				{
				setState(163);
				match(LT);
				setState(164);
				match(Int);
				}
				break;
			case GT:
				enterOuterAlt(_localctx, 4);
				{
				setState(165);
				match(GT);
				setState(166);
				match(Int);
				}
				break;
			case GE:
				enterOuterAlt(_localctx, 5);
				{
				setState(167);
				match(GE);
				setState(168);
				match(Int);
				}
				break;
			case Int:
				enterOuterAlt(_localctx, 6);
				{
				setState(169);
				match(Int);
				setState(170);
				match(T__1);
				setState(171);
				match(Int);
				}
				break;
			case T__12:
				enterOuterAlt(_localctx, 7);
				{
				setState(172);
				match(T__12);
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
			if ( listener instanceof StructureSchemeListener ) ((StructureSchemeListener)listener).enterDefinedTypeRuleLabel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StructureSchemeListener ) ((StructureSchemeListener)listener).exitDefinedTypeRuleLabel(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StructureSchemeVisitor ) return ((StructureSchemeVisitor<? extends T>)visitor).visitDefinedTypeRuleLabel(this);
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
			if ( listener instanceof StructureSchemeListener ) ((StructureSchemeListener)listener).enterPrimitiveData(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StructureSchemeListener ) ((StructureSchemeListener)listener).exitPrimitiveData(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StructureSchemeVisitor ) return ((StructureSchemeVisitor<? extends T>)visitor).visitPrimitiveData(this);
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
			if ( listener instanceof StructureSchemeListener ) ((StructureSchemeListener)listener).enterUnionData(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StructureSchemeListener ) ((StructureSchemeListener)listener).exitUnionData(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StructureSchemeVisitor ) return ((StructureSchemeVisitor<? extends T>)visitor).visitUnionData(this);
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
			if ( listener instanceof StructureSchemeListener ) ((StructureSchemeListener)listener).enterStarData(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StructureSchemeListener ) ((StructureSchemeListener)listener).exitStarData(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StructureSchemeVisitor ) return ((StructureSchemeVisitor<? extends T>)visitor).visitStarData(this);
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
			if ( listener instanceof StructureSchemeListener ) ((StructureSchemeListener)listener).enterRangeData(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StructureSchemeListener ) ((StructureSchemeListener)listener).exitRangeData(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StructureSchemeVisitor ) return ((StructureSchemeVisitor<? extends T>)visitor).visitRangeData(this);
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
			if ( listener instanceof StructureSchemeListener ) ((StructureSchemeListener)listener).enterCartesianProductData(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StructureSchemeListener ) ((StructureSchemeListener)listener).exitCartesianProductData(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StructureSchemeVisitor ) return ((StructureSchemeVisitor<? extends T>)visitor).visitCartesianProductData(this);
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
			if ( listener instanceof StructureSchemeListener ) ((StructureSchemeListener)listener).enterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StructureSchemeListener ) ((StructureSchemeListener)listener).exitList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StructureSchemeVisitor ) return ((StructureSchemeVisitor<? extends T>)visitor).visitList(this);
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
			if ( listener instanceof StructureSchemeListener ) ((StructureSchemeListener)listener).enterLabelRuleLabel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StructureSchemeListener ) ((StructureSchemeListener)listener).exitLabelRuleLabel(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StructureSchemeVisitor ) return ((StructureSchemeVisitor<? extends T>)visitor).visitLabelRuleLabel(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class EnumContext extends DataTypeContext {
		public List<TerminalNode> Name() { return getTokens(StructureSchemeParser.Name); }
		public TerminalNode Name(int i) {
			return getToken(StructureSchemeParser.Name, i);
		}
		public EnumContext(DataTypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StructureSchemeListener ) ((StructureSchemeListener)listener).enterEnum(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StructureSchemeListener ) ((StructureSchemeListener)listener).exitEnum(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StructureSchemeVisitor ) return ((StructureSchemeVisitor<? extends T>)visitor).visitEnum(this);
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
			if ( listener instanceof StructureSchemeListener ) ((StructureSchemeListener)listener).enterLlist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StructureSchemeListener ) ((StructureSchemeListener)listener).exitLlist(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StructureSchemeVisitor ) return ((StructureSchemeVisitor<? extends T>)visitor).visitLlist(this);
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
		int _startState = 34;
		enterRecursionRule(_localctx, 34, RULE_dataType, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(211);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				{
				_localctx = new PrimitiveDataContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(176);
				primitiveType();
				}
				break;
			case 2:
				{
				_localctx = new RangeDataContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(177);
				rangeDataType();
				}
				break;
			case 3:
				{
				_localctx = new LabelRuleLabelContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(178);
				labeledDataType();
				}
				break;
			case 4:
				{
				_localctx = new DefinedTypeRuleLabelContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(179);
				definedTypeName();
				}
				break;
			case 5:
				{
				_localctx = new CartesianProductDataContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(180);
				match(T__6);
				setState(181);
				dataType(0);
				setState(186);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__9) {
					{
					{
					setState(182);
					match(T__9);
					setState(183);
					dataType(0);
					}
					}
					setState(188);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(189);
				match(T__7);
				}
				break;
			case 6:
				{
				_localctx = new EnumContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(191);
				match(T__14);
				setState(192);
				match(Name);
				setState(197);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__9) {
					{
					{
					setState(193);
					match(T__9);
					setState(194);
					match(Name);
					}
					}
					setState(199);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(200);
				match(T__15);
				}
				break;
			case 7:
				{
				_localctx = new ListContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(201);
				match(T__16);
				setState(202);
				match(T__6);
				setState(203);
				dataType(0);
				setState(204);
				match(T__7);
				}
				break;
			case 8:
				{
				_localctx = new LlistContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(206);
				match(T__17);
				setState(207);
				match(T__6);
				setState(208);
				dataType(0);
				setState(209);
				match(T__7);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(222);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(220);
					switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
					case 1:
						{
						_localctx = new UnionDataContext(new DataTypeContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_dataType);
						setState(213);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(214);
						match(T__13);
						setState(215);
						dataType(6);
						}
						break;
					case 2:
						{
						_localctx = new StarDataContext(new DataTypeContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_dataType);
						setState(216);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(217);
						match(T__6);
						setState(218);
						match(T__12);
						setState(219);
						match(T__7);
						}
						break;
					}
					} 
				}
				setState(224);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
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
			if ( listener instanceof StructureSchemeListener ) ((StructureSchemeListener)listener).enterCharPrimitive(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StructureSchemeListener ) ((StructureSchemeListener)listener).exitCharPrimitive(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StructureSchemeVisitor ) return ((StructureSchemeVisitor<? extends T>)visitor).visitCharPrimitive(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IntegerPrimitiveContext extends PrimitiveTypeContext {
		public IntegerPrimitiveContext(PrimitiveTypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StructureSchemeListener ) ((StructureSchemeListener)listener).enterIntegerPrimitive(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StructureSchemeListener ) ((StructureSchemeListener)listener).exitIntegerPrimitive(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StructureSchemeVisitor ) return ((StructureSchemeVisitor<? extends T>)visitor).visitIntegerPrimitive(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NumberPrimitiveContext extends PrimitiveTypeContext {
		public NumberPrimitiveContext(PrimitiveTypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StructureSchemeListener ) ((StructureSchemeListener)listener).enterNumberPrimitive(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StructureSchemeListener ) ((StructureSchemeListener)listener).exitNumberPrimitive(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StructureSchemeVisitor ) return ((StructureSchemeVisitor<? extends T>)visitor).visitNumberPrimitive(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StringPrimitiveContext extends PrimitiveTypeContext {
		public StringPrimitiveContext(PrimitiveTypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StructureSchemeListener ) ((StructureSchemeListener)listener).enterStringPrimitive(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StructureSchemeListener ) ((StructureSchemeListener)listener).exitStringPrimitive(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StructureSchemeVisitor ) return ((StructureSchemeVisitor<? extends T>)visitor).visitStringPrimitive(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BooleanPrimitiveContext extends PrimitiveTypeContext {
		public BooleanPrimitiveContext(PrimitiveTypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StructureSchemeListener ) ((StructureSchemeListener)listener).enterBooleanPrimitive(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StructureSchemeListener ) ((StructureSchemeListener)listener).exitBooleanPrimitive(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StructureSchemeVisitor ) return ((StructureSchemeVisitor<? extends T>)visitor).visitBooleanPrimitive(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimitiveTypeContext primitiveType() throws RecognitionException {
		PrimitiveTypeContext _localctx = new PrimitiveTypeContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_primitiveType);
		try {
			setState(230);
			switch (_input.LA(1)) {
			case T__18:
				_localctx = new BooleanPrimitiveContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(225);
				match(T__18);
				}
				break;
			case T__19:
				_localctx = new NumberPrimitiveContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(226);
				match(T__19);
				}
				break;
			case T__20:
				_localctx = new IntegerPrimitiveContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(227);
				match(T__20);
				}
				break;
			case T__21:
				_localctx = new CharPrimitiveContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(228);
				match(T__21);
				}
				break;
			case T__22:
				_localctx = new StringPrimitiveContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(229);
				match(T__22);
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
		public TerminalNode Range() { return getToken(StructureSchemeParser.Range, 0); }
		public RangeDataTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rangeDataType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StructureSchemeListener ) ((StructureSchemeListener)listener).enterRangeDataType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StructureSchemeListener ) ((StructureSchemeListener)listener).exitRangeDataType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StructureSchemeVisitor ) return ((StructureSchemeVisitor<? extends T>)visitor).visitRangeDataType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RangeDataTypeContext rangeDataType() throws RecognitionException {
		RangeDataTypeContext _localctx = new RangeDataTypeContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_rangeDataType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(232);
			match(T__4);
			setState(233);
			match(Range);
			setState(234);
			match(T__5);
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
		public TerminalNode Name() { return getToken(StructureSchemeParser.Name, 0); }
		public DataTypeContext dataType() {
			return getRuleContext(DataTypeContext.class,0);
		}
		public LabeledDataTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_labeledDataType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StructureSchemeListener ) ((StructureSchemeListener)listener).enterLabeledDataType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StructureSchemeListener ) ((StructureSchemeListener)listener).exitLabeledDataType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StructureSchemeVisitor ) return ((StructureSchemeVisitor<? extends T>)visitor).visitLabeledDataType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LabeledDataTypeContext labeledDataType() throws RecognitionException {
		LabeledDataTypeContext _localctx = new LabeledDataTypeContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_labeledDataType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(236);
			match(Name);
			setState(237);
			match(T__1);
			setState(238);
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
		public TerminalNode Name() { return getToken(StructureSchemeParser.Name, 0); }
		public ConceptNameContext(ConceptTypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StructureSchemeListener ) ((StructureSchemeListener)listener).enterConceptName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StructureSchemeListener ) ((StructureSchemeListener)listener).exitConceptName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StructureSchemeVisitor ) return ((StructureSchemeVisitor<? extends T>)visitor).visitConceptName(this);
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
			if ( listener instanceof StructureSchemeListener ) ((StructureSchemeListener)listener).enterCartesianProductConcept(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StructureSchemeListener ) ((StructureSchemeListener)listener).exitCartesianProductConcept(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StructureSchemeVisitor ) return ((StructureSchemeVisitor<? extends T>)visitor).visitCartesianProductConcept(this);
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
			if ( listener instanceof StructureSchemeListener ) ((StructureSchemeListener)listener).enterUnionConcept(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StructureSchemeListener ) ((StructureSchemeListener)listener).exitUnionConcept(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StructureSchemeVisitor ) return ((StructureSchemeVisitor<? extends T>)visitor).visitUnionConcept(this);
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
			if ( listener instanceof StructureSchemeListener ) ((StructureSchemeListener)listener).enterStarConcept(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StructureSchemeListener ) ((StructureSchemeListener)listener).exitStarConcept(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StructureSchemeVisitor ) return ((StructureSchemeVisitor<? extends T>)visitor).visitStarConcept(this);
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
		int _startState = 42;
		enterRecursionRule(_localctx, 42, RULE_conceptType, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(253);
			switch (_input.LA(1)) {
			case Name:
				{
				_localctx = new ConceptNameContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(241);
				match(Name);
				}
				break;
			case T__6:
				{
				_localctx = new CartesianProductConceptContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(242);
				match(T__6);
				setState(243);
				conceptType(0);
				setState(248);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__9) {
					{
					{
					setState(244);
					match(T__9);
					setState(245);
					conceptType(0);
					}
					}
					setState(250);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(251);
				match(T__7);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(264);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(262);
					switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
					case 1:
						{
						_localctx = new UnionConceptContext(new ConceptTypeContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_conceptType);
						setState(255);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(256);
						match(T__13);
						setState(257);
						conceptType(3);
						}
						break;
					case 2:
						{
						_localctx = new StarConceptContext(new ConceptTypeContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_conceptType);
						setState(258);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(259);
						match(T__6);
						setState(260);
						match(T__12);
						setState(261);
						match(T__7);
						}
						break;
					}
					} 
				}
				setState(266);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
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

	public static class SelectorContext extends ParserRuleContext {
		public List<TerminalNode> Name() { return getTokens(StructureSchemeParser.Name); }
		public TerminalNode Name(int i) {
			return getToken(StructureSchemeParser.Name, i);
		}
		public SelectorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selector; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StructureSchemeListener ) ((StructureSchemeListener)listener).enterSelector(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StructureSchemeListener ) ((StructureSchemeListener)listener).exitSelector(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StructureSchemeVisitor ) return ((StructureSchemeVisitor<? extends T>)visitor).visitSelector(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelectorContext selector() throws RecognitionException {
		SelectorContext _localctx = new SelectorContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_selector);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(267);
			match(Name);
			setState(272);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(268);
				match(T__2);
				setState(269);
				match(Name);
				}
				}
				setState(274);
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
		public TerminalNode Name() { return getToken(StructureSchemeParser.Name, 0); }
		public ClassNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_className; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StructureSchemeListener ) ((StructureSchemeListener)listener).enterClassName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StructureSchemeListener ) ((StructureSchemeListener)listener).exitClassName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StructureSchemeVisitor ) return ((StructureSchemeVisitor<? extends T>)visitor).visitClassName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassNameContext className() throws RecognitionException {
		ClassNameContext _localctx = new ClassNameContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_className);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(275);
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
		public TerminalNode Name() { return getToken(StructureSchemeParser.Name, 0); }
		public BinaryLinkNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_binaryLinkName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StructureSchemeListener ) ((StructureSchemeListener)listener).enterBinaryLinkName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StructureSchemeListener ) ((StructureSchemeListener)listener).exitBinaryLinkName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StructureSchemeVisitor ) return ((StructureSchemeVisitor<? extends T>)visitor).visitBinaryLinkName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BinaryLinkNameContext binaryLinkName() throws RecognitionException {
		BinaryLinkNameContext _localctx = new BinaryLinkNameContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_binaryLinkName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(277);
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
		public TerminalNode Name() { return getToken(StructureSchemeParser.Name, 0); }
		public AttributeValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attributeValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StructureSchemeListener ) ((StructureSchemeListener)listener).enterAttributeValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StructureSchemeListener ) ((StructureSchemeListener)listener).exitAttributeValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StructureSchemeVisitor ) return ((StructureSchemeVisitor<? extends T>)visitor).visitAttributeValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AttributeValueContext attributeValue() throws RecognitionException {
		AttributeValueContext _localctx = new AttributeValueContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_attributeValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(279);
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

	public static class DefinedTypeNameContext extends ParserRuleContext {
		public TerminalNode Name() { return getToken(StructureSchemeParser.Name, 0); }
		public DefinedTypeNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_definedTypeName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StructureSchemeListener ) ((StructureSchemeListener)listener).enterDefinedTypeName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StructureSchemeListener ) ((StructureSchemeListener)listener).exitDefinedTypeName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StructureSchemeVisitor ) return ((StructureSchemeVisitor<? extends T>)visitor).visitDefinedTypeName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DefinedTypeNameContext definedTypeName() throws RecognitionException {
		DefinedTypeNameContext _localctx = new DefinedTypeNameContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_definedTypeName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(281);
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

	public static class BinaryOperatorContext extends ParserRuleContext {
		public TerminalNode EQ() { return getToken(StructureSchemeParser.EQ, 0); }
		public TerminalNode NOTEQ() { return getToken(StructureSchemeParser.NOTEQ, 0); }
		public TerminalNode LT() { return getToken(StructureSchemeParser.LT, 0); }
		public TerminalNode LE() { return getToken(StructureSchemeParser.LE, 0); }
		public TerminalNode GT() { return getToken(StructureSchemeParser.GT, 0); }
		public TerminalNode GE() { return getToken(StructureSchemeParser.GE, 0); }
		public BinaryOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_binaryOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StructureSchemeListener ) ((StructureSchemeListener)listener).enterBinaryOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StructureSchemeListener ) ((StructureSchemeListener)listener).exitBinaryOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StructureSchemeVisitor ) return ((StructureSchemeVisitor<? extends T>)visitor).visitBinaryOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BinaryOperatorContext binaryOperator() throws RecognitionException {
		BinaryOperatorContext _localctx = new BinaryOperatorContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_binaryOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(283);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EQ) | (1L << NOTEQ) | (1L << LT) | (1L << LE) | (1L << GT) | (1L << GE))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
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
		public TerminalNode Int() { return getToken(StructureSchemeParser.Int, 0); }
		public TerminalNode Float() { return getToken(StructureSchemeParser.Float, 0); }
		public NumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_number; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StructureSchemeListener ) ((StructureSchemeListener)listener).enterNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StructureSchemeListener ) ((StructureSchemeListener)listener).exitNumber(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StructureSchemeVisitor ) return ((StructureSchemeVisitor<? extends T>)visitor).visitNumber(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumberContext number() throws RecognitionException {
		NumberContext _localctx = new NumberContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_number);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(285);
			_la = _input.LA(1);
			if ( !(_la==Int || _la==Float) ) {
			_errHandler.recoverInline(this);
			} else {
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 17:
			return dataType_sempred((DataTypeContext)_localctx, predIndex);
		case 21:
			return conceptType_sempred((ConceptTypeContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean dataType_sempred(DataTypeContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 5);
		case 1:
			return precpred(_ctx, 6);
		}
		return true;
	}
	private boolean conceptType_sempred(ConceptTypeContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 2);
		case 3:
			return precpred(_ctx, 3);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3&\u0122\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\6\2C\n\2\r\2\16\2D\3\2\3\2\3\2\3\3\3\3\3\4\3\4\3\4\5\4O\n\4\3\5\3"+
		"\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\5\6Z\n\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6b\n"+
		"\6\3\7\3\7\3\7\3\7\3\b\3\b\3\b\7\bk\n\b\f\b\16\bn\13\b\3\t\3\t\5\tr\n"+
		"\t\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\5\13|\n\13\3\f\3\f\5\f\u0080\n"+
		"\f\3\r\3\r\3\r\3\r\7\r\u0086\n\r\f\r\16\r\u0089\13\r\3\r\3\r\3\16\3\16"+
		"\3\16\3\16\5\16\u0091\n\16\3\17\3\17\3\17\5\17\u0096\n\17\3\20\3\20\3"+
		"\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3"+
		"\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\5\22\u00b0\n\22\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\7\23\u00bb\n\23\f\23\16\23\u00be\13\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\7\23\u00c6\n\23\f\23\16\23\u00c9\13\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\5\23\u00d6\n\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\23\7\23\u00df\n\23\f\23\16\23\u00e2\13"+
		"\23\3\24\3\24\3\24\3\24\3\24\5\24\u00e9\n\24\3\25\3\25\3\25\3\25\3\26"+
		"\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\7\27\u00f9\n\27\f\27\16"+
		"\27\u00fc\13\27\3\27\3\27\5\27\u0100\n\27\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\7\27\u0109\n\27\f\27\16\27\u010c\13\27\3\30\3\30\3\30\7\30\u0111"+
		"\n\30\f\30\16\30\u0114\13\30\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3"+
		"\35\3\35\3\36\3\36\3\36\2\4$,\37\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36"+
		" \"$&(*,.\60\62\64\668:\2\4\3\2\36#\3\2\33\34\u012b\2<\3\2\2\2\4I\3\2"+
		"\2\2\6N\3\2\2\2\bP\3\2\2\2\nU\3\2\2\2\fc\3\2\2\2\16g\3\2\2\2\20q\3\2\2"+
		"\2\22s\3\2\2\2\24{\3\2\2\2\26}\3\2\2\2\30\u0081\3\2\2\2\32\u008c\3\2\2"+
		"\2\34\u0095\3\2\2\2\36\u0097\3\2\2\2 \u009d\3\2\2\2\"\u00af\3\2\2\2$\u00d5"+
		"\3\2\2\2&\u00e8\3\2\2\2(\u00ea\3\2\2\2*\u00ee\3\2\2\2,\u00ff\3\2\2\2."+
		"\u010d\3\2\2\2\60\u0115\3\2\2\2\62\u0117\3\2\2\2\64\u0119\3\2\2\2\66\u011b"+
		"\3\2\2\28\u011d\3\2\2\2:\u011f\3\2\2\2<=\7\3\2\2=>\5\4\3\2>B\7\4\2\2?"+
		"@\5\6\4\2@A\7\5\2\2AC\3\2\2\2B?\3\2\2\2CD\3\2\2\2DB\3\2\2\2DE\3\2\2\2"+
		"EF\3\2\2\2FG\7\6\2\2GH\7\2\2\3H\3\3\2\2\2IJ\7$\2\2J\5\3\2\2\2KO\5\b\5"+
		"\2LO\5\n\6\2MO\5\f\7\2NK\3\2\2\2NL\3\2\2\2NM\3\2\2\2O\7\3\2\2\2PQ\5\60"+
		"\31\2QR\7\7\2\2RS\5\16\b\2ST\7\b\2\2T\t\3\2\2\2UV\7\t\2\2VW\5\26\f\2W"+
		"Y\5\62\32\2XZ\5\34\17\2YX\3\2\2\2YZ\3\2\2\2Z[\3\2\2\2[\\\5\26\f\2\\a\7"+
		"\n\2\2]^\7\7\2\2^_\5\16\b\2_`\7\b\2\2`b\3\2\2\2a]\3\2\2\2ab\3\2\2\2b\13"+
		"\3\2\2\2cd\7\35\2\2de\7\13\2\2ef\7\35\2\2f\r\3\2\2\2gl\5\20\t\2hi\7\f"+
		"\2\2ik\5\20\t\2jh\3\2\2\2kn\3\2\2\2lj\3\2\2\2lm\3\2\2\2m\17\3\2\2\2nl"+
		"\3\2\2\2or\5\24\13\2pr\5\22\n\2qo\3\2\2\2qp\3\2\2\2r\21\3\2\2\2st\7\35"+
		"\2\2tu\7\4\2\2uv\5$\23\2v\23\3\2\2\2w|\5,\27\2xy\7\35\2\2yz\7\4\2\2z|"+
		"\5,\27\2{w\3\2\2\2{x\3\2\2\2|\25\3\2\2\2}\177\5\24\13\2~\u0080\5\30\r"+
		"\2\177~\3\2\2\2\177\u0080\3\2\2\2\u0080\27\3\2\2\2\u0081\u0082\7\t\2\2"+
		"\u0082\u0087\5\32\16\2\u0083\u0084\7\r\2\2\u0084\u0086\5\32\16\2\u0085"+
		"\u0083\3\2\2\2\u0086\u0089\3\2\2\2\u0087\u0085\3\2\2\2\u0087\u0088\3\2"+
		"\2\2\u0088\u008a\3\2\2\2\u0089\u0087\3\2\2\2\u008a\u008b\7\n\2\2\u008b"+
		"\31\3\2\2\2\u008c\u008d\5.\30\2\u008d\u0090\58\35\2\u008e\u0091\5.\30"+
		"\2\u008f\u0091\5\64\33\2\u0090\u008e\3\2\2\2\u0090\u008f\3\2\2\2\u0091"+
		"\33\3\2\2\2\u0092\u0096\5\36\20\2\u0093\u0096\5 \21\2\u0094\u0096\7\16"+
		"\2\2\u0095\u0092\3\2\2\2\u0095\u0093\3\2\2\2\u0095\u0094\3\2\2\2\u0096"+
		"\35\3\2\2\2\u0097\u0098\7\t\2\2\u0098\u0099\5\"\22\2\u0099\u009a\7\f\2"+
		"\2\u009a\u009b\5\"\22\2\u009b\u009c\7\n\2\2\u009c\37\3\2\2\2\u009d\u009e"+
		"\7\t\2\2\u009e\u009f\5\"\22\2\u009f\u00a0\7\n\2\2\u00a0!\3\2\2\2\u00a1"+
		"\u00a2\7\36\2\2\u00a2\u00b0\7\33\2\2\u00a3\u00a4\7!\2\2\u00a4\u00b0\7"+
		"\33\2\2\u00a5\u00a6\7 \2\2\u00a6\u00b0\7\33\2\2\u00a7\u00a8\7\"\2\2\u00a8"+
		"\u00b0\7\33\2\2\u00a9\u00aa\7#\2\2\u00aa\u00b0\7\33\2\2\u00ab\u00ac\7"+
		"\33\2\2\u00ac\u00ad\7\4\2\2\u00ad\u00b0\7\33\2\2\u00ae\u00b0\7\17\2\2"+
		"\u00af\u00a1\3\2\2\2\u00af\u00a3\3\2\2\2\u00af\u00a5\3\2\2\2\u00af\u00a7"+
		"\3\2\2\2\u00af\u00a9\3\2\2\2\u00af\u00ab\3\2\2\2\u00af\u00ae\3\2\2\2\u00b0"+
		"#\3\2\2\2\u00b1\u00b2\b\23\1\2\u00b2\u00d6\5&\24\2\u00b3\u00d6\5(\25\2"+
		"\u00b4\u00d6\5*\26\2\u00b5\u00d6\5\66\34\2\u00b6\u00b7\7\t\2\2\u00b7\u00bc"+
		"\5$\23\2\u00b8\u00b9\7\f\2\2\u00b9\u00bb\5$\23\2\u00ba\u00b8\3\2\2\2\u00bb"+
		"\u00be\3\2\2\2\u00bc\u00ba\3\2\2\2\u00bc\u00bd\3\2\2\2\u00bd\u00bf\3\2"+
		"\2\2\u00be\u00bc\3\2\2\2\u00bf\u00c0\7\n\2\2\u00c0\u00d6\3\2\2\2\u00c1"+
		"\u00c2\7\21\2\2\u00c2\u00c7\7\35\2\2\u00c3\u00c4\7\f\2\2\u00c4\u00c6\7"+
		"\35\2\2\u00c5\u00c3\3\2\2\2\u00c6\u00c9\3\2\2\2\u00c7\u00c5\3\2\2\2\u00c7"+
		"\u00c8\3\2\2\2\u00c8\u00ca\3\2\2\2\u00c9\u00c7\3\2\2\2\u00ca\u00d6\7\22"+
		"\2\2\u00cb\u00cc\7\23\2\2\u00cc\u00cd\7\t\2\2\u00cd\u00ce\5$\23\2\u00ce"+
		"\u00cf\7\n\2\2\u00cf\u00d6\3\2\2\2\u00d0\u00d1\7\24\2\2\u00d1\u00d2\7"+
		"\t\2\2\u00d2\u00d3\5$\23\2\u00d3\u00d4\7\n\2\2\u00d4\u00d6\3\2\2\2\u00d5"+
		"\u00b1\3\2\2\2\u00d5\u00b3\3\2\2\2\u00d5\u00b4\3\2\2\2\u00d5\u00b5\3\2"+
		"\2\2\u00d5\u00b6\3\2\2\2\u00d5\u00c1\3\2\2\2\u00d5\u00cb\3\2\2\2\u00d5"+
		"\u00d0\3\2\2\2\u00d6\u00e0\3\2\2\2\u00d7\u00d8\f\7\2\2\u00d8\u00d9\7\20"+
		"\2\2\u00d9\u00df\5$\23\b\u00da\u00db\f\b\2\2\u00db\u00dc\7\t\2\2\u00dc"+
		"\u00dd\7\17\2\2\u00dd\u00df\7\n\2\2\u00de\u00d7\3\2\2\2\u00de\u00da\3"+
		"\2\2\2\u00df\u00e2\3\2\2\2\u00e0\u00de\3\2\2\2\u00e0\u00e1\3\2\2\2\u00e1"+
		"%\3\2\2\2\u00e2\u00e0\3\2\2\2\u00e3\u00e9\7\25\2\2\u00e4\u00e9\7\26\2"+
		"\2\u00e5\u00e9\7\27\2\2\u00e6\u00e9\7\30\2\2\u00e7\u00e9\7\31\2\2\u00e8"+
		"\u00e3\3\2\2\2\u00e8\u00e4\3\2\2\2\u00e8\u00e5\3\2\2\2\u00e8\u00e6\3\2"+
		"\2\2\u00e8\u00e7\3\2\2\2\u00e9\'\3\2\2\2\u00ea\u00eb\7\7\2\2\u00eb\u00ec"+
		"\7\32\2\2\u00ec\u00ed\7\b\2\2\u00ed)\3\2\2\2\u00ee\u00ef\7\35\2\2\u00ef"+
		"\u00f0\7\4\2\2\u00f0\u00f1\5$\23\2\u00f1+\3\2\2\2\u00f2\u00f3\b\27\1\2"+
		"\u00f3\u0100\7\35\2\2\u00f4\u00f5\7\t\2\2\u00f5\u00fa\5,\27\2\u00f6\u00f7"+
		"\7\f\2\2\u00f7\u00f9\5,\27\2\u00f8\u00f6\3\2\2\2\u00f9\u00fc\3\2\2\2\u00fa"+
		"\u00f8\3\2\2\2\u00fa\u00fb\3\2\2\2\u00fb\u00fd\3\2\2\2\u00fc\u00fa\3\2"+
		"\2\2\u00fd\u00fe\7\n\2\2\u00fe\u0100\3\2\2\2\u00ff\u00f2\3\2\2\2\u00ff"+
		"\u00f4\3\2\2\2\u0100\u010a\3\2\2\2\u0101\u0102\f\4\2\2\u0102\u0103\7\20"+
		"\2\2\u0103\u0109\5,\27\5\u0104\u0105\f\5\2\2\u0105\u0106\7\t\2\2\u0106"+
		"\u0107\7\17\2\2\u0107\u0109\7\n\2\2\u0108\u0101\3\2\2\2\u0108\u0104\3"+
		"\2\2\2\u0109\u010c\3\2\2\2\u010a\u0108\3\2\2\2\u010a\u010b\3\2\2\2\u010b"+
		"-\3\2\2\2\u010c\u010a\3\2\2\2\u010d\u0112\7\35\2\2\u010e\u010f\7\5\2\2"+
		"\u010f\u0111\7\35\2\2\u0110\u010e\3\2\2\2\u0111\u0114\3\2\2\2\u0112\u0110"+
		"\3\2\2\2\u0112\u0113\3\2\2\2\u0113/\3\2\2\2\u0114\u0112\3\2\2\2\u0115"+
		"\u0116\7\35\2\2\u0116\61\3\2\2\2\u0117\u0118\7\35\2\2\u0118\63\3\2\2\2"+
		"\u0119\u011a\7\35\2\2\u011a\65\3\2\2\2\u011b\u011c\7\35\2\2\u011c\67\3"+
		"\2\2\2\u011d\u011e\t\2\2\2\u011e9\3\2\2\2\u011f\u0120\t\3\2\2\u0120;\3"+
		"\2\2\2\31DNYalq{\177\u0087\u0090\u0095\u00af\u00bc\u00c7\u00d5\u00de\u00e0"+
		"\u00e8\u00fa\u00ff\u0108\u010a\u0112";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}