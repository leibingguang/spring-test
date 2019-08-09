package com.spring.ioc.c_tags;

import com.spring.ioc.bean.initBeans.Car;
import com.spring.ioc.bean.initBeans.Person;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class CTagsDemo
{
    private static final String ID = "1";

    static BeanFactory beanFactory;
    @BeforeClass
    public static void beforeClass()
    {
       beanFactory = new XmlBeanFactory(new ClassPathResource("initBeansApplicationContext.xml"));
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


}
