package com.spring.ioc.factoryMethod;

import com.spring.ioc.bean.initBeans.Car;
import com.spring.ioc.initBeans.Car;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class FactoryMethodDemo {

    static BeanFactory beanFactory;
    @BeforeClass
    public static void beforeClass()
    {
        beanFactory = new XmlBeanFactory(new ClassPathResource("factoryMethod.xml"));
    }

    /**
     * 通过getBean携带方法参数来设置factory-method的参数
     */
    @Test
    public void testFactoryMethod()
    {
        Car car = (Car)beanFactory.getBean("car", "1121212", "1", "2");
        System.out.println(car);
    }

    /**
     * 通过<constructor-arg></constructor-arg>标签来设置factory-method的参数
     */
    @Test
    public void testArgsToUsedConstructor()
    {
        Car car = (Car)beanFactory.getBean("argsToUseConstructor");
        System.out.println(car);
    }
}
