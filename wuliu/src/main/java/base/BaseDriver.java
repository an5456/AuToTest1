package base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BaseDriver {
    WebDriver driver;
    public BaseDriver(String browser){
       SelectDriver select=new SelectDriver();
      this.driver= select.driverName(browser);
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
