package com.spring.ioc.bean.lifecycle;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LifeCycleDemo {
    static ClassPathXmlApplicationContext applicationContext;
    @BeforeClass
    public static void beforeClass()
    {
//        applicationContext = new XmlBeanFactory(new ClassPathResource("lifecycle/lifecycle.xml"));
        applicationContext = new ClassPathXmlApplicationContext("lifecycle/lifecycle.xml");
    }

    @Test
    public void testCycle()
    {
        applicationContext.getBean("lifecycleBean");
        applicationContext.close();
    }
}
