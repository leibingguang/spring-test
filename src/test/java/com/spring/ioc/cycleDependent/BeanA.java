package com.spring.ioc.cycleDependent;

public class BeanA {
    private BeanB beanB;

    public BeanB getBeanB() {
        return beanB;
    }

    public void setBeanB(BeanB beanB) {
        this.beanB = beanB;
    }

//    @Override
//    public String toString() {
//        final StringBuffer sb = new StringBuffer("BeanA{");
//        sb.append("beanB=").append(beanB);
//        sb.append('}');
//        return sb.toString();
//    }
}
