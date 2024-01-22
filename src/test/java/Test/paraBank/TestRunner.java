package Test.paraBank;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

// login

@CucumberOptions (features = "src/test/java/Test/paraBank",glue = "Test/paraBank",plugin = {"pretty","html:ParaBankReport1"})
public class TestRunner extends AbstractTestNGCucumberTests {

}
