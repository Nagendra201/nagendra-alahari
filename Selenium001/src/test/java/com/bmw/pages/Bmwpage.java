package com.bmw.pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.basepage.BasePage;

public class Bmwpage extends BasePage{
	
	WebDriver driver ;
	@FindBy(xpath = "//a[contains(text(),'Models')]")
	WebElement models;
	@FindBy(xpath = "//a[contains(text(),'7')]")
	WebElement medel7;
	@FindBy(xpath = "/html/body/div[1]/div[2]/div/div/div/div[1]/div/div[1]/div[2]/div/div/div/div/div[2]/div/div[1]/div/div/a")
	WebElement image;
	@FindBy(xpath = "//div[@class=\"ds2-mobilepreview ds2-page--wrapper\"]//nav[@class=\"scroll-navigation tw-relative tw-scrolling-touch tw-overflow-x-auto\"]//div[1]//div[3]")
	WebElement technicaldata;
	@FindBy(xpath = "//section[@class='content ds2-technical-data--content ds2-mvc-tabs-content__panel ds2-mvc-tabs-content__panel--active']//div[@class='row']//div[1]//div[1]//table[1]//tbody[1]//tr[4]//td[2]//div[1]")
	WebElement speed;
	
	public Bmwpage(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	}
	public void models() {
		models.click();
		medel7.click();
		
	}
	public void image() {
		
		image.click();

}
	
	public void technicaldata() {
		
		//Actions actions = new Actions(driver);
		//actions.moveToElement(technicaldata).click().build().perform();
		 	technicaldata.click();

	}
	public String speed() {
		
		String b=speed.getText();
		System.out.println(b);
		return b;
	}
	

}
