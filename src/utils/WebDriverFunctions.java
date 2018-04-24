package utils;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WebDriverFunctions {
	public static Logger APPLICATION_LOGS =Logger.getLogger("devpinoyLogger");
	
	protected WebDriver driver;
	
	public void typeByXpath(String loc, String value) {
		driver.findElement(By.xpath(loc)).sendKeys(value);
	}

}
