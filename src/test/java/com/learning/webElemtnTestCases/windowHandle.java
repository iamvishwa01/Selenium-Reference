package com.learning.webElemtnTestCases;

import com.learning.utility.BaseClass;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import java.util.Iterator;
import java.util.Set;

import static com.learning.utility.LogUtility.info;

public class windowHandle extends BaseClass {

@Test

    public void windowhandle(){
    driver.get("https://rahulshettyacademy.com/AutomationPractice/");

        driver.findElement(By.id("openwindow")).click();
    info(driver.getTitle());
        Set<String> id = driver.getWindowHandles();
       Iterator<String> it = id.iterator();
        String parentWindow = it.next();
        String child = it.next();
        driver.switchTo().window(child);
        info(driver.getTitle());
        driver.close();
        driver.switchTo().window(parentWindow);
    info(driver.getTitle());
}


}
