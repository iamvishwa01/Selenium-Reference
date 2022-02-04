package com.learning.webElemtnTestCases;

import com.learning.utility.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class dragDrop extends BaseClass {

    @Test
    public void dragdrop(){
        driver.get("https://jqueryui.com/droppable/");
        driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='demo-frame']")));//entering in frame
        WebElement source = driver.findElement(By.id("draggable"));
        WebElement target = driver.findElement(By.id("droppable"));
        Actions a = new Actions(driver);
        a.dragAndDrop(source,target).build().perform();
        driver.switchTo().defaultContent();//coming to normal window or outside frame
    }


}
