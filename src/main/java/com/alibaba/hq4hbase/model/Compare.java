package com.alibaba.hq4hbase.model;

/**
 * Created by genxiaogu on 14-6-26.
 * 查询条件
 */
public class Compare {

    private String column ;
    private CompareType type ;
    private String value ;

    public void setType(CompareType type) {
        this.type = type;
    }

    public void setColumn(String column) {
        this.column = column;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public CompareType getType() {
        return type;
    }

    public String getColumn() {
        return column;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "Compare{" +
                "column='" + column + '\'' +
                ", type=" + type +
                ", value='" + value + '\'' +
                '}';
    }
}
