package com.spring.ioc.bean.initBeans;

public class Person {
    private String id;
    private String name;
    /**
     * 1 男 0 女
     */
    private int sex;

    private String address;

    private Car car;

    public Person() {
    }

    public Person(String id, String name, int sex, String address, Car car) {
        this.id = id;
        this.name = name;
        this.sex = sex;
        this.address = address;
        this.car = car;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Person{");
        sb.append("id='").append(id).append('\'');
        sb.append(", name='").append(name).append('\'');
        sb.append(", sex=").append(sex);
        sb.append(", address='").append(address).append('\'');
        sb.append(", car=").append(car);
        sb.append('}');
        return sb.toString();
    }
}
