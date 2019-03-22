package com.lei.beanfactory.test.wire.javaconfig;

import org.springframework.stereotype.Component;

@Component
public class SgtPappers implements CompactDisc {
    private static final String title = "sgtPappers title";

    public void play() {
        System.out.println("play " + title);
    }
}
