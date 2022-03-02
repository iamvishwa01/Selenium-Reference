package com.learning.CoreJava.Arrays;

public class Array {

    public static void main(String args[]){

        //array is collection of same datatype in a single variable

        int a[] = {1,2,3,4,5,6};  // memory allocation is direct
        int b[] = new int[5]; //memory allocation static
        b[0] = 1;
        b[1] =2 ;
        b[2]= 3;
        b[3] = 4;
        b[4] = 5;

        for(int i =0;i<a.length;i++){
            System.out.println(a[i]);
        }
        System.out.println(" ");
        for(int i =0;i<b.length;i++){
            System.out.println(b[i]);
        }

    }

}
