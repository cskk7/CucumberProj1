package Test.paraBank;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverUtil {

    public static WebDriver driver;

    public static WebDriver launchDriver() {

        driver = new ChromeDriver();
        return driver;
    }
}


