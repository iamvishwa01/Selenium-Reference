package com.learning.TestNG;

import org.testng.annotations.Test;

public class TestNGElectronic {

    @Test
    public void asuslogin(){
        System.out.println("Asus login");
    }
    @Test(groups = {"smoke"})
    public void asuslogin1(){
        System.out.println("Asus login");
    }
    @Test
    public void asuslogin2(){
        System.out.println("Asus login");
    }

    @Test(dependsOnMethods = "asuslogin2")
    public void nokiaLogin(){
        System.out.println("Nokia login");
    }
    @Test(groups = {"smoke"})
    public void samsungLogin(){
     System.out.println("samsung login");
    }
}
