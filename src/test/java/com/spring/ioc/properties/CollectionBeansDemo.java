package com.spring.ioc.properties;

import com.spring.ioc.initBeans.ComplexObject;
import org.apache.commons.dbcp.BasicDataSource;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class CollectionBeansDemo {
    private static BeanFactory beanFactory;
    private static ComplexObject complexObject;
    @BeforeClass
    public static void beforeClass()
    {
        beanFactory = new XmlBeanFactory(new ClassPathResource("bean/collection-bean/collectionBeans.xml"));
        complexObject= (ComplexObject)beanFactory.getBean("moreComplexObject");

    }

    @Test
    public void testList()
    {
        Assert.assertNotEquals(null, complexObject.getSomeList().get(1));
        Assert.assertEquals("jdbc:mysql://localhost:3306/mydb", ((BasicDataSource)complexObject.getSomeList().get(1)).getUrl());
    }
    @Test
    public void testProperties()
    {
        Assert.assertNotEquals(null, complexObject.getAdminEmails());
        Assert.assertEquals("administrator@example.org", complexObject.getAdminEmails().getProperty("administrator"));
    }
    @Test
    public void testMap()
    {
        String entryValue = (String)complexObject.getSomeMap().get("an entry");
        Assert.assertEquals("just some string", entryValue);
    }
    @Test
    public void testSet()
    {
        Assert.assertNotEquals(null, complexObject.getSomeSet());
        Assert.assertNotEquals(true,complexObject.getSomeSet().contains("complexObject.getSomeSet()") );
    }
}
