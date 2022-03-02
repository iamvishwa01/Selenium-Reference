package com.learning.CoreJava.Collection;

import java.util.ArrayList;

public class collection_practical {
    public static void main(String args[]){

        /*
        Java collection is a collection of interfaces and classes which helps
        in storing and processing the data efficiently.
        This framework has several useful classes which have tons of useful functions
        which makes a programmer task super easy.
         */
        //this accepts duplicate values
        // ArrayList is dynamic. can access remove add in any index
        // array is fixed size

        ArrayList<String> a = new ArrayList<String>();
        a.add("test");
        a.add("java");
        a.add("Linux");
        a.add("Python");
        System.out.println(a);
        System.out.println(a.get(2));
     //   a.remove("test");
        System.out.println(a);
        if(a.contains("test")){
            System.out.println("yes");
        }else{
            System.out.println("no");
        }

        System.out.println(a.isEmpty());
        System.out.println(a.size());
        System.out.println(a.indexOf(2));

    }
}
