package com.learning.webElemtnTestCases;

import com.learning.utility.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

public class AutoSUggestiveDropDown extends BaseClass {


    @Test
            public void autosuggestiveDropdown() {


        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        driver.findElement(By.id("autocomplete")).sendKeys("IND");
        List<WebElement> option = driver.findElements(By.xpath("//li[@class='ui-menu-item']/div"));
        for(WebElement options : option){
            if(options.getText().equalsIgnoreCase("India")){
               options.click();
            }
        }
    }
}
