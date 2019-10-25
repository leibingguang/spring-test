package com.spring.aop.pojo;

import org.springframework.aop.AfterReturningAdvice;
import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

public class AssistanceActionAdvice implements MethodBeforeAdvice, AfterReturningAdvice{
    public void before(Method method, Object[] args, Object target) throws Throwable {
        System.out.println("饭前洗手！");
    }

    public void afterReturning(Object returnValue, Method method, Object[] args, Object target) throws Throwable {
        System.out.println("饭后刷牙！");
    }
}
