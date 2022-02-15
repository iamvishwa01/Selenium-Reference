package com.learning.Streams;

import com.learning.utility.BaseClass;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class streamCollect extends BaseClass {

    public static void main(String args[]){

        ArrayList<String> list = new ArrayList<String>();
        list.add("sujeet");
        list.add("shivam");
        list.add("sushil");
        list.add("sandeep");
        list.add("Rahul");
        list.add("Ruchit");
        list.add("Sanjay");

       List<String> newList = list.stream().filter(s->s.startsWith("s")).map(s->s.toUpperCase()).collect(Collectors.toList());
       newList.stream().forEach(s->System.out.println(s));

       //get the 2nd data of the list
        System.out.println(newList.get(0));
        System.out.println(newList.get(3));


    }
}

