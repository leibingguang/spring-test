package com.spring.ioc.annotation_config.autowire.method;

import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AutowiredMethodDemo {
    @Test
    public void testAutowiredField() {
        AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(AutowiredMethodConfig.class);
        AutowiredMethodBean autowiredBean = annotationConfigApplicationContext.getBean(AutowiredMethodBean.class);
        AutowiredMethodNestedBean autowiredNestedBean = annotationConfigApplicationContext.getBean(AutowiredMethodNestedBean.class);
        System.out.println(autowiredBean);
        System.out.println(autowiredNestedBean);
    }
}
