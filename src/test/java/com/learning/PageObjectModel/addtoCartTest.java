package com.learning.PageObjectModel;

import com.learning.utility.BaseClass;
import com.learning.utility.ReadConfig;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static com.learning.utility.LogUtility.error;
import static com.learning.utility.LogUtility.info;

public class addtoCartTest extends BaseClass  {

    @Test//(dataProvider="getData")
//    public void LoginSauce(String username,String password){
    public void LoginSauce(){

        driver.get("https://www.saucedemo.com/");
        SauceLabsPage sp = new SauceLabsPage(driver);
        sp.getUsername().sendKeys("standard_user");
        sp.getPassword().sendKeys("secret_sauce");
        sp.ClickLogin().click();
//        sp.clickMenu().click();
//        sp.CLickLogout().click();
    }
//    @DataProvider(name = "getData")
//    public Object[][] getData(){
//        Object [][] data = new Object[1][2];
//        data[0][0]="standard_user";
//        data[0][1]="secret_sauce";
////        //second row
////        data[1][0]="problem_user";
////        data[1][1]="secret_sauce";
//        return data;
//    }

    @Test(dataProvider = "getshippingData")
    public void purchase(String fname,String llname,String pin){

        SauceHomePage ad = new SauceHomePage(driver);
        ad.addtoCart().click();
        ad.clickoncart().click();
        info("clicked on cart");
        ad.checkout().click();
        info("clicked on checkout button");
        ad.fname().sendKeys(fname);
        ad.lname().sendKeys(llname);

        ad.zipcode().sendKeys(pin);
        info("fname,lname and postal code provided");
        ad.placeorder().click();
        info("placing order");
        ad.Finishorder().click();
        info("order placed");
        ad.verifyorder().click();
        info("Verifying order");
        String vali = ad.verifyorder().getText();
        if(vali.contains("THANK YOU FOR YOUR ORDER")) {
            info("order place successfully");
            ad.BackToHome().click();
            Assert.assertTrue(false);

        }else {
            error("Error in placing order");
            Assert.assertTrue(false);
        }
    }

//@Test
//public void Xlogout(){
//    SauceLabsPage sp = new SauceLabsPage(driver);
//    sp.clickMenu().click();
//    sp.CLickLogout().click();
//}


    @DataProvider(name = "getshippingData")
    public Object[][] getshippingData(){
        Object [][] data = new Object[2][3];
        data[0][0]="sujeet";
        data[0][1]="test";
        data[0][2]="401254";
//        //second row
        data[1][0]="shivam";
        data[1][1]="test1";
        data[1][2]="401324";
        return data;
    }



}
