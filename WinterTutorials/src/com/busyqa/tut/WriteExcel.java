package com.busyqa.tut;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteExcel {

	public static void main(String[] args) throws IOException {
		String pathofFile = "D:\\Training\\TestData.xlsx";
		try {
			FileInputStream fis = new FileInputStream(pathofFile);
			XSSFWorkbook excelBook = new XSSFWorkbook(fis);
			XSSFSheet sheet = excelBook.getSheet("Sheet1");
			XSSFRow row = sheet.getRow(1);
			XSSFCell cell = row.getCell(0);
			//failsafe
			if (cell == null) {
				cell = sheet.getRow(1).createCell(0);
			}

			cell.setCellValue("Samantha");
			FileOutputStream fos = new FileOutputStream(pathofFile);
			excelBook.write(fos);
			fos.close();
			excelBook.close();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
