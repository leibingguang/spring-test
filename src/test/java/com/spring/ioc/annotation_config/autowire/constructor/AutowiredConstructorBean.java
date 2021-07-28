package com.spring.ioc.annotation_config.autowire.constructor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class AutowiredConstructorBean {
    private AutowiredConstructorNestedBean autowiredNestedBean;

    private String beanName;

    @Autowired(required = false)
    public AutowiredConstructorBean() {
        System.out.println("1");
    }

    @Autowired(required = false)
    public AutowiredConstructorBean(AutowiredConstructorNestedBean autowiredNestedBean) {
        System.out.println("2");
        this.autowiredNestedBean = autowiredNestedBean;
    }

    @Autowired(required = false)
    public AutowiredConstructorBean(AutowiredConstructorNestedBean autowiredNestedBean, @Value("${beanName}") String beanName) {
        this.autowiredNestedBean = autowiredNestedBean;
        this.beanName = beanName;
    }

    public void setAutowiredNestedBean(AutowiredConstructorNestedBean autowiredNestedBean) {
        this.autowiredNestedBean = autowiredNestedBean;
    }

    public AutowiredConstructorNestedBean getAutowiredNestedBean()
    {
        return autowiredNestedBean;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("AutowiredBean{");
        sb.append("autowiredNestedBean=").append(autowiredNestedBean);
        sb.append(", beanName='").append(beanName).append('\'');
        sb.append('}');
        return sb.toString();
    }

    public String getBeanName() {
        return beanName;
    }

    public void setBeanName(String beanName) {
        this.beanName = beanName;
    }
}
