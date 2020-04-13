package com.wxtest.wechat.entity;

import com.alibaba.fastjson.annotation.JSONField;

/**
 *    
 * <p>
 *  Simple to Introduction  
 *  @ClassName:    AccessToken  
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
public class AccessToken {

    /*
     * 获取到的凭证
     */
    @JSONField(name = "access_token")
    private String accessToken;

    /*
     * 凭证有效时间，单位：秒
     */
    @JSONField(name = "expires_in")
    private String expiresIn;

    public String getAccessToken() {
        return accessToken;
    }

    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }

    public String getExpiresIn() {
        return expiresIn;
    }

    public void setExpiresIn(String expiresIn) {
        this.expiresIn = expiresIn;
    }
}
