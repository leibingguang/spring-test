package com.lei.beanfactory.test.wire.autowire;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackageClasses = CompactDisc.class)
public class CDPlayConfig {
}
