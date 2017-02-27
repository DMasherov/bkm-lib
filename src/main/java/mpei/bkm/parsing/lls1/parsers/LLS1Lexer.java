// Generated from C:/bmd/bkm-lib/src/grammar\LLS1.g4 by ANTLR 4.6
package mpei.bkm.parsing.lls1.parsers;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class LLS1Lexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.6", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, Name=19, Comment=20, Space=21;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
		"T__17", "Name", "Comment", "Space"
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


	public LLS1Lexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "LLS1.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\27\u0094\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\3\2\3\2\3\3\3\3\3\3\3\3"+
		"\3\4\3\4\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\r"+
		"\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\23"+
		"\3\23\3\24\6\24u\n\24\r\24\16\24v\3\25\3\25\3\25\3\25\7\25}\n\25\f\25"+
		"\16\25\u0080\13\25\3\25\3\25\3\25\3\25\7\25\u0086\n\25\f\25\16\25\u0089"+
		"\13\25\3\25\3\25\5\25\u008d\n\25\3\25\3\25\3\26\3\26\3\26\3\26\3\u0087"+
		"\2\27\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35"+
		"\20\37\21!\22#\23%\24\'\25)\26+\27\3\2\5\7\2//\62;C\\a\u0412\u0451\u0451"+
		"\4\2\f\f\17\17\5\2\13\f\16\17\"\"\u0097\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3"+
		"\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2"+
		"\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35"+
		"\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)"+
		"\3\2\2\2\2+\3\2\2\2\3-\3\2\2\2\5/\3\2\2\2\7\63\3\2\2\2\t\65\3\2\2\2\13"+
		"9\3\2\2\2\r<\3\2\2\2\17A\3\2\2\2\21G\3\2\2\2\23I\3\2\2\2\25K\3\2\2\2\27"+
		"O\3\2\2\2\31T\3\2\2\2\33Y\3\2\2\2\35^\3\2\2\2\37b\3\2\2\2!h\3\2\2\2#m"+
		"\3\2\2\2%q\3\2\2\2\'t\3\2\2\2)\u008c\3\2\2\2+\u0090\3\2\2\2-.\7\60\2\2"+
		".\4\3\2\2\2/\60\7P\2\2\60\61\7Q\2\2\61\62\7V\2\2\62\6\3\2\2\2\63\64\7"+
		"<\2\2\64\b\3\2\2\2\65\66\7C\2\2\66\67\7P\2\2\678\7F\2\28\n\3\2\2\29:\7"+
		"Q\2\2:;\7T\2\2;\f\3\2\2\2<=\7V\2\2=>\7J\2\2>?\7C\2\2?@\7V\2\2@\16\3\2"+
		"\2\2AB\7V\2\2BC\7J\2\2CD\7Q\2\2DE\7U\2\2EF\7G\2\2F\20\3\2\2\2GH\7*\2\2"+
		"H\22\3\2\2\2IJ\7+\2\2J\24\3\2\2\2KL\7K\2\2LM\7P\2\2MN\7X\2\2N\26\3\2\2"+
		"\2OP\7U\2\2PQ\7Q\2\2QR\7O\2\2RS\7G\2\2S\30\3\2\2\2TU\7G\2\2UV\7C\2\2V"+
		"W\7E\2\2WX\7J\2\2X\32\3\2\2\2YZ\7Q\2\2Z[\7P\2\2[\\\7N\2\2\\]\7[\2\2]\34"+
		"\3\2\2\2^_\7K\2\2_`\7O\2\2`a\7R\2\2a\36\3\2\2\2bc\7G\2\2cd\7Z\2\2de\7"+
		"K\2\2ef\7U\2\2fg\7V\2\2g \3\2\2\2hi\7P\2\2ij\7W\2\2jk\7N\2\2kl\7N\2\2"+
		"l\"\3\2\2\2mn\7K\2\2no\7U\2\2op\7C\2\2p$\3\2\2\2qr\7?\2\2r&\3\2\2\2su"+
		"\t\2\2\2ts\3\2\2\2uv\3\2\2\2vt\3\2\2\2vw\3\2\2\2w(\3\2\2\2xy\7\61\2\2"+
		"yz\7\61\2\2z~\3\2\2\2{}\n\3\2\2|{\3\2\2\2}\u0080\3\2\2\2~|\3\2\2\2~\177"+
		"\3\2\2\2\177\u008d\3\2\2\2\u0080~\3\2\2\2\u0081\u0082\7\61\2\2\u0082\u0083"+
		"\7,\2\2\u0083\u0087\3\2\2\2\u0084\u0086\13\2\2\2\u0085\u0084\3\2\2\2\u0086"+
		"\u0089\3\2\2\2\u0087\u0088\3\2\2\2\u0087\u0085\3\2\2\2\u0088\u008a\3\2"+
		"\2\2\u0089\u0087\3\2\2\2\u008a\u008b\7,\2\2\u008b\u008d\7\61\2\2\u008c"+
		"x\3\2\2\2\u008c\u0081\3\2\2\2\u008d\u008e\3\2\2\2\u008e\u008f\b\25\2\2"+
		"\u008f*\3\2\2\2\u0090\u0091\t\4\2\2\u0091\u0092\3\2\2\2\u0092\u0093\b"+
		"\26\2\2\u0093,\3\2\2\2\7\2v~\u0087\u008c\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}