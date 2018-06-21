package base1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class basePage {
    public baseDriver driver;
    public basePage (baseDriver driver){
        this.driver=driver;
    }
    /*封装获取element
    * */
    public WebElement element(By by){
      WebElement  ele=driver.element(by);
      return ele;
    }
    /*封装点击操作
    * */
    public void click(WebElement element){
        element.click();
    }
    /*封装输入操作
    * */
    public void sendkeys(WebElement element,String key){
        element.sendKeys(key);
    }
    /*判断元素是否显示
    * */
    public boolean assertElementDisplay(WebElement element){
        return element.isDisplayed();
    }
}
