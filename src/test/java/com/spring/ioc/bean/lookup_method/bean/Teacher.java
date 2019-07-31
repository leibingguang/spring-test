package com.spring.ioc.bean.lookup_method.bean;

public class Teacher extends Person {
    @Override
    public void showMe() {
        System.out.println("i'm a teacher!");
    }
}
