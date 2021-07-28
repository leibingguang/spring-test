package com.spring.ioc.annotation_config.autowire.method;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;

@ComponentScan(basePackageClasses = AutowiredMethodConfig.class)
@PropertySource("classpath:bean/annotation_config/autowire/resource.properties")
public class AutowiredMethodConfig {
}
