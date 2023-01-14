package com.sep3r.lesson2;

import java.util.Objects;

//<Access modifire is public. We can use protect if we need to use it only in this package or private if we use it only in this class>
//syntax is <Access Modifire> + <Type> + <Class Name>
// if we use final in all class or methodes or fields it does not inherit to the childs
public final class Pen {
    //attributes  ویژگی
    // <Access-Modifires> + <Type> + <Fileds-Name>
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
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Pen)) return false;
        Pen pen = (Pen) o;
        return getName().equals(pen.getName()) && getColor().equals(pen.getColor());
    }
    @Override
    public int hashCode() {
        return Objects.hash(getName(), getColor());
    }
    @Override
    public String toString() {
        return "Pen{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
