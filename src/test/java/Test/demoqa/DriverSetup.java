//package Test.demoqa;
//
//import io.cucumber.java.After;
//import io.cucumber.java.Before;
//import io.cucumber.java.Scenario;
//import org.openqa.selenium.remote.RemoteWebDriver;
//
//public class DriverSetup {
//    public RemoteWebDriver driver = DriverManager.getDriver();
//
//    @Before
//    public void updateName(Scenario scenario) throws InterruptedException {
//        driver.executeScript("lambda-name=" + scenario.getName());
//    }
//
//    @After
//    public void close_the_browser(Scenario scenario) {
//        driver.executeScript("lambda-status=" + (scenario.isFailed() ? "failed" : "passed"));
//        System.out.println(driver.getSessionId());
//        Driver.quitDriver();
//    }
//
//}