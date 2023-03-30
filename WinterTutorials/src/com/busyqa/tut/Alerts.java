package com.busyqa.tut;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {
	
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver",
				"C:/Users/GirishGanapathi/eclipse-workspace/WinterTutorials/Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();		
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/alerts");
		driver.findElement(By.id("confirmButton")).click();
		
		
		Alert alert = driver.switchTo().alert();
		alert.dismiss();
		Thread.sleep(5000);
		driver.findElement(By.id("confirmButton")).click();
		alert.accept();
	}

}
