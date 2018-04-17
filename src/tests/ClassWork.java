package tests;

//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import base.Config;
import locators.Locators;
import values.Values;

public class ClassWork extends Config {
	Locators loc=new Locators();
	Values val=new Values();

	//Initialize browser
	@Test
	public void testingFirstName() {
		
		System.out.println("testingFirstName");
		
		// xpath - webelement / locators div /2
		// testdate - value 
		// driver.findElement 
		
//		//First name
//		driver.findElement(By.xpath(loc.fnameLocator)).sendKeys("val.fnameValue");
//		//Last name
//		driver.findElement(By.xpath(loc.lnameLocator)).sendKeys("val.lnameValue");
		
		
		//First name 
		typeByXpath(loc.fnameLocator, val.fnameValue);
		//Last name 
		typeByXpath(loc.lnameLocator, val.lnameValue);
		

		
	}

}
