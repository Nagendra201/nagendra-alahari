package com.cts.demoappt;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.DataProvider;

public class Basepage {
	public static Object[][] testdata;
	public static WebDriver driver;
	@FindBy(xpath = "//input[@name='userName']")
	WebElement username;
	@FindBy(xpath = "//input[@name='password']")
	WebElement password;
	public Basepage() {
		PageFactory.initElements(driver, this);
	}
   
	 public  Object[][] getUserData() throws IOException {
			FileInputStream file = new FileInputStream("groot.xlsx") ;
			XSSFWorkbook workbook=new XSSFWorkbook(file);
			XSSFSheet loginsheet=workbook.getSheet("login");
			int NumOfData=loginsheet.getPhysicalNumberOfRows();
			System.out.println(NumOfData);
			testdata=new Object[NumOfData][2];
			for(int i=0;i<NumOfData;i++) {
				XSSFRow row=loginsheet.getRow(i);
				XSSFCell username=row.getCell(0);
				XSSFCell password=row.getCell(1);
				testdata[i][0]=username.getStringCellValue();
				testdata[i][1]=password.getStringCellValue();
				System.out.println(testdata[i][0]);
				System.out.println(testdata[i][1]);
			}
			
			return testdata;
			
			
		}

	

}
