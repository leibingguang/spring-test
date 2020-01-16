package com.spring.aop.aspectJWithXml.argNames;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.lang.reflect.Method;

public class ArgNamesDemo {

    private ApplicationContext applicationContext;
    @Before
    public void beforeClass()
    {
        applicationContext = new ClassPathXmlApplicationContext("aop/aspectJ/aspectJAopApplicationContext.xml");
    }

    @Test
    public void aspectjTest1(){
        HelloApi helloapi = applicationContext.getBean(HelloApi.class);
        helloapi.aspectTest("aaaa", "bbbb");
        helloapi.notIntercept();
    }

    @Test
    public void invoke() throws Exception
    {
        Method method = HelloApiAspect.class.getMethod("beforecase2", String.class, String.class, Object.class, Object.class);
        method.invoke(new HelloApiAspect(), "a", "b", "c", "d");
    }
}
