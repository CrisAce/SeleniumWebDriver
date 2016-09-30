package testWebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.MarionetteDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class testSample {

	
	/*public static void sleep(int sec) {
		try {
			Thread.sleep(sec*1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}*/
	
	public static void main(String[] args) throws InterruptedException{

		
		System.setProperty("webdriver.gecko.driver","/Users/cristianion/Documents/geckodriver");
		DesiredCapabilities cap = DesiredCapabilities.firefox();
		
		cap.setCapability("marionette",true);
		
		WebDriver driver = new FirefoxDriver(cap);
		
		driver.get("http://www.google.com");
		
		
		
		
		String title = driver.getTitle();
		System.out.println(title);

		System.out.println(driver.findElement(By.id("gs_htif0")));  
		
		//WebElement is an interface witch can be 
		
		WebElement element = driver.findElement(By.id("gs_htif0"));
		element.sendKeys("nba.com");
		
		// Sau asa, ce am scris mai sus:
		//driver.findElement(By.id("gs_htif0")).sendKeys("nba.com");
		
		element = driver.findElement(By.xpath(".//*[@id='sblsbb']/button"));
		element.click();
		
		Thread.sleep(2000);
		
		element = driver.findElement(By.xpath(".//*[@id='rso']/div[1]/div/div/h3/a"));
		element.click();
		
		
		//driver.
		
		//String currentWindow = driver.getWindowHandle();
		//((JavascriptExecutor)driver).executeScript("alert('Test')");
		//driver.switchTo().alert().accept();
		//driver.switchTo().window(currentWindow);
		
		
		//sleep(3);
				
		//WebElement element = driver.findElement(By.xpath(".//*[@id='sb_ifc0']"));
		//element.sendKeys("fasole cu carnati");
		//element.sendKeys(Keys.RETURN);
		

		
	}

}
