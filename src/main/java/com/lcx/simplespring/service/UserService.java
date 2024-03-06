package com.lcx.simplespring.service;

import com.lcx.simplespring.spring.Autowired;
import com.lcx.simplespring.spring.BeanNameAware;
import com.lcx.simplespring.spring.Component;
import com.lcx.simplespring.spring.InitializingBean;

/**
 * @authoer louchongxiao
 * @description
 * @date 2024/3/6 10:01
 */
@Component
public class UserService implements UserInterface
//        ,BeanNameAware, InitializingBean
{
    @Autowired
    private OrderService orderService;


    public void test() {
        System.out.println(orderService);
    }
//    private String beanName;
//
//    private String xxx;
//
//    @Override
//    public void setBeanName(String beanName) {
//        this.beanName = beanName;
//    }
//
//    @Override
//    public void afterPropertiesSet() {
//        System.out.println("InitializingBean#afterPropertiesSet");
//    }
}
