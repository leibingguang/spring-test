package com.spring.ioc.placeholder;

import com.spring.ioc.initBeans.Car;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class PropertyPlaceHolderConfigurerTest {
    private ApplicationContext applicationContext = null;
//    private BeanFactory beanFactory;
    @Before
    public void before()
    {
        applicationContext = new ClassPathXmlApplicationContext("bean/placeholder/placeholder.xml");
//        beanFactory = new XmlBeanFactory(new ClassPathResource("bean/placeholder/placeholder.xml"));
    }
    @Test
    public void testReplaceHolder()
    {
//        Car car = (Car)beanFactory.getBean("car");
        System.out.println(applicationContext.getBean("car"));
//        System.out.println(car);
    }
}
