package com.spring.ioc.applicationContext;

import com.spring.ioc.bean.contructor_arg.ConstructorArgBean;
import com.spring.ioc.contructor_arg.ConstructorArgBean;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ClassPathApplicationContextDemo {
    static ApplicationContext applicationContext;
    @BeforeClass
    public static void beforeClass()
    {
        applicationContext = new ClassPathXmlApplicationContext("constructorArgBeansApplicationContext.xml");
    }

    @Test
    public void testClassPathApplicationContext()
    {
        ConstructorArgBean constructorArgBean = (ConstructorArgBean)applicationContext.getBean("constructorArgBean");
        System.out.println(constructorArgBean);
    }

}