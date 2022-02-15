package com.learning.Streams;

import com.learning.utility.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

import static com.learning.utility.LogUtility.info;

public class stream1 extends BaseClass {
    @Test
    public void stream(){ //using stream to filter an array
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
        Long c = list.stream().filter(s->s.startsWith("S")).count();
        info(String.valueOf(c));
        list.stream().filter(s->s.length()>5).forEach(s->System.out.println(s));
    }

    @Test
    public void NormalUsingJava(){  // normal using java
        ArrayList<String> list = new ArrayList<String>();
        list.add("sujeet");
        list.add("shivam");
        list.add("Aushil");
        list.add("sandeep");
        list.add("Aahul");
        list.add("Ruchit");
        list.add("Sanjay");
        list.add("Mujeeb");
        list.add("Aurgesh");
        list.add("Anand");
int count = 0;
        for(int i = 0; i < list.size();i++){
            String actualName = list.get(i);
            if(actualName.startsWith("s")){
                count++;
            }
        }
        System.out.println(count);
    }



}
