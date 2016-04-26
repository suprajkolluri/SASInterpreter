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
		T__0=1, T__1=2, T__2=3, T__3=4, IF=5, WHILE=6, ELSE=7, NEWLINE=8, INT=9, 
		BOOL=10, BSTART=11, BEND=12, ADDSUB=13, MULDIV=14, AND=15, OR=16, NOT=17, 
		EQUAL=18, COMPARE=19, DATATYPE=20, IDENTIFIER=21, WS=22, ASSIGNMENT=23, 
		PSTART=24, PEND=25, FUNCTIONNAME=26, YIELD=27;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "IF", "WHILE", "ELSE", "NEWLINE", "INT", 
		"BOOL", "BSTART", "BEND", "ADDSUB", "MULDIV", "AND", "OR", "NOT", "EQUAL", 
		"COMPARE", "DATATYPE", "IDENTIFIER", "WS", "ASSIGNMENT", "PSTART", "PEND", 
		"FUNCTIONNAME", "YIELD"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'('", "')'", "','", "'RETURN'", "'IF'", "'WHILE'", "'ELSE'", "'\n'", 
		null, null, "'{'", "'}'", null, null, "'AND'", "'OR'", "'NOT'", null, 
		null, null, null, null, "'='", "'['", "']'", null, "'yield'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, "IF", "WHILE", "ELSE", "NEWLINE", "INT", 
		"BOOL", "BSTART", "BEND", "ADDSUB", "MULDIV", "AND", "OR", "NOT", "EQUAL", 
		"COMPARE", "DATATYPE", "IDENTIFIER", "WS", "ASSIGNMENT", "PSTART", "PEND", 
		"FUNCTIONNAME", "YIELD"
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\35\u00a9\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b"+
		"\3\b\3\t\3\t\3\n\6\nX\n\n\r\n\16\nY\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16"+
		"\3\17\3\17\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\23"+
		"\3\23\3\23\3\23\5\23u\n\23\3\24\3\24\3\24\3\24\3\24\5\24|\n\24\3\25\3"+
		"\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3"+
		"\25\3\25\3\25\5\25\u0090\n\25\3\26\6\26\u0093\n\26\r\26\16\26\u0094\3"+
		"\27\6\27\u0098\n\27\r\27\16\27\u0099\3\30\3\30\3\31\3\31\3\32\3\32\3\33"+
		"\3\33\3\34\3\34\3\34\3\34\3\34\3\34\2\2\35\3\3\5\4\7\5\t\6\13\7\r\b\17"+
		"\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+"+
		"\27-\30/\31\61\32\63\33\65\34\67\35\3\2\b\3\2\62;\4\2HHVV\4\2--//\4\2"+
		",,\61\61\4\2>>@@\4\2C\\c|\u00b0\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2"+
		"\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2"+
		"\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2"+
		"\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2"+
		"\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2"+
		"\2\2\67\3\2\2\2\39\3\2\2\2\5;\3\2\2\2\7=\3\2\2\2\t?\3\2\2\2\13F\3\2\2"+
		"\2\rI\3\2\2\2\17O\3\2\2\2\21T\3\2\2\2\23W\3\2\2\2\25[\3\2\2\2\27]\3\2"+
		"\2\2\31_\3\2\2\2\33a\3\2\2\2\35c\3\2\2\2\37e\3\2\2\2!i\3\2\2\2#l\3\2\2"+
		"\2%t\3\2\2\2\'{\3\2\2\2)\u008f\3\2\2\2+\u0092\3\2\2\2-\u0097\3\2\2\2/"+
		"\u009b\3\2\2\2\61\u009d\3\2\2\2\63\u009f\3\2\2\2\65\u00a1\3\2\2\2\67\u00a3"+
		"\3\2\2\29:\7*\2\2:\4\3\2\2\2;<\7+\2\2<\6\3\2\2\2=>\7.\2\2>\b\3\2\2\2?"+
		"@\7T\2\2@A\7G\2\2AB\7V\2\2BC\7W\2\2CD\7T\2\2DE\7P\2\2E\n\3\2\2\2FG\7K"+
		"\2\2GH\7H\2\2H\f\3\2\2\2IJ\7Y\2\2JK\7J\2\2KL\7K\2\2LM\7N\2\2MN\7G\2\2"+
		"N\16\3\2\2\2OP\7G\2\2PQ\7N\2\2QR\7U\2\2RS\7G\2\2S\20\3\2\2\2TU\7\f\2\2"+
		"U\22\3\2\2\2VX\t\2\2\2WV\3\2\2\2XY\3\2\2\2YW\3\2\2\2YZ\3\2\2\2Z\24\3\2"+
		"\2\2[\\\t\3\2\2\\\26\3\2\2\2]^\7}\2\2^\30\3\2\2\2_`\7\177\2\2`\32\3\2"+
		"\2\2ab\t\4\2\2b\34\3\2\2\2cd\t\5\2\2d\36\3\2\2\2ef\7C\2\2fg\7P\2\2gh\7"+
		"F\2\2h \3\2\2\2ij\7Q\2\2jk\7T\2\2k\"\3\2\2\2lm\7P\2\2mn\7Q\2\2no\7V\2"+
		"\2o$\3\2\2\2pq\7?\2\2qu\7?\2\2rs\7#\2\2su\7?\2\2tp\3\2\2\2tr\3\2\2\2u"+
		"&\3\2\2\2v|\t\6\2\2wx\7>\2\2x|\7?\2\2yz\7@\2\2z|\7?\2\2{v\3\2\2\2{w\3"+
		"\2\2\2{y\3\2\2\2|(\3\2\2\2}~\7K\2\2~\177\7P\2\2\177\u0080\7V\2\2\u0080"+
		"\u0081\7G\2\2\u0081\u0082\7I\2\2\u0082\u0083\7G\2\2\u0083\u0090\7T\2\2"+
		"\u0084\u0085\7D\2\2\u0085\u0086\7Q\2\2\u0086\u0087\7Q\2\2\u0087\u0088"+
		"\7N\2\2\u0088\u0089\7G\2\2\u0089\u008a\7C\2\2\u008a\u0090\7P\2\2\u008b"+
		"\u008c\7X\2\2\u008c\u008d\7Q\2\2\u008d\u008e\7K\2\2\u008e\u0090\7F\2\2"+
		"\u008f}\3\2\2\2\u008f\u0084\3\2\2\2\u008f\u008b\3\2\2\2\u0090*\3\2\2\2"+
		"\u0091\u0093\t\7\2\2\u0092\u0091\3\2\2\2\u0093\u0094\3\2\2\2\u0094\u0092"+
		"\3\2\2\2\u0094\u0095\3\2\2\2\u0095,\3\2\2\2\u0096\u0098\7\"\2\2\u0097"+
		"\u0096\3\2\2\2\u0098\u0099\3\2\2\2\u0099\u0097\3\2\2\2\u0099\u009a\3\2"+
		"\2\2\u009a.\3\2\2\2\u009b\u009c\7?\2\2\u009c\60\3\2\2\2\u009d\u009e\7"+
		"]\2\2\u009e\62\3\2\2\2\u009f\u00a0\7_\2\2\u00a0\64\3\2\2\2\u00a1\u00a2"+
		"\5+\26\2\u00a2\66\3\2\2\2\u00a3\u00a4\7{\2\2\u00a4\u00a5\7k\2\2\u00a5"+
		"\u00a6\7g\2\2\u00a6\u00a7\7n\2\2\u00a7\u00a8\7f\2\2\u00a88\3\2\2\2\t\2"+
		"Yt{\u008f\u0094\u0099\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}