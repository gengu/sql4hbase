// Generated from antlr4/Sql4Hbase.g4 by ANTLR 4.2.2
package antlr4 ;
import com.alibaba.hq4hbase.condition.Condition;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;


/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link Sql4HbaseParser}.
 */
public interface Sql4HbaseListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link Sql4HbaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(@NotNull Sql4HbaseParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Sql4HbaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(@NotNull Sql4HbaseParser.StatementContext ctx);

	/**
	 * Enter a parse tree produced by {@link Sql4HbaseParser#hq_compare}.
	 * @param ctx the parse tree
	 */
	void enterHq_compare(@NotNull Sql4HbaseParser.Hq_compareContext ctx);
	/**
	 * Exit a parse tree produced by {@link Sql4HbaseParser#hq_compare}.
	 * @param ctx the parse tree
	 */
	void exitHq_compare(@NotNull Sql4HbaseParser.Hq_compareContext ctx);

	/**
	 * Enter a parse tree produced by {@link Sql4HbaseParser#hq_limit}.
	 * @param ctx the parse tree
	 */
	void enterHq_limit(@NotNull Sql4HbaseParser.Hq_limitContext ctx);
	/**
	 * Exit a parse tree produced by {@link Sql4HbaseParser#hq_limit}.
	 * @param ctx the parse tree
	 */
	void exitHq_limit(@NotNull Sql4HbaseParser.Hq_limitContext ctx);

	/**
	 * Enter a parse tree produced by {@link Sql4HbaseParser#hq_from}.
	 * @param ctx the parse tree
	 */
	void enterHq_from(@NotNull Sql4HbaseParser.Hq_fromContext ctx);
	/**
	 * Exit a parse tree produced by {@link Sql4HbaseParser#hq_from}.
	 * @param ctx the parse tree
	 */
	void exitHq_from(@NotNull Sql4HbaseParser.Hq_fromContext ctx);

	/**
	 * Enter a parse tree produced by {@link Sql4HbaseParser#hq_columns}.
	 * @param ctx the parse tree
	 */
	void enterHq_columns(@NotNull Sql4HbaseParser.Hq_columnsContext ctx);
	/**
	 * Exit a parse tree produced by {@link Sql4HbaseParser#hq_columns}.
	 * @param ctx the parse tree
	 */
	void exitHq_columns(@NotNull Sql4HbaseParser.Hq_columnsContext ctx);

	/**
	 * Enter a parse tree produced by {@link Sql4HbaseParser#hq_select}.
	 * @param ctx the parse tree
	 */
	void enterHq_select(@NotNull Sql4HbaseParser.Hq_selectContext ctx);
	/**
	 * Exit a parse tree produced by {@link Sql4HbaseParser#hq_select}.
	 * @param ctx the parse tree
	 */
	void exitHq_select(@NotNull Sql4HbaseParser.Hq_selectContext ctx);

	/**
	 * Enter a parse tree produced by {@link Sql4HbaseParser#tableName}.
	 * @param ctx the parse tree
	 */
	void enterTableName(@NotNull Sql4HbaseParser.TableNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link Sql4HbaseParser#tableName}.
	 * @param ctx the parse tree
	 */
	void exitTableName(@NotNull Sql4HbaseParser.TableNameContext ctx);

	/**
	 * Enter a parse tree produced by {@link Sql4HbaseParser#compare}.
	 * @param ctx the parse tree
	 */
	void enterCompare(@NotNull Sql4HbaseParser.CompareContext ctx);
	/**
	 * Exit a parse tree produced by {@link Sql4HbaseParser#compare}.
	 * @param ctx the parse tree
	 */
	void exitCompare(@NotNull Sql4HbaseParser.CompareContext ctx);

	/**
	 * Enter a parse tree produced by {@link Sql4HbaseParser#hq_where}.
	 * @param ctx the parse tree
	 */
	void enterHq_where(@NotNull Sql4HbaseParser.Hq_whereContext ctx);
	/**
	 * Exit a parse tree produced by {@link Sql4HbaseParser#hq_where}.
	 * @param ctx the parse tree
	 */
	void exitHq_where(@NotNull Sql4HbaseParser.Hq_whereContext ctx);

	/**
	 * Enter a parse tree produced by {@link Sql4HbaseParser#columnName}.
	 * @param ctx the parse tree
	 */
	void enterColumnName(@NotNull Sql4HbaseParser.ColumnNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link Sql4HbaseParser#columnName}.
	 * @param ctx the parse tree
	 */
	void exitColumnName(@NotNull Sql4HbaseParser.ColumnNameContext ctx);

	/**
	 * Enter a parse tree produced by {@link Sql4HbaseParser#descElement}.
	 * @param ctx the parse tree
	 */
	void enterDescElement(@NotNull Sql4HbaseParser.DescElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Sql4HbaseParser#descElement}.
	 * @param ctx the parse tree
	 */
	void exitDescElement(@NotNull Sql4HbaseParser.DescElementContext ctx);

	/**
	 * Enter a parse tree produced by {@link Sql4HbaseParser#selectElement}.
	 * @param ctx the parse tree
	 */
	void enterSelectElement(@NotNull Sql4HbaseParser.SelectElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Sql4HbaseParser#selectElement}.
	 * @param ctx the parse tree
	 */
	void exitSelectElement(@NotNull Sql4HbaseParser.SelectElementContext ctx);

    public void setCondition(Condition condition) ;
}