package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WebDriverFunctions {
	
	protected WebDriver driver;
	
	public void typeByXpath(String loc, String value) {
		driver.findElement(By.xpath(loc)).sendKeys(value);
	}

}
