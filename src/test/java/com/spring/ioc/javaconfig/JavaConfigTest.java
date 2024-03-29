package com.spring.ioc.javaconfig;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {CDPlayConfig.class, JavaConfigTest.class})
public class JavaConfigTest {
    @Autowired
    private CDPlayer cdPlayer;
    @Autowired
    private CompactDisc compactDisc;
    @Test
    public void test() {
        System.out.println(cdPlayer);
        System.out.println(cdPlayer.getCompactDisc());
        System.out.println(compactDisc);
//        System.out.println(getCdPlayer());
//        System.out.println(getCdPlayer());
//        System.out.println(getCdPlayer().getCompactDisc());
//        System.out.println(getCdPlayer().getCompactDisc());
    }

    @Bean(name = "compactDisc")
    public CompactDisc getCompactDisc() {
        return new SgtPappers();
    }

    @Bean(name = "cdPlayer")
    public CDPlayer getCdPlayer() {
        return new CDPlayer(new SgtPappers());
    }

}
