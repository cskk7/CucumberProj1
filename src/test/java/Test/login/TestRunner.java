package Test.login;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

// login

@CucumberOptions (features = "src/test/java/Test/demoqa",glue = "Test/demoqa",plugin = {"pretty","html:report.html"})
public class TestRunner extends AbstractTestNGCucumberTests {

}
