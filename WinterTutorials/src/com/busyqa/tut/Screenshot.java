package com.busyqa.tut;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshot {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:/Users/GirishGanapathi/eclipse-workspace/WinterTutorials/Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		driver.findElement(By.id("input-email")).sendKeys("abcd@abc.com");
		driver.findElement(By.id("input-password")).sendKeys("password1");

		// takesnapshot

	}

	public static void takeSnapshot(WebDriver driver) {

		try {
			File file = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			FileHandler.copy(file, new File("C:\\Users\\GirishGanapathi\\Downloads\\123456.png"));
		} catch (Exception e) {

		}

	}

}
