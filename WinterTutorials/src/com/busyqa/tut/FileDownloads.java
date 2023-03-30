package com.busyqa.tut;

import java.io.File;
import java.time.Duration;
import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class FileDownloads {

	public static void main(String[] args) {
		String folderPath = "D:\\Training\\TrainingDownLoadFolder";
		File folder = new File(folderPath);

		HashMap<String, Object> prefs = new HashMap<String, Object>();
		prefs.put("download.default_directory", "D:\\Training\\TrainingDownLoadFolder");

		System.setProperty("webdriver.chrome.driver",
				"C:/Users/GirishGanapathi/eclipse-workspace/WinterTutorials/Drivers/chromedriver.exe");

		ChromeOptions options = new ChromeOptions();
		options.setExperimentalOption("prefs", prefs);

		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		driver.get("https://the-internet.herokuapp.com/download");
		driver.findElement(By.xpath(".//a[normalize-space()='some-file.txt']")).click();

		String[] files = folder.list();
		System.out.println(files.length);
		
		for (int i = 0; i < files.length; i++) {
		System.out.println(files[i]);	
		}		

	}

}
