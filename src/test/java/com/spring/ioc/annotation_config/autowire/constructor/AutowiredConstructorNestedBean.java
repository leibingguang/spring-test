package com.spring.ioc.annotation_config.autowire.constructor;

import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Component
public class AutowiredConstructorNestedBean {
    private String beanName;
    private Integer id;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getBeanName() {
        return beanName;
    }

    public void setBeanName(String beanName) {
        this.beanName = beanName;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("AutowiredNestedBean{");
        sb.append("beanName='").append(beanName).append('\'');
        sb.append(", id=").append(id);
        sb.append('}');
        return sb.toString();
    }
}
