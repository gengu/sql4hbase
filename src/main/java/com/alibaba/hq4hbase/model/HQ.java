package com.alibaba.hq4hbase.model;

import org.antlr.v4.runtime.tree.ParseTree;

/**
 * Created by genxiaogu on 14-6-23.
 * 这个类记录最初的原始查询语句
 */
public class HQ{
    private String sql ;

    private ParseTree tree;

    public HQ(String sql){
        this.sql = sql ;
    }



}
