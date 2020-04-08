package com.cts.krishnaveni;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasePage123 {
	
	WebDriver driver;
	public void launchapp() {
		System.setProperty("webdriver.chrome.driver", "D:\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
	}
	public void launchbrowser() {
		driver.get("https://www.amazon.in");
	}

}
