package com.test.demo.bussiness;

import com.test.demo.base.baseDriver;
import com.test.demo.handle.loginpageHandle;

import java.io.IOException;


public class loginPro {
    public loginpageHandle lph;
    public loginPro(baseDriver driver){
        lph=new loginpageHandle(driver);
    }
    public void loginBuss(String username,String password) throws IOException {
        if(lph.aassertloginBoxDisplay()){
            lph.sendkyesUsername(username);
            lph.sendkeysPassword(password);
            lph.clickLoginButton();
        }
    }


    }

