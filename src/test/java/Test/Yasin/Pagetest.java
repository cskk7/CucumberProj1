package Test.Yasin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Pagetest {

    static WebDriver driver;

    public Pagetest(WebDriver driver){
        this.driver = driver;
    }
    public  void clickPracticesTab(){
        driver.findElement(By.xpath("//a[]")).click();
    }

}
