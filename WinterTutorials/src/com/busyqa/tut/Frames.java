package com.busyqa.tut;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver",
				"C:/Users/GirishGanapathi/eclipse-workspace/WinterTutorials/Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/frames");
		System.out.println(driver.findElement(By.xpath(".//div[contains(text(),'2')]")).getText());
		driver.switchTo().frame(0);		
		System.out.println(driver.findElement(By.id("sampleHeading")).getText());
		driver.switchTo().defaultContent();
		System.out.println(driver.findElement(By.xpath(".//div[contains(text(),'2')]")).getText());
		
		
		
	}

}
