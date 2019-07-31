package com.spring.ioc.bean.lifecycle.bean;

import org.springframework.beans.factory.InitializingBean;

import javax.annotation.PostConstruct;

public class LifeCycleBean implements InitializingBean {
    private String id;
    private String beanName;
    private String value;

    public void init() {
        System.out.println("init-method execute!");
    }

    @PostConstruct
    public void postConstructInit() {
        System.out.println("postConstructInit execute!");
    }

    public void afterPropertiesSet() throws Exception {
        System.out.println("afterPropertiesSet execute!");
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getBeanName() {
        return beanName;
    }

    public void setBeanName(String beanName) {
        this.beanName = beanName;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
