package com.learning.webElemtnTestCases;

import com.learning.utility.BaseClass;
import org.apache.commons.io.input.TeeInputStream;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

import static com.learning.utility.LogUtility.info;

public class checkboxes extends BaseClass {


    @Test //getting count of the checkboxes present on the page
    public void checkboxes(){
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        int checkboxx = driver.findElements(By.xpath("//input[@type='checkbox']")).size();
        info(String.valueOf(checkboxx));
        info(driver.getTitle());
    }

    @Test //selecting multiple checkbox
    public void selectallcheck(){
      List<WebElement> checkboxx =driver.findElements(By.xpath("//input[@type='checkbox']"));
       int size = checkboxx.size();
       for(int i = 0; i <size;i++){
           System.out.println(checkboxx.get(i).isSelected());
           checkboxx.get(i).click();
           System.out.println(checkboxx.get(i).isSelected());
       }
    }

}
