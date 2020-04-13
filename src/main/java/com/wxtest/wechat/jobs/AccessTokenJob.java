package com.wxtest.wechat.jobs;

import com.alibaba.fastjson.JSONObject;
import com.wxtest.wechat.constant.TokenConst;
import com.wxtest.wechat.entity.AccessToken;
import com.wxtest.wechat.common.HttpUtil;
import com.wxtest.wechat.entity.HttpError;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.util.StringUtils;

import java.util.concurrent.TimeUnit;

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
public class AccessTokenJob {

    @Value("${wechat.appid}")
    private String appID;

    @Value("${wechat.secret}")
    private String secret;

    @Value("${wechat.accesstoken.url}")
    private String accessTokenUrl;

    private static final Logger logger = LoggerFactory.getLogger(AccessTokenJob.class);



    //@Scheduled()
    public void accessTokenTrigger() throws InterruptedException {

        //如果获取失败，则3秒后重试。如连续100次获取失败，则不再重试。
        for (int i = 0; i < 100 ; i++) {
            if(accessToken()){
                break;
            }else {
                TimeUnit.SECONDS.sleep(3);
            }
        }
    }

    private boolean accessToken() {
//        String accessToken = "";
        boolean successFlag = false;
        String parm = "grant_type=client_credential&appid=" + appID + "&secret=" + secret;

        //正式用
        //String resultJson = HttpUtil.sendGet(accessTokenUrl, parm);

        //junit测试用
        String resultJson = HttpUtil.sendGet("https://api.weixin.qq.com/cgi-bin/token", "grant_type=client_credential&appid=wx93e1dc2edef6b238&secret=334716acc25c2816595b3e687decbafe");
        System.out.println(resultJson);
        logger.info(resultJson);

        if (!StringUtils.isEmpty(resultJson) && resultJson.contains("access_token")) {
            //成功获取到token
            AccessToken accessToken = JSONObject.parseObject(resultJson, AccessToken.class);
            logger.info("获取accessToken成功：" + accessToken.getAccessToken());
            successFlag = true;
            TokenConst.setAccessToken(accessToken.getAccessToken());
        } else if (!StringUtils.isEmpty(resultJson) && resultJson.contains("errcode")) {
            //错误
            HttpError httpError = JSONObject.parseObject(resultJson, HttpError.class);
            logger.error("获取accessToken失败：" + httpError.getErrCode() + httpError.getErrMsg());
            successFlag = false;
        }else {
            //没有返回消息
            logger.error("获取accessToken失败：没有接收到返回消息。");
            successFlag = false;
        }

        return successFlag;
    }

}
