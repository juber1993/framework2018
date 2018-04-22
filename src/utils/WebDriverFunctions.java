package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.log4testng.Logger;

public class WebDriverFunctions {
	public static Logger APPLICATION_LOGS =Logger.getLogger("devpinoyLogger");
	
	protected WebDriver driver;
	
	public void typeByXpath(String loc, String value) {
		//Try catch 
		driver.findElement(By.xpath(loc)).sendKeys(value);
	}

}
