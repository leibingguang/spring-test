package com.spring.ioc.lookup_method.bean;

import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class Teacher extends Person {
    @Override
    public void showMe() {
        System.out.println("i'm a teacher!");
    }
}
