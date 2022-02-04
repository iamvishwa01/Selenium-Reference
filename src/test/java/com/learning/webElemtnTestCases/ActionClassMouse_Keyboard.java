package com.learning.webElemtnTestCases;

import com.learning.utility.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class ActionClassMouse_Keyboard extends BaseClass {
    Actions a;
    @Test
    public void mouseHover(){
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        a = new Actions(driver);
        //mouse hover
        a.moveToElement(driver.findElement(By.id("mousehover"))).build().perform();
        //enter text in upppercase and clicking
        a.moveToElement(driver.findElement(By.name("enter-name"))).click().keyDown(Keys.SHIFT).sendKeys("test").doubleClick().build().perform();
        a.moveToElement(driver.findElement(By.name("enter-name"))).contextClick().build().perform();
    }



}
