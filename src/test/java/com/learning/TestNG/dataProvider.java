package com.learning.TestNG;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class dataProvider {

    @Test(dataProvider = "getData")
    public void dataprovider(String user,String pass){
        System.out.println(user);
        System.out.println(pass);
    }

    @DataProvider
    public Object[][] getData(){
        Object [][] data = new Object[3][2];
        //first row
        data[0][0]="usern001";
        data[0][1]="pass001";
        //second row
        data[1][0]="second002";
        data[1][1]="pass002";
        //third row
        data[2][0]="third003";
        data[2][1]="pass003";
        return data;
    }


}
