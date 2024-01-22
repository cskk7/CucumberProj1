package org.Karthi;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class Main2 {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver =new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/");
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        WebElement usrname = driver.findElement(By.xpath("//input[@name='username']"));
        driver.findElement(By.xpath("//p[text()='Forgot your password? ']")).click();

        usrname.sendKeys("Admin");
        WebElement reset = driver.findElement(By.xpath("//button[@type='submit']"));
        reset.click();
        Thread.sleep(2000);
        driver.quit();
    }
}
//        WebElement pass =driver.findElement(By.xpath("//input[@name='password']"));
//        pass.sendKeys("admin13");
//        driver.findElement(By.xpath("//button[@type='submit']")).click();