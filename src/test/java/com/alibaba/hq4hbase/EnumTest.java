package com.alibaba.hq4hbase;

import com.alibaba.hq4hbase.model.CompareType;
import junit.framework.TestCase;

/**
 * Created by genxiaogu on 14-6-26.
 * 测试enum
 */
public class EnumTest extends TestCase{
    public enum Color {
        RED("红色", 1), GREEN("绿色", 2), BLANK("白色", 3), YELLO("黄色", 4);
        // 成员变量
        private String name;
        private int index;

        // 构造方法
        private Color(String name, int index) {
            this.name = name;
            this.index = index;
        }

        // 覆盖方法
        @Override
        public String toString() {
            return this.index + "_" + this.name;
        }
    }

    public  void test1() {
        System.out.println(Color.RED.toString());
    }

    public void test2(){
        System.out.println(((CompareType)CompareType.valuesOf("like")));
    }
}
