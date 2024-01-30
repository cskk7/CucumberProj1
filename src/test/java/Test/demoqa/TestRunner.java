package Test.demoqa;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions (features = "src/test/java/Test/demoqa/todo.feature",glue = "Test/demoqa",plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"})
public class TestRunner extends AbstractTestNGCucumberTests {

}
