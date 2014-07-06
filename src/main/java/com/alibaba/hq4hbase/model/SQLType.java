package com.alibaba.hq4hbase.model;

/**
 * Created by genxiaogu on 14-6-29.
 * 查询类型 java7 支持了switch的enum类型
 */
public enum SQLType {
    Query("com.alibaba.hq4hbase.condition.QueryCondition"),
    Desc("com.alibaba.hq4hbase.condition.DescCondition"),
    Delete("com.alibaba.hq4hbase.condition.DeleteCondition"),
    Drop("com.alibaba.hq4hbase.condition.DropCondition") ;

    private String str ;

    private SQLType(String arg){
        this.str = arg ;
    }

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }


    @Override
    public String toString() {
        return this.str ;
    }
}
