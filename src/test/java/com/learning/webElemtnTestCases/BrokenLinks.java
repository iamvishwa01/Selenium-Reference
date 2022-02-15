package com.learning.webElemtnTestCases;

import com.learning.utility.BaseClass;
import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;
import java.net.HttpURLConnection;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Iterator;
import java.util.List;


import static com.learning.utility.LogUtility.info;

public class BrokenLinks extends BaseClass {

    //broken url
    // get the url into a string variable
    // java method to get the status code if status code is 200 then its pass otherwise fail


//@Test
    public void brokenLinks() throws IOException {
    driver.get("https://rahulshettyacademy.com/AutomationPractice/");

   String url= driver.findElement(By.xpath("//a[@class='blinkingText']")).getAttribute("href");
    HttpURLConnection conn  =  (HttpURLConnection) new URL(url).openConnection();
    conn.setRequestMethod("HEAD");
    conn.connect();
   int responseCode = conn.getResponseCode();

    if(responseCode==200){
        Assert.assertTrue(true);
        info("Link accessible. status code is" +" "+ responseCode);
    }else{
        Assert.assertTrue(false);
        info("Link accessible status code is" +" "+ responseCode);
    }
}

@Test
    public void allBrokenlinks() throws IOException {
    String url = "";
    HttpURLConnection huc = null;
    int respCode = 200;
    String homePage = "https://rahulshettyacademy.com/AutomationPractice/";
    driver.get("https://rahulshettyacademy.com/AutomationPractice/");
    List<WebElement> links = driver.findElements(By.cssSelector("li[class='gf-li']"));

    Iterator<WebElement> it = links.iterator();

    while(it.hasNext()){

        url = it.next().getAttribute("href");

        System.out.println(url);

        if(url == null || url.isEmpty()){
            System.out.println("URL is either not configured for anchor tag or it is empty");
            continue;
        }

        if(!url.startsWith(homePage)){
            System.out.println("URL belongs to another domain, skipping it.");
            continue;
        }

        try {
            huc = (HttpURLConnection)(new URL(url).openConnection());

            huc.setRequestMethod("HEAD");

            huc.connect();

            respCode = huc.getResponseCode();

            if(respCode >= 400){
                System.out.println(url+" is a broken link");
            }
            else{
                System.out.println(url+" is a valid link");
            }

        } catch (MalformedURLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

}



}
