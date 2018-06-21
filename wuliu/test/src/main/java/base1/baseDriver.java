package base1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class baseDriver {
    WebDriver driver;
    public void InitDriver(String browser){
        selectDriver select=new selectDriver();
        this.driver=select.driverName("browser");
    }
    /*封装element
    * */
    public WebElement element(By by){
      WebElement el= driver.findElement(by);
      return el;
    }
    /*封装get
    * */
    public void get(String url){
        driver.get(url);
    }

}
