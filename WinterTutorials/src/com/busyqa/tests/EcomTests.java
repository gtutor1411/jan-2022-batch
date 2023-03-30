package com.busyqa.tests;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

public class EcomTests {
	WebDriver driver;

	@BeforeClass
	public void initiate() {
		System.setProperty("webdriver.chrome.driver",
				"C:/Users/GirishGanapathi/eclipse-workspace/WinterTutorials/Drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}

	@Test(enabled = true)
	@Parameters({ "userName", "password" })
	public void loginTestold(String userName, String password) {
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		driver.findElement(By.id("input-email")).sendKeys(userName);
		driver.findElement(By.id("input-password")).sendKeys(password);
		driver.findElement(By.xpath(".//input[@value='Login']")).click();
		boolean isAlertPresent;
		// alert-danger alert-dismissible']")).isDisplayed();

		// SIZE METHOD
		int errorSize = driver.findElements(By.xpath("//div[@class='alert alert-danger alert-dismissible']")).size();

		if (errorSize > 0) {
			isAlertPresent = true;
			// takescreenhot
		} else {
			isAlertPresent = false;
		}
		/*
		 * // TRY/CATCH METHOD try { driver.findElement(By.
		 * xpath("//div[@class='alert alert-danger alert-dismissible']"));
		 * isAlertPresent = true; } catch (Exception e) { isAlertPresent = false; }
		 */
		assertTrue(isAlertPresent);

	}

	@Test(dataProvider = "loginData",enabled=false)	
	public void loginTest(String userName, String password) {
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		driver.findElement(By.id("input-email")).sendKeys(userName);		
		driver.findElement(By.id("input-password")).sendKeys(password);
		driver.findElement(By.xpath(".//input[@value='Login']")).click();
		driver.findElement(By.id("input-email")).clear();
		driver.findElement(By.id("input-password")).clear();
		boolean isAlertPresent;
		// alert-danger alert-dismissible']")).isDisplayed();

		// SIZE METHOD
		int errorSize = driver.findElements(By.xpath("//div[@class='alert alert-danger alert-dismissible']")).size();

		if (errorSize > 0) {
			isAlertPresent = true;
			// takescreenhot
		} else {
			isAlertPresent = false;
		}
		/*
		 * // TRY/CATCH METHOD try { driver.findElement(By.
		 * xpath("//div[@class='alert alert-danger alert-dismissible']"));
		 * isAlertPresent = true; } catch (Exception e) { isAlertPresent = false; }
		 */
		assertTrue(isAlertPresent);

	}

	@AfterClass
	public void tearDown() {
		driver.quit();
	}

	@DataProvider(name = "loginData")
	String[][] loginData() {
		String[][] data = { { "girish@gmail.com", "password1234" }, { "evginia@gmail.com", "password5678" } };
		return data;
	}

}
