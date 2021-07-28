package com.spring.ioc.annotation_config.autowire.field;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class AutowiredFieldNestedBean {
    @Value("${autowiredFieldNestedBeanName}")
    private String autowiredFieldNestedBeanName;

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("AutowiredFieldNestedBean{");
        sb.append("autowiredFieldNestedBeanName='").append(autowiredFieldNestedBeanName).append('\'');
        sb.append('}');
        return sb.toString();
    }

    public String getAutowiredFieldNestedBeanName() {
        return autowiredFieldNestedBeanName;
    }

    public void setAutowiredFieldNestedBeanName(String autowiredFieldNestedBeanName) {
        this.autowiredFieldNestedBeanName = autowiredFieldNestedBeanName;
    }
}
