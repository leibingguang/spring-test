package com.spring.ioc.annotation_config.configuration;

import com.spring.ioc.annotation_config.nestedBean.NestedBean;
import com.spring.ioc.annotation_config.nestedBean.NestedBean2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Configuration
//@Resource(name = "configurationBean")
//@Service
public class ConfigurationBean {

    private String id;
    @Resource
    private NestedBean nestedBean;

    private NestedBean2 nestedBean2;

    public String getId() {
        return id;
    }

//    @Resource
    public void setId(String id) {
        this.id = id;
    }

    public NestedBean getNestedBean() {
        return nestedBean;
    }

    public void setNestedBean(NestedBean nestedBean) {
        this.nestedBean = nestedBean;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("ConfigurationBean{");
        sb.append("id='").append(id).append('\'');
        sb.append(", nestedBean=").append(nestedBean);
        sb.append(", nestedBean2=").append(nestedBean2);
        sb.append('}');
        return sb.toString();
    }

    public NestedBean2 getNestedBean2() {
        return nestedBean2;
    }

    public void setNestedBean2(NestedBean2 nestedBean2) {
        this.nestedBean2 = nestedBean2;
    }

    @Bean
    public NestedBean nestedBean()
    {
        return new NestedBean();
    }
}
