package com.spring.ioc.annotation_config.nestedBean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.annotation.Resource;
import javax.annotation.Resources;

@Configuration
public class NestedBean {
    private String beanName;

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("NestedBean{");
        sb.append("beanName='").append(beanName).append('\'');
        sb.append('}');
        return sb.toString();
    }

    public String getBeanName() {
        return beanName;
    }

    public void setBeanName(String beanName)
    {
        this.beanName = beanName;
    }

    @Bean(value = "nestedBean2")
    public NestedBean2 nestedBean2()
    {
        return new NestedBean2();
    }
}
