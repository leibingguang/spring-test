package com.spring.aop.aspectJWithXml;

import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Set;

@Aspect
@Component
public class Audience {

    @Pointcut(value = "execution(* com.spring.aop.aspectJWithXml.Performance.testArgs(..)) && args(list)", argNames = "list")
    public void beforePointCut(List<String> list) {
    }

    @Pointcut(value = "execution(* com.spring.aop.aspectJWithXml.Performance.testArgs(..)) && args(list)")
    public void afterPointCut(List<String> list) {
    }

    @Pointcut(value = "execution(* testSet(..)) && args(str, set2)", argNames = "str,set2")
    public void beforeTestSet(String str, Set set2){}

    @Before(value = "beforePointCut(list)", argNames = "list")
    public void before(List<String> list) {
        System.out.println("before " + list);
    }

    @AfterReturning(value = "afterPointCut(list)", returning="returnStr")
    public void after(String returnStr, List<String> list) {
        System.out.println("after " + returnStr);
        System.out.println("param " + list);

    }

    @Before(value = "execution(* testSet(..)) && args(str, set1)")

    public void beforeSet(Set set1, String str)
    {
        System.out.println("beforeSet " + set1 + " str = " + str);

    }
}
