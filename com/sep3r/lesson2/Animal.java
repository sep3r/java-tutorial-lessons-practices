package com.sep3r.lesson2;

import java.util.Objects;

//java abstraction and encapsulation
public abstract class Animal {
    private int age;
    private String name;
    public Animal() {
    }
    public Animal(int age, String name) {
        this.age = age;
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void move(){
    }
}
