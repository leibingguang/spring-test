package com.spring.ioc.placeholder;

import com.spring.ioc.initBeans.Car;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PropertiesPlaceHolderConfigurerTest {
    private ApplicationContext applicationContext = null;
    @Before
    public void before()
    {
        applicationContext = new ClassPathXmlApplicationContext("bean/placeholder/placeholder.xml");
    }
    @Test
    public void testReplaceHolder()
    {
        Car car = (Car)applicationContext.getBean("car");
        System.out.println(car);
    }
}
