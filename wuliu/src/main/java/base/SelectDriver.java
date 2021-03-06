package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SelectDriver {
    public WebDriver driverName(String browser){
        if(browser.equalsIgnoreCase("firefox")){
            System.setProperty("webdriver.firefox.marionette", "D:\\wps\\selenium-2.42.2\\geckodriver.exe");
            return new FirefoxDriver();
        }else {
            System.setProperty("webdriver.chrome.driver", "D:\\wps\\selenium-2.42.2\\chromedriver.exe");
            return new ChromeDriver();
        }

    }
}
