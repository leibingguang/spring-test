package com.spring.ioc.lifecycle;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LifeCycleDemo {
    static ClassPathXmlApplicationContext applicationContext;
    @BeforeClass
    public static void beforeClass()
    {
//        applicationContext = new XmlBeanFactory(new ClassPathResource("bean.lifecycle/dependsOn.xml"));
        applicationContext = new ClassPathXmlApplicationContext("bean/lifecycle/lifecycle.xml");
    }

    @Test
    public void testCycle()
    {
        applicationContext.getBean("lifecycleBean");
        applicationContext.close();
    }
}
