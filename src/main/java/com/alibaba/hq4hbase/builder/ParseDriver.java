package com.alibaba.hq4hbase.builder;

import com.alibaba.hq4hbase.condition.Condition;
import com.alibaba.hq4hbase.condition.ConditionBasic;
import com.alibaba.hq4hbase.tools.Util;
import org.antlr.v4.runtime.ANTLRInputStream;
import antlr4.* ;
import antlr4.Sql4HbaseParser.StatementContext ;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

/**
 * Created by genxiaogu on 14-6-23.
 * Describe some issue. 定义了一些解析的基础能力
 */
public class ParseDriver {

    public Sql4HbaseLexer lexer ;
    public Sql4HbaseListener listener ;
    //这个变量只能使用一次
    private Sql4HbaseParser parser ;
    public ParserRuleContext context ;

    /**
     * get ConditionBasic
     * @param  context
     * @return
     * 返回查询基础类
     */
    public ConditionBasic parseWalk(ParserRuleContext context){
        ConditionBasic basic = new ConditionBasic() ;
        listener = new Sql4HbaseListenerImpl(basic);
        ParseTreeWalker walker = new ParseTreeWalker();
        walker.walk(listener,context);
        return basic ;
    }
    /**
     * get StatemenContext
     * @param sql
     * @return StatementContext
     */
    public ParserRuleContext getContext(String sql) {
        Util.checkEmptyString(sql);
        Util.checkNull(sql);

        ANTLRInputStream input = new ANTLRInputStream(sql) ;
        Sql4HbaseLexer lexer = new Sql4HbaseLexer(input);
        CommonTokenStream tokenStream = new CommonTokenStream(lexer);
        Sql4HbaseParser parser = new Sql4HbaseParser(tokenStream) ;

        StatementContext context = parser.statement() ;
        System.out.println(context.toStringTree(parser));
        return context ;
    }

    //只有具备context和condition两个元素才能执行walk操作
    public void paseWalk(ParserRuleContext context,Condition condition){
        ParseTreeWalker walker = new ParseTreeWalker() ;
        listener.setCondition(condition);
        walker.walk(listener,context);
    }

}
