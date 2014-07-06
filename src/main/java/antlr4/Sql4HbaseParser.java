// Generated from antlr4/Sql4Hbase.g4 by ANTLR 4.2.2
package antlr4 ;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class Sql4HbaseParser extends Parser {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		SELECT=1, AND=2, FROM=3, WHERE=4, LIMIT=5, LIKE=6, DESC=7, ALL_COLUMNS=8, 
		ROWKEY=9, TOCName=10, POSITIVE_INT=11, INT=12, FLOAT=13, Dot=14, EQUAL=15, 
		EQUAL_NS=16, NOTEQUAL=17, LESSTHANOREQUALTO=18, LESSTHAN=19, GREATERTHANOREQUALTO=20, 
		GREATERTHAN=21, UNDERLINE=22, HYPHEN=23, STRING=24;
	public static final String[] tokenNames = {
		"<INVALID>", "SELECT", "AND", "FROM", "WHERE", "LIMIT", "LIKE", "DESC", 
		"'*'", "ROWKEY", "TOCName", "POSITIVE_INT", "INT", "FLOAT", "','", "EQUAL", 
		"'<=>'", "NOTEQUAL", "'<='", "'<'", "'>='", "'>'", "'_'", "'-'", "STRING"
	};
	public static final int
		RULE_statement = 0, RULE_selectElement = 1, RULE_descElement = 2, RULE_hq_select = 3, 
		RULE_hq_from = 4, RULE_hq_where = 5, RULE_hq_limit = 6, RULE_hq_compare = 7, 
		RULE_hq_columns = 8, RULE_compare = 9, RULE_columnName = 10, RULE_tableName = 11;
	public static final String[] ruleNames = {
		"statement", "selectElement", "descElement", "hq_select", "hq_from", "hq_where", 
		"hq_limit", "hq_compare", "hq_columns", "compare", "columnName", "tableName"
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
		public DescElementContext descElement() {
			return getRuleContext(DescElementContext.class,0);
		}
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
			setState(26);
			switch (_input.LA(1)) {
			case SELECT:
				enterOuterAlt(_localctx, 1);
				{
				setState(24); selectElement();
				}
				break;
			case DESC:
				enterOuterAlt(_localctx, 2);
				{
				setState(25); descElement();
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
			setState(28); hq_select();
			setState(29); hq_from();
			setState(30); hq_where();
			setState(31); hq_limit();
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

	public static class DescElementContext extends ParserRuleContext {
		public TerminalNode DESC() { return getToken(Sql4HbaseParser.DESC, 0); }
		public TableNameContext tableName() {
			return getRuleContext(TableNameContext.class,0);
		}
		public DescElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_descElement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Sql4HbaseListener ) ((Sql4HbaseListener)listener).enterDescElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Sql4HbaseListener ) ((Sql4HbaseListener)listener).exitDescElement(this);
		}
	}

	public final DescElementContext descElement() throws RecognitionException {
		DescElementContext _localctx = new DescElementContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_descElement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(33); match(DESC);
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
		enterRule(_localctx, 6, RULE_hq_select);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(36); match(SELECT);
			setState(37); hq_columns();
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
		enterRule(_localctx, 8, RULE_hq_from);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(39); match(FROM);
			setState(40); tableName();
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
		enterRule(_localctx, 10, RULE_hq_where);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(42); match(WHERE);
			setState(43); hq_compare();
			setState(48);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AND) {
				{
				{
				setState(44); match(AND);
				setState(45); hq_compare();
				}
				}
				setState(50);
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
		enterRule(_localctx, 12, RULE_hq_limit);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(51); match(LIMIT);
			setState(52); match(POSITIVE_INT);
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
		public ColumnNameContext columnName() {
			return getRuleContext(ColumnNameContext.class,0);
		}
		public TerminalNode STRING() { return getToken(Sql4HbaseParser.STRING, 0); }
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
		enterRule(_localctx, 14, RULE_hq_compare);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(54); columnName();
			setState(55); compare();
			setState(56); match(STRING);
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
		enterRule(_localctx, 16, RULE_hq_columns);
		int _la;
		try {
			setState(67);
			switch (_input.LA(1)) {
			case TOCName:
				enterOuterAlt(_localctx, 1);
				{
				setState(58); columnName();
				setState(63);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Dot) {
					{
					{
					setState(59); match(Dot);
					setState(60); columnName();
					}
					}
					setState(65);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case ALL_COLUMNS:
				enterOuterAlt(_localctx, 2);
				{
				setState(66); match(ALL_COLUMNS);
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
		enterRule(_localctx, 18, RULE_compare);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(69);
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
		enterRule(_localctx, 20, RULE_columnName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(71); match(TOCName);
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
		enterRule(_localctx, 22, RULE_tableName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(73); match(TOCName);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\32N\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13\4"+
		"\f\t\f\4\r\t\r\3\2\3\2\5\2\35\n\2\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\5"+
		"\3\5\3\5\3\6\3\6\3\6\3\7\3\7\3\7\3\7\7\7\61\n\7\f\7\16\7\64\13\7\3\b\3"+
		"\b\3\b\3\t\3\t\3\t\3\t\3\n\3\n\3\n\7\n@\n\n\f\n\16\nC\13\n\3\n\5\nF\n"+
		"\n\3\13\3\13\3\f\3\f\3\r\3\r\3\r\2\2\16\2\4\6\b\n\f\16\20\22\24\26\30"+
		"\2\3\4\2\b\b\21\27E\2\34\3\2\2\2\4\36\3\2\2\2\6#\3\2\2\2\b&\3\2\2\2\n"+
		")\3\2\2\2\f,\3\2\2\2\16\65\3\2\2\2\208\3\2\2\2\22E\3\2\2\2\24G\3\2\2\2"+
		"\26I\3\2\2\2\30K\3\2\2\2\32\35\5\4\3\2\33\35\5\6\4\2\34\32\3\2\2\2\34"+
		"\33\3\2\2\2\35\3\3\2\2\2\36\37\5\b\5\2\37 \5\n\6\2 !\5\f\7\2!\"\5\16\b"+
		"\2\"\5\3\2\2\2#$\7\t\2\2$%\5\30\r\2%\7\3\2\2\2&\'\7\3\2\2\'(\5\22\n\2"+
		"(\t\3\2\2\2)*\7\5\2\2*+\5\30\r\2+\13\3\2\2\2,-\7\6\2\2-\62\5\20\t\2./"+
		"\7\4\2\2/\61\5\20\t\2\60.\3\2\2\2\61\64\3\2\2\2\62\60\3\2\2\2\62\63\3"+
		"\2\2\2\63\r\3\2\2\2\64\62\3\2\2\2\65\66\7\7\2\2\66\67\7\r\2\2\67\17\3"+
		"\2\2\289\5\26\f\29:\5\24\13\2:;\7\32\2\2;\21\3\2\2\2<A\5\26\f\2=>\7\20"+
		"\2\2>@\5\26\f\2?=\3\2\2\2@C\3\2\2\2A?\3\2\2\2AB\3\2\2\2BF\3\2\2\2CA\3"+
		"\2\2\2DF\7\n\2\2E<\3\2\2\2ED\3\2\2\2F\23\3\2\2\2GH\t\2\2\2H\25\3\2\2\2"+
		"IJ\7\f\2\2J\27\3\2\2\2KL\7\f\2\2L\31\3\2\2\2\6\34\62AE";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}