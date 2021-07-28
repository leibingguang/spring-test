package com.spring.aop.pojo;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.time.LocalDateTime;


public class POJODemo {

    static ApplicationContext applicationContext;
    @BeforeClass
    public static void beforeClass()
    {
        applicationContext = new ClassPathXmlApplicationContext("aop/pojo/pojoAopApplicationContext.xml");
    }

    @Test
    public void testPojoAop() throws InterruptedException {
        Dinner dinner = (Dinner) applicationContext.getBean("lunch");
        dinner.eating("红烧肉", LocalDateTime.now());
//        dinner.eating("红烧肉");

        System.out.println("=====================");
        dinner.drinking("啤酒",LocalDateTime.now());

        System.out.println("=======");
        dinner.eating("白菜");

        System.out.println("=========");
        dinner.eating();

        System.out.println(" ===========");
        dinner.eating(LocalDateTime.now());

        System.out.println("======");
        dinner.eating(LocalDateTime.now(), "肉烧红");
        Thread.sleep(1000);
    }

    @Test
    public void testAfterReturn()
    {
        Dinner dinner = (Dinner) applicationContext.getBean("lunch");
        dinner.drinking("咖啡");
    }

}
