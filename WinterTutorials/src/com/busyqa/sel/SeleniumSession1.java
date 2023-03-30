package com.busyqa.sel;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumSession1 {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver;
		System.setProperty("webdriver.chrome.driver",
				"C:/Users/GirishGanapathi/eclipse-workspace/WinterTutorials/Drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		/*
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getPageSource().contains("u already have an account with us"));
		*/

		List<WebElement> checkbox = driver.findElements(By.xpath(".//input[@type='checkbox']"));
		for (int i = 0; i < checkbox.size(); i++) {
			checkbox.get(0);
			System.out.println(checkbox.get(i).isSelected());
			System.out.println(checkbox.get(i).isEnabled());
			System.out.println(checkbox.get(i).isDisplayed());
			}

		/*
		 * driver.navigate().to("https://naveenautomationlabs.com/opencart");
		 * driver.navigate().forward(); Thread.sleep(1000); driver.navigate().back();
		 * Thread.sleep(1000); driver.navigate().refresh(); Thread.sleep(1000);
		 * driver.quit();
		 */

	}

}
