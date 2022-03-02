package com.learning.PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class SauceHomePage {
    WebDriver driver;
    // find add to cart
    @FindBy(how = How.XPATH, using = "//button[@id='add-to-cart-sauce-labs-backpack']")
    @CacheLookup
    WebElement addtocart;
    @FindBy(how = How.XPATH, using = "//div[@class='shopping_cart_container']")
    @CacheLookup
    WebElement clickoncart;
    @FindBy(how = How.XPATH, using = "//button[@id='checkout']")
    @CacheLookup
    WebElement Checkout;
    @FindBy(how = How.XPATH, using = "//input[@id='first-name']")
    @CacheLookup
    WebElement FirstName;
    @FindBy(how = How.XPATH, using = "//input[@id='last-name']")
    @CacheLookup
    WebElement LastName;
    @FindBy(how = How.XPATH, using = "//input[@id='postal-code']")
    @CacheLookup
    WebElement PostalCode;
    @FindBy(how = How.XPATH, using = "//input[@id='continue']")
    @CacheLookup
    WebElement PlaceOrder;
    @FindBy(how = How.XPATH, using = "//button[@id='finish']")
    @CacheLookup
    WebElement Finishorder;
    @FindBy(how = How.XPATH, using = "//h2[@class='complete-header']")
    @CacheLookup
    WebElement verifyorder;
    @FindBy(how = How.XPATH, using = "//button[@id='back-to-products']")
    @CacheLookup
    WebElement BackTohome;

    public SauceHomePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }


    public WebElement addtoCart() {
        return addtocart;
    }

    public WebElement clickoncart() {
        return clickoncart;
    }

    public WebElement checkout() {
        return Checkout;
    }

    public WebElement fname() {
        return FirstName;
    }

    public WebElement lname() {
        return LastName;
    }

    public WebElement zipcode() {
        return PostalCode;
    }

    public WebElement placeorder() {
        return PlaceOrder;
    }

    public WebElement Finishorder() {
        return Finishorder;
    }

    public WebElement verifyorder() {
        return verifyorder;
    }

    public WebElement BackToHome() {
        return BackTohome;
    }

}
