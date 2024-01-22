package Test.Yasin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverFactory {
    static WebDriver driver;

    public static WebDriver driverInitialize(){
        if(driver == null){
            driver = new ChromeDriver();
        }
        return driver;
    }
}
