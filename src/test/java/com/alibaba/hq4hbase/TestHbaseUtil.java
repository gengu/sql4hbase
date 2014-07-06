package com.alibaba.hq4hbase;

import com.alibaba.hq4hbase.tools.HTableUtil;
import com.alibaba.hq4hbase.tools.HbaseConf;
import junit.framework.TestCase;
import org.apache.hadoop.fs.Path;

import java.io.IOException;


/**
 * Created by genxiaogu on 14-6-24.
 * 测试类
 */
public class TestHbaseUtil extends TestCase{
    public void test1() throws IOException{
        HbaseConf.init("hbase");
        System.out.println(HTableUtil.isTableExists("abc_user_footprints_ol"));
    }

    public void test2() throws  IOException{
        Path path = new Path("/Users/genxiaogu/Desktop/hbase-setting.xml");
        HbaseConf.init(path);
        System.out.println(HTableUtil.isTableExists("abc_user_footprints_"));
    }
}
