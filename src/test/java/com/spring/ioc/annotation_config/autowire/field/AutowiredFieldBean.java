package com.spring.ioc.annotation_config.autowire.field;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class AutowiredFieldBean {

    @Value(value = "${autowiredFieldBeanName}")
    private String autowiredFieldName;

    @Autowired
    private AutowiredFieldNestedBean autowiredFieldNestedBean;

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("AutowiredFieldBean{");
        sb.append("autowiredFieldName='").append(autowiredFieldName).append('\'');
        sb.append(", autowiredFieldNestedBean=").append(autowiredFieldNestedBean);
        sb.append('}');
        return sb.toString();
    }

    public String getAutowiredFieldName() {
        return autowiredFieldName;
    }

    public void setAutowiredFieldName(String autowiredFieldName) {
        this.autowiredFieldName = autowiredFieldName;
    }

    public AutowiredFieldNestedBean getAutowiredFieldNestedBean() {
        return autowiredFieldNestedBean;
    }

    public void setAutowiredFieldNestedBean(AutowiredFieldNestedBean autowiredFieldNestedBean) {
        this.autowiredFieldNestedBean = autowiredFieldNestedBean;
    }
}
