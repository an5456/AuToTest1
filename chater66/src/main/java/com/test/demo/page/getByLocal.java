package com.test.demo.page;

import com.test.demo.base.getPro;
import org.openqa.selenium.By;

import java.io.IOException;

public class getByLocal {
    public static By getStr(String username) throws IOException {
        getPro action=new getPro("element.properties");
        String local= action.readInfor(username);
        String localTyple=local.split(">")[0];
        String localValues=local.split(">")[1];
        if(localTyple.equals("id")){
            return By.id(localValues);
        }else if(localTyple.equals("name")){
            return By.name(localValues);
        }else if (localTyple.equals("className")){
            return By.className(localValues);
        }else if (localTyple.equals("tagName")){
            return By.tagName(localValues);
        }else if (localTyple.equals("linkText")){
            return By.linkText(localValues);
        }else {
            return By.xpath(localValues);
        }
    }
}

