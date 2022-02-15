package com.learning.webElemtnTestCases;

import com.learning.utility.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

import static com.learning.utility.LogUtility.info;

public class datePicker extends BaseClass {
    //################selecting date from the current selected month#######################
    @Test(priority = 1)
    public void test() throws InterruptedException {
        driver.get("https://www.makemytrip.com/");
        driver.findElement(By.xpath("//li[@data-cy='account']")).click();
        Thread.sleep(2000);
//        driver.findElement(By.xpath("//label[@for='departure']")).click();
//        Thread.sleep(2000);

//    List<WebElement> dates=     driver.findElements(By.xpath("(//div[@class='DayPicker-Day'])/div/p[1]"));
//        int count = driver.findElements(By.xpath("(//div[@class='DayPicker-Day'])/div/p[1]")).size();
//        for(int i=0; i<count;i++){
//            String text = dates.get(i).getText();
//            if(text.equalsIgnoreCase("9")){
//                dates.get(i).click();
//                break;
//            }
//        }

        //################selecting date from the Future month#######################
        driver.findElement(By.xpath("//label[@for='departure']")).click();
        Thread.sleep(2000);
        while (!driver.findElement(By.xpath("(//div[@class='DayPicker-Caption'])[1]/div")).getText().contains("December")){
            driver.findElement(By.xpath("//div[@class='DayPicker-NavBar']/span[2]")).click();
    }
        List<WebElement> dates=     driver.findElements(By.xpath("(//div[@class='DayPicker-Day'])/div/p[1]"));
        int count = driver.findElements(By.xpath("(//div[@class='DayPicker-Day'])/div/p[1]")).size();
        for(int i=0; i<count;i++){
            String text = dates.get(i).getText();
            if(text.equalsIgnoreCase("26")){
                dates.get(i).click();
                break;
            }
        }



    }

}
