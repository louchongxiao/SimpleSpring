package com.lcx.simplespring.spring;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.RetentionPolicy.RUNTIME;

/**
 * @authoer louchongxiao
 * @description
 * @date 2024/3/5 17:12
 */
@Retention(RUNTIME)
@Target(ElementType.TYPE)
public @interface Scope {
    //默认单例
    String value() default "singleton";
}
