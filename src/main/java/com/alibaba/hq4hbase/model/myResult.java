package com.alibaba.hq4hbase.model;

/**
 * Created by genxiaogu on 14-6-23.
 * 结果数据 超类
 */
public abstract class myResult {

    //是否执行成功
    private boolean isSuccess ;

    public void setSuccess(boolean isSuccess) {
        this.isSuccess = isSuccess;
    }

    public boolean isSuccess() {
        return isSuccess;
    }
}
