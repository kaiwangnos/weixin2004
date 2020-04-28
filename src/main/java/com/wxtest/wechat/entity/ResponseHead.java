package com.wxtest.wechat.entity;

/**
 *    
 * <p>
 *  Simple to Introduction  
 *  @ClassName:    ReseponseBody  
 *  @Description:     
 *  @Author:       wangk  
 *  @CreateDate:   2020/4/28   
 *  @UpdateUser:   wangk  
 *  @UpdateDate:   2020/4/28
 *  @UpdateRemark: [初版]
 *  @Version:      [v1.0]
 * <p>
 *  
 */
public class ResponseHead {
    private String rtnMsg;
    private String rtnCode;

    public String getRtnMsg() {
        return rtnMsg;
    }

    public void setRtnMsg(String rtnMsg) {
        this.rtnMsg = rtnMsg;
    }

    public String getRtnCode() {
        return rtnCode;
    }

    public void setRtnCode(String rtnCode) {
        this.rtnCode = rtnCode;
    }
}
