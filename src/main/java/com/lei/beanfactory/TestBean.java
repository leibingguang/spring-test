package com.lei.beanfactory;

public class TestBean {
    private String testStr;

    public String getTestStr() {
        return testStr;
    }

    public void setTestStr(String testStr) {
        this.testStr = testStr;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("TestBean{");
        sb.append("testStr='").append(testStr).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
