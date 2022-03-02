package com.learning.CoreJava;

public class reverseString {
    public static void main(String args[]){

        String a = "123211";
        String b ="";
        for(int i = a.length()-1;i>=0;i--){
        b= b+a.charAt(i);
        }
        System.out.println(b);
        if(a.equals(b)){
            System.out.println("string matches");
        }else{
            System.out.println("string are not matching");
        }
    }
}
