package com.spring.ioc.bean.factoryBean;

import com.spring.ioc.bean.initBeans.Car;
import org.springframework.beans.factory.FactoryBean;

public class CarFactoryBeanObject implements FactoryBean{
    public Object getObject() throws Exception {
        return new Car();
    }

    public Class<?> getObjectType() {
        return Car.class;
    }

    public boolean isSingleton() {
        return true;
    }
}
