package com.learning.CoreJava;

public class String_variable {
    public static void main(String args[]){

        String test = "sujeet is very good";



        System.out.println(test.toUpperCase());
        System.out.println(test.length());
        System.out.println(test.subSequence(2,5));
      String  [] data =test.split("is");
        System.out.println(data[0]);
        System.out.println(data[1]);
        System.out.println(test.toUpperCase());
        System.out.println(test.replace("is","are"));

    }
}
