package com.spring.ioc.cycleDependent;

import com.spring.ioc.init_method.Person;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class CycleDependentDemo {
    static ApplicationContext applicationContext;

    @BeforeClass
    public static void beforeClass() {
        applicationContext = new ClassPathXmlApplicationContext("bean/cycleDependent/cycleDependent.xml");
    }

    @Test
    public void testFactoryMethod() {
        BeanA beanA = (BeanA) applicationContext.getBean("beanA");
        BeanB beanB = (BeanB) applicationContext.getBean("beanB");
        System.out.println(beanA);
        System.out.println(beanB);
        System.out.println(beanB.getBeanA());
        System.out.println(beanA.getBeanB());
    }
}