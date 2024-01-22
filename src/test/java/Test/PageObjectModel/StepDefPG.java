package Test.PageObjectModel;

import io.cucumber.java.After;
import io.cucumber.java.AfterAll;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.*;
import org.testng.Assert;

public class StepDefPG {
    static WebDriver driver;

    @Before
    public void ScenarioName(Scenario scenario){
        driver  = DriverFactory.getDriver();
        System.out.println("---> scenario: "+scenario.getName());
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
        String expected = "Test Login | Practice Test Automation";
        Assert.assertEquals(actual,expected);
    }
    @After
    public void cleanUp(Scenario scenario)
    {

        System.out.println("---> scenario: "+scenario.getStatus());
        scenario.log("Karthiq is a good boy...");
        driver.quit();
    }
}
