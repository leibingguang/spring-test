package com.spring.aop.pojo;

import java.time.LocalDateTime;

public interface Dinner {
    void eating();

    void eating(String foodName);

    void eating(String foodName, LocalDateTime eatingTime);
    void eating( LocalDateTime eatingTime,String foodName);

    void eating(LocalDateTime eatingTime);

    void drinking(String name, LocalDateTime drinkingTime);

    String drinking(String name);
}
