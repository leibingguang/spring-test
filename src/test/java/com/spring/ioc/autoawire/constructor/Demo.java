package com.spring.ioc.autoawire.constructor;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class Demo {

    static BeanFactory beanFactory;
    @BeforeClass
    public static void beforeClass()
    {
        beanFactory = new XmlBeanFactory(new ClassPathResource("bean/autowire/autowireConstructor.xml"));
    }

    @Test
    public void testAutowireConstructor()
    {
        ConstructorBean constructorBean = beanFactory.getBean(ConstructorBean.class);
        System.out.println(constructorBean);
    }
}
