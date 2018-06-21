package business;

import base.BaseDriver;
import handle.loginPageHandle;

import java.io.IOException;

public class loginPro {
    public loginPageHandle lph;
    public loginPro(BaseDriver driver){
        lph=new loginPageHandle(driver);
    }
    public void testLogin(String username,String password) throws IOException {
        if(lph.assertUsernameBox()){
            lph.senkeysUsername(username);
            lph.sendkeysPassword(password);
            lph.clickLoginButton();
        }else {
            System.out.println("页面元素不存在");
        }
    }
}
