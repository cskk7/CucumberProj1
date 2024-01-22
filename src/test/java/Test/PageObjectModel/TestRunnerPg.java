package Test.PageObjectModel;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

// login

@CucumberOptions (features = "src/test/java/Test/PageObjectModel",glue = "Test/PageObjectModel",plugin = {"pretty","html:PGreport.html"})
public class TestRunnerPg extends AbstractTestNGCucumberTests {

}