package com.alibaba.hq4hbase.tools;

import com.alibaba.hq4hbase.exception.Sql4HbaseException;

/**
 * Created by genxiaogu on 14-6-23.
 */
public class Util{

    public static void checkNull(Object obj){
        if(null == obj)
            throw new Sql4HbaseException("obj is null ") ;
    }

    public static void checkEmptyString(String str){
        if("".equals(str)){
            throw new Sql4HbaseException("str is empty ") ;
        }else {

        }
    }

}
