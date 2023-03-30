package com.busyqa.tut;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class WebTables {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:/Users/GirishGanapathi/eclipse-workspace/WinterTutorials/Drivers/chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		//options.setHeadless(true);
		WebDriver driver = new ChromeDriver(options);		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/web-table-element.php");
		
		//headers
		/*
		List<WebElement> listOfHeaders = driver.findElements(By.xpath(".//th"));
		for (int i = 0; i < listOfHeaders.size(); i++) {
			System.out.println(listOfHeaders.get(i).getText());
		}
		*/
		
		//rows
		List<WebElement> listOfRows = driver.findElements(By.xpath(".//table[@class='dataTable']//tr"));
		for (int i = 0; i < listOfRows.size(); i++) {
			System.out.println(listOfRows.get(i).getText());
		}
		
		
		//column
		
		List<WebElement> listOfCol1 = driver.findElements(By.xpath(".//table[@class='dataTable']//td[1]"));
		for (int i = 0; i < listOfCol1.size(); i++) {
			System.out.println(listOfCol1.get(2).getText());
		}	
		

	}

}
