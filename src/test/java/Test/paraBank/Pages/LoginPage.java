package Test.paraBank.Pages;

import Test.paraBank.DriverUtil;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LoginPage  {

    private WebDriver driver;


    public LoginPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(45));
        PageFactory.initElements(driver, this);
    }

    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(45));
    @FindBy(how = How.XPATH, using = "//input[@name='username']")
    protected WebElement txtUsername;


    @FindBy(how = How.XPATH, using = "//input[@name='password']")
    protected WebElement txtPassword;

    @FindBy(how = How.XPATH, using = "//button[@id='submit']")
    protected WebElement btnSubmit;

    @FindBy(how = How.XPATH, using = "//h1[text()='Logged In Successfully']")
    protected WebElement elmntLoginSuccessMessage;

    public void launchURL() {
        driver.manage().deleteAllCookies();

        driver.manage().window().maximize();

        driver.get("https://practicetestautomation.com/practice-test-login/");
    }

    public void enterUsername(String strUsername) {
        wait.until(ExpectedConditions.visibilityOf(txtUsername));
        txtUsername.sendKeys(strUsername);
    }

    public void enterPassword(String strPassword) {
        wait.until(ExpectedConditions.visibilityOf(txtPassword));
        txtPassword.sendKeys(strPassword);
    }

    public void clickSubmit() {
        wait.until(ExpectedConditions.visibilityOf(btnSubmit));
        btnSubmit.click();
    }

    public boolean verifyLoginSuccessMessage() {
        wait.until(ExpectedConditions.visibilityOf(elmntLoginSuccessMessage));
        return elmntLoginSuccessMessage.isDisplayed();
    }

}
