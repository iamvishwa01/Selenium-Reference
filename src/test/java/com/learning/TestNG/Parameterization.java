package com.learning.TestNG;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameterization {
    @Parameters(value = {"URL"})
    @Test
    public void Perameter1(String url){
        System.out.println(url);
    }

}
