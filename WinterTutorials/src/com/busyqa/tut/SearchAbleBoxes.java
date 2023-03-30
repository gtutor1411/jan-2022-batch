package com.busyqa.tut;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SearchAbleBoxes {

	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver",
				"C:/Users/GirishGanapathi/eclipse-workspace/WinterTutorials/Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		driver.get("https://www.makemytrip.com/");
		driver.findElement(By.xpath(".//input[@id='fromCity']")).click();
		driver.findElement(By.xpath(".//input[@Placeholder='From']")).sendKeys("Chennai");
		Thread.sleep(10000);
		driver.findElements(By.xpath(".//p[contains(@class,'blackText')]")).get(0).click();
	}

}
