package com.busyqa.tut;



import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Resizing {

	public static void main(String[] args) {
		

		System.setProperty("webdriver.chrome.driver",
				"C:/Users/GirishGanapathi/eclipse-workspace/WinterTutorials/Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=common/home");
		System.out.println(driver.manage().window().getSize());
		//Dimension dim = new Dimension();
		
		Dimension dim = new Dimension(500, 500);
		driver.manage().window().setSize(dim);

	}

}
