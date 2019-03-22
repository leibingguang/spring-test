package com.spring.ioc.bean;

import com.spring.ioc.bean.initBeans.Car;
import com.spring.ioc.bean.initBeans.Person;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class InstantiatingBeansTest
{
    private static final String ID = "1";

    static BeanFactory beanFactory;
    @BeforeClass
    public static void beforeClass()
    {
       beanFactory = new XmlBeanFactory(new ClassPathResource("initBeansApplicationContext.xml"));
    }

    /**
     * 无参构造器，属性注入
     */
    @Test
    public void testNoneArgsConstructor()
    {
        Person person= (Person)beanFactory.getBean("personWithProperties");
        String value = person.getId();
        Assert.assertEquals(value, ID);
    }

    /**
     * 构造器注入
     */
    @Test
    public void testArgsConstructor()
    {
        Person person= (Person)beanFactory.getBean("personWithArgs");
        String value = person.getId();
        Assert.assertEquals(value, ID);
    }

    /**
     * c:标签构造器注入
     */
    @Test
    public void testArgsConstructorWithCTags()
    {
        Person person= (Person)beanFactory.getBean("personWithCTags");
        String value = person.getId();
        Assert.assertEquals(value, ID);
    }

    /**
     * 静态工厂方法注入
     */
    @Test
    public void testStaticFactoryMethod()
    {
        Person person= (Person)beanFactory.getBean("personWithStaticFactoryMethod");
        String value = person.getCar().getId();
        Assert.assertEquals(value, "staticFactoryMethodId");
    }

    /**
     * 实例工厂方法注入
     */
    @Test
    public void testInstanceFactoryMethod()
    {
        Person person= (Person)beanFactory.getBean("personWithInstanceFactoryMethod");
        String value = person.getCar().getId();
        Assert.assertEquals(value, "instanceFactoryMethodId");
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
