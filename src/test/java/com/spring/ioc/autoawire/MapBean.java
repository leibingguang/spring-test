package com.spring.ioc.autoawire;

import com.spring.ioc.initBeans.Car;

import java.util.Map;

public class MapBean {
    private Map<String, Car> carMap;

    public Map<String, Car> getCarMap() {
        return carMap;
    }

    public void setCarMap(Map<String, Car> carMap) {
        this.carMap = carMap;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("MapBean{");
        sb.append("carMap=").append(carMap);
        sb.append('}');
        return sb.toString();
    }
}
