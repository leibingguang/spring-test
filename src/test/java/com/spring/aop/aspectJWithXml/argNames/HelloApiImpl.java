package com.spring.aop.aspectJWithXml.argNames;

import org.springframework.stereotype.Component;

@Component
public class HelloApiImpl implements HelloApi{
    public void aspectTest(String a,String b){
        System.out.println("in aspectTest:" + "a:" + a + ",b:" + b);
    }

    @Override
    public void notIntercept() {
        System.out.println("not intercept");
    }
}
