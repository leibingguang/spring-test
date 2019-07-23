package com.spring.ioc.bean.initBeans;

public class Car {
    private String id;
    private String brands;
    private String color;

    public static Car getCar() {
        return new Car("staticFactoryMethodId", "Cayenne", "blue");
    }
    public static Car getCar(String id, String brands, String color) {
        return new Car(id, brands, color);

    }
    public Car getCarWithInstance() {
        return new Car("instanceFactoryMethodId", "Cayenne", "blue");

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getBrands() {
        return brands;
    }

    public void setBrands(String brands) {
        this.brands = brands;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Car(String id, String brands, String color) {
        this.id = id;
        this.brands = brands;
        this.color = color;
    }

    public Car() {
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Car{");
        sb.append("id='").append(id).append('\'');
        sb.append(", brands='").append(brands).append('\'');
        sb.append(", color='").append(color).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
