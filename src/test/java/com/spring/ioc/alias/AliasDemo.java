package com.spring.ioc.alias;

import com.spring.ioc.bean.initBeans.Car;
import com.spring.ioc.bean.initBeans.Person;
import com.spring.ioc.initBeans.Car;
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
        Car car = (Car)beanFactory.getBean("com.spring.ioc.bean.initBeans.Car");
        Car car2 = (Car)beanFactory.getBean("car2");
        Car carId = (Car)beanFactory.getBean("carId");
        Car carName = (Car)beanFactory.getBean("carName");
        Car carIdAlias = (Car)beanFactory.getBean("carIdAlias");
        Car carNameAlias = (Car)beanFactory.getBean("carNameAlias");
        System.out.println(car);
//        System.out.println(carName);
        Assert.assertNotNull(null, car);
        Assert.assertNotNull(null, carId);
        Assert.assertNotNull(null, carName);
        Assert.assertNotNull(null, carIdAlias);
        Assert.assertNotNull(null, carNameAlias);
    }
}
