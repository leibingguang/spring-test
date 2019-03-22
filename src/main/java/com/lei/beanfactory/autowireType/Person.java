package com.lei.beanfactory.autowireType;

public class Person {
    private  Book book;

    public  Person(Book book){
        this.book= book;
    }

    public void  setBook(Book book){
        this.book = book;
    }

    public  String  toString(){
        return  "I'm  a person  I want  to  read  a book   "+ book;
    }

    public Person(){
    }
}
