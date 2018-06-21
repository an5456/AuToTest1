package base;

import org.openqa.selenium.By;

import java.io.IOException;

public class getByLocal {
    public static By byStr(String key) throws IOException {
        getPro pro=new getPro("element.properties");
      String local= pro.readInfor(key);
      String localStyle=local.split(">")[0];
      String localValues=local.split(">")[1];
      if(localStyle.equals("id")){
            return By.id(localValues);
      }else if (localStyle.equals("name")){
          return By.name(localValues);
      }else if (localStyle.equals("className")){
          return By.className(localValues);
      }else if (localStyle.equals("linkText")){
          return By.linkText(localValues);
      }else if(localStyle.equals("tagName")){
          return By.tagName(localValues);
      }else {
          return By.xpath(localValues);
      }
    }
}
