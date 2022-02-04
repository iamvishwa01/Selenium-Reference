package com.learning.webElemtnTestCases;

import com.learning.WebElement_learning.allpagesElement;
import com.learning.utility.BaseClass;
import com.learning.utility.ReadConfig;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.nio.file.WatchEvent;
import java.util.List;

import static com.learning.utility.LogUtility.info;

public class All_element extends BaseClass {
ReadConfig readConfig = new ReadConfig();

    @Test
    public void LoadURL(){

        driver.get(readConfig.LoadLearningURL());
        info("URL loaded");
        if(driver.getTitle().equals("Practice Page")){
            info("Title matched");
        }else {
            info("title does not match");
        }
    }



    @Test
    public void validateHeading(){
        al = new allpagesElement(driver);
    String headin = String.valueOf(al.getHeading());
    if(headin.equals("Practice Page")){
        info(headin);
        info(al.getHeading());
        info("heading validation completed");
    }else {
        info("heading validation failed");
    }
    }

    @Test
    public void getALlLinks(){
        al = new allpagesElement(driver);
        for(WebElement link  :al.findAlllinks()){
            System.out.println(link.getText() + " - " + link.getAttribute("href"));
        }

    }



}
