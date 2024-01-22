package Test.PageObjectModel;

import io.cucumber.java.*;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.*;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

import java.sql.DriverManager;

public class StepDefPG {
    static WebDriver driver;
//    class Utility{
//
//        public static Scenario message;
//
//        static int i = 1;
//        public static void takeScreenShotAfterEveryStep() {
//            byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
//            message.attach(screenshot, "image/png","pic"+(i++));
//        }
//    }

    @Before
    public void ScenarioName(Scenario scenario){
        driver  = DriverFactory.getDriver();
        System.out.println("---> scenario: "+scenario.getName());
//            Utility.message = scenario;
    }

    @Given("user on loginpage")
    public void userOnLoginpage() {

        driver.get("https://practicetestautomation.com/practice-test-login/");
    }

    @When("user enetered username")
    public void userEneteredUsername() {
        WebElement user = driver.findElement(By.xpath("//input[@id='username']"));
        user.sendKeys("student");
        String usernameInput = user.getAttribute("value");
        Assert.assertEquals(usernameInput,"student");
    }

    @And("user entered password")
    public void userEnteredPassword() {
        WebElement pass = driver.findElement(By.xpath("//input[@id='password']"));
        pass.sendKeys("Password123");
        String passwordInput = pass.getAttribute("value");
        Assert.assertEquals(passwordInput,"Password123");
    }

    @And("user clicked submit")
    public void userClickedSubmit() {
        WebElement user = driver.findElement(By.xpath("//button[@id='submit']"));
        user.click();
    }

    @Then("user login successfully")
    public void userLoginSuccessfully() {
        String actual = driver.findElement(By.className("post-content")).getText();
        String expected = "Congratulations student. You successfully logged in!\n" +
                "Log out";
        Assert.assertEquals(actual,expected);
    }
    @AfterStep
    public void attach(Scenario scenario)throws Throwable{
        if(scenario.isFailed()){
            final byte[] screenshotTaken= ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshotTaken,"image/png","Failed");
        }
    }

    @Given("user on homepage")
    public void userOnHomepage() {
        String actual = driver.getTitle();
        String expected = "Logged In Successfully | Practice Test Automation";
        Assert.assertEquals(actual,expected);
    }

    @When("user clicked logout")
    public void userClickedLogout() {
        WebElement button = driver.findElement(By.xpath("//a[text()='Log out']"));
        button.click();
    }

    @Then("user logout successfully")
    public void userLogoutSuccessfully() {
        String actual = driver.getTitle();
        String expected = "Test Login | Practice Test Automation |";
        Assert.assertEquals(actual,expected);
    }
    @After
    public void cleanUp(Scenario scenario)
    {

        scenario.log("---> scenario: "+scenario.getStatus());

        TakesScreenshot tk = (TakesScreenshot) driver;
        scenario.attach(tk.getScreenshotAs(OutputType.BYTES),"image/png","Screenshot");
    }
}
