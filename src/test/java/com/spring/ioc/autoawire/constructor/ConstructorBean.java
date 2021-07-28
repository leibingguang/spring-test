package com.spring.ioc.autoawire.constructor;

public class ConstructorBean {
    private String name;
    private InnerConstructorBean innerConstructorBean;

    private InnerConstructorBean2 innerConstructorBean2;

    public ConstructorBean() {
    }

    public ConstructorBean(InnerConstructorBean innerConstructorBean) {
        this.innerConstructorBean = innerConstructorBean;
    }

    public ConstructorBean(InnerConstructorBean innerConstructorBean, InnerConstructorBean2 innerConstructorBean2) {
        this.innerConstructorBean = innerConstructorBean;
        this.innerConstructorBean2 = innerConstructorBean2;
    }
    public ConstructorBean(InnerConstructorBean2 innerConstructorBean2, String s) {
        this.innerConstructorBean2 = innerConstructorBean2;
    }
    public ConstructorBean(String name, InnerConstructorBean innerConstructorBean, InnerConstructorBean2 innerConstructorBean2) {
        this.name = name;
        this.innerConstructorBean = innerConstructorBean;
        this.innerConstructorBean2 = innerConstructorBean2;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public InnerConstructorBean getInnerConstructorBean() {
        return innerConstructorBean;
    }

    public InnerConstructorBean2 getInnerConstructorBean2() {
        return innerConstructorBean2;
    }

    public void setInnerConstructorBean2(InnerConstructorBean2 innerConstructorBean2) {
        this.innerConstructorBean2 = innerConstructorBean2;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("ConstructorBean{");
        sb.append("name='").append(name).append('\'');
        sb.append(", innerConstructorBean=").append(innerConstructorBean);
        sb.append(", innerConstructorBean2=").append(innerConstructorBean2);
        sb.append('}');
        return sb.toString();
    }

    public void setInnerConstructorBean(InnerConstructorBean innerConstructorBean) {
        this.innerConstructorBean = innerConstructorBean;
    }

}
