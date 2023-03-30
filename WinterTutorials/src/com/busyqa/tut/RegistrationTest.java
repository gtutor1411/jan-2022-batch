package com.busyqa.tut;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RegistrationTest {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:/Users/GirishGanapathi/eclipse-workspace/WinterTutorials/Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		/*
		 * 
		 * 
		 * Filling filelds Checkign checkbox Clicked continue button
		 * 
		 */		 
		
		
		try {
			driver.findElement(By.xpath("//h1[normalize-space()='Your Account Has Been Created!']"));
			System.out.println("Element found-Registration Test passed");
			//report.pass
		} catch (Exception e) {
			System.out.println("Element not found-Registration Test failed");
			//report.fail
		}

	}

}
