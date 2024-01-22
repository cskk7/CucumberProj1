package Test.PageObjectModel;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

// login

@CucumberOptions (features = "src/test/java/Test/PageObjectModel",glue = "Test/PageObjectModel",plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"})
public class TestRunnerPg extends AbstractTestNGCucumberTests {

}