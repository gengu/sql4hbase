package antlr4;

import com.alibaba.hq4hbase.condition.Condition;
import com.alibaba.hq4hbase.condition.ConditionBasic;
import com.alibaba.hq4hbase.condition.QueryCondition;
import com.alibaba.hq4hbase.model.Compare;
import com.alibaba.hq4hbase.model.CompareType;
import com.alibaba.hq4hbase.model.Query;
import com.alibaba.hq4hbase.model.SQLType;
import com.alibaba.hq4hbase.tools.Util;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.ArrayList;

/**
 * Created by genxiaogu on 14-7-4.
 * Condition 组装
 */
public class Sql4HbaseListenerImpl implements Sql4HbaseListener{

    private ConditionBasic basic ;
    private Condition condition ;

    public Sql4HbaseListenerImpl(ConditionBasic basic) {
        this.basic = basic;
    }

    public void setCondition(Condition condition) {
        this.condition = condition;
    }

    @Override
    public void enterStatement(@NotNull Sql4HbaseParser.StatementContext ctx) {

    }

    @Override
    public void exitStatement(@NotNull Sql4HbaseParser.StatementContext ctx) {

    }

    @Override
    public void enterHq_compare(@NotNull Sql4HbaseParser.Hq_compareContext ctx) {
        if(null != condition && condition instanceof  QueryCondition){
            Compare compare = new Compare();
            compare.setColumn(ctx.columnName().getText());
            compare.setType(CompareType.valuesOf(ctx.getChild(1).getText()));
            compare.setValue(ctx.STRING().getText());
            ((QueryCondition)condition).addCompare(compare);
        }
    }

    @Override
    public void exitHq_compare(@NotNull Sql4HbaseParser.Hq_compareContext ctx) {

    }

    @Override
    public void enterHq_limit(@NotNull Sql4HbaseParser.Hq_limitContext ctx) {
        if(null != condition){
            ((QueryCondition)condition).setLimit(ctx.POSITIVE_INT().getText());
        }
    }

    @Override
    public void exitHq_limit(@NotNull Sql4HbaseParser.Hq_limitContext ctx) {

    }

    @Override
    public void enterHq_from(@NotNull Sql4HbaseParser.Hq_fromContext ctx) {

    }

    @Override
    public void exitHq_from(@NotNull Sql4HbaseParser.Hq_fromContext ctx) {

    }

    @Override
    public void enterHq_columns(@NotNull Sql4HbaseParser.Hq_columnsContext ctx) {
        if(null != condition){
            if(null != ctx.ALL_COLUMNS().getText()){
                ((QueryCondition)condition).setAll(true);
            }
        }
    }

    @Override
    public void exitHq_columns(@NotNull Sql4HbaseParser.Hq_columnsContext ctx) {

    }

    @Override
    public void enterHq_select(@NotNull Sql4HbaseParser.Hq_selectContext ctx) {
        if(null != condition && condition instanceof QueryCondition){
            ((QueryCondition)condition).setColumns(new ArrayList<String>());
        }
    }

    @Override
    public void exitHq_select(@NotNull Sql4HbaseParser.Hq_selectContext ctx) {

    }

    @Override
    public void enterTableName(@NotNull Sql4HbaseParser.TableNameContext ctx) {
        if(basic != null){
            basic.setTableName(ctx.TOCName().getText());
        }
    }

    @Override
    public void exitTableName(@NotNull Sql4HbaseParser.TableNameContext ctx) {

    }

    @Override
    public void enterCompare(@NotNull Sql4HbaseParser.CompareContext ctx) {

    }

    @Override
    public void exitCompare(@NotNull Sql4HbaseParser.CompareContext ctx) {

    }

    @Override
    public void enterHq_where(@NotNull Sql4HbaseParser.Hq_whereContext ctx) {
        if(null != condition && condition instanceof QueryCondition){
            ((QueryCondition)condition).setCompareList(new ArrayList<Compare>());
        }
    }

    @Override
    public void exitHq_where(@NotNull Sql4HbaseParser.Hq_whereContext ctx) {

    }

    @Override
    public void enterColumnName(@NotNull Sql4HbaseParser.ColumnNameContext ctx) {
        if(null != condition && condition instanceof  QueryCondition){
            ((QueryCondition)condition).addColumns(ctx.getText());
        }

    }

    @Override
    public void exitColumnName(@NotNull Sql4HbaseParser.ColumnNameContext ctx) {

    }

    @Override
    public void enterDescElement(@NotNull Sql4HbaseParser.DescElementContext ctx) {

    }

    @Override
    public void exitDescElement(@NotNull Sql4HbaseParser.DescElementContext ctx) {

    }

    @Override
    public void enterSelectElement(@NotNull Sql4HbaseParser.SelectElementContext ctx) {
        Util.checkNull(basic);
        basic.setType(SQLType.Query);
    }

    @Override
    public void exitSelectElement(@NotNull Sql4HbaseParser.SelectElementContext ctx) {

    }

    @Override
    public void visitTerminal(@NotNull TerminalNode node) {

    }

    @Override
    public void visitErrorNode(@NotNull ErrorNode node) {

    }

    @Override
    public void enterEveryRule(@NotNull ParserRuleContext ctx) {

    }

    @Override
    public void exitEveryRule(@NotNull ParserRuleContext ctx) {

    }
}
