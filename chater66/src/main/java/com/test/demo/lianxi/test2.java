package com.test.demo.lianxi;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
@Listeners({testngListenerScreenShot.class})
public class test2 extends baseDriver{

    @Test
    public void InitDriver() {
        //System.setProperty("webdriver.chrome.driver", "D:\\wps\\selenium-2.42.2\\chromedriver.exe");
        //driver=new ChromeDriver();
        driver.get("https://www.imooc.com/user/newlogin/from_url");
    }
    @Test(dependsOnMethods = {"InitDriver"})
    public void login1(String username,String password) throws InterruptedException {
        this.InitDriver();
        WebElement user=driver.findElement(By.name("email"));
        user.isDisplayed();
        WebElement userpass=driver.findElement(By.name("password"));
        userpass.isDisplayed();
        WebElement button=driver.findElement(By.className("moco-btn"));
        button.isDisplayed();
        user.sendKeys(username);
        userpass.sendKeys(password);
        //this.button1();
        button.click();
        Thread.sleep(2000);
        //this.takeScreenShot();
        driver.close();
    }

    /*public static void main(String[] args) throws InterruptedException {
        test2 action=new test2();
        HashMap<String,String> hashMap=new HashMap<String, String>();
        hashMap.put("17729597958","andong527011764");
        hashMap.put("18513199586","111111");
        Iterator as=hashMap.entrySet().iterator();
        while (as.hasNext()){
            Map.Entry entry=(Map.Entry)as.next();
            String username=entry.getKey().toString();
            String password=entry.getValue().toString();
            action.login1(username,password);

        }
    }*/
}
