package com.alibaba.hq4hbase.model;

import java.util.ArrayList;

/**
 * Created by genxiaogu on 14-7-3.
 * 定义一个查询的result
 */
public class QueryResult extends myResult {

    private String rowkey ;

    private ArrayList<KV> kvList ;

    public String getRowkey() {
        return rowkey;
    }

    public void setRowkey(String rowkey) {
        this.rowkey = rowkey;
    }

    public ArrayList<KV> getKvList() {
        return kvList;
    }

    public void setKvList(ArrayList<KV> kvList) {
        this.kvList = kvList;
    }

    public void addKvList(KV kv){
        if(null != this.kvList){
            this.kvList.add(kv);
        }
    }

    @Override
    public String toString() {
        return "QueryResult{" +
                "rowkey='" + rowkey + '\'' +
                ", kvList=" + kvList +
                '}';
    }

    static class KV{
        private String qualifier ;
        private String value ;
        private String timeStamp ;
        private String family ;

        @Override
        public String toString() {
            return qualifier+"/"+family+"/"+timeStamp+":"+value + ":" ;
        }

        public String getQualifier() {
            return qualifier;
        }

        public String getValue() {
            return value;
        }

        public String getTimeStamp() {
            return timeStamp;
        }

        public String getFamily() {
            return family;
        }

        public void setQualifier(String qualifier) {
            this.qualifier = qualifier;
        }

        public void setValue(String value) {
            this.value = value;
        }

        public void setTimeStamp(String timeStamp) {
            this.timeStamp = timeStamp;
        }

        public void setFamily(String family) {
            this.family = family;
        }
    }
}
