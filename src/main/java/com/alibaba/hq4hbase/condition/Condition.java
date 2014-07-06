package com.alibaba.hq4hbase.condition;

/**
 * Created by genxiaogu on 14-7-1.
 * 查询基础类
 */
public class Condition {
    String tableName ;
    public Condition(ConditionBasic basic) {
        this.tableName = basic.getTableName();
    }

    public Condition(String tableName) {
        this.tableName = tableName;
    }

    public Condition(){}

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    public String getTableName() {
        return tableName;
    }
}
