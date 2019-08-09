package com.spring.ioc.depends;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class CircleDependsOnDemo {
    static BeanFactory beanFactory;

    @BeforeClass
    public static void beforeClass() {
        beanFactory = new XmlBeanFactory(new ClassPathResource("dependson/dependsOn.xml"));
    }

    @Test
    public void circleDependsOnTest() {
        beanFactory.getBean("beanA");
    }
}
