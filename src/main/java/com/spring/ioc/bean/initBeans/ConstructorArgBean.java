package com.spring.ioc.bean.initBeans;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class ConstructorArgBean {
    private List<String> list;
    private Map<String,String> map;
    private String[] stringArray;
    private Set<String> set;
    private Properties properties;
    private String string;

    public List<String> getList() {
        return list;
    }

    public void setList(List<String> list) {
        this.list = list;
    }

    public Map<String, String> getMap() {
        return map;
    }

    public void setMap(Map<String, String> map) {
        this.map = map;
    }

    public String[] getStringArray() {
        return stringArray;
    }

    public void setStringArray(String[] stringArray) {
        this.stringArray = stringArray;
    }

    public Set<String> getSet() {
        return set;
    }

    public void setSet(Set<String> set) {
        this.set = set;
    }

    public Properties getProperties() {
        return properties;
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }

    public String getString() {
        return string;
    }

    public void setString(String string) {
        this.string = string;
    }

    public ConstructorArgBean(List<String> list, Map<String, String> map, String[] stringArray, Set<String> set, Properties properties, String string) {
        this.list = list;
        this.map = map;
        this.stringArray = stringArray;
        this.set = set;
        this.properties = properties;
        this.string = string;
    }
}
