package com.spring.ioc.bean.alias;

import com.spring.ioc.bean.initBeans.Car;
import com.spring.ioc.bean.initBeans.Person;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class AliasDemo
{
    private static final String ID = "1";

    static BeanFactory beanFactory;
    @BeforeClass
    public static void beforeClass()
    {
       beanFactory = new XmlBeanFactory(new ClassPathResource("initBeansApplicationContext.xml"));
    }
    
    @Test
    public void testAlias()
    {
        Car car = (Car)beanFactory.getBean("car");
        Car carId = (Car)beanFactory.getBean("carId");
        Car carName = (Car)beanFactory.getBean("carName");
        Car carIdAlias = (Car)beanFactory.getBean("carIdAlias");
        Car carNameAlias = (Car)beanFactory.getBean("carNameAlias");

        Assert.assertNotNull(null, car);
        Assert.assertNotNull(null, carId);
        Assert.assertNotNull(null, carName);
        Assert.assertNotNull(null, carIdAlias);
        Assert.assertNotNull(null, carNameAlias);
    }
}
