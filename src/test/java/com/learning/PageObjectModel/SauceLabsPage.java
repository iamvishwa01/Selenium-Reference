package com.learning.PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class SauceLabsPage {
    WebDriver driver;

    public SauceLabsPage(WebDriver driver) {
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }
    //##################simple pom #############
//    By username = By.name("user-name");
//    By password = By.name("password");
//    By login = By.name("login-button");

    //########################Pagefactory type ########################

  //  @FindBy(name = "user-name") WebElement username;
    @FindBy(how = How.NAME, using = "user-name") WebElement username;
    @FindBy(how = How.NAME, using = "password") WebElement password;
    @FindBy(how = How.NAME, using = "login-button") WebElement login;
    @FindBy(id = "react-burger-menu-btn")WebElement menu;
    @FindBy(id = "logout_sidebar_link") WebElement logout;
    public WebElement getUsername(){
        return  username;
    }
    public WebElement getPassword(){
        return password;
    }
    public WebElement ClickLogin(){
        return login;
    }
    public WebElement clickMenu(){return menu;}
    public WebElement CLickLogout(){return logout;}
}
