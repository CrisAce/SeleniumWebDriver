package testWebDriver;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.Select;


public class testDropDown {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.gecko.driver","/Users/cristianion/Documents/geckodriver");
		DesiredCapabilities cap = DesiredCapabilities.firefox();
		
		cap.setCapability("marionette",true);
		
		WebDriver driver = new FirefoxDriver(cap);
		driver.get("https://www.wikipedia.org/");
		
	//	driver.findElement(By.xpath(".//*[@id='searchLanguage']")).sendKeys("RO");
	//	driver.findElement(By.xpath(".//*[@id='searchLanguage']")).click();
	//	driver.findElement(By.xpath(".//*[@id='searchLanguage']/option[41]")).click();
		
	
		
		//Select select = new Select(driver.findElement(By.xpath(".//*[@id='searchLanguage']/option[@value='ro']")));
		Thread.sleep(2000);
	//	Select selectLanguage = new Select(driver.findElement(By.xpath(".//*[@id='searchLanguage']")));
		WebElement selectLanguage = driver.findElement(By.xpath(".//*[@id='searchLanguage']"));
		selectLanguage.click();
		
		selectLanguage = driver.findElement(By.xpath("//*[@id='searchLanguage']"));
		selectLanguage.click();
		
		Select select = new Select(selectLanguage);
		
	//	select.selectByVisibleText("hi");
	//	select.selectByValue("Deutsch");
		
		List <WebElement> options =  select.getOptions();
		System.out.println(options.size());
		
		
		for (int i  = 0; i<options.size(); i++){
			
			System.out.println(options.get(i).getText());
			
		}
		
	//	selectLanguage.selectByVisibleText("Română");
	//	selectLanguage.selectByValue("bg");
		
	//	Select select = new Select(driver.findElement(By.id("searchLanguage")));
	//	select.selectByVisibleText("Deutsch");
		
		
		
		
		
		
	}

}
