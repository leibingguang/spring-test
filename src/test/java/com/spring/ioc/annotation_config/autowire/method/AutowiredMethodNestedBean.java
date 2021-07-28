package com.spring.ioc.annotation_config.autowire.method;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class AutowiredMethodNestedBean {
    @Value("${autowiredMethodNestedBeanName}")
    private String autowiredMethodNestedBeanName;

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("AutowiredMethodNestedBean{");
        sb.append("autowiredMethodNestedBeanName='").append(autowiredMethodNestedBeanName).append('\'');
        sb.append('}');
        return sb.toString();
    }

    public String getAutowiredMethodNestedBeanName() {
        return autowiredMethodNestedBeanName;
    }

    public void setAutowiredMethodNestedBeanName(String autowiredMethodNestedBeanName) {
        this.autowiredMethodNestedBeanName = autowiredMethodNestedBeanName;
    }
}
