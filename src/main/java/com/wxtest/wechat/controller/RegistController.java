package com.wxtest.wechat.controller;

import com.wxtest.wechat.entity.RegistResponse;
import com.wxtest.wechat.entity.ResponseHead;
import org.springframework.web.bind.annotation.*;

/**
 *    
 * <p>
 *  Simple to Introduction  
 *  @ClassName:    RegistController  
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
@RestController
public class RegistController {

    @RequestMapping("/regist")
    public RegistResponse regist(@RequestBody String userName) {
        RegistResponse registResponse = new RegistResponse();
        ResponseHead responseHead = new ResponseHead();
        responseHead.setRtnCode("000000");
        responseHead.setRtnMsg("成功");
        registResponse.setHead(responseHead);
        registResponse.setBody("123123");

        System.out.println(userName);

        return registResponse;
    }
}
