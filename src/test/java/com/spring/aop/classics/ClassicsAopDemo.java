package com.spring.aop.classics;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

/**
 * 基于代理的经典Spring AOP
 */
public class ClassicsAopDemo {
    public static void main(String[] args) {
        XmlBeanFactory beanFactory = new XmlBeanFactory(new ClassPathResource("aop/classics/classicsAopApplicationContext.xml"));
        Sleepable sleepable= (Sleepable) beanFactory.getBean("humanProxy");
//        System.out.println(beanFactory.getBean("&humanProxy"));
        sleepable.sleep();
    }
}
