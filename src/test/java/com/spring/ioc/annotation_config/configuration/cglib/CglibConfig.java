package com.spring.ioc.annotation_config.configuration.cglib;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan("com.zs.cglib")
//这个类作为配置类
public class CglibConfig {
    @Bean
    public TestDomain testDomain(){
        return new TestDomain();
    }
    @Bean
    public TestDomainTwo testDomainTwo(){
        //这个方法会预先调用上一个方法
        testDomain();
        return new TestDomainTwo();
    }
}
