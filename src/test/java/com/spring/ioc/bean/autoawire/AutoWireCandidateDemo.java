package com.spring.ioc.bean.autoawire;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;


public class AutoWireCandidateDemo {
    static BeanFactory beanFactory;

    @BeforeClass
    public static void beforeClass() {
        beanFactory = new XmlBeanFactory(new ClassPathResource("autowire/autowireByTypeWithMap.xml"));
    }

    /**
     * 如果把car2 bean中的autowire-candidate设置为false，那么car2就不会成为候选自动注入bean
     */
    @Test
    public void testMapAutoWire() {
        MapBean mapBean = (MapBean) beanFactory.getBean("mapBean");
        beanFactory.getBean("car1");
        System.out.println(mapBean);
    }
}
