package handle;

import base.BaseDriver;
import base1.loginPage;

import java.io.IOException;

public class loginPageHandle {
   // public BaseDriver driver;
    public loginPage lp;

    public loginPageHandle(BaseDriver driver) {
        //this.driver = driver;
        lp = new loginPage(driver);
    }

    /*输入用户名
     * */
    public void senkeysUsername(String username) throws IOException {
        lp.sendKeys(lp.getUsermameElement(), username);
    }

    /*输入密码
     * */
    public void sendkeysPassword(String password) throws IOException {
        lp.sendKeys(lp.getPasswordElement(), password);
    }

    /*点击登陆
     * */
    public void clickLoginButton() throws IOException {
        lp.click(lp.getLoginButtonElement());
    }

    /*判断输入框是否显示
     * */
    public boolean assertUsernameBox() throws IOException {
       return lp.assertElementDisplay(lp.getUsermameElement());
    }

}
