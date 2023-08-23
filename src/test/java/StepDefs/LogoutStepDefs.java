package StepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import static java.lang.Thread.sleep;


public class LogoutStepDefs {

    public static WebDriver driver;
    public LogoutStepDefs () {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\georg\\AutomationPersonalTraining\\PrepMajor2023v1\\src\\test\\resources\\Driver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
         
          //driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
    }
    @Given("I am on the PrepMajor website")
    public void iAmOnThePrepMajorWebsite() {
        driver.get("https://qa.reteicons.com/dynamite/");

    }
    @And("I click on login")
    public void iClickOnLogin() {
        driver.findElement(By.xpath("//*[@id=\"header\"]/div/div[2]/div/div/div/div[3]/a[1]/span")).click();
    }
    @When("I enter my username and password")
    public void iEnterMyUsernameAndPassword() {
        driver.findElement(By.xpath("//*[@id=\"stm-lms-login-modal\"]/div[2]/div[1]/input")).sendKeys("georgespofou@yahoo.fr");
       driver.findElement(By.xpath("//*[@id=\"stm-lms-login-modal\"]/div[2]/div[2]/input")).sendKeys("Tester23");
    }
    @And("I click on login button")
    public void iClickOnLoginButton() {
        driver.findElement(By.xpath("//*[@id=\"stm-lms-login-modal\"]/div[2]/div[3]/a/span")).click();

    }

    @Then("I should login successfully")
    public void iShouldLoginSuccessfully() {

    }

    @Given("I login to my PrepMajor Account")
    public void iLoginToMyPrepMajorAccount() {

    }

    @When("I click on logout button")
    public void iClickOnLogoutButton() {

    }

    @And("I logout successfully")
    public void iLogoutSuccessfully() {

    }

    @Then("I should be redirected to the login and signup page")
    public void iShouldBeRedirectedToTheLoginAndSignupPage() {
    }



}
