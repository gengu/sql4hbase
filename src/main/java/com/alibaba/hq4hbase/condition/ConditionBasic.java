package com.alibaba.hq4hbase.condition;

import com.alibaba.hq4hbase.model.SQLType;

/**
 * Created by genxiaogu on 14-6-26.
 * 基础查询类 定义基础信息
 */
public class ConditionBasic {

    private String tableName ;
    private SQLType type ;

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    public String getTableName() {
        return tableName;
    }

    public SQLType getType() {
        return type;
    }

    public void setType(SQLType type) {
        this.type = type;
    }
}

