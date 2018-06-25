package com.test.demo.base;

public class caseBase  {
    public baseDriver InitDriver(String browser){
        return new baseDriver(browser);
    }
}
