package com.spring.aop.classics;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class ClassicsAopDemo {
    public static void main(String[] args) {
        XmlBeanFactory beanFactory = new XmlBeanFactory(new ClassPathResource("aop/classics/classicsAopApplicationContext.xml"));
        Human human = (Human) beanFactory.getBean("human");
        human.sleep();
    }
}
