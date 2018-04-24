package base;

//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;

import utils.WebDriverFunctions;

public class Config extends WebDriverFunctions
{

	@BeforeTest
	public void initDrivers()
	{
		System.setProperty("webdriver.gecko.driver",System.getProperty("user.dir")+"\\drivers\\geckodriver.exe");
		driver = new FirefoxDriver();
		//    System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\drivers\\chromedriver.exe");
		//    driver = new ChromeDriver();
		driver.get ("http://facebook.com");
	}
}
