package Test.demoqa;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions (features = "src/test/java/Test/paraBank/DemoLogin.feature",glue = "Test/paraBank/StepDefinitions", plugin = {"pretty","html:Report1.html"})
public class TestRunner extends AbstractTestNGCucumberTests {

}
