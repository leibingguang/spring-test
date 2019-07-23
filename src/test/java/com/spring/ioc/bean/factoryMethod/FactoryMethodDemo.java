package com.spring.ioc.bean.factoryMethod;

import com.spring.ioc.bean.initBeans.Car;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class FactoryMethodDemo {

    static BeanFactory beanFactory;
    @BeforeClass
    public static void beforeClass()
    {
        beanFactory = new XmlBeanFactory(new ClassPathResource("factoryMethod.xml"));
    }

    @Test
    public void testFactoryMethod()
    {
        Car car = (Car)beanFactory.getBean("car", "1121212", "1", "2");
        System.out.println(car);
    }
}
