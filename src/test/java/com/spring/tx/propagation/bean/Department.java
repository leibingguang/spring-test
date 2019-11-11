package com.spring.tx.propagation.bean;

/**
 * 部门名称
 * <p>
 * create table test_department(
 * id NUMBER(10) not null,
 * name VARCHAR2(50),
 * address VARCHAR2(50)
 * );
 */
public class Department {

    private String name;

    public Department(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Department{");
        sb.append("name='").append(name).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
