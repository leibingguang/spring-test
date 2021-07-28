package com.spring.ioc.annotation_config.autowire.constructor;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;

@ComponentScan(basePackageClasses = AutowiredConstructorConfig.class)
//@Configuration
@PropertySource("classpath:bean/annotation_config/autowire/resource.properties")
public class AutowiredConstructorConfig {
}
