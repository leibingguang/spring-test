package com.spring.aop.aspectJ;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@EnableAspectJAutoProxy
@ComponentScan(basePackages = "com.spring.aop.aspectJ")
@Configurable
public class AspectJConfig {
//    @Bean
//    public Audience audience() {
//        return new Audience();
//    }
}
