package com.spring.ioc.bean;

import com.spring.ioc.bean.initBeans.Car;
import com.spring.ioc.bean.initBeans.Person;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

/**
 * 没有找到lazy-init测试点，后期完善
 */
public class LazyInitTest {
    static BeanFactory beanFactory;
    @BeforeClass
    public static void beforeClass()
    {
        beanFactory = new XmlBeanFactory(new ClassPathResource("lazyInitApplicationContext.xml"));
        System.out.println("s");
    }

    /**
     * 自动转配类型为No
     */
    @Test
    public void testAutowiringNo()
    {
        Person person = (Person)beanFactory.getBean("personAutowiringNo");
        Assert.assertNotNull(person.getCar());
    }

    /**
     * 自动装配类型为：byName 不存在
     */
    @Test
    public void testAutowiringByNameCar()
    {
        Person person = (Person)beanFactory.getBean("personAutowiringByName");
        Assert.assertNull(person.getCar());
}

    /**
     * 自动装配类型为：byName 存在
     */
    @Test
    public void testAutowiringByNameCarBean()
    {
        Person person = (Person)beanFactory.getBean("personAutowiringByName");
        Assert.assertNotNull(person.getCarBean());
    }

    @Test
    public void testName()
    {
        Car carA = (Car)beanFactory.getBean("a");
        Car carB = (Car)beanFactory.getBean("b");
        Car carC = (Car)beanFactory.getBean("c");

        Assert.assertNotNull(carA);
        Assert.assertNotNull(carB);
        Assert.assertNotNull(carC);
    }


    @Test
    public void testLazyInit()
    {
        Person person = (Person) beanFactory.getBean("personAutowiringByType");
        Assert.assertNotNull(person);
    }

}
