package com.miaoshaproject.error;

/**
 * Created by bingxiang on 2021/9/13.
 */
public interface CommonError {
    public int getErrCode();
    public String getErrMsg();
    public CommonError setErrMsg(String errMsg);


}
