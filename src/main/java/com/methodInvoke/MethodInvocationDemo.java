package com.methodInvoke;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MethodInvocationDemo {
    private static ApplicationContext applicationContext = null;
    static
    {
        applicationContext = new ClassPathXmlApplicationContext("methodInvocation.xml");
    }
    @Test
    public void test()
    {

    }
}
