package com.alibaba.hq4hbase;

import com.alibaba.hq4hbase.builder.ConditionBuilder;
import com.alibaba.hq4hbase.builder.ConditionBuilderImpl;
import com.alibaba.hq4hbase.condition.Condition;
import com.alibaba.hq4hbase.condition.QueryCondition;
import junit.framework.TestCase;

/**
 * Created by genxiaogu on 14-7-1.
 * 测试类
 */
public class TestConditionBuilder extends TestCase {
    public void test(){
//        String str = "select a,b,c,d from hello where rowkey like \"aa\" and rowkey='aaa' limit 100 ";
        String str = "select * from hello where rowkey like \"aa\" and rowkey='aaa' limit 100" ;
        ConditionBuilder builder = new ConditionBuilderImpl();
        Condition condition = builder.getCondition(str);
        System.out.println(((QueryCondition)condition).isAllColumns());
    }
}
