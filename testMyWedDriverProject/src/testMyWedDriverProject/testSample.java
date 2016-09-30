package testMyWedDriverProject;

import com.openqa.selenium.ChromeDriver;
import com.openqa.selenium.FireFoxDriver;
import com.openqa.selenium.WedDriver;

public class testSample {

	public static void main(String[] args) {
			
		//FireFoxDriver driver = new FireFoxDriver();
		//ChromeDriver driver2 = new ChromeDriver();
		
		WedDriver driver = new FireFoxDriver();
		driver.click("Submit button");
		driver.sendKeys("Text Box", "cristi.ion21@gmail.com");
		
		
	}

}
