package com.spring.ioc.autoawire.autowire;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = CDPlayConfig.class)
public class AutoWireTest {
    @Autowired
    private CompactDisc compactDisc;

    @Autowired
    private CDPlayer cdPlayer;

    @Test
    public void test() {
        System.out.println(compactDisc);
        System.out.println(cdPlayer);
        System.out.println(cdPlayer.getCompactDisc());
    }
}
