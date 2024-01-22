package Test.paraBank.StepDefinitions;

import Test.paraBank.Pages.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class LoginSteps {

    private StepHooks stepHooks;

    public LoginSteps(StepHooks stepHooks) {
        this.stepHooks = stepHooks;
    }

    @Given("As a user I am on Demo Application")
    public void asAUserIAmOnDemoApplication() {
        stepHooks.loginPage.launchURL();

    }

    @And("I enter valid credentials : {string} and {string}")
    public void iEnterValidCredentialsAnd(String strUsername, String strPassword) {
        stepHooks.loginPage.enterUsername(strUsername);
    }

    @When("I click on Login button")
    public void iClickOnLoginButton() {
      stepHooks.loginPage.clickSubmit();
    }

    @Then("I should see Demo Home page")
    public void iShouldSeeDemoHomePage() {
        Assert.assertTrue(stepHooks.loginPage.verifyLoginSuccessMessage());
    }
}
