package com.spring.ioc.beanPostProcessor;

import com.spring.ioc.beanPostProcessor.postprocessor.MyBeanPostProcessor;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class BeanPostProcessorDemo
{


    static BeanFactory beanFactory;
    @BeforeClass
    public static void beforeClass()
    {
        beanFactory = new XmlBeanFactory(new ClassPathResource("bean/bean-post-processor/beanPostProcessor.xml"));
        ((ConfigurableBeanFactory)beanFactory).addBeanPostProcessor(new MyBeanPostProcessor());
    }

    @Test
    public void testBeanPostProcessor()
    {
        beanFactory.getBean("car");
    }
}
