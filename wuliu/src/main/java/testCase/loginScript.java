package testCase;

import base.BaseDriver;
import base.CaseBase;
import base.getPro;
import business.loginPro;
import org.testng.annotations.Test;

import java.io.IOException;

public class loginScript extends CaseBase {
    public BaseDriver driver;
    public loginPro loginpro;
    public getPro gp;
    public loginScript() throws IOException {
        this.driver=InitDriver("chrome");
        loginpro=new loginPro(driver);
        //gp=new getPro("loginTest.properties");
    }@Test
    public void loginName(){

        driver.get("https://www.imooc.com/user/newlogin/from_url");
    }
    @Test(dependsOnMethods = {"loginName"})
    public void login() throws IOException {
        loginpro.testLogin("17729597958","andong527011764");
    }
}
