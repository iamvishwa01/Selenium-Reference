package com.learning.Streams;

import com.learning.utility.BaseClass;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StreamWithMap extends BaseClass {

    public static void main(String args[]){
            //filter a data from arraylist and convert to uppercase
    ArrayList<String> list = new ArrayList<String>();
    list.add("sujeet");
    list.add("shivam");
    list.add("sushil");
    list.add("sandeep");
    list.add("rahul");
    list.add("Ruchit");
    list.add("Sanjay");
    list.add("Mujeeb");
    list.add("Durgesh");
    list.add("Anand");
    list.stream().filter(s->s.endsWith("l")).map(s->s.toUpperCase()).forEach(s->System.out.println(s));
    list.stream().filter(s->s.startsWith("s")).map(s->s.toUpperCase()).forEach(s->System.out.println(s));
    list.stream().filter(s->s.matches("Sanjay")).map(s->s.toUpperCase()).forEach(s->System.out.println(s));
    //sort the array list
        List<String> names = Arrays.asList("Sujeet","Shivam","Ruchit","Snand","Sujeeb");
        names.stream().sorted().filter(s->s.startsWith("S")).forEach(s->System.out.println(s));

    }

}
