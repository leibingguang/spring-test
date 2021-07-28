package com.spring.ioc.annotation_config.configuration;

import com.spring.ioc.annotation_config.nestedBean.NestedBean;
import com.spring.ioc.annotation_config.nestedBean.NestedBean2;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ConfigurationAnnotationDemo {
    static ApplicationContext applicationContext;
    @BeforeClass
    public static void init()
    {
        applicationContext = new ClassPathXmlApplicationContext("bean/annotation_config/configuration/annotation_config_configuration.xml");
//        applicationContext = new AnnotationConfigApplicationContext(NestedBean.class);
//        applicationContext = new AnnotationConfigApplicationContext(ConfigurationBean.class);
    }

    @Test
    public void testConfiguration()
    {
       ConfigurationBean configurationBean =  (ConfigurationBean)applicationContext.getBean("configurationBean");
        System.out.println(configurationBean);
//       NestedBean nestedBean =  (NestedBean)applicationContext.getBean(NestedBean.class);
//        System.out.println(configurationBean);
//        System.out.println(nestedBean);
//        System.out.println(applicationContext.getBean(NestedBean2.class));
    }
}
