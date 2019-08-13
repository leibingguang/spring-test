package com.spring.aop.classics;

import org.springframework.aop.AfterReturningAdvice;
import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

public class SleepHelper implements MethodBeforeAdvice, AfterReturningAdvice {
    public void afterReturning(Object returnValue, Method method, Object[] args, Object target) throws Throwable {
        System.out.println("睡醒后，穿衣服!");
    }

    public void before(Method method, Object[] args, Object target) throws Throwable {
        System.out.println("睡觉前，脱衣服!");
    }
}
