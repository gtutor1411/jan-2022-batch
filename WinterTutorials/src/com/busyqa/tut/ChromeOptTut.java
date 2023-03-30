package com.busyqa.tut;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ChromeOptTut {
	
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver",
				"C:/Users/GirishGanapathi/eclipse-workspace/WinterTutorials/Drivers/chromedriver.exe");
		

		Map<String, String> mobileEmulation = new HashMap<>();
		mobileEmulation.put("deviceName", "iphone SE");
		
		ChromeOptions options = new ChromeOptions();
		
		//HEADLESS MODE
		//options.setHeadless(true);
		
		//MOBILE VIEW
		options.setExperimentalOption("mobileEmulation", mobileEmulation);
		WebDriver driver = new ChromeDriver(options);	
		
		
		
		
	}

}
