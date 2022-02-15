package com.learning.Streams;

import com.learning.utility.BaseClass;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamDistinct extends BaseClass {
    public static void main(String args[]) {

        List<Integer> values = Arrays.asList(1, 1, 3, 4, 5, 7, 4, 7, 7, 4, 22, 55, 99);
      //  values.stream().distinct().forEach(s->System.out.println(s));
    List<Integer> newList = values.stream().distinct().sorted().collect(Collectors.toList());
    newList.stream().forEach(s->System.out.println(s));
    }

}
