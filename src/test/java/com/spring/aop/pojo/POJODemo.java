package com.spring.aop.pojo;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class POJODemo {

    static ApplicationContext applicationContext;
    @BeforeClass
    public static void beforeClass()
    {
        applicationContext = new ClassPathXmlApplicationContext("aop/pojo/pojoAopApplicationContext.xml");
    }

    @Autowired
    private Dinner dinner;

    @Test
    public void testPojoAop() {
        Dinner dinner = (Dinner) applicationContext.getBean("dinner");
        dinner.eating();
    }

}
