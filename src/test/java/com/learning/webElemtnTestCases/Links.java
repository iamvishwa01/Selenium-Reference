package com.learning.webElemtnTestCases;

import com.learning.utility.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.Iterator;
import java.util.Set;

import static com.learning.utility.LogUtility.info;

public class Links extends BaseClass {
    @Test
    public void AgetTotalLinksCount(){
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        info(String.valueOf(driver.findElements(By.tagName("a")).size())); //getting count of all the links
    }
    @Test
    public void BallLinkFooter() throws InterruptedException {
        WebElement footer = driver.findElement(By.id("gf-BIG")); //limiting the scope of webdriver to specific webelement
        info(String.valueOf(footer.findElements(By.tagName("a")).size()));
        ///getting first left columnt footers

        WebElement leftFooter = footer.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
        info(String.valueOf(leftFooter.findElements(By.tagName("a")).size()));

        for (int i =1;i<leftFooter.findElements(By.tagName("a")).size();i++){ //looping all the links and using ctrl to click on the links
           String cntrlClick = Keys.chord(Keys.CONTROL,Keys.ENTER);
           leftFooter.findElements(By.tagName("a")).get(i).sendKeys(cntrlClick);
           Thread.sleep(4000);

            }
        Set<String> tabs = driver.getWindowHandles(); //getting all the windows handles in tabs variable which is set and set does not contain duplicate values
        Iterator <String> it = tabs.iterator(); //iterator to iterate all the tabs using while loop
        while (it.hasNext()){
            driver.switchTo().window(it.next());
            info(driver.getTitle());
            driver.close();
        }


    }


}
