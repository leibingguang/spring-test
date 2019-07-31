package com.spring.ioc.bean.javaconfig;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.context.annotation.Bean;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = CDPlayConfig.class)
public class JavaConfigTest {
    @Test
    public void test() {
        System.out.println(getCdPlayer());
        System.out.println(getCdPlayer());
        System.out.println(getCdPlayer().getCompactDisc());
        System.out.println(getCdPlayer().getCompactDisc());
    }

    @Bean(name = "compactDisc", autowire = Autowire.BY_NAME)
    public CompactDisc getCompactDisc() {
        return new SgtPappers();
    }

    @Bean(name = "cdPlayer", autowire = Autowire.BY_NAME)
    public CDPlayer getCdPlayer() {
        return new CDPlayer(new SgtPappers());
    }

}
