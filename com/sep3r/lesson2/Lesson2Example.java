package com.sep3r.lesson2;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;


//OOP = object oriented () -> {encapsulation - inheritance - polymorphism - anstraction}
// class is blueprint of Object - Object is an instance of Class
public class Lesson2Example {

    public static void main(String[] args) {
        CellPhone cellPhone = new CellPhone();
        System.out.println(cellPhone);
        Random rand = new Random();
        int call = rand.nextInt(2);
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
        anim.move();
        // use for and foreach
        List<String> lst = new ArrayList<>();
        lst.add("sepehr");
        lst.add("sepeh");
        lst.add("sepe");
        //these loops are just for test loops
        for(String s : lst){
            System.out.println(s);
        }

        for(int i = 0; i<lst.size(); i++){
            System.out.println(lst.get(i));
        }
        int i = lst.size();
        while (i>0){
            System.out.println(lst.get(i-1));
            i--;
        }
        // java array
        String[] s = new String[3];
        s[0] = "family";
        s[1] = "important";
        s[2] = "for me";
        for (Object obj : s){
            System.out.println(obj);
        }
        //so we can see we didnot change array size


    }
}
