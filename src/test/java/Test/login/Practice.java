package Test.login;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

// login
public class Practice {
    WebDriver driver;
    @Before
    public void setup() {
        driver = new ChromeDriver();
    }
    @Given("user is on Practice Automation page")
    public void userIsOnPracticeAutomationPage() {
        driver.get("https://practicetestautomation.com/practice-test-login/");
    }

    @When("user enter username")
    public void userEnterUsername() {
        driver.findElement(By.id("username")).sendKeys("student");
    }

    @And("user enter password")
    public void userEnterPassword() {
        driver.findElement(By.id("password")).sendKeys("Password123");
        driver.findElement(By.id("submit")).click();
    }

    @Then("user enters homepage")
    public void userEntersHomepage() {
        driver.getTitle();
    }

    @After
    public void cleanUp() {
        driver.quit();
    }
}
