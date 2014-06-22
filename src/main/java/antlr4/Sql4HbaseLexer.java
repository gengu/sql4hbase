package antlr4;// Generated from Sql4Hbase.g4 by ANTLR 4.2.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class Sql4HbaseLexer extends Lexer {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		SELECT=1, AND=2, FROM=3, WHERE=4, LIMIT=5, LIKE=6, ALL_COLUMNS=7, ROWKEY=8, 
		TOCName=9, POSITIVE_INT=10, INT=11, FLOAT=12, Dot=13, EQUAL=14, EQUAL_NS=15, 
		NOTEQUAL=16, LESSTHANOREQUALTO=17, LESSTHAN=18, GREATERTHANOREQUALTO=19, 
		GREATERTHAN=20, UNDERLINE=21, HYPHEN=22, STRING=23;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"SELECT", "AND", "FROM", "WHERE", "LIMIT", "LIKE", "'*'", "ROWKEY", "TOCName", 
		"POSITIVE_INT", "INT", "FLOAT", "','", "EQUAL", "'<=>'", "NOTEQUAL", "'<='", 
		"'<'", "'>='", "'>'", "'_'", "'-'", "STRING"
	};
	public static final String[] ruleNames = {
		"SELECT", "AND", "FROM", "WHERE", "LIMIT", "LIKE", "ALL_COLUMNS", "ROWKEY", 
		"TOCName", "POSITIVE_INT", "INT", "FLOAT", "NameStartChar", "Letter", 
		"HexDigit", "NOTZERO", "Digit", "Dot", "EQUAL", "EQUAL_NS", "NOTEQUAL", 
		"LESSTHANOREQUALTO", "LESSTHAN", "GREATERTHANOREQUALTO", "GREATERTHAN", 
		"UNDERLINE", "HYPHEN", "STRING", "ESC"
	};


	public Sql4HbaseLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Sql4Hbase.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\31\u00ce\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\3\2\3\2\3\2\3"+
		"\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\7\nn\n\n\f\n\16\nq\13\n\3\13\3"+
		"\13\3\13\3\f\6\fw\n\f\r\f\16\fx\3\r\6\r|\n\r\r\r\16\r}\3\r\3\r\7\r\u0082"+
		"\n\r\f\r\16\r\u0085\13\r\3\r\3\r\6\r\u0089\n\r\r\r\16\r\u008a\5\r\u008d"+
		"\n\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\24"+
		"\3\24\3\24\5\24\u009e\n\24\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\5\26"+
		"\u00a8\n\26\3\27\3\27\3\27\3\30\3\30\3\31\3\31\3\31\3\32\3\32\3\33\3\33"+
		"\3\34\3\34\3\35\3\35\3\35\7\35\u00bb\n\35\f\35\16\35\u00be\13\35\3\35"+
		"\3\35\3\35\3\35\7\35\u00c4\n\35\f\35\16\35\u00c7\13\35\3\35\5\35\u00ca"+
		"\n\35\3\36\3\36\3\36\4\u00bc\u00c5\2\37\3\3\5\4\7\5\t\6\13\7\r\b\17\t"+
		"\21\n\23\13\25\f\27\r\31\16\33\2\35\2\37\2!\2#\2%\17\'\20)\21+\22-\23"+
		"/\24\61\25\63\26\65\27\67\309\31;\2\3\2\26\4\2UUuu\4\2GGgg\4\2NNnn\4\2"+
		"EEee\4\2VVvv\4\2CCcc\4\2PPpp\4\2FFff\4\2HHhh\4\2TTtt\4\2QQqq\4\2OOoo\4"+
		"\2YYyy\4\2JJjj\4\2KKkk\4\2MMmm\4\2[[{{\4\2C\\c|\4\2CHch\b\2$$^^ddpptt"+
		"vv\u00d8\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2"+
		"\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27"+
		"\3\2\2\2\2\31\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-"+
		"\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2"+
		"\2\29\3\2\2\2\3=\3\2\2\2\5D\3\2\2\2\7H\3\2\2\2\tM\3\2\2\2\13S\3\2\2\2"+
		"\rY\3\2\2\2\17^\3\2\2\2\21`\3\2\2\2\23g\3\2\2\2\25r\3\2\2\2\27v\3\2\2"+
		"\2\31\u008c\3\2\2\2\33\u008e\3\2\2\2\35\u0090\3\2\2\2\37\u0092\3\2\2\2"+
		"!\u0094\3\2\2\2#\u0096\3\2\2\2%\u0098\3\2\2\2\'\u009d\3\2\2\2)\u009f\3"+
		"\2\2\2+\u00a7\3\2\2\2-\u00a9\3\2\2\2/\u00ac\3\2\2\2\61\u00ae\3\2\2\2\63"+
		"\u00b1\3\2\2\2\65\u00b3\3\2\2\2\67\u00b5\3\2\2\29\u00c9\3\2\2\2;\u00cb"+
		"\3\2\2\2=>\t\2\2\2>?\t\3\2\2?@\t\4\2\2@A\t\3\2\2AB\t\5\2\2BC\t\6\2\2C"+
		"\4\3\2\2\2DE\t\7\2\2EF\t\b\2\2FG\t\t\2\2G\6\3\2\2\2HI\t\n\2\2IJ\t\13\2"+
		"\2JK\t\f\2\2KL\t\r\2\2L\b\3\2\2\2MN\t\16\2\2NO\t\17\2\2OP\t\3\2\2PQ\t"+
		"\13\2\2QR\t\3\2\2R\n\3\2\2\2ST\t\4\2\2TU\t\20\2\2UV\t\r\2\2VW\t\20\2\2"+
		"WX\t\6\2\2X\f\3\2\2\2YZ\t\4\2\2Z[\t\20\2\2[\\\t\21\2\2\\]\t\3\2\2]\16"+
		"\3\2\2\2^_\7,\2\2_\20\3\2\2\2`a\t\13\2\2ab\t\f\2\2bc\t\16\2\2cd\t\21\2"+
		"\2de\t\3\2\2ef\t\22\2\2f\22\3\2\2\2go\5\33\16\2hn\5\35\17\2in\5\37\20"+
		"\2jn\5#\22\2kn\5\67\34\2ln\5\65\33\2mh\3\2\2\2mi\3\2\2\2mj\3\2\2\2mk\3"+
		"\2\2\2ml\3\2\2\2nq\3\2\2\2om\3\2\2\2op\3\2\2\2p\24\3\2\2\2qo\3\2\2\2r"+
		"s\5!\21\2st\5\27\f\2t\26\3\2\2\2uw\5#\22\2vu\3\2\2\2wx\3\2\2\2xv\3\2\2"+
		"\2xy\3\2\2\2y\30\3\2\2\2z|\5#\22\2{z\3\2\2\2|}\3\2\2\2}{\3\2\2\2}~\3\2"+
		"\2\2~\177\3\2\2\2\177\u0083\7\60\2\2\u0080\u0082\5#\22\2\u0081\u0080\3"+
		"\2\2\2\u0082\u0085\3\2\2\2\u0083\u0081\3\2\2\2\u0083\u0084\3\2\2\2\u0084"+
		"\u008d\3\2\2\2\u0085\u0083\3\2\2\2\u0086\u0088\7\60\2\2\u0087\u0089\5"+
		"#\22\2\u0088\u0087\3\2\2\2\u0089\u008a\3\2\2\2\u008a\u0088\3\2\2\2\u008a"+
		"\u008b\3\2\2\2\u008b\u008d\3\2\2\2\u008c{\3\2\2\2\u008c\u0086\3\2\2\2"+
		"\u008d\32\3\2\2\2\u008e\u008f\t\23\2\2\u008f\34\3\2\2\2\u0090\u0091\t"+
		"\23\2\2\u0091\36\3\2\2\2\u0092\u0093\t\24\2\2\u0093 \3\2\2\2\u0094\u0095"+
		"\4\63;\2\u0095\"\3\2\2\2\u0096\u0097\4\62;\2\u0097$\3\2\2\2\u0098\u0099"+
		"\7.\2\2\u0099&\3\2\2\2\u009a\u009e\7?\2\2\u009b\u009c\7?\2\2\u009c\u009e"+
		"\7?\2\2\u009d\u009a\3\2\2\2\u009d\u009b\3\2\2\2\u009e(\3\2\2\2\u009f\u00a0"+
		"\7>\2\2\u00a0\u00a1\7?\2\2\u00a1\u00a2\7@\2\2\u00a2*\3\2\2\2\u00a3\u00a4"+
		"\7>\2\2\u00a4\u00a8\7@\2\2\u00a5\u00a6\7#\2\2\u00a6\u00a8\7?\2\2\u00a7"+
		"\u00a3\3\2\2\2\u00a7\u00a5\3\2\2\2\u00a8,\3\2\2\2\u00a9\u00aa\7>\2\2\u00aa"+
		"\u00ab\7?\2\2\u00ab.\3\2\2\2\u00ac\u00ad\7>\2\2\u00ad\60\3\2\2\2\u00ae"+
		"\u00af\7@\2\2\u00af\u00b0\7?\2\2\u00b0\62\3\2\2\2\u00b1\u00b2\7@\2\2\u00b2"+
		"\64\3\2\2\2\u00b3\u00b4\7a\2\2\u00b4\66\3\2\2\2\u00b5\u00b6\7/\2\2\u00b6"+
		"8\3\2\2\2\u00b7\u00bc\7$\2\2\u00b8\u00bb\5;\36\2\u00b9\u00bb\13\2\2\2"+
		"\u00ba\u00b8\3\2\2\2\u00ba\u00b9\3\2\2\2\u00bb\u00be\3\2\2\2\u00bc\u00bd"+
		"\3\2\2\2\u00bc\u00ba\3\2\2\2\u00bd\u00bf\3\2\2\2\u00be\u00bc\3\2\2\2\u00bf"+
		"\u00ca\7$\2\2\u00c0\u00c5\7)\2\2\u00c1\u00c4\5;\36\2\u00c2\u00c4\13\2"+
		"\2\2\u00c3\u00c1\3\2\2\2\u00c3\u00c2\3\2\2\2\u00c4\u00c7\3\2\2\2\u00c5"+
		"\u00c6\3\2\2\2\u00c5\u00c3\3\2\2\2\u00c6\u00c8\3\2\2\2\u00c7\u00c5\3\2"+
		"\2\2\u00c8\u00ca\7)\2\2\u00c9\u00b7\3\2\2\2\u00c9\u00c0\3\2\2\2\u00ca"+
		":\3\2\2\2\u00cb\u00cc\7^\2\2\u00cc\u00cd\t\25\2\2\u00cd<\3\2\2\2\21\2"+
		"mox}\u0083\u008a\u008c\u009d\u00a7\u00ba\u00bc\u00c3\u00c5\u00c9\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}