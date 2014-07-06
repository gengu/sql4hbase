package com.alibaba.hq4hbase.execute;

import com.alibaba.hq4hbase.condition.Condition;
import com.alibaba.hq4hbase.condition.QueryCondition;

import java.util.List;

/**
 * Created by genxiaogu on 14-7-3.
 * sql 的执行
 */
public interface HbaseExecutor {
    /**
     * 执行sql 拿到返回结果
     * @param condition
     * @return
     */
    public List<QueryCondition> executeQuery(QueryCondition condition);

    public Object execute(Condition condition) ;

    public Object execute(String sql) ;

}
