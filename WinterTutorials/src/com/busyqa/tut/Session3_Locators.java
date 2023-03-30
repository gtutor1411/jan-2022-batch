package com.busyqa.tut;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Session3_Locators {

	public static void main(String[] args) {
		WebDriver driver = null;
		try {
			System.setProperty("webdriver.chrome.driver",
					"C:/Users/GirishGanapathi/eclipse-workspace/WinterTutorials/Drivers/chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
			Thread.sleep(1000);
			// Locating by ID
			WebElement tbox_FirstName = driver.findElement(By.id("input-firstname"));			
			tbox_FirstName.sendKeys("Girish");
			
			// Locating by linkText
			WebElement link1 = driver.findElement(By.linkText("login page"));
			link1.click();
			
			driver.navigate().back();
			
			// Locating by linkText
			WebElement link2 = driver.findElement(By.partialLinkText("login"));
			link1.click();
			Thread.sleep(2000);
			
			/*
			// Locating by Name
			WebElement tbox_FirstNam = driver.findElement(By.name("firstname"));
			tbox_FirstNam.clear();
			tbox_FirstNam.sendKeys("Samantha");
			*/
			/*
			//Locating by cssselectors(ID) <htmltag><#><idValue>
			WebElement tbox_lastName = driver.findElement(By.cssSelector("input#input-lastname"));
			tbox_lastName.sendKeys("foundByCssSelectorID");
			
			//Locating by cssselectors(CLASS) <htmltag><.><classValue>
			WebElement tbox_email = driver.findElement(By.cssSelector("input.form-control"));
			tbox_email.sendKeys("foundByCssSelectorCLASS");
			*/
			
			//xpaths
			WebElement radioButton = driver.findElement(By.xpath(".//label[@class='radio-inline']"));
			radioButton.click();
			
			
			WebElement tbox_lastName = driver.findElement(By.xpath(".//input[@name='lastname']"));
			tbox_lastName.sendKeys("FoundUsinXpath");
			
			
			WebElement tbox_firstName = driver.findElement(By.xpath(".//input[contains(@id,'firstname')]"));
			tbox_firstName.sendKeys("FoundUsinXpathCONTAINS");
			
			//Thread.sleep(10000);
			
			List<WebElement> listOfLinks =driver.findElements(By.xpath(".//a[@class='list-group-item']"));
			System.out.println(listOfLinks.size());
			
			//listOfLinks.click();
			//System.out.println(listOfLinks.get(5).getText());
			for(int i=0;i<listOfLinks.size();i++) {
			if(listOfLinks.get(i).getText().equalsIgnoreCase("Downloads")) {
				listOfLinks.get(i).click();
			}
			}	
			  
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			driver.quit();
		}

	}

}
