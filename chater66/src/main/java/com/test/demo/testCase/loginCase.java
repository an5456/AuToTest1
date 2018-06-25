package com.test.demo.testCase;

import com.test.demo.base.baseDriver;
import com.test.demo.base.caseBase;
import com.test.demo.bussiness.loginPro;
import org.testng.annotations.Test;
import java.io.IOException;

public class loginCase extends caseBase {
    public baseDriver driver;
    public loginPro lp;
    public loginCase(){
        this.driver=InitDriver("chrome");
        lp=new loginPro(driver);
    }
    @Test
    public void imoocLoginPageUrl(){
        driver.get("https://www.imooc.com/user/newlogin/from_url");
    }
    @Test(dependsOnMethods = {"imoocLoginPageUrl"})
    public void loginScript() throws IOException {
        lp.loginBuss("17729597958","andong527011764");
    }
}
