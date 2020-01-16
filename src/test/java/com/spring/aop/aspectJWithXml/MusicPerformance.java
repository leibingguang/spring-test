package com.spring.aop.aspectJWithXml;

import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Set;

@Component("musicPerformance")
public class MusicPerformance implements Performance {
    public void perform() {
        System.out.println("Music Performance begin...!");
    }

    public String testArgs(List<String> list1)
    {
        System.out.println("execute testArgs...");
        return "returnString";
    }

    public void testSet(Set<String> stringSet)
    {
        System.out.println("testSet");
    }


    public void testSet(String str, Set<String> stringSet)
    {
        System.out.println("testSet, 2 parameters");
    }
}
