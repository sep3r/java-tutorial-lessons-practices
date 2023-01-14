package com.sep3r.lesson2;

//<Access modifire is public. We can use protect if we need to use it only in this package or private if we use it only in this class>
//syntax is <Access Modifire> + <Type> + <Class Name>
public class Pen {
    //attributes  ویژگی
    private String name;
    private String color;

    //behaviors  رفتار
    public Pen() {
    }
    public Pen(String name, String color) {
        this.name = name;
        this.color = color;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    //identities

}
