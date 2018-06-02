package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Steps {
	
	WebDriver driver;

	@Given("^I am in Login Page$")
	public void i_am_in_Login_Page() throws Throwable {
		

		System.setProperty("webdriver.chrome.driver", "E://Automation Softwares//Unzipped Files//Drivers//chromedriver_win32//chromedriver.exe");
	    driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("http://opensource.demo.orangehrmlive.com");
	    Thread.sleep(6000);
	    
	}

	@When("^I enter valid \"([^\"]*)\" and \"([^\"]*)\"$")
	public void i_enter_valid_and(String Username, String Password) throws Throwable {
	   
		driver.findElement(By.id("txtUsername")).sendKeys(Username);
		driver.findElement(By.id("txtPassword")).sendKeys(Password);
	}

	@And("^I click on Login$")
	public void i_click_on_Login() throws Throwable {
	    
		driver.findElement(By.id("btnLogin")).click();
	}

	@Then("^I should be able to login$")
	public void i_should_be_able_to_login() throws Throwable {
	 
		if(driver.getCurrentUrl().equalsIgnoreCase("http://opensource.demo.orangehrmlive.com/index.php/dashboard")){
	         System.out.println("Test Pass"); 
	      } else { 
	         System.out.println("Test Failed"); 
	      } 
	      driver.close(); 
	   } 

	
}
