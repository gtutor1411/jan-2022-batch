package com.busyqa.tut;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandling {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:/Users/GirishGanapathi/eclipse-workspace/WinterTutorials/Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/browser-windows");
		String parentWindow = driver.getWindowHandle();
		System.out.println("ParentWindow-->" + parentWindow);
		driver.findElement(By.id("windowButton")).click();
		Set<String> allWindows = driver.getWindowHandles();
		System.out.println("AllWindows-->" + allWindows);

		for (String window : allWindows) {

			if (!parentWindow.contentEquals(window)) {
				driver.switchTo().window(window);
				break;
			}

		}
		//code that will be executed in a new window
		System.out.println(driver.findElement(By.id("sampleHeading")).getText());
		System.out.println(driver.getWindowHandle());
		driver.close();
		Thread.sleep(3000);
		driver.switchTo().window(parentWindow);
		System.out.println(driver.getWindowHandle());
		driver.quit();

	}

}
