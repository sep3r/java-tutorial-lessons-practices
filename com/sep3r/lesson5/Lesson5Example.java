package com.sep3r.lesson5;

import java.util.function.Function;
import java.util.function.IntBinaryOperator;

public class Lesson5Example{
    public static void main(String[] args) {
        MacLog macLog = (String s)-> s.length();
        int length = macLog.getStringintoInt("sep3r.ir has a new host");
        System.out.println(length);
    }
    public MacLog test(String s1){
        return (String s)-> s1.length();
    }
    interface MacLog{
        int getStringintoInt(String s);
    }
}
