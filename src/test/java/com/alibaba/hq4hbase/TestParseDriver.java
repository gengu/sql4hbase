package com.alibaba.hq4hbase;

import com.alibaba.hq4hbase.builder.ConditionBuilder;
import com.alibaba.hq4hbase.builder.ConditionBuilderImpl;
import com.alibaba.hq4hbase.builder.ParseDriver;
import com.alibaba.hq4hbase.condition.Condition;
import com.alibaba.hq4hbase.condition.ConditionBasic;
import com.alibaba.hq4hbase.condition.QueryCondition;
import junit.framework.TestCase;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.RuleContext;

/**
 * Created by genxiaogu on 14-6-23.
 * 测试testCase
 */
public class TestParseDriver extends TestCase {

    public void test1(){
        String str = "select a,b,c,d from hello where rowkey like \"aa\" and rowkey='aaa' limit 100 ";
        ParseDriver driver = new ParseDriver();
        ConditionBuilder builder = new ConditionBuilderImpl();
        //拿到context
        ParserRuleContext context = driver.getContext(str);
        //识别查询的类型
        ConditionBasic basic = driver.parseWalk(context);

        Condition condition = builder.getConditionByBasic(basic);
        driver.paseWalk(context, condition);
        System.out.println(((QueryCondition)condition).getLimit());
    }
}
