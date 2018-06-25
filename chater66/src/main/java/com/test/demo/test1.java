package com.test.demo;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.List;
import java.util.Set;

public class test1 {
    public WebDriver driver;
    public String windowsHandle;
    @Test
    public void InitDriver() {
        System.setProperty("webdriver.chrome.driver", "D:\\wps\\selenium-2.42.2\\chromedriver.exe");
       driver=new ChromeDriver();
       driver.get("https://www.imooc.com/user/newlogin/from_url");
    }
    /*成功登陆
    * */
    @Test(dependsOnMethods = {"InitDriver"})
    public void login() throws InterruptedException, IOException {
        WebElement user=driver.findElement(By.name("email"));
        user.isDisplayed();
        WebElement userpass=driver.findElement(By.name("password"));
        userpass.isDisplayed();
        WebElement button=driver.findElement(By.className("moco-btn"));
        button.isDisplayed();
        user.sendKeys("17729597958");
        userpass.sendKeys("andong527011764");
        //this.button1();
        button.click();
        Thread.sleep(2000);
        this.Index();
        this.switchHandle();
        //this.iframeSwitch();
        //this.downSelectBox();
        //this.upImg();
        //this.upHeader1();
        //this.upHeader();
        //this.jscript();
       // this.eqName();
        //this.readBox();
    }
    /*去掉遮罩框
     * */

    public void jscript()  {

        String jscript="document.getElementById('J_GotoTop').style.display='none'";
        JavascriptExecutor js=(JavascriptExecutor) driver;
        js.executeScript(jscript);
    }
    /*判断是否是登陆的用户
     * */
    public void eqName(){
        WebElement header=driver.findElement(By.id("header-avator"));
        Actions actions=new Actions(driver);
        actions.moveToElement(header).perform();
        String  span=driver.findElement(By.className("name")).getText();
        System.out.println(span);
        if(span.equals("慕勒2472625")){
            System.out.println("登陆成功");
        }else{
            System.out.println("登陆失败");
        }
    }
    /*操作单选框
    * */
    public void readBox(){
        driver.get("https://www.imooc.com/user/setprofile");
        driver.findElement(By.className("pull-right")).click();
        WebElement moco=driver.findElement(By.xpath("//*[@id='profile']/div[4]/div"));
        List<WebElement> input=moco.findElements(By.tagName("input"));
        for(WebElement ele:input){
            boolean  ab= ele.isSelected();
            if(ab==true){
                continue;
            }else {
                ele.click();
                break;
            }
        }
    }
    /*隐藏button
    * */
    public void button1(){
        String jscript="document.getElementsByClassName('moco-btn ')[0].style.display='none'";
        JavascriptExecutor js=(JavascriptExecutor)driver;
        js.executeScript(jscript);
    }
    /*
    * 提交form表单*/
    public void form(){
        driver.get("xxxxxx");
        driver.findElement(By.id("signup-form")).submit();
    }
    /*上传头像通过js修改css
    * */
    public void upHeader(){
        driver.get("https://www.imooc.com/user/setbindsns");
        String jscript="document.getElementsByClassName('update-avator')[0].style.bottom='0'";
        JavascriptExecutor js=(JavascriptExecutor)driver;
        js.executeScript(jscript);
        this.sleep(2000);
        driver.findElement(By.className("js-avator-link")).click();
        driver.findElement(By.id("upload")).sendKeys("C:\\Users\\Thinkpad\\Desktop\\11.jpg");
    }
    /*上传头像通过鼠标悬停
    * */
    public void upHeader1(){
        driver.get("https://www.imooc.com/user/setbindsns");
       WebElement up= driver.findElement(By.className("update-avator"));
       Actions actions=new Actions(driver);
       actions.moveToElement(up).perform();
        driver.findElement(By.className("js-avator-link")).click();
        driver.findElement(By.id("upload")).sendKeys("C:\\Users\\Thinkpad\\Desktop\\11.jpg");
    }
    /*通过AuTOiT上传头像
    * */
    public void upImg() throws IOException {
        driver.get("https://www.imooc.com/user/setbindsns");
        WebElement up= driver.findElement(By.className("update-avator"));
        Actions actions=new Actions(driver);
        actions.moveToElement(up).perform();
        driver.findElement(By.className("js-avator-link")).click();
        driver.findElement(By.className("avator-btn-fake")).click();
        Runtime.getRuntime().exec("C:\\Program Files (x86)\\AutoIt3\\upHeader.exe");

    }
    /*下拉框操作
    * */
    public void downSelectBox(){
        driver.get("https://www.imooc.com/user/setprofile");
        driver.findElement(By.className("pull-right ")).click();
        this.sleep(1000);
        WebElement from=driver.findElement(By.id("profile"));
        WebElement job=from.findElement(By.id("job"));
        Select select=new Select(job);
       // select.selectByIndex(2);//通过Index定位下拉框信息
       // select.selectByValue("8");//通过Value定位下拉框信息
        select.selectByVisibleText("页面重构设计");//通过可见文本VisbleText定位下拉框信息

        List<WebElement> all=select.getAllSelectedOptions();
        for (WebElement el:all){
            String sl= el.getText();
            System.out.println(sl);
        }

        String sd=select.getFirstSelectedOption().getText();//获取当前所选元素值
        System.out.println(sd);

    }
    /*封装等待时间
    * */
    public void sleep(int sleeptime){
        try {
            Thread.sleep(sleeptime);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    /*通过子父结点get(Index)定位元素
    * */
    public void Index(){
        driver.get("https://www.imooc.com/");
        WebElement menu=driver.findElement(By.className("menuContent"));
        List<WebElement> ad=menu.findElements(By.className("item"));
        Actions actions=new Actions(driver);
        actions.moveToElement(ad.get(0)).perform();
        windowsHandle=driver.getWindowHandle();
        driver.findElement(By.linkText("HTML/CSS")).click();
    }
    /*ifame窗口切换
    * */
    public void iframeSwitch(){
        driver.get("https://www.imooc.com/wiki/create");
        WebElement ue= driver.findElement(By.id("ueditor_0"));
        driver.switchTo().frame(ue);
        driver.findElement(By.tagName("body")).sendKeys("selenium自动化测试");
    }
    /*窗口切换
    * */

    public void switchHandle(){
       Set<String> ad= driver.getWindowHandles();
       for(String av:ad){
            if(av.equals(windowsHandle)){
                continue;
            }
           System.out.println(av);
            driver.switchTo().window(av);
       }
       driver.findElement(By.linkText("案例")).click();
    }
}