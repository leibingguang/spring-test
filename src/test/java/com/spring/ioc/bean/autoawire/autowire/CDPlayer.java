package com.spring.ioc.bean.autoawire.autowire;

import org.springframework.stereotype.Component;

@Component
public class CDPlayer {
    private CompactDisc compactDisc;

    public CDPlayer() {
    }

    public CDPlayer(CompactDisc compactDisc) {
        this.compactDisc = compactDisc;
    }

    public CompactDisc getCompactDisc() {
        return compactDisc;
    }
}
