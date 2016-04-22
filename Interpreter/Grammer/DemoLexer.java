// Generated from Demo.g4 by ANTLR 4.5.3
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class DemoLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.5.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, IF=4, WHILE=5, ELSE=6, NEWLINE=7, INT=8, BOOL=9, 
		BSTART=10, BEND=11, ADDSUB=12, MULDIV=13, AND=14, OR=15, NOT=16, EQUAL=17, 
		COMPARE=18, DATATYPE=19, IDENTIFIER=20, WS=21, ASSIGNMENT=22, PSTART=23, 
		PEND=24, FUNCTIONNAME=25, RETURN=26;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "IF", "WHILE", "ELSE", "NEWLINE", "INT", "BOOL", 
		"BSTART", "BEND", "ADDSUB", "MULDIV", "AND", "OR", "NOT", "EQUAL", "COMPARE", 
		"DATATYPE", "IDENTIFIER", "WS", "ASSIGNMENT", "PSTART", "PEND", "FUNCTIONNAME", 
		"RETURN"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'('", "')'", "','", "'IF'", "'WHILE'", "'ELSE'", "'\n'", null, 
		null, "'{'", "'}'", null, null, "'AND'", "'OR'", "'NOT'", null, null, 
		null, null, null, "'='", "'['", "']'", null, "'Return'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, "IF", "WHILE", "ELSE", "NEWLINE", "INT", "BOOL", 
		"BSTART", "BEND", "ADDSUB", "MULDIV", "AND", "OR", "NOT", "EQUAL", "COMPARE", 
		"DATATYPE", "IDENTIFIER", "WS", "ASSIGNMENT", "PSTART", "PEND", "FUNCTIONNAME", 
		"RETURN"
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


	public DemoLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Demo.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\34\u009d\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\5\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\t\6\tO\n\t\r\t\16\tP\3"+
		"\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\17\3\17\3\20\3"+
		"\20\3\20\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\5\22l\n\22\3\23\3\23"+
		"\3\23\3\23\3\23\5\23s\n\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\5\24\u0083\n\24\3\25\6\25\u0086\n\25\r\25\16"+
		"\25\u0087\3\26\6\26\u008b\n\26\r\26\16\26\u008c\3\27\3\27\3\30\3\30\3"+
		"\31\3\31\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33\2\2\34\3\3\5\4\7"+
		"\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22"+
		"#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\3\2\b\3\2\62;\4\2HHVV"+
		"\4\2--//\4\2,,\61\61\4\2>>@@\4\2C\\c|\u00a3\2\3\3\2\2\2\2\5\3\2\2\2\2"+
		"\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2"+
		"\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2"+
		"\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2"+
		"\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2"+
		"\2\2\65\3\2\2\2\3\67\3\2\2\2\59\3\2\2\2\7;\3\2\2\2\t=\3\2\2\2\13@\3\2"+
		"\2\2\rF\3\2\2\2\17K\3\2\2\2\21N\3\2\2\2\23R\3\2\2\2\25T\3\2\2\2\27V\3"+
		"\2\2\2\31X\3\2\2\2\33Z\3\2\2\2\35\\\3\2\2\2\37`\3\2\2\2!c\3\2\2\2#k\3"+
		"\2\2\2%r\3\2\2\2\'\u0082\3\2\2\2)\u0085\3\2\2\2+\u008a\3\2\2\2-\u008e"+
		"\3\2\2\2/\u0090\3\2\2\2\61\u0092\3\2\2\2\63\u0094\3\2\2\2\65\u0096\3\2"+
		"\2\2\678\7*\2\28\4\3\2\2\29:\7+\2\2:\6\3\2\2\2;<\7.\2\2<\b\3\2\2\2=>\7"+
		"K\2\2>?\7H\2\2?\n\3\2\2\2@A\7Y\2\2AB\7J\2\2BC\7K\2\2CD\7N\2\2DE\7G\2\2"+
		"E\f\3\2\2\2FG\7G\2\2GH\7N\2\2HI\7U\2\2IJ\7G\2\2J\16\3\2\2\2KL\7\f\2\2"+
		"L\20\3\2\2\2MO\t\2\2\2NM\3\2\2\2OP\3\2\2\2PN\3\2\2\2PQ\3\2\2\2Q\22\3\2"+
		"\2\2RS\t\3\2\2S\24\3\2\2\2TU\7}\2\2U\26\3\2\2\2VW\7\177\2\2W\30\3\2\2"+
		"\2XY\t\4\2\2Y\32\3\2\2\2Z[\t\5\2\2[\34\3\2\2\2\\]\7C\2\2]^\7P\2\2^_\7"+
		"F\2\2_\36\3\2\2\2`a\7Q\2\2ab\7T\2\2b \3\2\2\2cd\7P\2\2de\7Q\2\2ef\7V\2"+
		"\2f\"\3\2\2\2gh\7?\2\2hl\7?\2\2ij\7#\2\2jl\7?\2\2kg\3\2\2\2ki\3\2\2\2"+
		"l$\3\2\2\2ms\t\6\2\2no\7>\2\2os\7?\2\2pq\7@\2\2qs\7?\2\2rm\3\2\2\2rn\3"+
		"\2\2\2rp\3\2\2\2s&\3\2\2\2tu\7K\2\2uv\7P\2\2vw\7V\2\2wx\7G\2\2xy\7I\2"+
		"\2yz\7G\2\2z\u0083\7T\2\2{|\7D\2\2|}\7Q\2\2}~\7Q\2\2~\177\7N\2\2\177\u0080"+
		"\7G\2\2\u0080\u0081\7C\2\2\u0081\u0083\7P\2\2\u0082t\3\2\2\2\u0082{\3"+
		"\2\2\2\u0083(\3\2\2\2\u0084\u0086\t\7\2\2\u0085\u0084\3\2\2\2\u0086\u0087"+
		"\3\2\2\2\u0087\u0085\3\2\2\2\u0087\u0088\3\2\2\2\u0088*\3\2\2\2\u0089"+
		"\u008b\7\"\2\2\u008a\u0089\3\2\2\2\u008b\u008c\3\2\2\2\u008c\u008a\3\2"+
		"\2\2\u008c\u008d\3\2\2\2\u008d,\3\2\2\2\u008e\u008f\7?\2\2\u008f.\3\2"+
		"\2\2\u0090\u0091\7]\2\2\u0091\60\3\2\2\2\u0092\u0093\7_\2\2\u0093\62\3"+
		"\2\2\2\u0094\u0095\5)\25\2\u0095\64\3\2\2\2\u0096\u0097\7T\2\2\u0097\u0098"+
		"\7g\2\2\u0098\u0099\7v\2\2\u0099\u009a\7w\2\2\u009a\u009b\7t\2\2\u009b"+
		"\u009c\7p\2\2\u009c\66\3\2\2\2\t\2Pkr\u0082\u0087\u008c\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}