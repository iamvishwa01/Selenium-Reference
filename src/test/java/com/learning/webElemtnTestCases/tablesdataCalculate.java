package com.learning.webElemtnTestCases;

import com.learning.utility.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class tablesdataCalculate extends BaseClass {

    @Test
            public void calculateTabledata(){
        int sum=0;
        driver.get("http://www.cricbuzz.com/live-cricket-scorecard/18970/pak-vs-sl-2nd-t20i-pakistan-v-sri-lanka-in-uae-2017");//url

        WebElement table=driver.findElement(By.cssSelector("div[class='cb-col cb-col-100 cb-ltst-wgt-hdr']"));//limiting the scope of the driver only to the table
        int rowcount=	table.findElements(By.cssSelector("cb-col cb-col-100 cb-scrd-itms")).size(); //getting the row count
        int count=table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] div:nth-child(3)")).size();

        for(int i=0;i<count-2;i++)
        {
            String value=table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] div:nth-child(3)")).get(i).getText();
            int valueinteger=  Integer.parseInt(value);
            sum=sum+valueinteger;//103
        }
        //System.out.println(sum);

        String Extras=driver.findElement(By.xpath("//div[text()='Extras']/following-sibling::div")).getText();
        int extrasValue=Integer.parseInt(Extras);
        int TotalSumValue=sum+extrasValue;
        System.out.println(TotalSumValue);


        String ActualTotal=driver.findElement(By.xpath("//div[text()='Total']/following-sibling::div")).getText();
        int ActualTotalVAlue=Integer.parseInt(ActualTotal);
        if(ActualTotalVAlue==TotalSumValue)
        {
            System.out.println("Count Matches");
        }
        else
        {
            System.out.println("count fails");
        }
    }
    }




