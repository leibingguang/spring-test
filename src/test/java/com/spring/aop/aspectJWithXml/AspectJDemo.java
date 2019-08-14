package com.spring.aop.aspectJWithXml;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class AspectJDemo {
    static ApplicationContext applicationContext;
    @BeforeClass
    public static void beforeClass()
    {
        applicationContext = new ClassPathXmlApplicationContext("aop/aspectJ/aspectJAopApplicationContext.xml");
    }

    @Test
    public void testAspectJ()
    {
//        Performance performance = (Performance)applicationContext.getBean("musicPerformance");
        Performance performance = (Performance)applicationContext.getBean(Performance.class);
        performance.perform();
    }
}
