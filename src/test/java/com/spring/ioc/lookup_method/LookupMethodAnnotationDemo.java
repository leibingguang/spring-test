package com.spring.ioc.lookup_method;

import com.spring.ioc.lookup_method.bean.LookupMethodBean;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class LookupMethodAnnotationDemo {
    static BeanFactory beanFactory;
    @BeforeClass
    public static void beforeClass()
    {
        beanFactory = new XmlBeanFactory(new ClassPathResource("bean/lookup-method/lookup-method-annotation.xml"));
    }

    @Test
    public void testFactoryMethod()
    {
        LookupMethodBean lookupMethodBean = (LookupMethodBean)beanFactory.getBean("lookupMethodBean");
        lookupMethodBean.showMe();
    }
}
