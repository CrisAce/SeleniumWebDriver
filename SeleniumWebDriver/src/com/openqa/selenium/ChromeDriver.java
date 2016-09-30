package com.openqa.selenium;



//mport org.openqa.selenium.WebDriver;

public class ChromeDriver implements com.openqa.selenium.WedDriver  {
	
	public ChromeDriver(){
		System.out.println("Launching Chrome");
	}

	@Override
	public void click(String locator) {
		System.out.println("Click on an Element in Chrome " + locator);
	}

	@Override
	public void sendKeys(String locator, String value) {
		System.out.println("Type in an element in Chrome: " + locator + "An the value is : " + value);
	}
	

}
