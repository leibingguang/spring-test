package com.spring.ioc.beanPostProcessor.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Person {

    private Car car;

    @Autowired
    public Person(Car car) {
        this.car = car;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Person{");
        sb.append("car=").append(car);
        sb.append('}');
        return sb.toString();
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }
}
