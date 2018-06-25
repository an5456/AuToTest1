package com.test.demo.base;

import com.test.demo.lianxi.baseDriver;
import org.testng.ITestResult;
import org.testng.TestListenerAdapter;


public class testngListenerScreenShot extends TestListenerAdapter {
    public void onTestSuccess(ITestResult var1) {
        super.onTestSuccess(var1);
    }
    public void onTestFailure(ITestResult var1) {
        super.onTestFailure(var1);
        this.takeScreenShot(var1);
    }
    public void takeScreenShot(ITestResult var1){
        com.test.demo.lianxi.baseDriver b=(baseDriver)var1.getInstance();
        b.takeScreenShot();
    }
}
