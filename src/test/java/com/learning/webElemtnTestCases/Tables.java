package com.learning.webElemtnTestCases;

import com.learning.utility.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import static com.learning.utility.LogUtility.info;

public class Tables extends BaseClass {
    @Test
    public void TotalRow(){
        driver.get("https://www.cricbuzz.com/live-cricket-scorecard/40981/afgu19-vs-ausu19-3rd-place-playoff-icc-under-19-world-cup-2022");
        //div[@id='innings_1']/div[1]/div[3]/div[3]
     WebElement table =  driver.findElement(By.cssSelector("//div[class='cb-col cb-col-100 cb-ltst-wgt-hdr']"));
        int row = table.findElements(By.cssSelector("cb-col cb-col-100 cb-scrd-itms")).size();
       // int count = table.findElements(By.cssSelector("//div[class='cb-col cb-col-100 cb-scrd-itms'] div:nth-child(3)")).size();
        info(String.valueOf(row));
    }

}
