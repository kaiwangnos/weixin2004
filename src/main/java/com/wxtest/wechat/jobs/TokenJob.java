package com.wxtest.wechat.jobs;

import org.springframework.scheduling.annotation.Scheduled;

/**
 *    
 * <p>
 *  Simple to Introduction  
 *  @ClassName:    TokenJob
 *  @Description: 
 *  @Author:       87050
 *  @CreateDate:   2020/4/11
 *  @UpdateUser:   87050
 *  @UpdateDate:   2020/4/11
 *  @UpdateRemark: [初版]
 *  @Version:      [v1.0] 
 * <p>
 *  
 */
public class TokenJob {


    @Scheduled()
    public String accessToken(String aa){
        String accessToken = "";

        return accessToken;
    }

}
