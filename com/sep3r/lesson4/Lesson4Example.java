package com.sep3r.lesson4;

import java.lang.reflect.Parameter;
import java.sql.Wrapper;
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
        set.add("majid");
        set.add("mahmood");
        set.forEach(s -> System.out.println(s));
        list.set(2, "david");

        WrapperClass wrapperClass = getWrapper();
        System.out.println(wrapperClass.getValue() + " "+ wrapperClass.getNumber());
    }

    private static WrapperClass getWrapper(){
        return new WrapperClass<>("This is Wrap class", 16);
    }
}
