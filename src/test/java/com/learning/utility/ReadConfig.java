package com.learning.utility;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig {



    public static Properties pro;

    public ReadConfig() {
        File src = new File("./configuration/config.properties");
        try {
            FileInputStream fis = new FileInputStream(src);
            pro =new Properties();
            pro.load(fis);

        }catch(Exception e) {
            System.out.println("Exception is " + e.getMessage());
        }
    }

    public String getApplicationURL() {
        String url = pro.getProperty("sauce_App");
        return url;
    }
    public String getusername() {
        String uname = pro.getProperty("username");
        return uname;
    }
    public String getpassword() {
        String pass = pro.getProperty("password");
        return pass;
    }

    public String getCdriver() {
        String cdriver = pro.getProperty("Chrome");
        return cdriver;
    }
    public String getFdriver() {
        String fdriver = pro.getProperty("Firefox");
        return fdriver;
    }
    public String getIEdriver() {
        String iedriver = pro.getProperty("iEexplorer");
        return iedriver;
    }
    public String getEdgeDriver(){
        String edge = pro.getProperty("edge");
        return edge;
    }
    public String getLogPath(){
        String logpath = pro.getProperty("logpath");
        return logpath;
    }
    public String getclinicURL(){
        String clinicpath = pro.getProperty("clinic");
        return clinicpath;
    }
    public String getClinicUsername(){
        String username = pro.getProperty("clinic_username");
        return username;
    }
    public String getClinicpassword(){
        String password = pro.getProperty("clinic_password");
        return password;
    }

    public String LoadLearningURL(){
        String learningURL = pro.getProperty("Learning");
        return learningURL;
    }
    public static String gethost(){
        String getHost = pro.getProperty("host");
        return getHost;
    }
    public String getMysqlUser(){
        String getmysqluser = pro.getProperty("My_sqluser");
        return getmysqluser;
    }
    public String getMysqlPass(){
        String getMysqlpass = pro.getProperty("My_sqlpass");
        return getMysqlpass;
    }
    public String getMysqlPort(){
        String getMysqlPort = pro.getProperty("port");
        return getMysqlPort;
    }
    public String getMysqlDB(){
        String getMysqldb = pro.getProperty("DB");
        return getMysqldb;
    }
    public String getMysqlTable(){
        String getMysqltable = pro.getProperty("Tablee");
        return getMysqltable;
    }
}