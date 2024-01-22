package Test.paraBank.StepDefinitions;

import Test.paraBank.DriverUtil;
import Test.paraBank.Pages.LoginPage;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class StepHooks {

    public static Scenario scenario;

    public LoginPage loginPage;

    public static WebDriver driver;


    public StepHooks() {
        driver = DriverUtil.launchDriver();
        System.out.println("--------> "+driver);
        loginPage = new LoginPage(driver);
    }

    @Before
    public void beforeScenario(Scenario scenario1) {

        System.out.println("\n Scenario name :::: " +
                scenario1.getName());
        System.out.println("\n Scenario tags :::: " +
                scenario1.getSourceTagNames());
        scenario = scenario1;
    }

    @After
    public void afterScenario() {

        byte[] imageBytes = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
        scenario.attach(imageBytes, "image/png", "");
        System.out.println("\n Scenario STAtus :::" + scenario.getStatus());
    }
}
