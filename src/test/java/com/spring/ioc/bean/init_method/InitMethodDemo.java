package com.spring.ioc.bean.init_method;

import com.spring.ioc.bean.initBeans.Car;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class InitMethodDemo {    static BeanFactory beanFactory;
    @BeforeClass
    public static void beforeClass()
    {
        beanFactory = new XmlBeanFactory(new ClassPathResource("initMethod.xml"));
    }

    @Test
    public void testFactoryMethod()
    {
        Person person = (Person)beanFactory.getBean("person");
        System.out.println(person);
    }
}