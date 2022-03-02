package com.learning.CoreJava;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Datee {
    public static void main(String args[]){
        Date d1 = new Date();
        System.out.println(d1.toString());
        SimpleDateFormat sdf = new SimpleDateFormat("HHmmddMMYYYY");
        System.out.println(sdf.format(d1));

        //calender class

        Calendar c =Calendar.getInstance() ;
        SimpleDateFormat sd = new SimpleDateFormat("HHmmddMMYYYY");
        System.out.println(sd.format(c.getTime()));
        System.out.println(c.get(Calendar.DAY_OF_WEEK));
        System.out.println(c.get(Calendar.DAY_OF_MONTH));
        System.out.println(c.get(Calendar.WEEK_OF_YEAR));
        System.out.println(c.get(Calendar.DATE));

    }
}
