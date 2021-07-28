package com.spring.ioc.annotation_config.autowire.method;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class AutowiredMethodBean {

    private String autowiredMethodBeanName;

    private AutowiredMethodNestedBean autowiredMethodNestedBean;

    public String getAutowiredMethodBeanName() {
        return autowiredMethodBeanName;
    }

    @Value(value = "${autowiredMethodBeanName}")
    public void setAutowiredMethodBeanName(String autowiredMethodBeanName) {
        this.autowiredMethodBeanName = autowiredMethodBeanName;
    }

    public AutowiredMethodNestedBean getAutowiredMethodNestedBean() {
        return autowiredMethodNestedBean;
    }

    @Autowired
    public void setAutowiredMethodNestedBean(AutowiredMethodNestedBean autowiredMethodNestedBean) {
        this.autowiredMethodNestedBean = autowiredMethodNestedBean;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("AutowiredMethodBean{");
        sb.append("autowiredMethodBeanName='").append(autowiredMethodBeanName).append('\'');
        sb.append(", autowiredMethodNestedBean=").append(autowiredMethodNestedBean);
        sb.append('}');
        return sb.toString();
    }
}
