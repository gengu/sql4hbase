package com.alibaba.hq4hbase.tools;

import java.util.ResourceBundle;

/**
 * Created by genxiaogu on 14-6-24.
 * Property util
 */
public class PropertiesUtil {
    public ResourceBundle bundle = null ;

    public PropertiesUtil(String fileName) {
        this.bundle = ResourceBundle.getBundle(fileName) ;
    }

    public String getValue(String key){
        return this.bundle.getString(key) ;
    }
}
