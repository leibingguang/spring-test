package com.spring.ioc.annotation_config.autowire.field;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;

@ComponentScan(basePackageClasses = AutowiredFieldConfig.class)
@PropertySource("classpath:bean/annotation_config/autowire/resource.properties")
public class AutowiredFieldConfig {
}
