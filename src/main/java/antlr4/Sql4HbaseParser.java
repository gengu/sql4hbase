package antlr4;// Generated from Sql4Hbase.g4 by ANTLR 4.2.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class Sql4HbaseParser extends Parser {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		SELECT=1, AND=2, FROM=3, WHERE=4, LIMIT=5, LIKE=6, ALL_COLUMNS=7, ROWKEY=8, 
		TOCName=9, POSITIVE_INT=10, INT=11, FLOAT=12, Dot=13, EQUAL=14, EQUAL_NS=15, 
		NOTEQUAL=16, LESSTHANOREQUALTO=17, LESSTHAN=18, GREATERTHANOREQUALTO=19, 
		GREATERTHAN=20, UNDERLINE=21, HYPHEN=22, STRING=23;
	public static final String[] tokenNames = {
		"<INVALID>", "SELECT", "AND", "FROM", "WHERE", "LIMIT", "LIKE", "'*'", 
		"ROWKEY", "TOCName", "POSITIVE_INT", "INT", "FLOAT", "','", "EQUAL", "'<=>'", 
		"NOTEQUAL", "'<='", "'<'", "'>='", "'>'", "'_'", "'-'", "STRING"
	};
	public static final int
		RULE_statement = 0, RULE_selectElement = 1, RULE_hq_select = 2, RULE_hq_from = 3, 
		RULE_hq_where = 4, RULE_hq_limit = 5, RULE_hq_compare = 6, RULE_hq_columns = 7, 
		RULE_compare = 8, RULE_columnName = 9, RULE_tableName = 10;
	public static final String[] ruleNames = {
		"statement", "selectElement", "hq_select", "hq_from", "hq_where", "hq_limit", 
		"hq_compare", "hq_columns", "compare", "columnName", "tableName"
	};

	@Override
	public String getGrammarFileName() { return "Sql4Hbase.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public Sql4HbaseParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class StatementContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(Sql4HbaseParser.EOF, 0); }
		public SelectElementContext selectElement() {
			return getRuleContext(SelectElementContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Sql4HbaseListener ) ((Sql4HbaseListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Sql4HbaseListener ) ((Sql4HbaseListener)listener).exitStatement(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(22); selectElement();
			setState(23); match(EOF);
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

	public static class SelectElementContext extends ParserRuleContext {
		public Hq_fromContext hq_from() {
			return getRuleContext(Hq_fromContext.class,0);
		}
		public Hq_selectContext hq_select() {
			return getRuleContext(Hq_selectContext.class,0);
		}
		public Hq_limitContext hq_limit() {
			return getRuleContext(Hq_limitContext.class,0);
		}
		public Hq_whereContext hq_where() {
			return getRuleContext(Hq_whereContext.class,0);
		}
		public SelectElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectElement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Sql4HbaseListener ) ((Sql4HbaseListener)listener).enterSelectElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Sql4HbaseListener ) ((Sql4HbaseListener)listener).exitSelectElement(this);
		}
	}

	public final SelectElementContext selectElement() throws RecognitionException {
		SelectElementContext _localctx = new SelectElementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_selectElement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(25); hq_select();
			setState(26); hq_from();
			setState(27); hq_where();
			setState(28); hq_limit();
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

	public static class Hq_selectContext extends ParserRuleContext {
		public Hq_columnsContext hq_columns() {
			return getRuleContext(Hq_columnsContext.class,0);
		}
		public TerminalNode SELECT() { return getToken(Sql4HbaseParser.SELECT, 0); }
		public Hq_selectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_hq_select; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Sql4HbaseListener ) ((Sql4HbaseListener)listener).enterHq_select(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Sql4HbaseListener ) ((Sql4HbaseListener)listener).exitHq_select(this);
		}
	}

	public final Hq_selectContext hq_select() throws RecognitionException {
		Hq_selectContext _localctx = new Hq_selectContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_hq_select);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(30); match(SELECT);
			setState(31); hq_columns();
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

	public static class Hq_fromContext extends ParserRuleContext {
		public TableNameContext tableName() {
			return getRuleContext(TableNameContext.class,0);
		}
		public TerminalNode FROM() { return getToken(Sql4HbaseParser.FROM, 0); }
		public Hq_fromContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_hq_from; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Sql4HbaseListener ) ((Sql4HbaseListener)listener).enterHq_from(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Sql4HbaseListener ) ((Sql4HbaseListener)listener).exitHq_from(this);
		}
	}

	public final Hq_fromContext hq_from() throws RecognitionException {
		Hq_fromContext _localctx = new Hq_fromContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_hq_from);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(33); match(FROM);
			setState(34); tableName();
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

	public static class Hq_whereContext extends ParserRuleContext {
		public TerminalNode WHERE() { return getToken(Sql4HbaseParser.WHERE, 0); }
		public List<TerminalNode> AND() { return getTokens(Sql4HbaseParser.AND); }
		public List<Hq_compareContext> hq_compare() {
			return getRuleContexts(Hq_compareContext.class);
		}
		public TerminalNode AND(int i) {
			return getToken(Sql4HbaseParser.AND, i);
		}
		public Hq_compareContext hq_compare(int i) {
			return getRuleContext(Hq_compareContext.class,i);
		}
		public Hq_whereContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_hq_where; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Sql4HbaseListener ) ((Sql4HbaseListener)listener).enterHq_where(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Sql4HbaseListener ) ((Sql4HbaseListener)listener).exitHq_where(this);
		}
	}

	public final Hq_whereContext hq_where() throws RecognitionException {
		Hq_whereContext _localctx = new Hq_whereContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_hq_where);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(36); match(WHERE);
			setState(37); hq_compare();
			setState(42);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AND) {
				{
				{
				setState(38); match(AND);
				setState(39); hq_compare();
				}
				}
				setState(44);
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

	public static class Hq_limitContext extends ParserRuleContext {
		public TerminalNode LIMIT() { return getToken(Sql4HbaseParser.LIMIT, 0); }
		public TerminalNode POSITIVE_INT() { return getToken(Sql4HbaseParser.POSITIVE_INT, 0); }
		public Hq_limitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_hq_limit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Sql4HbaseListener ) ((Sql4HbaseListener)listener).enterHq_limit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Sql4HbaseListener ) ((Sql4HbaseListener)listener).exitHq_limit(this);
		}
	}

	public final Hq_limitContext hq_limit() throws RecognitionException {
		Hq_limitContext _localctx = new Hq_limitContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_hq_limit);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(45); match(LIMIT);
			setState(46); match(POSITIVE_INT);
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

	public static class Hq_compareContext extends ParserRuleContext {
		public CompareContext compare() {
			return getRuleContext(CompareContext.class,0);
		}
		public TerminalNode STRING() { return getToken(Sql4HbaseParser.STRING, 0); }
		public TerminalNode ROWKEY() { return getToken(Sql4HbaseParser.ROWKEY, 0); }
		public Hq_compareContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_hq_compare; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Sql4HbaseListener ) ((Sql4HbaseListener)listener).enterHq_compare(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Sql4HbaseListener ) ((Sql4HbaseListener)listener).exitHq_compare(this);
		}
	}

	public final Hq_compareContext hq_compare() throws RecognitionException {
		Hq_compareContext _localctx = new Hq_compareContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_hq_compare);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(48); match(ROWKEY);
			setState(49); compare();
			setState(50); match(STRING);
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

	public static class Hq_columnsContext extends ParserRuleContext {
		public ColumnNameContext columnName(int i) {
			return getRuleContext(ColumnNameContext.class,i);
		}
		public TerminalNode ALL_COLUMNS() { return getToken(Sql4HbaseParser.ALL_COLUMNS, 0); }
		public List<ColumnNameContext> columnName() {
			return getRuleContexts(ColumnNameContext.class);
		}
		public List<TerminalNode> Dot() { return getTokens(Sql4HbaseParser.Dot); }
		public TerminalNode Dot(int i) {
			return getToken(Sql4HbaseParser.Dot, i);
		}
		public Hq_columnsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_hq_columns; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Sql4HbaseListener ) ((Sql4HbaseListener)listener).enterHq_columns(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Sql4HbaseListener ) ((Sql4HbaseListener)listener).exitHq_columns(this);
		}
	}

	public final Hq_columnsContext hq_columns() throws RecognitionException {
		Hq_columnsContext _localctx = new Hq_columnsContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_hq_columns);
		int _la;
		try {
			setState(61);
			switch (_input.LA(1)) {
			case TOCName:
				enterOuterAlt(_localctx, 1);
				{
				setState(52); columnName();
				setState(57);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Dot) {
					{
					{
					setState(53); match(Dot);
					setState(54); columnName();
					}
					}
					setState(59);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case ALL_COLUMNS:
				enterOuterAlt(_localctx, 2);
				{
				setState(60); match(ALL_COLUMNS);
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

	public static class CompareContext extends ParserRuleContext {
		public TerminalNode LESSTHAN() { return getToken(Sql4HbaseParser.LESSTHAN, 0); }
		public TerminalNode GREATERTHANOREQUALTO() { return getToken(Sql4HbaseParser.GREATERTHANOREQUALTO, 0); }
		public TerminalNode GREATERTHAN() { return getToken(Sql4HbaseParser.GREATERTHAN, 0); }
		public TerminalNode LESSTHANOREQUALTO() { return getToken(Sql4HbaseParser.LESSTHANOREQUALTO, 0); }
		public TerminalNode EQUAL() { return getToken(Sql4HbaseParser.EQUAL, 0); }
		public TerminalNode LIKE() { return getToken(Sql4HbaseParser.LIKE, 0); }
		public TerminalNode EQUAL_NS() { return getToken(Sql4HbaseParser.EQUAL_NS, 0); }
		public TerminalNode NOTEQUAL() { return getToken(Sql4HbaseParser.NOTEQUAL, 0); }
		public CompareContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compare; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Sql4HbaseListener ) ((Sql4HbaseListener)listener).enterCompare(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Sql4HbaseListener ) ((Sql4HbaseListener)listener).exitCompare(this);
		}
	}

	public final CompareContext compare() throws RecognitionException {
		CompareContext _localctx = new CompareContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_compare);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(63);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LIKE) | (1L << EQUAL) | (1L << EQUAL_NS) | (1L << NOTEQUAL) | (1L << LESSTHANOREQUALTO) | (1L << LESSTHAN) | (1L << GREATERTHANOREQUALTO) | (1L << GREATERTHAN))) != 0)) ) {
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

	public static class ColumnNameContext extends ParserRuleContext {
		public TerminalNode TOCName() { return getToken(Sql4HbaseParser.TOCName, 0); }
		public ColumnNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_columnName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Sql4HbaseListener ) ((Sql4HbaseListener)listener).enterColumnName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Sql4HbaseListener ) ((Sql4HbaseListener)listener).exitColumnName(this);
		}
	}

	public final ColumnNameContext columnName() throws RecognitionException {
		ColumnNameContext _localctx = new ColumnNameContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_columnName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(65); match(TOCName);
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

	public static class TableNameContext extends ParserRuleContext {
		public TerminalNode TOCName() { return getToken(Sql4HbaseParser.TOCName, 0); }
		public TableNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Sql4HbaseListener ) ((Sql4HbaseListener)listener).enterTableName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Sql4HbaseListener ) ((Sql4HbaseListener)listener).exitTableName(this);
		}
	}

	public final TableNameContext tableName() throws RecognitionException {
		TableNameContext _localctx = new TableNameContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_tableName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(67); match(TOCName);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\31H\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13\4"+
		"\f\t\f\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\5\3\5\3\5\3\6\3\6"+
		"\3\6\3\6\7\6+\n\6\f\6\16\6.\13\6\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\t\3\t\3"+
		"\t\7\t:\n\t\f\t\16\t=\13\t\3\t\5\t@\n\t\3\n\3\n\3\13\3\13\3\f\3\f\3\f"+
		"\2\2\r\2\4\6\b\n\f\16\20\22\24\26\2\3\4\2\b\b\20\26?\2\30\3\2\2\2\4\33"+
		"\3\2\2\2\6 \3\2\2\2\b#\3\2\2\2\n&\3\2\2\2\f/\3\2\2\2\16\62\3\2\2\2\20"+
		"?\3\2\2\2\22A\3\2\2\2\24C\3\2\2\2\26E\3\2\2\2\30\31\5\4\3\2\31\32\7\2"+
		"\2\3\32\3\3\2\2\2\33\34\5\6\4\2\34\35\5\b\5\2\35\36\5\n\6\2\36\37\5\f"+
		"\7\2\37\5\3\2\2\2 !\7\3\2\2!\"\5\20\t\2\"\7\3\2\2\2#$\7\5\2\2$%\5\26\f"+
		"\2%\t\3\2\2\2&\'\7\6\2\2\',\5\16\b\2()\7\4\2\2)+\5\16\b\2*(\3\2\2\2+."+
		"\3\2\2\2,*\3\2\2\2,-\3\2\2\2-\13\3\2\2\2.,\3\2\2\2/\60\7\7\2\2\60\61\7"+
		"\f\2\2\61\r\3\2\2\2\62\63\7\n\2\2\63\64\5\22\n\2\64\65\7\31\2\2\65\17"+
		"\3\2\2\2\66;\5\24\13\2\678\7\17\2\28:\5\24\13\29\67\3\2\2\2:=\3\2\2\2"+
		";9\3\2\2\2;<\3\2\2\2<@\3\2\2\2=;\3\2\2\2>@\7\t\2\2?\66\3\2\2\2?>\3\2\2"+
		"\2@\21\3\2\2\2AB\t\2\2\2B\23\3\2\2\2CD\7\13\2\2D\25\3\2\2\2EF\7\13\2\2"+
		"F\27\3\2\2\2\5,;?";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}