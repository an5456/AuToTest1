package base1;

import base.BaseDriver;
import base.BasePage;
import base.getByLocal;
import org.openqa.selenium.WebElement;

import java.io.IOException;

public class loginPage extends BasePage {
    public loginPage(BaseDriver driver){

        super(driver);
    }
    /*获取用户名输入框
    * */
    public WebElement getUsermameElement() throws IOException {
       return element(getByLocal.byStr("username"));
    }
    /*获取密码输入框
    * */
    public WebElement getPasswordElement() throws IOException {
        return element(getByLocal.byStr("userpass"));
    }
    /*获取登陆按钮
    * */
    public WebElement getLoginButtonElement() throws IOException {
        return element(getByLocal.byStr("button"));
    }

}
