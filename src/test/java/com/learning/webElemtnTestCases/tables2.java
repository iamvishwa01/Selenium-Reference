package com.learning.webElemtnTestCases;

import com.learning.utility.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

import static com.learning.utility.LogUtility.info;

public class tables2 extends BaseClass {

    @Test
    public void table2(){
        driver.get("https://www.w3schools.com/html/html_tables.asp");
       int tableRow = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr")).size();
       info(String.valueOf(tableRow));
       info("table heading");
       int tableHeading = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr/th")).size();
       info(String.valueOf(tableHeading));
       for(int i = 2; i<tableRow;i++){
           for(int j =1;j<=tableHeading;j++){
               System.out.print(driver.findElement(By.xpath("//table[@id='customers']/tbody/tr["+i+"]/td["+j+"]")).getText());
           }
           System.out.println(" ");
       }
    }

}
