package com.spring.aop.pojo;

import java.time.LocalDateTime;

public class Lunch implements Dinner {
    public void eating() {
        System.out.println("吃午饭...");
    }

    public void eating(String foodName)
    {
        System.out.println("吃午饭：" + foodName);
    }

    @Override
    public void eating(String foodName, LocalDateTime eatingTime) {
        System.out.println("吃午饭： " + foodName + " eatingTime: " + eatingTime);
    }

    @Override
    public void eating(LocalDateTime eatingTime, String foodName) {
        System.out.println("revert eating eatingTime = " + eatingTime + " foodName" + foodName);
    }

    @Override
    public void eating(LocalDateTime eatingTime) {
        System.out.println("吃饭时间： "+ eatingTime);
    }

    @Override
    public void drinking(String name, LocalDateTime drinkingTime) {
        System.out.println("喝饮料： "+ name + " drinkingTime:"+drinkingTime);
    }

    @Override
    public String drinking(String name) {
        System.out.println("喝饮料并返回饮料名称：" + name);
        return name;
    }
}
