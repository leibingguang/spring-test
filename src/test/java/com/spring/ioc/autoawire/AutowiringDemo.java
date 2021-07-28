package com.spring.ioc.autoawire;

import com.spring.ioc.initBeans.Person;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class AutowiringDemo {
    static BeanFactory beanFactory;
    static BeanFactory childBeanFactory;
    @BeforeClass
    public static void beforeClass()
    {
        beanFactory = new XmlBeanFactory(new ClassPathResource("bean/autowire/autowiringApplicationContext.xml"));
        childBeanFactory = new XmlBeanFactory(new ClassPathResource("bean/autowire/autowiringApplicationContext.xml"));
        ((XmlBeanFactory) childBeanFactory).setParentBeanFactory(beanFactory);
    }

    /**
     * 自动转配类型为No
     */
    @Test
    public void testAutowiringNo()
    {
        Person person = (Person)beanFactory.getBean("personAutowiringNo");
        System.out.println(person);
        Assert.assertNotNull(person.getCarBean());
    }

    /**
     * 自动装配类型为：byName 不存在
     */
    @Test
    public void testAutowiringByNameCar()
    {
        Person person = (Person)beanFactory.getBean("personAutowiringByName");
        System.out.println(person);
        Assert.assertNull(person.getCarBean());
    }

    /**
     * 自动装配类型为：byName 存在
     */
    @Test
    public void testAutowiringByNameCarBean()
    {
        Person person = (Person)beanFactory.getBean("personAutowiringByName");
        Assert.assertNotNull(person.getCarBean());
        System.out.println(person);
    }

    /**
     * 自动装配类型为：byType 同类型的bean不能重复定义
     */
    @Test
    public void testAutowiringByType()
    {
        Person person = (Person)beanFactory.getBean("personAutowiringByType");
        Assert.assertNotNull(person.getCarBean());
        System.out.println(person);
    }


    /**
     * 自动装配类型为：constructor
     * 与byType类型，但是是通过构造器进行装配的
     */
    @Test
    public void testAutowiringConstructor()
    {
        Person person = (Person)beanFactory.getBean("personAutowiringConstructor");
        Assert.assertNotNull(person.getCarBean());
    }

    @Test
    public void testParent()
    {
        Person person = (Person)beanFactory.getBean("personAutowiringConstructor");
        Person childPerson = (Person)childBeanFactory.getBean("personAutowiringConstructor");

        System.out.println(person);
        System.out.println(childPerson);
    }
}
