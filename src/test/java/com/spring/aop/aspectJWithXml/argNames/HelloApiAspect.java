package com.spring.aop.aspectJWithXml.argNames;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;
//import org.junit.Before;

@Aspect
@Component
public class HelloApiAspect {
    @Pointcut(value="execution(* com.spring.aop.aspectJWithXml.argNames.HelloApiImpl.aspectTest(..)) && args(a1,b2)",argNames="a1,b2")
    public void pointcut1(String a1,String b2){}
//
//    @Before(value="pointcut1(a,b)",argNames="a,b")
//    public void beforecase1(String a,String b){
//        System.out.println("1 a:" + a +" b:" + b);
//    }

//    @Before(value="pointcut1(a,b) && target(com.spring.aop.aspectJWithXml.argNames.HelloApiAspect) && target(target) && this(this1)",argNames="a,b,target, this1")
    @Before(value="pointcut1(a,b) && target(target) && this(this1)",argNames="a,b,target, this1")
    public void beforecase2(String a,String b, Object target,Object this1){
        System.out.println("2 a:" + a +" b:" + b + " bean:" + target + " this1:"+this1);
    }
}
