package com.spring.ioc.lookup_method;

import com.spring.ioc.lookup_method.bean.LookupMethodBean;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.cglib.core.DebuggingClassWriter;
import org.springframework.core.io.ClassPathResource;

public class LookupMethodDemo {
    static BeanFactory beanFactory;
    @BeforeClass
    public static void beforeClass()
    {
        beanFactory = new XmlBeanFactory(new ClassPathResource("bean/lookup-method/lookup-method.xml"));
    }

    @Test
    public void testFactoryMethod()
    {

        System.setProperty(DebuggingClassWriter.DEBUG_LOCATION_PROPERTY,
                "I:\\code\\spring\\spring-test\\src\\test\\java\\com\\spring\\ioc\\bean\\lookup_method\\generateclass");
        LookupMethodBean lookupMethodBean = (LookupMethodBean)beanFactory.getBean("lookupMethodBean");
        lookupMethodBean.showMe();
    }
}
