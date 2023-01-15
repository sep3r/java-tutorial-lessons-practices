package com.sep3r.lesson2;

import java.util.ArrayList;
import java.util.List;

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
        // use for and foreach
        List<String> lst = new ArrayList<>();
        lst.add("sepehr");
        lst.add("sepeh");
        lst.add("sepe");

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

    }
}
