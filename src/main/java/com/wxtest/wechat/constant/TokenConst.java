package com.wxtest.wechat.constant;

/**
 *    
 * <p>
 *  Simple to Introduction  
 *  @ClassName:    TokenConst  
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
public class TokenConst {
    private static String accessToken = "";

    public static String getAccessToken() {
        return accessToken;
    }

    public static void setAccessToken(String accessToken) {
        TokenConst.accessToken = accessToken;
    }
}
