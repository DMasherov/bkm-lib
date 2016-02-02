package mpei.bkm.parsing.lq.parsers;// Generated from C:/plugin/protege/bkmapi-parsing/grammar\LQ.g4 by ANTLR 4.5
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class LQLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.5", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, QueryHeadSign=7, QueryBodySign=8, 
		Int=9, Float=10, QuotedString=11, SUM=12, AVG=13, MIN=14, MAX=15, EQ=16, 
		NOTEQ=17, LT=18, LE=19, GT=20, GE=21, LIKE=22, Name=23, Space=24;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "QueryHeadSign", "QueryBodySign", 
		"Int", "Float", "QuotedString", "SUM", "AVG", "MIN", "MAX", "EQ", "NOTEQ", 
		"LT", "LE", "GT", "GE", "LIKE", "Name", "Space", "Digit"
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


	public LQLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "LQ.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\32\u00a3\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\6\3\7\3\7\3"+
		"\b\3\b\3\t\3\t\3\n\6\nH\n\n\r\n\16\nI\3\13\6\13M\n\13\r\13\16\13N\3\13"+
		"\3\13\7\13S\n\13\f\13\16\13V\13\13\5\13X\n\13\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\7\f`\n\f\f\f\16\fc\13\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\7\fl\n\f\f\f\16\f"+
		"o\13\f\3\f\5\fr\n\f\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\17\3\17\3\17"+
		"\3\17\3\20\3\20\3\20\3\20\3\21\3\21\3\22\3\22\3\22\3\22\3\23\3\23\3\24"+
		"\3\24\3\24\3\25\3\25\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\30\6\30"+
		"\u009a\n\30\r\30\16\30\u009b\3\31\3\31\3\31\3\31\3\32\3\32\2\2\33\3\3"+
		"\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21"+
		"!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\2\3\2\t\3\2$$\5\2\f\f\17\17"+
		"$$\3\2))\5\2\f\f\17\17))\b\2//\62;C\\aac|\u0412\u0451\5\2\13\f\16\17\""+
		"\"\3\2\62;\u00ad\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13"+
		"\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2"+
		"\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2"+
		"!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3"+
		"\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\3\65\3\2\2\2\5\67\3\2\2\2\79\3\2\2\2\t"+
		";\3\2\2\2\13=\3\2\2\2\r@\3\2\2\2\17B\3\2\2\2\21D\3\2\2\2\23G\3\2\2\2\25"+
		"L\3\2\2\2\27q\3\2\2\2\31s\3\2\2\2\33w\3\2\2\2\35{\3\2\2\2\37\177\3\2\2"+
		"\2!\u0083\3\2\2\2#\u0085\3\2\2\2%\u0089\3\2\2\2\'\u008b\3\2\2\2)\u008e"+
		"\3\2\2\2+\u0090\3\2\2\2-\u0093\3\2\2\2/\u0099\3\2\2\2\61\u009d\3\2\2\2"+
		"\63\u00a1\3\2\2\2\65\66\7.\2\2\66\4\3\2\2\2\678\7*\2\28\6\3\2\2\29:\7"+
		"+\2\2:\b\3\2\2\2;<\7=\2\2<\n\3\2\2\2=>\7K\2\2>?\7P\2\2?\f\3\2\2\2@A\7"+
		"\60\2\2A\16\3\2\2\2BC\7A\2\2C\20\3\2\2\2DE\7/\2\2E\22\3\2\2\2FH\5\63\32"+
		"\2GF\3\2\2\2HI\3\2\2\2IG\3\2\2\2IJ\3\2\2\2J\24\3\2\2\2KM\5\63\32\2LK\3"+
		"\2\2\2MN\3\2\2\2NL\3\2\2\2NO\3\2\2\2OW\3\2\2\2PT\7\60\2\2QS\5\63\32\2"+
		"RQ\3\2\2\2SV\3\2\2\2TR\3\2\2\2TU\3\2\2\2UX\3\2\2\2VT\3\2\2\2WP\3\2\2\2"+
		"WX\3\2\2\2X\26\3\2\2\2Ya\t\2\2\2Z`\n\3\2\2[\\\7^\2\2\\`\7^\2\2]^\7^\2"+
		"\2^`\7$\2\2_Z\3\2\2\2_[\3\2\2\2_]\3\2\2\2`c\3\2\2\2a_\3\2\2\2ab\3\2\2"+
		"\2bd\3\2\2\2ca\3\2\2\2dr\t\2\2\2em\t\4\2\2fl\n\5\2\2gh\7^\2\2hl\7^\2\2"+
		"ij\7^\2\2jl\7)\2\2kf\3\2\2\2kg\3\2\2\2ki\3\2\2\2lo\3\2\2\2mk\3\2\2\2m"+
		"n\3\2\2\2np\3\2\2\2om\3\2\2\2pr\t\4\2\2qY\3\2\2\2qe\3\2\2\2r\30\3\2\2"+
		"\2st\7U\2\2tu\7W\2\2uv\7O\2\2v\32\3\2\2\2wx\7C\2\2xy\7X\2\2yz\7I\2\2z"+
		"\34\3\2\2\2{|\7O\2\2|}\7K\2\2}~\7P\2\2~\36\3\2\2\2\177\u0080\7O\2\2\u0080"+
		"\u0081\7C\2\2\u0081\u0082\7Z\2\2\u0082 \3\2\2\2\u0083\u0084\7?\2\2\u0084"+
		"\"\3\2\2\2\u0085\u0086\7?\2\2\u0086\u0087\7\61\2\2\u0087\u0088\7?\2\2"+
		"\u0088$\3\2\2\2\u0089\u008a\7>\2\2\u008a&\3\2\2\2\u008b\u008c\7>\2\2\u008c"+
		"\u008d\7?\2\2\u008d(\3\2\2\2\u008e\u008f\7@\2\2\u008f*\3\2\2\2\u0090\u0091"+
		"\7@\2\2\u0091\u0092\7?\2\2\u0092,\3\2\2\2\u0093\u0094\7N\2\2\u0094\u0095"+
		"\7K\2\2\u0095\u0096\7M\2\2\u0096\u0097\7G\2\2\u0097.\3\2\2\2\u0098\u009a"+
		"\t\6\2\2\u0099\u0098\3\2\2\2\u009a\u009b\3\2\2\2\u009b\u0099\3\2\2\2\u009b"+
		"\u009c\3\2\2\2\u009c\60\3\2\2\2\u009d\u009e\t\7\2\2\u009e\u009f\3\2\2"+
		"\2\u009f\u00a0\b\31\2\2\u00a0\62\3\2\2\2\u00a1\u00a2\t\b\2\2\u00a2\64"+
		"\3\2\2\2\r\2INTW_akmq\u009b\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}