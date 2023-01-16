package com.sep3r.lesson4;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Lesson4Example {

    //this lesson for Collections
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        List<String> list = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            list.add("ali");
            set.add("ali");
        }
        for (String s : set) {
            System.out.println("set :" + s);
        }
        for (String s : list) {
            System.out.println("list :" + s);
        }

    }
}
