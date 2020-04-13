package com.wxtest.wechat;

import com.wxtest.wechat.jobs.AccessTokenJob;
import org.junit.jupiter.api.Test;

/**
 *    
 * <p>
 *  Simple to Introduction  
 *  @ClassName:    AccessTokenJobTests  
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
public class AccessTokenJobTests {

    @Test
    public void accessTokenJobTest() throws InterruptedException {
        AccessTokenJob accessTokenJob = new AccessTokenJob();
        accessTokenJob.accessTokenTrigger();
    }
}
