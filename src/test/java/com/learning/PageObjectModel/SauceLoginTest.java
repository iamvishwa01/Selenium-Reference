package com.learning.PageObjectModel;

import com.learning.utility.BaseClass;
import org.testng.annotations.Test;

public class SauceLoginTest extends BaseClass {

    @Test
    public void LoginSauce(){
        driver.get("https://www.saucedemo.com/");
        SauceLabsPage sp = new SauceLabsPage(driver);
        sp.getUsername().sendKeys("standard_user");
        sp.getPassword().sendKeys("secret_sauce");
        sp.ClickLogin().click();
    }


}
