package com.wxtest.wechat.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
@RequestMapping("/")
public class HelloController {

    private static final Logger logger = LoggerFactory.getLogger(HelloController.class);

    @RequestMapping("hello")
    public ModelAndView hello() {
//        for (int i = 0; i < 10000; i++) {
//
//            logger.error("测试日志");
//        }
        return new ModelAndView("index");
    }
}
