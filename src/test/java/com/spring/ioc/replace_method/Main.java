package com.spring.ioc.replace_method;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.cglib.core.DebuggingClassWriter;
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
        System.setProperty(DebuggingClassWriter.DEBUG_LOCATION_PROPERTY,
                "I:\\code\\spring\\spring-test\\src\\test\\java\\com\\spring\\ioc\\bean\\replace_method\\generateclass");
        ChangeMe changeMe = (ChangeMe)beanFactory.getBean("changeMe");
        System.out.println(changeMe.changeMe());
    }
}
