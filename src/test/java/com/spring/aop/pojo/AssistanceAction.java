package com.spring.aop.pojo;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import java.time.LocalDateTime;

/**
 * 切面Aspect
 */
public class AssistanceAction {

    // 带参数 begin
    public void before(String foodName, LocalDateTime eatingTime) {
        System.out.println("  before: " + foodName + " eatTime = " + eatingTime);
    }
//    public void before(String foodName) {
//        System.out.println("  before: " + foodName);
//    }

//    public void before(LocalDateTime eatingTime)
//    {
//        System.out.println(" localDatetime: " + eatingTime);
//    }

    public void after(String foodName) {
        System.out.println(" after: " + foodName);
    }

    public void around(ProceedingJoinPoint pj, String foodName) throws Throwable {
        System.out.println("before around: " + foodName);
        pj.proceed();
        System.out.println("after around: " + foodName);

    }

    public String afterReturning(String foodName, String afterReturning) {
        System.out.println(" after returning: "+ foodName);
        return "afterReturning";
    }

    public void afterThrowing(String foodName) {
        System.out.println(" after throwing: " + foodName);
    }

    // 带参数 end


    // 不带参数 begin
    public void beforeNoArgs() {
        System.out.println("  before: ");
    }

    public void afterNoArgs() {
        System.out.println(" after: " );
    }

    public void aroundNoArgs(ProceedingJoinPoint pj) throws Throwable {
        System.out.println("before around: " );
        pj.proceed();
        System.out.println("after around: " );

    }

    public void afterReturningNoArgs() {
        System.out.println(" after returning: " );
    }

    public void afterThrowingNoArgs() {
        System.out.println(" after throwing: " );
    }
    // 不带参数 end
}
