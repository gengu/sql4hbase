package com.alibaba.hql4hbase.antlr4;
import antlr4.Sql4HbaseListener;
import antlr4.Sql4HbaseListenerImpl;
import com.alibaba.hq4hbase.condition.Condition;
import com.alibaba.hq4hbase.condition.ConditionBasic;
import junit.framework.TestCase;
import org.antlr.runtime.tree.ParseTree;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;

import antlr4.Sql4HbaseLexer ;
import antlr4.Sql4HbaseParser ;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
//import org.antlr.v4.runtime.tree.ParseTree;


import java.io.IOException;

/**
 * Created by genxiaogu on 14-6-22.
 * test
 */
public class Antlr4Test extends TestCase{

    public void test() throws IOException{
        //ANTLRInputStream input = new ANTLRInputStream(System.in);
        String str = "select a,b from hello where rowkey like \"aa\" and rowkey='aaa' limit 100 ";
        ANTLRInputStream input = new ANTLRInputStream(str) ;
        Sql4HbaseLexer lexer = new Sql4HbaseLexer(input);
        CommonTokenStream tokenStream = new CommonTokenStream(lexer);

        Sql4HbaseParser parser = new Sql4HbaseParser(tokenStream) ;

        Sql4HbaseParser.StatementContext tree = parser.statement() ;
        System.out.println(tree.toStringTree(parser));
        System.out.println(tree.selectElement().hq_where().hq_compare(0).getChild(1).getText());
        //System.out.println(tree.selectElement().hq_select().hq_columns().ALL_COLUMNS());
        //System.out.println(tree.selectElement().hq_limit().POSITIVE_INT());
//        ConditionBasic condition = new ConditionBasic();
//        Sql4HbaseListener listener = new Sql4HbaseListenerImpl(condition);
//        ParseTreeWalker walker = new ParseTreeWalker();
//        walker.walk(listener,tree);
//
//        System.out.println(
//                condition.getTableName().toString() +
//                        condition.getType().toString()
//        );

    }
}
