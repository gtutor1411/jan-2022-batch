package com.busyqa.tut;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Cookies {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.edge.driver",
				"C:/Users/GirishGanapathi/eclipse-workspace/WinterTutorials/Drivers/edgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		driver.findElement(By.xpath("//input[@id='input-email']")).sendKeys("girish@busy.com");
		driver.findElement(By.xpath("//input[@id='input-password']")).sendKeys("Happy@123");
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		Thread.sleep(2000);

		Set<Cookie> allCookies = driver.manage().getCookies();
		for (Cookie cookie : allCookies) {

			System.out.println(cookie.getName() + "--" + cookie.getValue() + "--" + cookie.getPath() + "--"
					+ cookie.getSameSite() + "--" + cookie.getDomain());
		}
		
		
		Cookie sessionCookie = driver.manage().getCookieNamed("OCSESSID");
		driver.quit();
		
		Cookie girishCookie = new Cookie("Girish","is the best");
		
		WebDriver newDriver = new ChromeDriver();
		newDriver.manage().window().maximize(); 
		newDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		newDriver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		newDriver.manage().deleteCookieNamed("OCSESSID");
		newDriver.manage().addCookie(sessionCookie);
		newDriver.manage().addCookie(girishCookie);
		newDriver.navigate().refresh();
		Thread.sleep(10000);
		

	}

}
