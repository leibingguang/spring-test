package com.spring.ioc.annotation_config.configuration.cglib;

import org.springframework.stereotype.Component;

@Component("testDomain")
public class TestDomain {
    public TestDomain() {
        //构造参数打印，证明被调过
        System.out.println("new TestDomain-------------");
    }
}
