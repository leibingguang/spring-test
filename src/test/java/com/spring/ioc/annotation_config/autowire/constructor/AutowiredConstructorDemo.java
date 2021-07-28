package com.spring.ioc.annotation_config.autowire.constructor;

import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AutowiredConstructorDemo {
    @Test
    public void testAutowired()
    {
        AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(AutowiredConstructorConfig.class);
        AutowiredConstructorBean autowiredBean = annotationConfigApplicationContext.getBean(AutowiredConstructorBean.class);
        AutowiredConstructorNestedBean autowiredNestedBean = annotationConfigApplicationContext.getBean(AutowiredConstructorNestedBean.class);
        System.out.println(autowiredBean);
        System.out.println(autowiredNestedBean);
//        System.out.println(System.getProperties());

    }
}
