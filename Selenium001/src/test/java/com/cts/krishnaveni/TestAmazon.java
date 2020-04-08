package com.cts.krishnaveni;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestAmazon extends BasePage123 {
	
	WebDriver driver = null;
	@BeforeTest
	public void before() {

		launchapp();
		launchbrowser();
		
	}
	@Test
	public void test1() {
		
	}
	
	
}