package Test.Yasin;

import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.util.List;

public class calcSteps {
    static WebDriver driver;
    int c;

    @Given("I open calculator")
    public void iOpenCalculator() {
        System.out.println("Calculator opened succesfully");
        driver  = DriverFactory.driverInitialize();
        driver.get("");
    }


    @When("I add two numbers")
    public void iAddTwoNumbers() {
        System.out.println("----> Add two numbers"+(2+2));
    }

    @Then("I should see output")
    public void iShouldSeeOutput() {
        System.out.println("-----> Output: "+4);
    }

    @When("I subtract two numbers: {int},{int}")
    public void iSubtractTwoNumbers(int arg0, int arg1) {
        System.out.println("-----> Subtraction :");
        c = arg0 - arg1;

    }

    @Then("I should see output: {int}")
    public void iShouldSeeOutput(int arg0) {
        System.out.print("-----> Output : "+arg0);
    }

    @When("I add two numbers: {int}, {int}")
    public void iAddNumbersAB(int arg0,int arg1) {
        System.out.println("-----> Addition: ");
        c = arg0 + arg1;
    }
    @When("I multiply two numbers:")
    public void iMultiplyTwoNumbers(List<Integer> lstData) {
        System.out.println("======> "+lstData.get(0));
        System.out.println("======> "+lstData.get(1));
        System.out.println("======> "+lstData.get(0)*lstData.get(1));
        c = lstData.get(0)*lstData.get(1);
    }

   @After
    public void clean(Scenario scenario){
       System.out.println("Scenario Name: "+scenario.getName());
       System.out.println("Scenario STATUS: "+scenario.getStatus());

       TakesScreenshot tk = (TakesScreenshot) driver;
       scenario.attach(tk.getScreenshotAs(OutputType.BYTES),"image/png","Screenshot");

   }


}
