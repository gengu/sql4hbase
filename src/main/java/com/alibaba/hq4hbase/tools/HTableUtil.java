package com.alibaba.hq4hbase.tools;

import org.apache.hadoop.hbase.client.HTable;
import java.io.IOException;

/**
 * Created by genxiaogu on 14-6-24.
 * Htable util class !
 */
public class HTableUtil {

    public static HTable getTable(String tableName){
        return (HTable) HbaseConf.gethTablePool().getTable(tableName) ;
    }

    public static void close(HTable hTable) {
        try {
            hTable.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }



    public static boolean isTableExists(String tableName) throws IOException{

        return HbaseConf.getAdmin().tableExists(tableName) ;

    }

    public static void createTable(){}

    public static void dropTable() {}
}
