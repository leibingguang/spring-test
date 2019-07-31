package com.spring.ioc.bean.lookup_method.bean;

public abstract class LookupMethodBean {
    public void showMe()
    {
        this.getBean().showMe();
    }
    public abstract Person getBean();
}
