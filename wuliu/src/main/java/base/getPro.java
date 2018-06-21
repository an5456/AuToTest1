package base;

import java.io.*;
import java.util.Properties;

public class getPro {
    private String filepath;
    private Properties pro;
    public getPro(String filepath) throws IOException {
        this.filepath=filepath;
        this.pro=readFile();
    }
    /*读取配置文件
    * */
    public Properties readFile() throws IOException {
        Properties properties=new Properties();
        try {
            InputStream inputStream=new FileInputStream(filepath);
            BufferedInputStream buff=new BufferedInputStream(inputStream);
            properties.load(buff);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return properties;
    }
    /*
    * 读取文本信息*/
    public String readInfor(String key){
        if(pro.containsKey(key)){
          String username= pro.getProperty(key);
          return username;
        }else {
            System.out.println("你输入的key值不存在");
            return "";
        }
    }
}
