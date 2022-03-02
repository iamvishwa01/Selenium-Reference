package com.learning.CoreJava.Collection;

import java.util.HashMap;
import java.util.HashSet;

public class List {
    public static void main(String[]args){
        /*
        set does not contain duplicate values
        List contains duplicate values
        Hashset,treeset,Linkedset implements set interface
        element stores in random manner there is no sequence follows in this
         */
        HashSet<String> hashSet = new HashSet<String>();
        hashSet.add("USA");
        hashSet.add("IND");
        hashSet.add("UK");
        hashSet.add("UK");
        hashSet.add("CAN");
        hashSet.add("CAN");
        System.out.println(hashSet);
        hashSet.remove("CAN");
        System.out.println(hashSet);
    }
}
