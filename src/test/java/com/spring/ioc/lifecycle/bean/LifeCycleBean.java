package com.spring.ioc.lifecycle.bean;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class LifeCycleBean implements InitializingBean, DisposableBean {
    private String id;
    private String beanName;
    private String value;

    public void init() {
        System.out.println("bean.init-method execute!");
    }

    @PostConstruct
    public void postConstructInit() {
        System.out.println("postConstructInit execute!");
    }

    public void afterPropertiesSet() throws Exception {
        System.out.println("afterPropertiesSet execute!");
    }

    public void close()
    {
        System.out.println("destroy-method execute!");
    }

    public void destroy() throws Exception {
        System.out.println("destroy execute!");
    }

    @PreDestroy
    public void preDestroy()
    {
        System.out.println("preDestroy execute!");
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
