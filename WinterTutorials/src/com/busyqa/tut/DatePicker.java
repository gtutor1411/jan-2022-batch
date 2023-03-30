package com.busyqa.tut;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePicker {

	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver",
				"C:/Users/GirishGanapathi/eclipse-workspace/WinterTutorials/Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/datepicker/");
		driver.switchTo().frame(0);
		//method 1 superfast
		/*
		driver.findElement(By.id("datepicker")).sendKeys("01/02/2022");
		driver.findElement(By.id("datepicker")).sendKeys(Keys.RETURN);
		*/
		
		//method 2 boring but needed
		
		driver.findElement(By.id("datepicker")).click();
		List<WebElement> dateList=driver.findElements(By.xpath(".//table//tr/td/a"));		
		for(int i=0;i<dateList.size();i++) {
			System.out.println(dateList.get(i).getText());
			if(dateList.get(i).getText().equalsIgnoreCase("15")) {
				dateList.get(i).click();				
			}
		}
		Thread.sleep(5000);
		
		driver.quit();

	}

}
