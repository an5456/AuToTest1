package base;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BasePage {
    public BaseDriver driver;
    public BasePage(BaseDriver driver){

        this.driver=driver;
    }
    /*封装element
    * */
    public WebElement element(By by){
     WebElement  ele= driver.element(by);
     return ele;
    }
    /*封装点击
    * */
    public void click(WebElement element){
        if(element!=null){
            element.click();
        }else {
            System.out.println("你找的元素不存在");
        }
    }
    /*封装输入
    * */
    public void sendKeys(WebElement element,String key){
        if(element!=null){
            element.sendKeys(key);
        }else {
            System.out.println("元素不存在");
        }
    }
    /*判断元素是否显示
    * */
    public boolean assertElementDisplay(WebElement element){
        return element.isDisplayed();
    }
}
