package com.alibaba.hq4hbase.condition;

/**
 * Created by genxiaogu on 14-7-4.
 * 单一的 rowkey 查询
 */
public class SingleQueryCondition extends QueryCondition{

    private String value ;

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
