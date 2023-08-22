package StepDefs;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class RegistrationStepDefs {
   public static WebDriver driver;
 //create constructor
   public RegistrationStepDefs(){
     System.setProperty("webdriver.chrome.driver","C:\\Users\\georg\\AutomationPersonalTraining\\PrepMajor2023v1\\src\\test\\resources\\Driver\\chromedriver.exe");
    driver =new ChromeDriver();
    driver.manage().window().maximize();
      // driver.get("https://automationtalks.com/2016/10/28/what-is-automation-testing/");
      // driver.get( "https://developertraining.reteicons.com/Rita/index.php/automation-form/");
   }
    @Given("I navigate to PrepMajor website")
    public void i_navigate_to_prep_major_website() {
      driver.get( "https://developertraining.reteicons.com/Rita/index.php/automation-form/");


    }
    @When("I enter my Name and last name")
   public void iEnterMyNameAndLastName() {
      //driver.findElement(By.id("wpforms-2082-fie")).sendKeys("Georges");
     driver.findElement(By.xpath("//*[@id=\"wpforms-18-field_1\"]")).sendKeys("pofou");

   }
    @When("I enter my email address")
    public void i_enter_my_email_address() {


    }
   @And("I enter my height")
   public void iEnterMyHeight() {

   }
    @And("I select my vegetarian option")
    public void iSelectMyVegetarianOption() {

    }
   @And("I enter my location")
   public void iEnterMyLocation() {

   }

   @And("I select the length of my career")
   public void iSelectTheLengthOfMyCareer() {

   }
   @And("I describe my hobbies")
   public void iDescribeMyHobbies() {

   }
   @And("I select my course choice")
   public void iSelectMyCourseChoice() {
       driver.findElement(By.xpath("//*[@id=\"wpforms-18-field_29\"]/li[3]/label")).click();

   }
   @And("I select my career progression")
    public void iSelectMyCareerProgression() {

   }
   @And("I select all the days working for me")
   public void iSelectAllTheDaysWorkingForMe() {

   }
   @And("I select the best time for me")
   public void iSelectTheBestTimeForMe() {

   }
   @And("I select my favorite music")
   public void iSelectMyFavoriteMusic() {

   }
   @And("I click on Submit")
   public void iClickOnSubmit() {

   }
    @ Then("I should see the successful message")
    public void i_should_see_the_successful_message() {

    }



}
