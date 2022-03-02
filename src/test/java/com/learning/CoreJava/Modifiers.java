package com.learning.CoreJava;

public class Modifiers {



    public static void main(String args[]){

        //4 access modifiers
        /*
        1. Default : Access method anywhere in the packages
        2. Public :  Can access variable/methods to all the packages
        3. Private : if marked variable/methods as private then it can be accessible only to the class
        4. Protected : can be accessed to the same packages but by extending the parent class to the chiled class

         */

        Modifiers m1 = new Modifiers();
        m1.getdata();

    }
    private void getdata(){
        System.out.println("hello");
    }

}
