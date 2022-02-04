package com.learning.webElemtnTestCases;

import com.learning.utility.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import static com.learning.utility.LogUtility.error;
import static com.learning.utility.LogUtility.info;

public class staticDropDown extends BaseClass {


    @Test
    public void StaticDropdown() throws InterruptedException {
        driver.get("https://www.goindigo.in/");
        //simple while loop to click on element

        driver.findElement(By.name("passenger")).click();

        Thread.sleep(2000);
        int click1 = 1;
        while(click1 < 5){
            driver.findElement(By.xpath("(//button[@title='Up']/span[@class='icon-plus'])[1]")).click();
            click1++;
        }
        driver.findElement(By.xpath("//button[contains(text(),'Done')]")).click();
        String count11 = driver.findElement(By.cssSelector("input.counter.adult-pax")).getText();
        System.out.println(count11);
        String countpass = driver.findElement(By.xpath("//input[@name='passenger']")).getText();
        info(countpass);
        if(countpass.equals("5")){
            System.out.println("Matches");
            info("Matches");
            info(countpass);
        }else{
           info(countpass);
            error("match failed");
        }
    }

}
