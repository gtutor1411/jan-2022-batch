package com.busyqa.tut;

import java.util.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Sliders {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:/Users/GirishGanapathi/eclipse-workspace/WinterTutorials/Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/slider/");
		
		WebElement frame = driver.findElement(By.xpath(".//iframe[@class='demo-frame']"));
		driver.switchTo().frame(frame);
		
		
		WebElement slider = driver.findElement(By.xpath(".//span[contains(@class,'ui-slider')]"));
		/*
		Actions action = new Actions(driver);
		action.moveToElement(slider).dragAndDropBy(slider, 200, 0).perform();
		*/
		
		for(int i=0;i<=100;i++) {
			
			slider.sendKeys(Keys.ARROW_RIGHT);
		}
		
		

	}

}
