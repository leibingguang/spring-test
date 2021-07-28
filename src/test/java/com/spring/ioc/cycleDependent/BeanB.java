package com.spring.ioc.cycleDependent;

public class BeanB {
    private BeanA beanA;

    public BeanA getBeanA() {
        return beanA;
    }

    public void setBeanA(BeanA beanA) {
        this.beanA = beanA;
    }

//    @Override
//    public String toString() {
//        final StringBuffer sb = new StringBuffer("BeanB{");
//        sb.append("beanA=").append(beanA);
//        sb.append('}');
//        return sb.toString();
//    }
}
