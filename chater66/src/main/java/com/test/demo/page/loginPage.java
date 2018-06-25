package com.test.demo.page;

import com.test.demo.base.baseBage;
import com.test.demo.base.baseDriver;
import org.openqa.selenium.WebElement;

import java.io.IOException;

public class loginPage extends baseBage {
    public loginPage(baseDriver driver){
        super(driver);
    }
    /*获取输入框定位元素
    * */
    public WebElement getSendkeysBoxElement() throws IOException {
       return element(getByLocal.getStr("username"));
    }
    /*获取密码框定位元素
    * */
    public WebElement getPasswordBoxElement() throws IOException {
        return element(getByLocal.getStr("userpass"));
    }
    /*获取登陆按钮的定位元素
    * */
    public WebElement getLoginButtonElement() throws IOException {
        return element(getByLocal.getStr("button"));
    }
}
