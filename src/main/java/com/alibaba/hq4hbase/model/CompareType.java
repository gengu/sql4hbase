package com.alibaba.hq4hbase.model;

/**
 * Created by genxiaogu on 14-6-26.
 * 比较类型
 */
public enum CompareType {
    EQUAL("="),
    LESSTHANOREQUALTO("<="),
    LESSTHAN("<"),
    GREATERTHANOREQUALTO(">="),
    GREATERTHAN(">"),
    LIKE("like"),
    IN("in") ;

    String value ;
    private CompareType(String value){
        this.value = value ;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    //通过值来返回具体的type
    public static CompareType valuesOf(String type){
        for(CompareType c : CompareType.values()){
            if(type.equals(c.getValue())){
                return c ;
            }
        }
        return  null ;
    }

    @Override
    public String toString() {
        return this.value;
    }


}
