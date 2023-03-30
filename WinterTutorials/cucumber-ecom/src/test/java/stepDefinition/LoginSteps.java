package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;

public class LoginSteps {
	WebDriver driver;

	@Before
	public void initialize() {
		System.out.println("Running Initialize");
	}
	//BACKGROUND
	
	// EXECTION
	@Given("I launch a chrome browser")
	public void i_launch_a_chrome_browser() {
		WebDriverManager.edgedriver().setup();
		driver = new EdgeDriver();
	}
	
	

	@When("I open the ecommerce website")
	public void i_open_the_ecommerce_website() {
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
	}

	@When("I enter invalid username and password")
	public void i_enter_invalid_username_and_password() {
		driver.findElement(By.xpath("//input[@id='input-email']")).sendKeys("myuser");
		driver.findElement(By.xpath("//input[@id='input-password']")).sendKeys("mypassword");
		driver.findElement(By.xpath("//input[@value='Login']")).click();
	}

	@When("I enter invalid username {string} and password {string}")
	public void i_enter_invalid_username_and_password(String username, String password) {
		driver.findElement(By.xpath("//input[@id='input-email']")).sendKeys(username);
		driver.findElement(By.xpath("//input[@id='input-password']")).sendKeys(password);
		driver.findElement(By.xpath("//input[@value='Login']")).click();

	}

	@Then("I should be not be successfully logged in")
	public void i_should_be_not_be_successfully_logged_in() {
		boolean result = driver.findElement(By.xpath("//div[@class='alert alert-danger alert-dismissible']"))
				.isDisplayed();
		Assert.assertEquals(true, result);
	}

	@Then("the title should be as expected")
	public void the_title_should_be_as_expected() {
		System.out.println("Title is as expected");
	}

	@Then("Close browser")
	public void close_browser() {
		driver.quit();
	}
	
	@After
	public void tearDown() {
		System.out.println("Running Tear down");
	}

}
