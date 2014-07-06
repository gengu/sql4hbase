package com.alibaba.hq4hbase.execute;

import com.alibaba.hq4hbase.condition.Condition;
import com.alibaba.hq4hbase.condition.DescCondition;
import com.alibaba.hq4hbase.condition.QueryCondition;
import com.alibaba.hq4hbase.model.Compare;
import com.alibaba.hq4hbase.tools.HTableUtil;
import com.alibaba.hq4hbase.tools.Util;
import org.apache.hadoop.hbase.client.HTable;
import org.apache.hadoop.hbase.filter.FilterList;

import java.util.List;

/**
 * Created by genxiaogu on 14-7-3.
 * 具体执行类
 */
public class HbaseExecutorImpl implements HbaseExecutor {
    @Override
    public List<QueryCondition> executeQuery(QueryCondition condition) {
        Util.checkNull(condition);
        HTable hTable = null ;
        try {
            if (HTableUtil.isTableExists(condition.getTableName())) {
                hTable = HTableUtil.getTable(condition.getTableName());
                FilterList filterList = new FilterList();

            }
        }catch(Exception e){
            e.printStackTrace();
        }
        //获取表名

        return null;
    }

    @Override
    public Object execute(Condition condition) {
        if(condition instanceof QueryCondition){
            return null ;
        }else if(condition instanceof DescCondition){
            return null ;
        }else{
            return null ;
        }
    }

    @Override
    public Object execute(String sql) {
        return null;
    }

    public FilterList buildFilterList(QueryCondition condition){
        if(null != condition.getCompareList()){
            FilterList filterList = new FilterList();
            for(Compare compare:condition.getCompareList()){

            }
        }
    return null ;
    }

}
