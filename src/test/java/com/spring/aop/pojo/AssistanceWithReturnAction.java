package com.spring.aop.pojo;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Aspect
@Component
public class AssistanceWithReturnAction {
    @Pointcut("execution( * com.spring.aop.pojo.*.*(..))")
    private void pointcut() {}

    @AfterReturning(pointcut = "pointcut()",returning="returnValue")
    public void after(String returnValue)
    {
        System.out.println("AfterReturning returnValue=" + returnValue);
    }
}
