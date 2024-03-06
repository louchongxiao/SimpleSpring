package com.lcx.simplespring.service;

import com.lcx.simplespring.spring.Autowired;
import com.lcx.simplespring.spring.Component;

/**
 * @authoer louchongxiao
 * @description
 * @date 2024/3/6 10:01
 */
@Component
public class UserService {
    @Autowired
    private OrderService orderService;

    public void test() {
        System.out.println(orderService);
    }
}
