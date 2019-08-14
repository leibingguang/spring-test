package com.spring.aop.aspectJWithXml;

import org.springframework.stereotype.Component;

@Component("musicPerformance")
public class MusicPerformance implements Performance {
    public void perform() {
        System.out.println("Music Performance begin...!");
    }
}
