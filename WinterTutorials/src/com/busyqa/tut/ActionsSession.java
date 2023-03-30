package com.busyqa.tut;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsSession {

	public static void main(String[] args) throws InterruptedException {
	

		System.setProperty("webdriver.chrome.driver",
				"C:/Users/GirishGanapathi/eclipse-workspace/WinterTutorials/Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();		
		driver.manage().window().maximize();		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://naveenautomationlabs.com/opencart/");
		
		WebElement element = driver.findElement(By.xpath(".//a[normalize-space()='Desktops']"));
		
		Actions action = new Actions(driver);
		//hovering
		//action.moveToElement(element).perform();
		
		//rightclick
		action.contextClick(element).perform();
		
		//double click
		WebElement currDropDown = driver.findElement(By.xpath(".//i[@class='fa fa-caret-down']"));
		action.doubleClick(currDropDown).perform();
		
		
		
		

	}

}
