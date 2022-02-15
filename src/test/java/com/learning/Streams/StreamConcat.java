package com.learning.Streams;

import com.learning.utility.BaseClass;

import java.util.ArrayList;
import java.util.stream.Stream;

import static com.learning.utility.LogUtility.info;


public class StreamConcat extends BaseClass {

    public static void main(String args[]){
        ArrayList<String> list = new ArrayList<String>();
        list.add("sujeet");
        list.add("shivam");
        list.add("sushil");
        list.add("sandeep");
        list.add("rahul");
        list.add("Ruchit");
        list.add("Sanjay");
        ArrayList<String> list2 = new ArrayList<String>();
        list2.add("dell");
        list2.add("apple");
        list2.add("samsung");
        list2.add("asus");
        list2.add("nokia");
        //merging 2 different list
      Stream<String> newStream =  Stream.concat(list.stream(),list2.stream());

       // newStream.sorted().forEach(s->System.out.println(s));
        boolean flag = newStream.anyMatch(s->s.equalsIgnoreCase("nokia"));
       System.out.println(flag);
    }

}
