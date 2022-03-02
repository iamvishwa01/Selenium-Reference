package com.learning.CoreJava.Collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class hashmapp {
    public static void main(String[]args){
        HashMap <Integer,String> hm = new HashMap<Integer,String>();
        hm.put(0,"hello");
        hm.put(1,"morning");
        hm.put(2,"night");
        hm.put(3,"afternoon");
        System.out.println(hm.get(3));
        Set sn = hm.entrySet();
        Iterator it = sn.iterator();
        while (it.hasNext()){
            Map.Entry mp = (Map.Entry) it.next();
            System.out.println(mp.getKey());
            System.out.println(mp.getValue());
        }
    }
}
