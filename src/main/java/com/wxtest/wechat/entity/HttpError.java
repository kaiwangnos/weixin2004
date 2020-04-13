package com.wxtest.wechat.entity;

import com.alibaba.fastjson.annotation.JSONField;

/**
 *    
 * <p>
 *  Simple to Introduction  
 *  @ClassName:    HttpError  
 *  @Description:     
 *  @Author:       wangk  
 *  @CreateDate:   2020/4/13   
 *  @UpdateUser:   wangk  
 *  @UpdateDate:   2020/4/13
 *  @UpdateRemark: [初版]
 *  @Version:      [v1.0]
 * <p>
 *  
 */
public class HttpError {

    @JSONField(name = "errcode")
    private String errCode;

    @JSONField(name = "errmsg")
    private String errMsg;

    public String getErrCode() {
        return errCode;
    }

    public void setErrCode(String errCode) {
        this.errCode = errCode;
    }

    public String getErrMsg() {
        return errMsg;
    }

    public void setErrMsg(String errMsg) {
        this.errMsg = errMsg;
    }
}
