package com.alibaba.hql4hbase.antlr4;

import antlr4.Sql4HbaseLexer;
import antlr4.Sql4HbaseListener;
import antlr4.Sql4HbaseListenerImpl;
import antlr4.Sql4HbaseParser;
import com.alibaba.hq4hbase.condition.ConditionBasic;
import junit.framework.TestCase;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import antlr4.Sql4HbaseParser.StatementContext ;

import java.io.IOException;

/**
 * Created by genxiaogu on 14-7-1.
 */
public class Antlr4Test1 extends TestCase {
    public void test() throws IOException {
        //ANTLRInputStream input = new ANTLRInputStream(System.in);
        String str = "select aa,bb,cc from hello where rowkey like \"aa\" and rowkey='aaa' limit 100 ";
        ANTLRInputStream input = new ANTLRInputStream(str) ;
        Sql4HbaseLexer lexer = new Sql4HbaseLexer(input);
        CommonTokenStream tokenStream = new CommonTokenStream(lexer);

        Sql4HbaseParser parser = new Sql4HbaseParser(tokenStream) ;

        Sql4HbaseParser.StatementContext tree = parser.statement() ;

        System.out.println(tree.selectElement().hq_select().hq_columns().columnName().get(1).TOCName().toStringTree(parser));

    }

    public void test1() {
        //ANTLRInputStream input = new ANTLRInputStream(System.in);
        String str = "select aa,bb,cc from hello where rowkey like \"aa\" and rowkey='aaa' limit 100 ";
        ANTLRInputStream input = new ANTLRInputStream(str) ;
        Sql4HbaseLexer lexer = new Sql4HbaseLexer(input);
        CommonTokenStream tokenStream = new CommonTokenStream(lexer);

        Sql4HbaseParser parser = new Sql4HbaseParser(tokenStream) ;

        Sql4HbaseParser.StatementContext tree = parser.statement() ;
        //这里的问题是 输入流已经输出完成了 所以得重置输入流 不过这里比较绕
        ParserRuleContext tree1 = tree.selectElement() ;
        System.out.println(tree.toStringTree(parser));
        System.out.println(tree1.toStringTree(parser));
    }
}
