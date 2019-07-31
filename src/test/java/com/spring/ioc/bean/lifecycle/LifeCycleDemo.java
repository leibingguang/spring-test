package com.spring.ioc.bean.lifecycle;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class LifeCycleDemo {
    static BeanFactory beanFactory;
    @BeforeClass
    public static void beforeClass()
    {
        beanFactory = new XmlBeanFactory(new ClassPathResource("lifecycle/lifecycle.xml"));
    }

    @Test
    public void testCycle()
    {
        beanFactory.getBean("lifecycleBean");
    }
}
