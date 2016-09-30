package com.thoughtworks.selenium;

public class DefaultSelenium {

	
	public DefaultSelenium(String serverHost, int serverPort, String browserStartCommand, String browserURL){
		
		System.out.println("Server host " + serverHost);
		System.out.println("Server Port" + serverPort);
		System.out.println("Browser" + browserStartCommand);
		System.out.println("Browser URL:" + browserURL);
	}
	
	public void start(){
		System.out.println("Starting the Selenium session");
	}
	
	public void click(String locator){
		 
		System.out.println("Click on element"+ locator);
		
	}
	
	public void type(String locator, String value){
		
		System.out.println("Selected the element as: " + locator + "type the value as: "+ value);
	}
}
