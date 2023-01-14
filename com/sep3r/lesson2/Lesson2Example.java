package com.sep3r.lesson2;

public class Lesson2Example {

    public static void main(String[] args) {
        CellPhone cellPhone = new CellPhone();
        System.out.println(cellPhone.toString());
        int call = 1;
        //upcasting
        Animal animal1 = new Cat();
        Animal animal2 = new Fish();
        animal1.move();
        animal2.move();
        //polymorphism dynamic binding
        Animal anim;
        if (call == 1)
            anim = new Cat();
        else
            anim = new Fish();
    }
}
