package com.wxtest.wechat.controller;

import com.wxtest.wechat.common.Sha1;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;

/**
 * 微信公众号接入     
 *
 * @Description:  [微信公众号接入]    
 * @UpdateRemark: [初版]  
 * @Version:      [v1.0] 
 */
@RestController
public class JoinController {

    @Value("${wechat.token}")
    private String token;

    /**
     * @return
     * @author: 87050
     * @description: TODO
     * @date: 2020/4/11
     */
    @RequestMapping("/join")
    public String join(@RequestParam("signature") String signature,
                       @RequestParam("timestamp") String timestamp,
                       @RequestParam("nonce") String nonce,
                       @RequestParam("echostr") String echostr) {
        String serEchostr = "";

//        字典排序
        String[] sarry = {token, timestamp, nonce};
        Arrays.sort(sarry);

        StringBuffer sb = new StringBuffer();

        for (String s : sarry) {
            sb.append(s);
        }

        String mySignature = Sha1.sha1(sb.toString());
        if (!StringUtils.isEmpty(mySignature) && !StringUtils.isEmpty(signature) && mySignature.equals(signature)) {
            serEchostr = echostr;
        }
        return serEchostr;
    }

}
