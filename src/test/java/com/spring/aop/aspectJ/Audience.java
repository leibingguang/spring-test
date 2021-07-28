package com.spring.aop.aspectJ;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
//@Component
public class Audience {

    @Pointcut("execution(String com.spring.aop.aspectJ.Performance.perform(..))")
    public void performance() {
    }

    @Before("performance()")
    public void before() {
        System.out.println("Seat Down!");
    }

    @After("performance()")
    public void after() {
        System.out.println("CLAP! CLAP!");
    }
}
