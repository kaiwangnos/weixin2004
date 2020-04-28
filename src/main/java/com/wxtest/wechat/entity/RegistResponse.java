package com.wxtest.wechat.entity;

/**
 *    
 * <p>
 *  Simple to Introduction  
 *  @ClassName:    RegistResponse  
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
public class RegistResponse {
    private ResponseHead head;
    private String body;

    public ResponseHead getHead() {
        return head;
    }

    public void setHead(ResponseHead head) {
        this.head = head;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }
}
