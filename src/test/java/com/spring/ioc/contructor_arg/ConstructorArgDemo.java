package com.spring.ioc.contructor_arg;

import com.spring.ioc.bean.contructor_arg.ConstructorArgBean;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class ConstructorArgDemo {
    static BeanFactory beanFactory;
    @BeforeClass
    public static void beforeClass()
    {
        beanFactory = new XmlBeanFactory(new ClassPathResource("constructorArgBeansApplicationContext.xml"));
    }

    @Test
    public void testConstructorArg()
    {
        ConstructorArgBean constructorArgBean = (ConstructorArgBean)beanFactory.getBean("constructorArgBean");
        Assert.assertNotNull(constructorArgBean.getList());
        Assert.assertNotNull(constructorArgBean.getMap());
        Assert.assertNotNull(constructorArgBean.getProperties());
        Assert.assertNotNull(constructorArgBean.getSet());
        Assert.assertNotNull(constructorArgBean.getStringArray());
        Assert.assertNotNull(constructorArgBean.getString());

    }

    @Test
    public void testConstructorArgMapNull()
    {
        ConstructorArgBean constructorArgBean = (ConstructorArgBean)beanFactory.getBean("constructorArgBeanNull");
        Assert.assertNotNull(constructorArgBean.getList());
        Assert.assertNull(constructorArgBean.getMap());
        Assert.assertNotNull(constructorArgBean.getProperties());
        Assert.assertNotNull(constructorArgBean.getSet());
        Assert.assertNotNull(constructorArgBean.getStringArray());
        Assert.assertNotNull(constructorArgBean.getString());
    }
}
