package com.spring.ioc.placeholder;

import com.spring.ioc.initBeans.Car;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.env.Environment;
import org.springframework.core.io.ClassPathResource;

public class PropertySourcesPlaceHolderConfigurerTest {
    private ApplicationContext applicationContext = null;
    @Before
    public void before()
    {
        applicationContext = new ClassPathXmlApplicationContext("bean/placeholder/resourcesplaceholder.xml");
    }
    @Test
    public void testReplaceHolder()
    {
        Car car = (Car)applicationContext.getBean("car");
        System.out.println(car);
        Environment environment = applicationContext.getEnvironment();
        System.out.println(environment);
    }
}
