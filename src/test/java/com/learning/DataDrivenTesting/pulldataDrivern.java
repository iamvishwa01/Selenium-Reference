package com.learning.DataDrivenTesting;

import java.io.IOException;
import java.util.ArrayList;

public class pulldataDrivern {


    public static void main(String args[]) throws IOException {
        DataDriven1 dataDriven1 = new DataDriven1();

       ArrayList data = dataDriven1.getData("Credentials");
System.out.println(data.get(0));
        System.out.println(data.get(1));
        System.out.println(data.get(2));

    }
}
