package com.busyqa.tut;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReadExcel {

	public static void main(String[] args) throws IOException, InterruptedException {

		String pathOfExcel = "D:/Training/TestData.xlsx";

		FileInputStream fis = new FileInputStream(pathOfExcel);

		// apache .xls HSSF/ .xlsx-->XSSF
		//HSSFWorkbook book = null;
		XSSFWorkbook excelBook = new XSSFWorkbook(fis);
		XSSFSheet sheet = excelBook.getSheet("Sheet1");
		int totalRows = sheet.getLastRowNum();
		int totalCols = sheet.getRow(0).getLastCellNum();

		System.out.println("Total rows-->" + totalRows);
		System.out.println("Total rows-->" + totalCols);
		/*
		int rowNumber = 1;
		int colNumber = 0;

		XSSFRow row = sheet.getRow(1);
		String firstName = row.getCell(colNumber).toString();
		System.out.println(firstName);
		*/
		/*
		for (int i = 0; i < totalRows; i++) {
			XSSFRow curRow = sheet.getRow(i);
			for (int j = 0; j < totalCols; j++) {				
				String value = curRow.getCell(j).toString();
				System.out.println(value);		
					
			}
		}	
		*/	
		excelBook.close();
		fis.close();
		
		String pathDirectory = System.getProperty("user.dir");		
		FileInputStream ifis = new FileInputStream(pathDirectory + "\\config.properties");
		Properties prop = new Properties();
		prop.load(ifis);
		
		System.setProperty("webdriver.chrome.driver", pathDirectory + prop.getProperty("path.chromedriver"));
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		String fName= getCellData(sheet, 1, 0);
		driver.findElement(By.xpath("//input[@id='input-firstname']")).sendKeys(fName);
		Thread.sleep(3000);
		driver.quit();
		
	}

	public static String getCellData(XSSFSheet sheet, int rows, int cols) {

		int rowNumber = rows;
		int colNumber = cols;

		XSSFRow row = sheet.getRow(rowNumber);
		String value = row.getCell(colNumber).toString();
		// System.out.println(firstName);
		return value;

	}

}
