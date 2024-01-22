package org.Karthi;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver=new ChromeDriver();
        driver.get("https://practicetestautomation.com/practice-test-login/");
        WebElement neg = driver.findElement(By.xpath("//h5[text()='Test case 1: Positive LogIn test']"));

        JavascriptExecutor js = (JavascriptExecutor) driver;
//        js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
//        js.executeScript("arguments[0].scrollIntoView();", neg);
        js.executeScript("window.scrollBy(0,200)", "");

        Thread.sleep(2000);

        driver.quit();

    }
}
