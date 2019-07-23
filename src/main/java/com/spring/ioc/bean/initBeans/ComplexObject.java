package com.spring.ioc.bean.initBeans;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class ComplexObject {
    /**
     * properties 注入
     */
    private Properties adminEmails;

    /**
     * List注入
     */
    private List<Object> someList;

    /**
     * Map注入
     */
    private Map<String, Object> someMap;

    /**
     * Set注入
     */
    private Set<Object> someSet;

    public Properties getAdminEmails() {
        return adminEmails;
    }

    public void setAdminEmails(Properties adminEmails) {
        this.adminEmails = adminEmails;
    }

    public List<Object> getSomeList() {
        return someList;
    }

    public void setSomeList(List<Object> someList) {
        this.someList = someList;
    }

    public Map<String, Object> getSomeMap() {
        return someMap;
    }

    public void setSomeMap(Map<String, Object> someMap) {
        this.someMap = someMap;
    }

    public Set<Object> getSomeSet() {
        return someSet;
    }

    public void setSomeSet(Set<Object> someSet) {
        this.someSet = someSet;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("ComplexObject{");
        sb.append("adminEmails=").append(adminEmails);
        sb.append(", someList=").append(someList);
        sb.append(", someMap=").append(someMap);
        sb.append(", someSet=").append(someSet);
        sb.append('}');
        return sb.toString();
    }
}
