package com.alibaba.hq4hbase.tools;

import org.apache.hadoop.fs.Path;
import org.apache.hadoop.hbase.HBaseConfiguration;
import org.apache.hadoop.hbase.client.HBaseAdmin;
import org.apache.hadoop.hbase.client.HTablePool;
import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.hbase.util.PoolMap;

import java.io.IOException;
import java.util.ResourceBundle;


/**
 * Created by genxiaogu on 14-6-24.
 * Hbase 的工具类
 */
public class HbaseConf {
    private static HTablePool hTablePool ;
    private static Configuration conf ;
    private static HBaseAdmin admin ;

    /**
     * 使用参数初始化hbase
     * @param quorum
     * @param parent
     */
    public static void init(String quorum,String parent) {
        conf = HBaseConfiguration.create() ;
        conf.set("hbase.zookeeper.quorum", quorum);
        conf.set("zookeeper.znode.parent", parent);
        hTablePool = new HTablePool(conf,100, PoolMap.PoolType.ThreadLocal);
        try {
            admin = new HBaseAdmin(conf);
        }catch(IOException e){

        }
    }

    /**
     * 利用property文件初始化
     */
    public static void init(String fileName){

        conf = HBaseConfiguration.create() ;
        conf.set("hbase.zookeeper.quorum",ResourceBundle.getBundle(fileName).getString("hbase.zookeeper.quorum"));
        conf.set("zookeeper.znode.parent",ResourceBundle.getBundle(fileName).getString("zookeeper.znode.parent"));
        hTablePool = new HTablePool(conf,1000, PoolMap.PoolType.ThreadLocal) ;
        try {
            admin = new HBaseAdmin(conf);
        }catch(IOException e){

        }
    }

    /**
     * 读取本地文件
     * @return
     */
    public static void init(Path path){

        conf = HBaseConfiguration.create() ;
        conf.addResource(path);

        hTablePool = new HTablePool(conf,1000, PoolMap.PoolType.ThreadLocal) ;
        try{
            admin = new HBaseAdmin(conf);
        }catch(IOException e){
            e.printStackTrace();
        }
    }


    public static Configuration getConf() {
        return conf;
    }

    public static HTablePool gethTablePool() {
        return hTablePool;
    }

    public static HBaseAdmin getAdmin() {
        return admin;
    }
}
