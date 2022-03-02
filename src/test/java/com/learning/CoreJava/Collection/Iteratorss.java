package com.learning.CoreJava.Collection;

import java.util.HashSet;
import java.util.Iterator;

public class Iteratorss {
    public static void main(String[]args){
        /*
        set does not contain duplicate values
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
      Iterator<String> i= hashSet.iterator();
        while (i.hasNext()){
            System.out.println(i.next());
        }
    }
}
