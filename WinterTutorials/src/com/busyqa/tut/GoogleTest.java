package com.busyqa.tut;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class GoogleTest {

	@BeforeTest
	public void initiate() {
		System.out.println("I initiated something");

	}

	@AfterTest
	public void tearDown() {
		System.out.println("I tore down something");
	}

	@Test
	public void chromeTest() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:/Users/GirishGanapathi/eclipse-workspace/WinterTutorials/Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		assertEquals("Google", driver.getTitle());
		driver.quit();
	}

	@Test(dependsOnMethods = "chromeTest")
	public void edgeTest() {
		System.setProperty("webdriver.edge.driver",
				"C:/Users/GirishGanapathi/eclipse-workspace/WinterTutorials/Drivers/edgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.google.com/");
		assertEquals("Google", driver.getTitle());
		driver.quit();

	}

}
