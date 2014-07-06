// Generated from antlr4/Sql4Hbase.g4 by ANTLR 4.2.2
package antlr4 ;
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
		SELECT=1, AND=2, FROM=3, WHERE=4, LIMIT=5, LIKE=6, DESC=7, ALL_COLUMNS=8, 
		ROWKEY=9, TOCName=10, POSITIVE_INT=11, INT=12, FLOAT=13, Dot=14, EQUAL=15, 
		EQUAL_NS=16, NOTEQUAL=17, LESSTHANOREQUALTO=18, LESSTHAN=19, GREATERTHANOREQUALTO=20, 
		GREATERTHAN=21, UNDERLINE=22, HYPHEN=23, STRING=24;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"SELECT", "AND", "FROM", "WHERE", "LIMIT", "LIKE", "DESC", "'*'", "ROWKEY", 
		"TOCName", "POSITIVE_INT", "INT", "FLOAT", "','", "EQUAL", "'<=>'", "NOTEQUAL", 
		"'<='", "'<'", "'>='", "'>'", "'_'", "'-'", "STRING"
	};
	public static final String[] ruleNames = {
		"SELECT", "AND", "FROM", "WHERE", "LIMIT", "LIKE", "DESC", "ALL_COLUMNS", 
		"ROWKEY", "TOCName", "POSITIVE_INT", "INT", "FLOAT", "NameStartChar", 
		"Letter", "HexDigit", "NOTZERO", "Digit", "Dot", "EQUAL", "EQUAL_NS", 
		"NOTEQUAL", "LESSTHANOREQUALTO", "LESSTHAN", "GREATERTHANOREQUALTO", "GREATERTHAN", 
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\32\u00d5\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\3\2"+
		"\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b"+
		"\3\b\3\b\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\7\13u\n\13\f\13\16\13x\13\13\3\f\3\f\3\f\3\r\6\r~\n\r\r\r\16\r\177"+
		"\3\16\6\16\u0083\n\16\r\16\16\16\u0084\3\16\3\16\7\16\u0089\n\16\f\16"+
		"\16\16\u008c\13\16\3\16\3\16\6\16\u0090\n\16\r\16\16\16\u0091\5\16\u0094"+
		"\n\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\25"+
		"\3\25\3\25\5\25\u00a5\n\25\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\5\27"+
		"\u00af\n\27\3\30\3\30\3\30\3\31\3\31\3\32\3\32\3\32\3\33\3\33\3\34\3\34"+
		"\3\35\3\35\3\36\3\36\3\36\7\36\u00c2\n\36\f\36\16\36\u00c5\13\36\3\36"+
		"\3\36\3\36\3\36\7\36\u00cb\n\36\f\36\16\36\u00ce\13\36\3\36\5\36\u00d1"+
		"\n\36\3\37\3\37\3\37\4\u00c3\u00cc\2 \3\3\5\4\7\5\t\6\13\7\r\b\17\t\21"+
		"\n\23\13\25\f\27\r\31\16\33\17\35\2\37\2!\2#\2%\2\'\20)\21+\22-\23/\24"+
		"\61\25\63\26\65\27\67\309\31;\32=\2\3\2\26\4\2UUuu\4\2GGgg\4\2NNnn\4\2"+
		"EEee\4\2VVvv\4\2CCcc\4\2PPpp\4\2FFff\4\2HHhh\4\2TTtt\4\2QQqq\4\2OOoo\4"+
		"\2YYyy\4\2JJjj\4\2KKkk\4\2MMmm\4\2[[{{\4\2C\\c|\4\2CHch\b\2$$^^ddpptt"+
		"vv\u00df\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2"+
		"\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27"+
		"\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2"+
		"-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2"+
		"\2\29\3\2\2\2\2;\3\2\2\2\3?\3\2\2\2\5F\3\2\2\2\7J\3\2\2\2\tO\3\2\2\2\13"+
		"U\3\2\2\2\r[\3\2\2\2\17`\3\2\2\2\21e\3\2\2\2\23g\3\2\2\2\25n\3\2\2\2\27"+
		"y\3\2\2\2\31}\3\2\2\2\33\u0093\3\2\2\2\35\u0095\3\2\2\2\37\u0097\3\2\2"+
		"\2!\u0099\3\2\2\2#\u009b\3\2\2\2%\u009d\3\2\2\2\'\u009f\3\2\2\2)\u00a4"+
		"\3\2\2\2+\u00a6\3\2\2\2-\u00ae\3\2\2\2/\u00b0\3\2\2\2\61\u00b3\3\2\2\2"+
		"\63\u00b5\3\2\2\2\65\u00b8\3\2\2\2\67\u00ba\3\2\2\29\u00bc\3\2\2\2;\u00d0"+
		"\3\2\2\2=\u00d2\3\2\2\2?@\t\2\2\2@A\t\3\2\2AB\t\4\2\2BC\t\3\2\2CD\t\5"+
		"\2\2DE\t\6\2\2E\4\3\2\2\2FG\t\7\2\2GH\t\b\2\2HI\t\t\2\2I\6\3\2\2\2JK\t"+
		"\n\2\2KL\t\13\2\2LM\t\f\2\2MN\t\r\2\2N\b\3\2\2\2OP\t\16\2\2PQ\t\17\2\2"+
		"QR\t\3\2\2RS\t\13\2\2ST\t\3\2\2T\n\3\2\2\2UV\t\4\2\2VW\t\20\2\2WX\t\r"+
		"\2\2XY\t\20\2\2YZ\t\6\2\2Z\f\3\2\2\2[\\\t\4\2\2\\]\t\20\2\2]^\t\21\2\2"+
		"^_\t\3\2\2_\16\3\2\2\2`a\t\t\2\2ab\t\3\2\2bc\t\2\2\2cd\t\5\2\2d\20\3\2"+
		"\2\2ef\7,\2\2f\22\3\2\2\2gh\t\13\2\2hi\t\f\2\2ij\t\16\2\2jk\t\21\2\2k"+
		"l\t\3\2\2lm\t\22\2\2m\24\3\2\2\2nv\5\35\17\2ou\5\37\20\2pu\5!\21\2qu\5"+
		"%\23\2ru\59\35\2su\5\67\34\2to\3\2\2\2tp\3\2\2\2tq\3\2\2\2tr\3\2\2\2t"+
		"s\3\2\2\2ux\3\2\2\2vt\3\2\2\2vw\3\2\2\2w\26\3\2\2\2xv\3\2\2\2yz\5#\22"+
		"\2z{\5\31\r\2{\30\3\2\2\2|~\5%\23\2}|\3\2\2\2~\177\3\2\2\2\177}\3\2\2"+
		"\2\177\u0080\3\2\2\2\u0080\32\3\2\2\2\u0081\u0083\5%\23\2\u0082\u0081"+
		"\3\2\2\2\u0083\u0084\3\2\2\2\u0084\u0082\3\2\2\2\u0084\u0085\3\2\2\2\u0085"+
		"\u0086\3\2\2\2\u0086\u008a\7\60\2\2\u0087\u0089\5%\23\2\u0088\u0087\3"+
		"\2\2\2\u0089\u008c\3\2\2\2\u008a\u0088\3\2\2\2\u008a\u008b\3\2\2\2\u008b"+
		"\u0094\3\2\2\2\u008c\u008a\3\2\2\2\u008d\u008f\7\60\2\2\u008e\u0090\5"+
		"%\23\2\u008f\u008e\3\2\2\2\u0090\u0091\3\2\2\2\u0091\u008f\3\2\2\2\u0091"+
		"\u0092\3\2\2\2\u0092\u0094\3\2\2\2\u0093\u0082\3\2\2\2\u0093\u008d\3\2"+
		"\2\2\u0094\34\3\2\2\2\u0095\u0096\t\23\2\2\u0096\36\3\2\2\2\u0097\u0098"+
		"\t\23\2\2\u0098 \3\2\2\2\u0099\u009a\t\24\2\2\u009a\"\3\2\2\2\u009b\u009c"+
		"\4\63;\2\u009c$\3\2\2\2\u009d\u009e\4\62;\2\u009e&\3\2\2\2\u009f\u00a0"+
		"\7.\2\2\u00a0(\3\2\2\2\u00a1\u00a5\7?\2\2\u00a2\u00a3\7?\2\2\u00a3\u00a5"+
		"\7?\2\2\u00a4\u00a1\3\2\2\2\u00a4\u00a2\3\2\2\2\u00a5*\3\2\2\2\u00a6\u00a7"+
		"\7>\2\2\u00a7\u00a8\7?\2\2\u00a8\u00a9\7@\2\2\u00a9,\3\2\2\2\u00aa\u00ab"+
		"\7>\2\2\u00ab\u00af\7@\2\2\u00ac\u00ad\7#\2\2\u00ad\u00af\7?\2\2\u00ae"+
		"\u00aa\3\2\2\2\u00ae\u00ac\3\2\2\2\u00af.\3\2\2\2\u00b0\u00b1\7>\2\2\u00b1"+
		"\u00b2\7?\2\2\u00b2\60\3\2\2\2\u00b3\u00b4\7>\2\2\u00b4\62\3\2\2\2\u00b5"+
		"\u00b6\7@\2\2\u00b6\u00b7\7?\2\2\u00b7\64\3\2\2\2\u00b8\u00b9\7@\2\2\u00b9"+
		"\66\3\2\2\2\u00ba\u00bb\7a\2\2\u00bb8\3\2\2\2\u00bc\u00bd\7/\2\2\u00bd"+
		":\3\2\2\2\u00be\u00c3\7$\2\2\u00bf\u00c2\5=\37\2\u00c0\u00c2\13\2\2\2"+
		"\u00c1\u00bf\3\2\2\2\u00c1\u00c0\3\2\2\2\u00c2\u00c5\3\2\2\2\u00c3\u00c4"+
		"\3\2\2\2\u00c3\u00c1\3\2\2\2\u00c4\u00c6\3\2\2\2\u00c5\u00c3\3\2\2\2\u00c6"+
		"\u00d1\7$\2\2\u00c7\u00cc\7)\2\2\u00c8\u00cb\5=\37\2\u00c9\u00cb\13\2"+
		"\2\2\u00ca\u00c8\3\2\2\2\u00ca\u00c9\3\2\2\2\u00cb\u00ce\3\2\2\2\u00cc"+
		"\u00cd\3\2\2\2\u00cc\u00ca\3\2\2\2\u00cd\u00cf\3\2\2\2\u00ce\u00cc\3\2"+
		"\2\2\u00cf\u00d1\7)\2\2\u00d0\u00be\3\2\2\2\u00d0\u00c7\3\2\2\2\u00d1"+
		"<\3\2\2\2\u00d2\u00d3\7^\2\2\u00d3\u00d4\t\25\2\2\u00d4>\3\2\2\2\21\2"+
		"tv\177\u0084\u008a\u0091\u0093\u00a4\u00ae\u00c1\u00c3\u00ca\u00cc\u00d0"+
		"\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}