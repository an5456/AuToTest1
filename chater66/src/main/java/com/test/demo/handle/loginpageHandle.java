package com.test.demo.handle;

import com.test.demo.base.baseDriver;
import com.test.demo.page.loginPage;
import org.openqa.selenium.WebElement;

import java.io.IOException;

public class loginpageHandle {
    public loginPage lp;
    public loginpageHandle(baseDriver driver){
        lp=new loginPage(driver);
    }
    /*输入用户名
    * */
    public void sendkyesUsername(String username) throws IOException {
        lp.sendkeys(lp.getSendkeysBoxElement(),username);
    }
    /*输入密码
    * */
    public void sendkeysPassword(String password) throws IOException {
        lp.sendkeys(lp.getPasswordBoxElement(),password);
    }
    /*点击登陆按钮
    * */
    public void clickLoginButton() throws IOException {
        lp.click(lp.getLoginButtonElement());
    }
    /*判断输入框是否显示
    * */
    public boolean aassertloginBoxDisplay() throws IOException {
        return lp.getSendkeysBoxElement().isDisplayed();
    }
}
