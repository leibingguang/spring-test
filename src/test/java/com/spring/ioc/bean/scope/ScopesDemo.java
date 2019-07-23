package com.spring.ioc.bean.scope;

import com.spring.ioc.bean.initBeans.Car;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class ScopesDemo {
    static BeanFactory beanFactory;
    @BeforeClass
    public static void beforeClass()
    {
        beanFactory = new XmlBeanFactory(new ClassPathResource("scopesApplicationContext.xml"));
    }

    @Test
    public void testScopeSingleton()
    {
        Car carSinglecon1 = (Car)beanFactory.getBean("carScopeSingleton");
        Car carSinglecon2 = (Car)beanFactory.getBean("carScopeSingleton");
        Assert.assertEquals(true, carSinglecon1==carSinglecon2);
    }

    @Test
    public void testScopeProtoType()
    {
        Car carSinglecon1 = (Car)beanFactory.getBean("carScopePrototype");
        Car carSinglecon2 = (Car)beanFactory.getBean("carScopePrototype");
        Assert.assertNotEquals(true,carSinglecon1==carSinglecon2);
    }
}
