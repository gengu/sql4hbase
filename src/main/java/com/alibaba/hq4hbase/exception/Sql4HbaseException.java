package com.alibaba.hq4hbase.exception;

/**
 * Created by genxiaogu on 14-6-23.
 * 定义错误类
 */
public class Sql4HbaseException extends RuntimeException{

    public Sql4HbaseException(String message){
        super(message);
    }


}
