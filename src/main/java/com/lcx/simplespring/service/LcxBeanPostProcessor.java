package com.lcx.simplespring.service;

import com.lcx.simplespring.spring.BeanPostProcessor;
import com.lcx.simplespring.spring.Component;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

@Component
public class LcxBeanPostProcessor implements BeanPostProcessor {


    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) {
        if (beanName.equals("userService")) {
            System.out.println(11111);
        }
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) {
        if (beanName.equals("userService")) {
            System.out.println(22222);
            Object proxyInstance = Proxy.newProxyInstance(LcxBeanPostProcessor.class.getClassLoader(), bean.getClass().getInterfaces(), new InvocationHandler() {
                @Override
                public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                    System.out.println("切面逻辑");
                    return method.invoke(bean, args);
                }
            });
            return proxyInstance;
        }
        return bean;
    }
}
