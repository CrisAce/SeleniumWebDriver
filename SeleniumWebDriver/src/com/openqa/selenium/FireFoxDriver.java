package com.openqa.selenium;

public class FireFoxDriver implements WedDriver {

	public  FireFoxDriver() {
		System.out.println("Launching Firefix");
	}
	
	@Override
	public void click(String locator) {
		System.out.println("Click on an Element in Firefox " + locator);
	}

	@Override
	public void sendKeys(String locator, String value) {
		System.out.println("Type in an element in Firefox: " + locator + "An the value is : " + value);
	}
	

}
