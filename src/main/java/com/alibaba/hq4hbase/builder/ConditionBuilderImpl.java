package com.alibaba.hq4hbase.builder;

import com.alibaba.hq4hbase.condition.Condition;
import com.alibaba.hq4hbase.condition.ConditionBasic;

/**
 * Created by genxiaogu on 14-6-27.
 * 组装context类
 */
public class ConditionBuilderImpl extends ConditionBuilder{

    @Override
    public Condition buildCondition(String sql) {
        ConditionBuilder builder = new ConditionBuilderImpl();
        Condition condition = builder.getCondition(sql);
        return condition ;
    }

    @Override
    public Condition getConditionByBasic(ConditionBasic basic) {

        try {
            System.out.println(basic.getType());
            Condition condition =  (Condition)Class.forName(basic.getType().toString()).newInstance();
            condition.setTableName(basic.getTableName());
            ParseDriver driver = new ParseDriver();
            return condition ;
        }catch(Exception e){
            e.printStackTrace();
        }
        return null ;
    }

}
