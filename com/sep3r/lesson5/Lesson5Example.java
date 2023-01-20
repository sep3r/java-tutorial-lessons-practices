package com.sep3r.lesson5;

public class Lesson5Example {
    public static void main(String[] args) {
        Lesson5Example lesson5Example = new Lesson5Example();
        lesson5Example.test((number1, number2)->number1+ number2, 15, 180);
        lesson5Example.test((str1, str2)->str1+str2, "salam ", " Chetori?");
    }
    private void test(Checkpoint checkpoint, Integer x, Integer y){
        System.out.println(checkpoint.sum(x, y));
    }
    private void test(Concatable concatable, String x, String y){
        System.out.println(concatable.concat(x,y));
    }
    @FunctionalInterface
    interface Checkpoint{
        int sum(Integer x, Integer y);
    }
    @FunctionalInterface
    interface Concatable{
        String concat(String x, String y);
    }
}
