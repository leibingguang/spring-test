package com.spring.aop.aspectJ;

import org.springframework.stereotype.Component;

@Component
public class MusicPerformance implements Performance {
    public void perform() {
        System.out.println("Music Performance begin...!");
    }
}
