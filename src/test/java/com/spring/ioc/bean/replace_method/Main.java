package com.spring.ioc.bean.replace_method;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class Main {
    static BeanFactory beanFactory;
    @BeforeClass
    public static void beforeClass()
    {
        beanFactory = new XmlBeanFactory(new ClassPathResource("replace-method.xml"));
    }
    @Test
    public void testReplaceMethod()
    {
        ChangeMe changeMe = (ChangeMe)beanFactory.getBean("changeMe");
        System.out.println(changeMe.changeMe());
    }
}
