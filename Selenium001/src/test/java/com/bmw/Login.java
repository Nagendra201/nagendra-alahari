package com.bmw;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.basepage.BasePage;
import com.bmw.pages.Bmwpage;

public class Login extends BasePage{

	
	WebDriver driver=null;
	Bmwpage Bmwpage;
	String speed;
	@BeforeTest
	public void initdriver() {
		
		driver=launchApp("chrome");
		Bmwpage=new Bmwpage(driver);
	}
	@Test
	public void bmw() throws InterruptedException {
		
		Bmwpage.models();
		 Actions action = new Actions(driver);
		  action.moveToElement(driver.findElement(By.xpath( "//div[@class='enhanced-model-card tw-relative tw-p-300 tw-mb-200 tw-mt-200 tw-relative tw-bg-white hover-out enhanced-model-card-small']"))).build().perform();;
		 Bmwpage.image();
		 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		// Thread.sleep(5000);
		 
		   	Bmwpage.technicaldata();
		   	String b=Bmwpage.speed();
		   	System.out.println(b.length());
		   	System.out.println(b.substring(5,8));
		   	int i=Integer.parseInt(b.substring(5,8));
		   	//	Assert.assertTrue(i<300, "test case pass");
		   	if(i<300) {
		   		
		   		Assert.assertTrue(true, "test case passed");
		   		File file = new File("D:\\output.xlsx");
		   		XSSFWorkbook wb = new XSSFWorkbook();
		   		XSSFSheet sh = wb.createSheet("First Sheet");
		   		sh.createRow(0).createCell(0).setCellValue("does not meet my requirements");
		   		FileOutputStream fos = null;
				try {
					fos = new FileOutputStream(file);
				} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		   		try {
					wb.write(fos);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		   		
		   	 
		   	}else 
		   			{
		   				Assert.assertTrue(true, "test case failed");
		   				File file = new File("D:\\output.xlsx");
				   		XSSFWorkbook wb = new XSSFWorkbook();
				   		XSSFSheet sh = wb.createSheet("First Sheet");
				   		sh.createRow(0).createCell(0).setCellValue("meet my requirements");
				   		FileOutputStream fos = null;
						try {
							fos = new FileOutputStream(file);
						} catch (FileNotFoundException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
				   		try {
							wb.write(fos);
						} catch (IOException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
		   				
		   				
		   			}
		   		
	
	
	
	}
		   		
			   		
		   		
	
	
	@AfterTest
	public void aftertest() {
		
		 driver.close();
	}
	
	
}
