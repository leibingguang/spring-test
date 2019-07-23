package com.spring.ioc.bean.factoryBean;

import com.spring.ioc.bean.initBeans.Car;
import com.spring.ioc.bean.initBeans.Person;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class FactoryBeanDemo {
    static BeanFactory beanFactory;

    @BeforeClass
    public static void beforeClass() {
        beanFactory = new XmlBeanFactory(new ClassPathResource("factoryBean.xml"));
    }

    /**
     * 自动转配类型为No
     */
    @Test
    public void testAutowiringNo() {
//        Car car = (Car) beanFactory.getBean("carFactoryBean");
        Car car2 = (Car) beanFactory.getBean("carFactoryBean");
//        System.out.println(car);
        System.out.println(car2);
    }
}
