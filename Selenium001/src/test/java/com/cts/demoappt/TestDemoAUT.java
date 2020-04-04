package com.cts.demoappt;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestDemoAUT extends Basepage {

	@BeforeSuite
	public void launchbrowser() {
	System.setProperty("webdriver.chrome.driver", "D:\\drivers\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.get("http://www.newtours.demoaut.com");

}
	@DataProvider(name = "Authentication")
	 public  Object[][] authenticate() throws IOException {
			
//		return new Object[][] { 
//			{ "user1", "user1pass" }, 
//			{ "user2", "user2pass" } 
//	      };
		return getUserData();
	 }
	 @Test(dataProvider = "Authentication")	 
	 public void test(String sUsername, String sPassword) {
		 
		
	     driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

	     driver.get("http://www.newtours.demoaut.com");
	 
	     driver.findElement(By.name("userName")).sendKeys(sUsername);

	     driver.findElement(By.name("password")).sendKeys(sPassword);

	     driver.findElement(By.name("login")).click();
	 }
	 
	 @AfterTest
	 public void closeDriver()
	 {
	     driver.quit();
	 }
	 
	
}
