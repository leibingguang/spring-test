package com.spring.ioc.bean;

import com.spring.ioc.bean.initBeans.Person;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class InitCallbackTest {
    static BeanFactory beanFactory;
    @BeforeClass
    public static void beforeClass()
    {
        beanFactory = new XmlBeanFactory(new ClassPathResource("initCallbackApplicationContext.xml"));
    }

    /**
     * 初始化回调方法测试
     */
    @Test
    public void testPersonInitCallback()
    {
        Person person = (Person)beanFactory.getBean("personInitCallback");
        Assert.assertEquals(1, person.getSex());
    }

    @AfterClass
    public static void testPersonDestroyCallback() throws Exception
    {
        Person person = (Person)beanFactory.getBean("personInitCallback");
        person.destroy();
    }
}
