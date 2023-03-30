package com.busyqa.browsers;

import java.time.Duration;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Session3_Synchro {

	public static void main(String[] args) throws InterruptedException {
		// Implicit wait
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver",
				"C:/Users/GirishGanapathi/eclipse-workspace/WinterTutorials/Drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.get("http://seleniumpractise.blogspot.in/2016/08/how-to-use-explicit-wait-in-selenium.html");
		driver.findElement(By.xpath(".//button[text()='Click me to start timer']")).click();
		/*
		 * driver.findElement(By.xpath(".//p[text()='WebDriver']"));
		 * 
		 * //driver.quit();
		 */

		// Explicit Wait __> 
		/*
		WebElement element = null;
		try {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(50));
			element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//p[text()='WebDriver']")));
			System.out.println("Element is found");
		} catch (Exception e) {
			System.out.println("Element not found in the specified time duration");
		}
		*/
		
		

		// Fluent Waits
		driver.navigate().to("http://seleniumpractise.blogspot.in/2016/08/how-to-use-explicit-wait-in-selenium.html");
		driver.findElement(By.xpath("//button[text()='Click me to start timer']")).click();
		FluentWait<WebDriver> wait = new FluentWait<WebDriver>(driver)
		       .withTimeout(Duration.ofSeconds(30))
		       .pollingEvery(Duration.ofSeconds(5))
		       .ignoring(NoSuchElementException.class);
		 
		WebElement elementf = wait.until(new Function<WebDriver, WebElement>() {
		public WebElement apply(WebDriver driver) {
		WebElement elementf = driver.findElement(By.xpath("//p[text()='WebDriver']"));
		String getTextOnPage = elementf.getText();
		if(getTextOnPage.equals("WebDriver")){
		System.out.println(getTextOnPage);
		return elementf;
		}else{
		System.out.println("FluentWait Failed");
		return null;
		}
		}
		});
		// -->Static Wait

	}

}
