package com.spring.aop.aspectJWithXml;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.*;


public class AspectJDemo {
    private ApplicationContext applicationContext;
    private Performance performance;
    @Before
    public void beforeClass()
    {
        applicationContext = new ClassPathXmlApplicationContext("aop/aspectJ/aspectJAopApplicationContext.xml");

         performance = (Performance)applicationContext.getBean(Performance.class);
    }

    @Test
    public void testAspectJ()
    {
//        Performance performance = (Performance)applicationContext.getBean("musicPerformance");
        performance.perform();

        List<String> list = Arrays.asList("a", "b", "c");
        performance.testArgs(list);

    }

    @Test
    public void testSet()
    {
        Set<String> stringSet = new HashSet<String>();
        stringSet.add("a");
        performance.testSet(stringSet);
    }

    @Test
    public void testSetTwoParameters()
    {
        Set<String> stringSet = new HashSet<String>();
        stringSet.add("a");
        performance.testSet("paramString", stringSet);
    }
}
