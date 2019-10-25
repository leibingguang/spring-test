package com.spring.ioc.autoawire;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class AutoWireByTypeWithMapDemo {
    static BeanFactory beanFactory;

    @BeforeClass
    public static void beforeClass() {
        beanFactory = new XmlBeanFactory(new ClassPathResource("bean/autowire/autowireByTypeWithMap.xml"));
    }

    @Test
    public void testMapAutoWire() {
        MapBean mapBean = (MapBean) beanFactory.getBean("mapBean");
        System.out.println(mapBean);
    }
}
