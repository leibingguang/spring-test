package com.spring.ioc.javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CDPlayConfig {
    @Bean
    public CDPlayer getCDPlayer()
    {
        return new CDPlayer(getSgtPappers());
    }

    @Bean
    public SgtPappers getSgtPappers()
    {
        return new SgtPappers();
    }
}
