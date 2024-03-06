package com.lcx.simplespring;

import com.lcx.simplespring.service.AppConfig;
import com.lcx.simplespring.service.UserService;
import com.lcx.simplespring.spring.ApplicationContext;

/**
 * @authoer louchongxiao
 * @description
 * @date 2024/3/6 10:09
 */
public class Test {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ApplicationContext(AppConfig.class);
        UserService userService = (UserService) applicationContext.getBean("userService");
        userService.test();
    }
}
