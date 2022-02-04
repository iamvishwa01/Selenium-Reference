package com.learning.pages;


import com.learning.utility.ReadConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SauceLabs_Login {

    WebDriver driver;
    ReadConfig readConfig = new ReadConfig();
    public SauceLabs_Login(WebDriver driver){
        this.driver=driver;
    }

    By email = By.name("user-name");
    By pass = By.name("password");
    By click = By.id("login-button");
    By menu = By.id("react-burger-menu-btn");
    By logout = By.id("logout_sidebar_link");
//    public void setUsername(){
//        driver.findElement(email).sendKeys(readConfig.getusername());
//    }
//    public void setPassword(){
//        driver.findElement(pass).sendKeys(readConfig.getpassword());
//    }

public void setUsername(String user){
    driver.findElement(email).sendKeys(user);
}
    public void setPassword(String password){
    driver.findElement(pass).sendKeys(password);
    }
    public void clickLogin(){driver.findElement(click).click();}
    public void clickMenu(){driver.findElement(menu).click();}
    public void CLickLogout(){driver.findElement(logout).click();}

}
