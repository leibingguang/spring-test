package com.spring.ioc.annotation_config.autowire.field;

import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AutowiredFieldDemo {
    @Test
    public void testAutowiredField() {
        AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(AutowiredFieldConfig.class);
        AutowiredFieldBean autowiredBean = annotationConfigApplicationContext.getBean(AutowiredFieldBean.class);
        AutowiredFieldNestedBean autowiredNestedBean = annotationConfigApplicationContext.getBean(AutowiredFieldNestedBean.class);
        System.out.println(autowiredBean);
        System.out.println(autowiredNestedBean);
    }
}
