package com.spring.ioc.lookup_method.bean;

import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.stereotype.Component;

@Component
public abstract class LookupMethodBean {
    public void showMe()
    {
        this.getBean().showMe();
    }
    @Lookup
    public abstract Person getBean();
}
