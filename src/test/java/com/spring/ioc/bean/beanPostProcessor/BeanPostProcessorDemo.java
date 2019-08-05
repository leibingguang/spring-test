package com.spring.ioc.bean.beanPostProcessor;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class BeanPostProcessorDemo
{


    static BeanFactory beanFactory;
    @BeforeClass
    public static void beforeClass()
    {
        beanFactory = new XmlBeanFactory(new ClassPathResource("beanPostProcessor/beanPostProcessor.xml"));
    }

    @Test
    public void testBeanPostProcessor()
    {
        beanFactory.getBean("car");
    }
}
