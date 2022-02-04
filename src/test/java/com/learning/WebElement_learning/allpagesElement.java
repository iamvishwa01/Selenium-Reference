package com.learning.WebElement_learning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class allpagesElement {

    WebDriver driver;

    public allpagesElement(WebDriver driver){
        this.driver=driver;
    }
    By headingOFthePage = By.xpath("//h1[contains(text(),'Practice Page')]");
    By alllinks = By.tagName("a");
    By headermenu = By.tagName("//div[@style='text-align: right;margin-top: -30px;']/button");
    By tableRow = By.xpath("//table[@name='courses']/tbody/tr");
    By TableColumn = By.xpath("//table[@name='courses']/tbody/tr/th");
    By tableData = By.xpath("//table[@name='courses']/tbody/tr/td");
    public String getHeading(){
        String heading = driver.findElement(headingOFthePage).getText();
        return heading;
    }

public List<WebElement> findAlllinks(){
    List<WebElement> allLinks = driver.findElements(alllinks);
  return  allLinks;
}

public List<WebElement> allMenu(){
        List<WebElement> almenu = driver.findElements(headermenu);
        return  almenu;
}
public WebElement getTableData(){
        WebElement data = (WebElement) driver.findElements(tableData);
        return data;
}
public int getRowcount(){
  int row = driver.findElements(tableRow).size();
        return row;
}
    public int getRow(){
        int row = driver.findElements(tableRow).size();
        return row;
    }
public int getColumntCount(){
        int column = driver.findElements(TableColumn).size();
        return column;
}
    public int getColumnt(){
        int column = driver.findElements(TableColumn).size();
        return column;
    }
}
