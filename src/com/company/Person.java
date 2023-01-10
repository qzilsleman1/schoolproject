package com.company;

import java.util.Random;

public class Person {
    Random a= new Random();
    private String name;
    private int age;

    public Person(String name,int age){
        this.name=name;
       // this.age=age;
        setAge(age);
    }

    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public void setName(String name){
        this.name=name;
    }
    public void setAge(int age){
        if (age>=20&&age<=120)
        this.age=age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
