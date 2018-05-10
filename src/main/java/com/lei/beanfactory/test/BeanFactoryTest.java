package com.lei.beanfactory.test;

import com.lei.beanfactory.TestBean;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class BeanFactoryTest {
    public static void main(String[] args) {
        BeanFactory beanFactory = new XmlBeanFactory(new ClassPathResource("applicationContext.xml"));
        TestBean testBean = (TestBean) beanFactory.getBean("testBean");
        System.out.println(testBean.getTestStr());
    }
}
