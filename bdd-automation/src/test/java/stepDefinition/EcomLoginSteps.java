package stepDefinition;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class EcomLoginSteps {
	WebDriver driver;

	@Before
	public void init() {
		System.out.println("Helllo its me again");
	}

	@After
	public void tearDown() {
		System.out.println("Hello bubye");
	}

	@Given("I launch a edge browser")
	public void i_launch_a_edge_browser() {
		WebDriverManager.edgedriver().setup();
		driver = new EdgeDriver();
	}

	@When("I open the ecommerce login website")
	public void i_open_the_ecommerce_login_website() {
		// Write code here that turns the phrase above into concrete actions
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
	}

	@When("I enter invalid username and password")
	public void i_enter_invalid_username_and_password() {
		// Write code here that turns the phrase above into concrete actions
		driver.findElement(By.xpath("//input[@id='input-email']")).sendKeys("myuser");
		driver.findElement(By.xpath("//input[@id='input-password']")).sendKeys("myuser");
		driver.findElement(By.xpath("//input[@value='Login']")).click();
	}

	@When("I enter invalid username {string} and password {string}")
	public void i_enter_invalid_username_and_password(String username, String password) {
		// Write code here that turns the phrase above into concrete actions
		driver.findElement(By.xpath("//input[@id='input-email']")).sendKeys(username);
		driver.findElement(By.xpath("//input[@id='input-password']")).sendKeys(password);
		driver.findElement(By.xpath("//input[@value='Login']")).click();
	}

	@Then("I sould not be successfully logged in")
	public void i_sould_not_be_successfully_logged_in() {
		// Write code here that turns the phrase above into concrete actions
		Assert.assertEquals(true,
				driver.findElement(By.xpath("//div[@class='alert alert-danger alert-dismissible']")).isDisplayed());
	}

	@Then("Close browser")
	public void close_browser() {
		driver.quit();
	}

	@When("I check the title")
	public void i_check_the_title() {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("Title is as being checked");
	}

	@Then("Title shoudl be as expected")
	public void title_shoudl_be_as_expected() {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("Title is as expected");
	}

}
