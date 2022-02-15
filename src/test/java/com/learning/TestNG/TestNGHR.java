package com.learning.TestNG;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNGHR {

    @Test(priority = 2)
    public void sample(){
        System.out.println("hello from testNG");
    }
    @Parameters(value = {"URL"})
    @Test(priority = 1)
    public void test2(String url){

        Assert.assertTrue(false);
        System.out.println("Second test");
        System.out.println(url);

    }
}
