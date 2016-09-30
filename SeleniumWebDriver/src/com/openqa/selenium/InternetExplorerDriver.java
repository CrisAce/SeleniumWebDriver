package com.openqa.selenium;

public class InternetExplorerDriver implements WedDriver {

	@Override
	public void click(String locator) {
		System.out.println("Click on an Element in Internet " + locator);
	}

	@Override
	public void sendKeys(String locator, String value) {
		System.out.println("Type in an element in Internet Explorer: " + locator + "An the value is : " + value);
	}

}
