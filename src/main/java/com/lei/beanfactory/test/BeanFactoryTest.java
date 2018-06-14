package com.lei.beanfactory.test;

import com.lei.beanfactory.TestBean;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;

import java.io.File;
import java.net.URL;

public class BeanFactoryTest {
    public static void main(String[] args) throws Exception{

        BeanFactory beanFactory = new XmlBeanFactory(new ClassPathResource("applicationContext.xml"));
        URL classpathURL = new ClassPathResource("applicationContext.xml").getURL();
        String s  = new ClassPathResource("classpath:applicationContext.xml").getPath();
        URL fileSystemURL = new FileSystemResource("applicationContext.xml").getURL();

        System.out.println(classpathURL);
        System.out.println(s);
        System.out.println(fileSystemURL);

//        TestBean testBean = (TestBean) beanFactory.getBean("testBean");
//        System.out.println(testBean.getTestStr());
    }
}
