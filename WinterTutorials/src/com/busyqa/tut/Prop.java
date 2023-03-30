package com.busyqa.tut;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Prop {

	public static void main(String[] args) throws IOException {

		String pathDirectory = System.getProperty("user.dir");		
		FileInputStream fis = new FileInputStream(pathDirectory + "\\config.properties");
		Properties prop = new Properties();
		prop.load(fis);
		
		System.setProperty("webdriver.chrome.driver", pathDirectory + prop.getProperty("path.chromedriver"));
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		// inputstream and outputstream

		String username = prop.getProperty("username");
		String password = prop.getProperty("password");
		String testUrl = prop.getProperty("test.url");

		driver.get(testUrl);
		driver.findElement(By.xpath("//input[@id='input-email']")).sendKeys(username);
		driver.findElement(By.xpath("//input[@id='input-password']")).sendKeys(password);
		driver.findElement(By.xpath("//input[@value='Login']")).click();

	}

}
