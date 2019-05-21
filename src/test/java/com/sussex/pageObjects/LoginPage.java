package com.sussex.pageObjects;

import org.openqa.selenium.WebDriver;

public class LoginPage {
WebDriver driver;
	
	public void AboutPage(WebDriver driver) {
		
		this.driver =driver;
	}
	
	public String getTitle() {
		return driver.getTitle();
	}
	
	public String getCurrentUrl() {
		return driver.getCurrentUrl();
	}
}
