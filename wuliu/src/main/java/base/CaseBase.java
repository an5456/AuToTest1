package base;

public class CaseBase  {
    public BaseDriver InitDriver(String browser){
        return new BaseDriver(browser);
    }
}
