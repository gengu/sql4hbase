package com.alibaba.hq4hbase.builder;

import antlr4.Sql4HbaseParser;
import com.alibaba.hq4hbase.condition.Condition;
import antlr4.Sql4HbaseParser.StatementContext ;
import com.alibaba.hq4hbase.condition.ConditionBasic;
import org.antlr.v4.runtime.ParserRuleContext;

/**
 * Created by genxiaogu on 14-6-26.
 * Condition Build
 */
public abstract class ConditionBuilder {

    /**
     * buildConditionBasic
     * @return
     */
    public abstract Condition buildCondition(String sql);

    //做一次基础的condition build 确定Condition的种类
    public abstract Condition getConditionByBasic(ConditionBasic basic) ;

    public Condition getCondition(String sql){
        ParseDriver driver = new ParseDriver();
        ParserRuleContext context = driver.getContext(sql);
        ConditionBasic basic = driver.parseWalk(context);
        //依赖子类的实现
        Condition condition = this.getConditionByBasic(basic);
        driver.paseWalk(context,condition);
        return condition ;
    }
}
