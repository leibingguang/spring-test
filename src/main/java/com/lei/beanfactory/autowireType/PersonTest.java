package com.lei.beanfactory.autowireType;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PersonTest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("book.xml");
        Person person = (Person) context.getBean("person");
        System.out.println(person.toString());
    }
}
