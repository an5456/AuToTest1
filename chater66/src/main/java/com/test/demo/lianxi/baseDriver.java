package com.test.demo.lianxi;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;

public class baseDriver {
   public WebDriver driver;
    public  baseDriver() {
        System.setProperty("webdriver.chrome.driver", "D:\\wps\\selenium-2.42.2\\chromedriver.exe");
        driver = new ChromeDriver();
    }
    /*截图
     * */
    public void takeScreenShot(){
        long timeStamp = System.currentTimeMillis();
        String path=String.valueOf(timeStamp);
        // SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        // String sd = sdf.format(new Date(Long.parseLong(String.valueOf(timeStamp))));
        //System.out.println(sd);
        String systemPath=System.getProperty("user.dir");
        path=path+".png";
        String screenPath=systemPath+"/"+path;
        File screen=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        try {
            FileUtils.copyFile(screen,new File(screenPath));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
