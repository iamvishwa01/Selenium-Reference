package com.learning.TestNG;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNG {
    @Parameters(value = {"URL","username","password"})
    @Test(priority = 2,groups = {"smoke"})
    public void sample(String url,String user,String pass){
        System.out.println("hello from testNG");
        System.out.println(url);
        System.out.println(user);
        System.out.println(pass);
    }

    @Test(priority = 1)
    public void test2(){
        System.out.println("Second test");
    }

}
