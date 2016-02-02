package mpei.bkm.parsing.structurescheme.parsers;

// Generated from StructureScheme.g4 by ANTLR 4.5.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class StructureSchemeLexer extends Lexer {
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
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
		"T__17", "T__18", "T__19", "T__20", "T__21", "T__22", "Range", "Int", 
		"Float", "Name", "EQ", "NOTEQ", "LT", "LE", "GT", "GE", "QuotedString", 
		"Comment", "Space", "Digit"
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


	public StructureSchemeLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "StructureScheme.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2&\u0139\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3"+
		"\3\3\4\3\4\3\5\3\5\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\n"+
		"\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21"+
		"\3\21\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\30\3\30"+
		"\3\30\3\30\3\30\3\30\3\30\3\31\5\31\u00a7\n\31\3\31\7\31\u00aa\n\31\f"+
		"\31\16\31\u00ad\13\31\3\31\3\31\7\31\u00b1\n\31\f\31\16\31\u00b4\13\31"+
		"\3\31\3\31\3\31\3\31\7\31\u00ba\n\31\f\31\16\31\u00bd\13\31\3\31\5\31"+
		"\u00c0\n\31\3\31\7\31\u00c3\n\31\f\31\16\31\u00c6\13\31\3\31\3\31\7\31"+
		"\u00ca\n\31\f\31\16\31\u00cd\13\31\3\31\3\31\3\31\3\31\7\31\u00d3\n\31"+
		"\f\31\16\31\u00d6\13\31\5\31\u00d8\n\31\3\32\6\32\u00db\n\32\r\32\16\32"+
		"\u00dc\3\33\6\33\u00e0\n\33\r\33\16\33\u00e1\3\33\3\33\7\33\u00e6\n\33"+
		"\f\33\16\33\u00e9\13\33\5\33\u00eb\n\33\3\34\6\34\u00ee\n\34\r\34\16\34"+
		"\u00ef\3\35\3\35\3\36\3\36\3\36\3\36\3\37\3\37\3 \3 \3 \3!\3!\3\"\3\""+
		"\3\"\3#\3#\3#\3#\3#\3#\7#\u0108\n#\f#\16#\u010b\13#\3#\3#\3#\3#\3#\3#"+
		"\3#\7#\u0114\n#\f#\16#\u0117\13#\3#\5#\u011a\n#\3$\3$\3$\3$\7$\u0120\n"+
		"$\f$\16$\u0123\13$\3$\3$\3$\3$\7$\u0129\n$\f$\16$\u012c\13$\3$\3$\5$\u0130"+
		"\n$\3$\3$\3%\3%\3%\3%\3&\3&\3\u012a\2\'\3\3\5\4\7\5\t\6\13\7\r\b\17\t"+
		"\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27"+
		"-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\2\3\2\13\3\2"+
		"\"\"\b\2//\62;C\\aac|\u0412\u0451\3\2$$\5\2\f\f\17\17$$\3\2))\5\2\f\f"+
		"\17\17))\4\2\f\f\17\17\5\2\13\f\16\17\"\"\3\2\62;\u0151\2\3\3\2\2\2\2"+
		"\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2"+
		"\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2"+
		"\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2"+
		"\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2"+
		"\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2"+
		"\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\3"+
		"M\3\2\2\2\5T\3\2\2\2\7V\3\2\2\2\tX\3\2\2\2\13\\\3\2\2\2\r^\3\2\2\2\17"+
		"`\3\2\2\2\21b\3\2\2\2\23d\3\2\2\2\25h\3\2\2\2\27j\3\2\2\2\31l\3\2\2\2"+
		"\33o\3\2\2\2\35q\3\2\2\2\37s\3\2\2\2!u\3\2\2\2#w\3\2\2\2%|\3\2\2\2\'\u0082"+
		"\3\2\2\2)\u008a\3\2\2\2+\u0091\3\2\2\2-\u0099\3\2\2\2/\u009e\3\2\2\2\61"+
		"\u00d7\3\2\2\2\63\u00da\3\2\2\2\65\u00df\3\2\2\2\67\u00ed\3\2\2\29\u00f1"+
		"\3\2\2\2;\u00f3\3\2\2\2=\u00f7\3\2\2\2?\u00f9\3\2\2\2A\u00fc\3\2\2\2C"+
		"\u00fe\3\2\2\2E\u0119\3\2\2\2G\u012f\3\2\2\2I\u0133\3\2\2\2K\u0137\3\2"+
		"\2\2MN\7U\2\2NO\7E\2\2OP\7J\2\2PQ\7G\2\2QR\7O\2\2RS\7G\2\2S\4\3\2\2\2"+
		"TU\7<\2\2U\6\3\2\2\2VW\7\60\2\2W\b\3\2\2\2XY\7G\2\2YZ\7P\2\2Z[\7F\2\2"+
		"[\n\3\2\2\2\\]\7]\2\2]\f\3\2\2\2^_\7_\2\2_\16\3\2\2\2`a\7*\2\2a\20\3\2"+
		"\2\2bc\7+\2\2c\22\3\2\2\2de\7K\2\2ef\7U\2\2fg\7C\2\2g\24\3\2\2\2hi\7."+
		"\2\2i\26\3\2\2\2jk\7=\2\2k\30\3\2\2\2lm\7/\2\2mn\7@\2\2n\32\3\2\2\2op"+
		"\7,\2\2p\34\3\2\2\2qr\7~\2\2r\36\3\2\2\2st\7}\2\2t \3\2\2\2uv\7\177\2"+
		"\2v\"\3\2\2\2wx\7N\2\2xy\7K\2\2yz\7U\2\2z{\7V\2\2{$\3\2\2\2|}\7N\2\2}"+
		"~\7N\2\2~\177\7K\2\2\177\u0080\7U\2\2\u0080\u0081\7V\2\2\u0081&\3\2\2"+
		"\2\u0082\u0083\7D\2\2\u0083\u0084\7q\2\2\u0084\u0085\7q\2\2\u0085\u0086"+
		"\7n\2\2\u0086\u0087\7g\2\2\u0087\u0088\7c\2\2\u0088\u0089\7p\2\2\u0089"+
		"(\3\2\2\2\u008a\u008b\7P\2\2\u008b\u008c\7w\2\2\u008c\u008d\7o\2\2\u008d"+
		"\u008e\7d\2\2\u008e\u008f\7g\2\2\u008f\u0090\7t\2\2\u0090*\3\2\2\2\u0091"+
		"\u0092\7K\2\2\u0092\u0093\7p\2\2\u0093\u0094\7v\2\2\u0094\u0095\7g\2\2"+
		"\u0095\u0096\7i\2\2\u0096\u0097\7g\2\2\u0097\u0098\7t\2\2\u0098,\3\2\2"+
		"\2\u0099\u009a\7E\2\2\u009a\u009b\7j\2\2\u009b\u009c\7c\2\2\u009c\u009d"+
		"\7t\2\2\u009d.\3\2\2\2\u009e\u009f\7U\2\2\u009f\u00a0\7v\2\2\u00a0\u00a1"+
		"\7t\2\2\u00a1\u00a2\7k\2\2\u00a2\u00a3\7p\2\2\u00a3\u00a4\7i\2\2\u00a4"+
		"\60\3\2\2\2\u00a5\u00a7\5\63\32\2\u00a6\u00a5\3\2\2\2\u00a6\u00a7\3\2"+
		"\2\2\u00a7\u00ab\3\2\2\2\u00a8\u00aa\t\2\2\2\u00a9\u00a8\3\2\2\2\u00aa"+
		"\u00ad\3\2\2\2\u00ab\u00a9\3\2\2\2\u00ab\u00ac\3\2\2\2\u00ac\u00ae\3\2"+
		"\2\2\u00ad\u00ab\3\2\2\2\u00ae\u00b2\7/\2\2\u00af\u00b1\t\2\2\2\u00b0"+
		"\u00af\3\2\2\2\u00b1\u00b4\3\2\2\2\u00b2\u00b0\3\2\2\2\u00b2\u00b3\3\2"+
		"\2\2\u00b3\u00b5\3\2\2\2\u00b4\u00b2\3\2\2\2\u00b5\u00d8\5\63\32\2\u00b6"+
		"\u00b7\5\63\32\2\u00b7\u00bb\7/\2\2\u00b8\u00ba\t\2\2\2\u00b9\u00b8\3"+
		"\2\2\2\u00ba\u00bd\3\2\2\2\u00bb\u00b9\3\2\2\2\u00bb\u00bc\3\2\2\2\u00bc"+
		"\u00d8\3\2\2\2\u00bd\u00bb\3\2\2\2\u00be\u00c0\5E#\2\u00bf\u00be\3\2\2"+
		"\2\u00bf\u00c0\3\2\2\2\u00c0\u00c4\3\2\2\2\u00c1\u00c3\t\2\2\2\u00c2\u00c1"+
		"\3\2\2\2\u00c3\u00c6\3\2\2\2\u00c4\u00c2\3\2\2\2\u00c4\u00c5\3\2\2\2\u00c5"+
		"\u00c7\3\2\2\2\u00c6\u00c4\3\2\2\2\u00c7\u00cb\7/\2\2\u00c8\u00ca\t\2"+
		"\2\2\u00c9\u00c8\3\2\2\2\u00ca\u00cd\3\2\2\2\u00cb\u00c9\3\2\2\2\u00cb"+
		"\u00cc\3\2\2\2\u00cc\u00ce\3\2\2\2\u00cd\u00cb\3\2\2\2\u00ce\u00d8\5E"+
		"#\2\u00cf\u00d0\5E#\2\u00d0\u00d4\7/\2\2\u00d1\u00d3\t\2\2\2\u00d2\u00d1"+
		"\3\2\2\2\u00d3\u00d6\3\2\2\2\u00d4\u00d2\3\2\2\2\u00d4\u00d5\3\2\2\2\u00d5"+
		"\u00d8\3\2\2\2\u00d6\u00d4\3\2\2\2\u00d7\u00a6\3\2\2\2\u00d7\u00b6\3\2"+
		"\2\2\u00d7\u00bf\3\2\2\2\u00d7\u00cf\3\2\2\2\u00d8\62\3\2\2\2\u00d9\u00db"+
		"\5K&\2\u00da\u00d9\3\2\2\2\u00db\u00dc\3\2\2\2\u00dc\u00da\3\2\2\2\u00dc"+
		"\u00dd\3\2\2\2\u00dd\64\3\2\2\2\u00de\u00e0\5K&\2\u00df\u00de\3\2\2\2"+
		"\u00e0\u00e1\3\2\2\2\u00e1\u00df\3\2\2\2\u00e1\u00e2\3\2\2\2\u00e2\u00ea"+
		"\3\2\2\2\u00e3\u00e7\7\60\2\2\u00e4\u00e6\5K&\2\u00e5\u00e4\3\2\2\2\u00e6"+
		"\u00e9\3\2\2\2\u00e7\u00e5\3\2\2\2\u00e7\u00e8\3\2\2\2\u00e8\u00eb\3\2"+
		"\2\2\u00e9\u00e7\3\2\2\2\u00ea\u00e3\3\2\2\2\u00ea\u00eb\3\2\2\2\u00eb"+
		"\66\3\2\2\2\u00ec\u00ee\t\3\2\2\u00ed\u00ec\3\2\2\2\u00ee\u00ef\3\2\2"+
		"\2\u00ef\u00ed\3\2\2\2\u00ef\u00f0\3\2\2\2\u00f08\3\2\2\2\u00f1\u00f2"+
		"\7?\2\2\u00f2:\3\2\2\2\u00f3\u00f4\7?\2\2\u00f4\u00f5\7\61\2\2\u00f5\u00f6"+
		"\7?\2\2\u00f6<\3\2\2\2\u00f7\u00f8\7>\2\2\u00f8>\3\2\2\2\u00f9\u00fa\7"+
		">\2\2\u00fa\u00fb\7?\2\2\u00fb@\3\2\2\2\u00fc\u00fd\7@\2\2\u00fdB\3\2"+
		"\2\2\u00fe\u00ff\7@\2\2\u00ff\u0100\7?\2\2\u0100D\3\2\2\2\u0101\u0109"+
		"\t\4\2\2\u0102\u0108\n\5\2\2\u0103\u0104\7^\2\2\u0104\u0108\7^\2\2\u0105"+
		"\u0106\7^\2\2\u0106\u0108\7$\2\2\u0107\u0102\3\2\2\2\u0107\u0103\3\2\2"+
		"\2\u0107\u0105\3\2\2\2\u0108\u010b\3\2\2\2\u0109\u0107\3\2\2\2\u0109\u010a"+
		"\3\2\2\2\u010a\u010c\3\2\2\2\u010b\u0109\3\2\2\2\u010c\u011a\t\4\2\2\u010d"+
		"\u0115\t\6\2\2\u010e\u0114\n\7\2\2\u010f\u0110\7^\2\2\u0110\u0114\7^\2"+
		"\2\u0111\u0112\7^\2\2\u0112\u0114\7)\2\2\u0113\u010e\3\2\2\2\u0113\u010f"+
		"\3\2\2\2\u0113\u0111\3\2\2\2\u0114\u0117\3\2\2\2\u0115\u0113\3\2\2\2\u0115"+
		"\u0116\3\2\2\2\u0116\u0118\3\2\2\2\u0117\u0115\3\2\2\2\u0118\u011a\t\6"+
		"\2\2\u0119\u0101\3\2\2\2\u0119\u010d\3\2\2\2\u011aF\3\2\2\2\u011b\u011c"+
		"\7\61\2\2\u011c\u011d\7\61\2\2\u011d\u0121\3\2\2\2\u011e\u0120\n\b\2\2"+
		"\u011f\u011e\3\2\2\2\u0120\u0123\3\2\2\2\u0121\u011f\3\2\2\2\u0121\u0122"+
		"\3\2\2\2\u0122\u0130\3\2\2\2\u0123\u0121\3\2\2\2\u0124\u0125\7\61\2\2"+
		"\u0125\u0126\7,\2\2\u0126\u012a\3\2\2\2\u0127\u0129\13\2\2\2\u0128\u0127"+
		"\3\2\2\2\u0129\u012c\3\2\2\2\u012a\u012b\3\2\2\2\u012a\u0128\3\2\2\2\u012b"+
		"\u012d\3\2\2\2\u012c\u012a\3\2\2\2\u012d\u012e\7,\2\2\u012e\u0130\7\61"+
		"\2\2\u012f\u011b\3\2\2\2\u012f\u0124\3\2\2\2\u0130\u0131\3\2\2\2\u0131"+
		"\u0132\b$\2\2\u0132H\3\2\2\2\u0133\u0134\t\t\2\2\u0134\u0135\3\2\2\2\u0135"+
		"\u0136\b%\2\2\u0136J\3\2\2\2\u0137\u0138\t\n\2\2\u0138L\3\2\2\2\31\2\u00a6"+
		"\u00ab\u00b2\u00bb\u00bf\u00c4\u00cb\u00d4\u00d7\u00dc\u00e1\u00e7\u00ea"+
		"\u00ef\u0107\u0109\u0113\u0115\u0119\u0121\u012a\u012f\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}