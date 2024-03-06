package com.lcx.simplespring.spring;

/**
 * @authoer louchongxiao
 * @description
 * @date 2024/3/6 10:33
 */
public class BeanDefinition {
    private Class type;

    private String scope;

    public BeanDefinition() {
    }

    public BeanDefinition(Class type, String scope) {
        this.type = type;
        this.scope = scope;
    }

    public Class getType() {
        return type;
    }

    public void setType(Class type) {
        this.type = type;
    }

    public String getScope() {
        return scope;
    }

    public void setScope(String scope) {
        this.scope = scope;
    }
}
