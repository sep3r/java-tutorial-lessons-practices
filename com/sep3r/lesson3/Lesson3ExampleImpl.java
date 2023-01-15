package com.sep3r.lesson3;

import java.util.Scanner;

//Example to implement an Interface
public class Lesson3ExampleImpl{
    public static void main(String[] args) {
        try{
            Inner inner = new Inner();
            inner.getMessage();
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    static class Inner implements Lesson3Example {
        @Override
        public void getMessage() {
            try (Scanner sc = new Scanner(System.in);) {
                System.out.println("Enter Message to Show ...!");
                String s = sc.nextLine();
                writeMessage(s);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        public void writeMessage(String s) {
            try {
                System.out.println(s);
            } catch (NullPointerException e) {
                e.printStackTrace();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
