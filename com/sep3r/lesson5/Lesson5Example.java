package com.sep3r.lesson5;

public class Lesson5Example {
    public static void main(String[] args) {
        Lesson5Example lesson5Example = new Lesson5Example();
        lesson5Example.test((number1, number2)->number1+ number2, 15, 180);
    }
    private void test(Checkpoint checkpoint, Integer number1, Integer number2){
        System.out.println(checkpoint.sum(number1, number2));
    }
    @FunctionalInterface
    interface Checkpoint{
        int sum(Integer x, Integer y);
    }


}
