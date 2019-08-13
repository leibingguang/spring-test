package com.spring.ioc.beanPostProcessor;

import com.spring.ioc.beanPostProcessor.bean.Person;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanPostProcessorTradeDemo {
    static ApplicationContext applicationContext;
    @BeforeClass
    public static void init()
    {
        applicationContext = new ClassPathXmlApplicationContext("beanPostProcessor/beanPostProcessorTrade.xml");
    }
    @Test
    public void test()
    {
        Person car = (Person)applicationContext.getBean("person");
        System.out.println(car);
    }
}
