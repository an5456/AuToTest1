package com.test.demo.base;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;



public class baseDriver {
    public WebDriver driver;
    public baseDriver(String browser){
        selectDriver select=new selectDriver();
        this.driver=select.driverName(browser);
    }
    /*封装get
    * */
    public void get(String url){
        driver.get(url);
    }
    /*封装element
    * */
    public WebElement element(By by){
       WebElement el=driver.findElement(by);
       return el;
    }

}
