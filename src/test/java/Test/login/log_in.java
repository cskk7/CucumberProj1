//package Test.login;
//
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//public class log_in {
//    public WebDriver driver;
//    @Given("Login page")
//    public void login_page() {
//        driver=new ChromeDriver();
//        driver.get("https://practicetestautomation.com/practice-test-login/");
//
//    }
//
//    @When("enter valid user name and password")
//    public void enterValidUserNameAndPassword() {
//
//        driver.findElement(By.xpath("//input[@name='username']")).sendKeys("student");
//        driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Password123");
//        driver.findElement(By.xpath("//button[@class='btn']")).click();
//    }
//
//    @Then("i should see the login succesfully")
//    public void iShouldSeeTheLoginSuccesfully() {
//
//        System.out.println(driver.findElement(By.xpath("//h1[@class='post-title']")).isDisplayed());
//    }
//}
