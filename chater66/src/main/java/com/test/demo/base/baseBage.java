package com.test.demo.base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class baseBage {
    public baseDriver driver;
    public baseBage(baseDriver driver){
        this.driver=driver;
    }
    /*定位元素的方法
    * */
    public WebElement element(By by){
        WebElement el= driver.element(by);
        return el;
    }
    /*封装输入
    * */
    public void sendkeys(WebElement element,String username){
        element.sendKeys(username);
    }
    /*
    * 封装点击*/
    public void click(WebElement element){
        element.click();
    }
    /*判断元素是否显示
    * */
    public boolean assertElementDisplay(WebElement element){
        return element.isDisplayed();
    }
}
