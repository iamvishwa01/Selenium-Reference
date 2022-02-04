package com.learning.testcases;

import com.aventstack.extentreports.ExtentReports;
import com.learning.pages.SauceLabs_Login;
import com.learning.utility.BaseClass;
import com.learning.utility.ReadConfig;
import com.learning.utility.XLUtils;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.IOException;

import static com.learning.utility.LogUtility.*;

public class dataDriver_SauceLabs extends BaseClass {


    static String excelFilePath =BaseClass.TestData_FILEPATH+TestData_FILENAME;
    ReadConfig readConfig = new ReadConfig();

        @Test(dataProvider="LoginData")
        public void loginDDTest(String user,String pwd) throws InterruptedException, IOException
        {
            extentTest = extent.createTest("Validate saucelabs Login with multiple input");
            startTestCase("LoginSauceLabs");
            driver.get(readConfig.getApplicationURL());
             sp=new SauceLabs_Login(driver);
             sp.setUsername(user);
            extentTest.info("user name provided");
            info("user name provided");
            sp.setPassword(pwd);
            info("password provided");
            extentTest.info("password provided");
            sp.clickLogin();
            info("Login Button Clicked");
            extentTest.info("Password Button clicked");

            if(driver.getCurrentUrl().equals("https://www.saucedemo.com/")) {
                error("Login failed");
                Assert.assertTrue(false);
            }else {
                info("login success");
                Assert.assertTrue(true);
               // XLUtils.setCellData(System.getProperty("user.dir")+"/TestData/TestData.xlsx","Sheet1",5,0,"Passed");
            sp.clickMenu();
                info("menu button clicked");
            sp.CLickLogout();
                info("Logout button clicked");
            if(driver.getCurrentUrl().equals(readConfig.getApplicationURL())){
                info("Logout Success");
                extentTest.info("Logout Success");
                Assert.assertTrue(true);
            }else {
                error("Logout error");
                extentTest.info("Logout error");
                Assert.assertTrue(false);
            }
            }

        }


    @DataProvider(name="LoginData")
    String [][] getData() throws IOException
    {
        //String path=TestData_FILEPATH+TestData_FILENAME;
        String path=System.getProperty("user.dir")+"/TestData/TestData.xlsx";
        int rownum= XLUtils.getRowCount(path, "Sheet1");
        int colcount=XLUtils.getCellCount(path,"Sheet1",1);

        String logindata[][]=new String[rownum][colcount];

        for(int i=1;i<=rownum;i++)
        {
            for(int j=0;j<colcount;j++)
            {
                logindata[i-1][j]=XLUtils.getCellData(path,"Sheet1", i,j);//1 0
            }

        }
        return logindata;
    }

    }



