package com.alibaba.hq4hbase.condition;

import com.alibaba.hq4hbase.model.Compare;

import java.util.ArrayList;

/**
 * Created by genxiaogu on 14-6-26.
 * 查询基础类 一次查询是基于这个类展开的
 */
public class QueryCondition extends Condition{
    private String limit ;
    private ArrayList<String> columns ;
    private ArrayList<Compare> compareList ;
    //是否取出所有字段
    private boolean all ;

    public String getLimit() {
        return limit;
    }

    public void setLimit(String limit) {
        this.limit = limit;
    }

    public ArrayList<String> getColumns() {
        return columns;
    }

    public void setColumns(ArrayList<String> columns) {
        this.columns = columns;
    }

    public ArrayList<Compare> getCompareList() {
        return compareList;
    }

    public void setCompareList(ArrayList<Compare> compareList) {
        this.compareList = compareList;
    }

    public boolean isAllColumns(){
        return all;
    }
    public void addColumns(String column) {
        if (null != this.columns){
            this.getColumns().add(column);
        }
    }

    public void setAll(boolean all) {
        this.all = all;
    }

    public void addCompare(Compare compare){
        if(null != compareList){
            this.compareList.add(compare);
        }
    }

    @Override
    public String toString() {
        return "QueryCondition{" +
                "limit='" + limit + '\'' +
                ", columns=" + columns +
                ", compareList=" + compareList +
                ", all=" + all +
                ", tablename=" + tableName +
                '}';
    }
}

