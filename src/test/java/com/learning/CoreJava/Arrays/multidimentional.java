package com.learning.CoreJava.Arrays;

public class multidimentional {

    public static void main(String args[]) {

        int a[][] = new int[2][2];
        a[0][0] = 5;
        a[0][1] = 6;
        a[1][0] = 7;
        a[1][1] = 9;

        System.out.println(a[1][1]);

        //another way of declaring multidimentional array
        int b[][]= {{4,5,6},{1,2,3}};
        System.out.println(b[1][1]);
    }
}
